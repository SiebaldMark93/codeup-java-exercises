import oop.Person;

import java.util.Arrays;




public class ArraysExercises {

    public static Person [] addPerson (Person newPerson, Person[] persons) {
        Person[] newPersonArray;
        newPersonArray = Arrays.copyOf(persons, persons.length +1);
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }


    public static void main(String[] args) {
        Person[] persons;
        persons = new Person[3];
        persons[0] = new Person("Kenny");
        persons[1] = new Person("Alfredo");
        persons[3] = new Person("Chase");

        Person[] newPersonArray = ArraysExercises.addPerson(new Person("Marcus"), persons);

        for (Person person : newPersonArray) {
            person.sayHello();
        }

    }

}
