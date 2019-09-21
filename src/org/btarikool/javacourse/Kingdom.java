package org.btarikool.javacourse;

public class Kingdom {

    public static void main(String[] args) {

        String firstKnight = "Donald";
        String secondKnight = "Duck";
        System.out.println ("welcome, my King");

        Kingdom.Lords Lord = new Kingdom.Lords();
        Lord.LordsMethod();

        Kingdom.King meeting = new Kingdom.King();
        meeting.greeting("");

    }
    static class Lords{
        public void LordsMethod() {
            firstLord("My King! You are best of the best!");
            secondLord("I will protect you!");
        }

        public void secondLord (String Mouse) {
            System.out.println (Mouse);
        }

        public void firstLord (String Mikki) {
            System.out.println (Mikki);
        }
    }
    public static class King {
        public void greeting (String name) {
            System.out.format("Hello! I'm your king %s", name);

        }

    }
}