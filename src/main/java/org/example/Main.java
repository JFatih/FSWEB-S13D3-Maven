package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fatih","Çakmak",27);
        Person person1 = new Person("Jack", "Gyllenhaal",43,
                "Columbia University", 1.82 , false);
        Person person2 = new Person("Ryan","Reynolds",47,
                "Kwantlen Polytechnic University",1.88,true);
        System.out.println("----------------------");
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("----------------------");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("School: " + person1.getSchool());
        System.out.println("Size: " + person1.getSize());
        System.out.println("Is Married: " + person1.getIsMarried());
        System.out.println("----------------------");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("School: " + person2.getSchool());
        System.out.println("Size: " + person2.getSize());
        System.out.println("Is Married: " + person2.getIsMarried());
        System.out.println("----------------------");
        Wall wall = new Wall(10.5 , 20.8);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
        System.out.println("----------------------");
        wall.setHeight(0);
        System.out.println("Area: " + wall.getArea());
        System.out.println("----------------------");
        wall.setHeight(1);
        System.out.println("Area: " + wall.getArea());
        System.out.println("----------------------");
        wall.setWidth(-5);
        System.out.println("Area: " + wall.getArea());
        System.out.println("----------------------");
    }
}
