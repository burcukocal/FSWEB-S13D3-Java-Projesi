package com.workintech.model;

public class Person {
    String firstName;
    String lastName;
    int age;
    String country;
    String education;
    String gender;

//    double salary;
//    boolean isMarried;
//    String[] pets;

    public Person(String firstName, String lastName, int age ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String country, String education, String gender){
        this(firstName, lastName, age);
        this.country = country;
        this.education = education;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <=19;
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("isTeen: " + person.isTeen());
    }
}
