package impl;

import api.People;

public class Janpanese implements People {
    @Override
    public String echo(String name) {
        return "Janpanese";
    }
}
