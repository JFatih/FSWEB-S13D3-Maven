package org.example;

public class Person {
    String firstName;
    String lastName;
    String school;
    int age;
    double size;
    boolean isMarried;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String school, double size, boolean isMarried) {
        this(firstName,lastName,age);
        this.school = school;
        this.size = size;
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
    public String getSchool() {
        return school;
    }
    public double getSize() {
        return size;
    }
    public boolean getIsMarried() {
        return isMarried;
    }
}
