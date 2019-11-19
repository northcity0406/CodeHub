package com.northcity;

import com.northcity.annotation.PrinterAnnotation;
import com.northcity.impl.ImagePrinter;
import com.northcity.impl.TextPrinter;
import java.lang.reflect.Field;

public class Main {
    public static void main(String [] args) throws IllegalAccessException, InstantiationException {
        //获取Printer的Class对象
        Class<Printer> printerClass = Printer.class;
        //获取Printer的实例对象
        Printer printer = (Printer)printerClass.newInstance();
        //遍历Printer的Class的所有Filed对象
        for(Field field : printerClass.getDeclaredFields()){
            //获得该Field的PrinterAnnotation注解
            PrinterAnnotation spiAnnotation = (PrinterAnnotation) field.getAnnotation(PrinterAnnotation.class);
            //获得该注解的值
            String value = spiAnnotation.value();
            //根据注解的值注入对应的
            if(value.equals("TextPrinter")) printer.setiPrinter(new TextPrinter());
            else printer.setiPrinter(new ImagePrinter());
        }
        printer.Print();
    }
}
