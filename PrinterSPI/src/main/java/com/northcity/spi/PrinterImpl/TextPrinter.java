package com.northcity.spi.PrinterImpl;

import com.northcity.spi.PrinterInterface.IPrinter;

public class TextPrinter implements IPrinter {
    public void Print() {
        System.out.println("Text printer");
    }
}
