package dev.arturo.models;

public class SecondStep extends Person {

    Character gender;
    String country;

    


    public Character getGender() {
        return gender;
    }




    public void setGender(Character gender) {
        this.gender = gender;
    }




    public String getCountry() {
        return country;
    }




    public void setCountry(String country) {
        this.country = country;
    }




    public SecondStep(String name, String lastName, Integer borningYear, String dni, Character gender, String country) {
        super(name, lastName, borningYear, dni);
        this.gender = gender;
        this.country = country;
    }

    public void getingPersonExtends(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(borningYear);
        System.out.println(dni);
        System.out.println(gender);
        System.out.println(country);
    }

    public static void main(String[] args) {
      
    }
    

}
