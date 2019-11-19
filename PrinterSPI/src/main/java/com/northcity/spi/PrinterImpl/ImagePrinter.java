package com.northcity.spi.PrinterImpl;

import com.northcity.spi.PrinterInterface.IPrinter;

public class ImagePrinter implements IPrinter {
    public void Print() {
        System.out.println("Image printer");
    }
}
