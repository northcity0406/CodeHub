package impl;

import api.People;

public class Korean implements People {
    @Override
    public String echo(String name) {
        return "Korean";
    }
}
