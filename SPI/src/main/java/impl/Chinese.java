package impl;

import api.People;

public class Chinese implements People {
    @Override
    public String echo(String name) {
        return "Chinese";
    }
}
