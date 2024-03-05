package interview;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Mike"));
        people.add(new Person(1, "Mike"));

        System.out.println(people.size());
    }

    //@Data
    static class Person{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }


    }
}
