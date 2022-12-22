package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Hope", FEMALE, 24),
            new Person("Anthony", MALE, 31),
            new Person("Goodluck", MALE, 30),
            new Person("Ruth", FEMALE, 26),
            new Person("David", MALE, 27),
            new Person("Adora", FEMALE, 28)
        );

        //imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.gender == FEMALE)
                females.add(person);
        }

        for (Person female : females) {
            System.out.println(female);
        }

        //declarative approach

        people.stream()
                .filter(person -> person.gender == FEMALE)
//                .toList()
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;
        private final int age;

        Person(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
