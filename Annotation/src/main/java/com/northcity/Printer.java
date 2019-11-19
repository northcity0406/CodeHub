package com.northcity;
import com.northcity.annotation.PrinterAnnotation;
import com.northcity.api.IPrinter;

public class Printer{
    @PrinterAnnotation("TextPrinter")
    private IPrinter iPrinter;
    public void setiPrinter(IPrinter iPrinter) {
        this.iPrinter = iPrinter;
    }
    public void Print(){
        iPrinter.Print();
    }
}
