package com.northcity.printer;

import com.northcity.api.IPrinter;
public class TextPrinter implements IPrinter {
    public String print() {
        return "Text Printer";
    }
}
