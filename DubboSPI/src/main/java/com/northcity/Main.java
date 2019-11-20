package com.northcity;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.northcity.api.IPrinter;

public class Main {
    public static void main(String [] args){
        IPrinter iPrinter = ExtensionLoader.getExtensionLoader(IPrinter.class).getDefaultExtension();
        System.out.println("default:\t" + iPrinter.print());

        iPrinter = ExtensionLoader.getExtensionLoader(IPrinter.class).getExtension("image");
        System.out.println("image:\t" + iPrinter.print());

        iPrinter = ExtensionLoader.getExtensionLoader(IPrinter.class).getAdaptiveExtension();
        iPrinter.print();
    }
}
