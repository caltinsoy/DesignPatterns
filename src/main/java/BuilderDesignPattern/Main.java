package main.java.BuilderDesignPattern;

import main.java.BuilderDesignPattern.model.Person;

public class Main {

    public static void main(String[] args) {
        /*
            The multiple constructor with combination of multiple parameters
            variation is called the telescoping constructor.

         * Builder design pattern is used to create instance of
         * very complex object having telescoping constructor in easiest way.
         * */

        Person person = new Person.Builder()
                .setAge(15)
                .setCity("Ankara")
                .setWeight(87)
                .setLastName("Altinsoy")
                .setName("Cemalettin")
                .build();
        System.out.println(person.toString());
    }

}
