package org.btarikool.javacourse;

public class Lord {
    String name;

    public Lord(String name) {
        this.name = name;
    }

    public String getTitleAndName() {
        return "Lord " + name;
    }

    public void doAction(String actionContent) {
        Action action = new Action();
        action.doAction(this.getTitleAndName(), actionContent);
    }

}
