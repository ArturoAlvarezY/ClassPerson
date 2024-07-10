package dev.arturo.models;

public class Person {
    String name;
    String lastName;
    Integer borningYear;
    String dni;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBorningYear() {
        return borningYear;
    }

    public String getDni() {
        return dni;
    }

    
    public Person(String name, String lastName, Integer borningYear, String dni) {
        this.name = name;
        this.lastName = lastName;
        this.borningYear = borningYear;
        this.dni = dni;
    }


    public void printingPerson(){
        
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(borningYear);
        System.out.println(dni);
    }
}


