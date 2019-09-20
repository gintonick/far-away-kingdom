package org.btarikool.javacourse;

public class Knight {
    String name;

    public Knight(String name) {
        this.name = name;
    }

    public String getTitleAndName() {
        return "Knight " + name;
    }

    public void doAction(String actionContent) {
        Action action = new Action();
        action.doAction(this.getTitleAndName(), actionContent);
    }

    public void sayHello(String name) {
        System.out.format("Hello! I am the Knight %s\n", name);
    }

}
