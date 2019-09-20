// Kingdom.java
package org.btarikool.javacourse;

public class Kingdom {

    public static void main(String[] args) {
        System.out.println("Kingdom of Far Far Away");
        if (args.length < 5) {
            System.out.println("please pass 5 names as parameters to start ");
            return;
        }
        Knight knight1 = new Knight(args[3]);
        Knight knight2 = new Knight(args[4]);
        Lord lord1 = new Lord(args[2]);
        Lord lord2 = new Lord(args[1]);
        King king = new King(args[0]);

        knight1.doAction("my hommage to " + lord1.getTitleAndName());
        knight2.doAction("my military service to " + lord2.getTitleAndName());
        lord1.doAction("my loyalty to " + king.getTitleAndName());
        lord2.doAction("my military aid to " + king.getTitleAndName());
        king.doAction("I give fief to " + lord1.getTitleAndName());
        king.doAction("I give 2 peasants to " + lord2.getTitleAndName());
        Peasant peasant1 = king.presentPeasant(lord1.getTitleAndName());
        Peasant peasant2 = king.presentPeasant(lord1.getTitleAndName());
        lord1.doAction("I give food to " + knight1.getTitleAndName());
        lord2.doAction("I give protection to " + knight2.getTitleAndName());
        knight1.doAction("I bring new lands to " + king.getTitleAndName());
        knight2.doAction("I bring new lands to " + king.getTitleAndName());
        peasant1.doAction("I give food to " + lord1.getTitleAndName());
        peasant2.doAction("I give food to " + lord2.getTitleAndName());
        king.sayHello(args[0]);
    }
}
