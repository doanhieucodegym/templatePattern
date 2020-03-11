package com.hivetech.templatePattern;

public class main {
    public static void main(String[] args) {
        PageTemplate designPattern = new DesignPatternPage();
        designPattern.displayWebPage();

        System.out.println();

        PageTemplate java8Tutorial = new Java8TutorialPage();
        java8Tutorial.displayWebPage();

        System.out.println();

        PageTemplate contact = new ContactPage();
        contact.displayWebPage();
    }
}
