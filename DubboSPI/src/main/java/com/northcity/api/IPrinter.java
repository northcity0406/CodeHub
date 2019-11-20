package com.northcity.api;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("text")
public interface IPrinter {
    @Adaptive({"text","image"})
    public String print();
}
