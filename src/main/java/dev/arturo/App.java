package dev.arturo;

import dev.arturo.models.Person;
import dev.arturo.models.SecondStep;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
          
    Person firstPerson = new Person("Lucas", "Alvarez", 2024, "Z1451600Y");
    Person secondPerson = new Person("Emi", "Ramirez", 2003, "V30165822");
    
    firstPerson.printingPerson();
    secondPerson.printingPerson();
    
    
    }

}
