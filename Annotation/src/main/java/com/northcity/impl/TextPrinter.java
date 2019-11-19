package com.northcity.impl;

import com.northcity.api.IPrinter;

public class TextPrinter implements IPrinter {
    public void Print() {
        System.out.println("Text Printer");
    }
}
