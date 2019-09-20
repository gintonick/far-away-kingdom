package org.btarikool.javacourse;

public class Peasant {
    String name;

    public Peasant(String name) {
        this.name = name;
    }

    public String getTitleAndName() {
        return name;
    }

    public void doAction(String actionContent) {
        Action action = new Action();
        action.doAction(this.getTitleAndName(), actionContent);
    }


}
