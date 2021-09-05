package main.java.BuilderDesignPattern.model;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private String city;
    private int weight;

    public Person(String name, String lastName, int age, String city, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.weight = weight;
    }

    public static class Builder {
        private String name;
        private String lastName;
        private int age;
        private String city;
        private int weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;

            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;

            return this;
        }

        public Person build() {
            return new Person(name, lastName, age, city, weight);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", weight=" + weight +
                '}';
    }
}
