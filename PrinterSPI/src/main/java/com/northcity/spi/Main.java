package com.northcity.spi;

import com.northcity.spi.PrinterInterface.IPrinter;

import java.util.ServiceLoader;

public class Main {
    public static void main(String [] args){
        ServiceLoader<IPrinter> serviceLoader = ServiceLoader.load(IPrinter.class);
        for(IPrinter iPrinter : serviceLoader){
            iPrinter.Print();
        }
    }
}
