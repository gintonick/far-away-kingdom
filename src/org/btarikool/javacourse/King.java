// King.java
package org.btarikool.javacourse;

public class King {
    String name;
    int createdPeasants = 0;

    public King(String name) {
        this.name = name;
    }

    public String getTitleAndName() {
        return "King " + name;
    }

    public void doAction(String actionContent) {
        Action action = new Action();
        action.doAction(this.getTitleAndName(), actionContent);
    }

    public Peasant presentPeasant(String masterName) {
        createdPeasants ++;
        return new Peasant(masterName + "'s peasant #" + createdPeasants);
    }

    public void sayHello(String name) {
        System.out.format("Hello! I am the King %s\n", name);

    }


}