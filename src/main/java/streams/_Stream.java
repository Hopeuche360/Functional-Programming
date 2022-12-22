package streams;


import imperative.Main;

import java.util.List;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Hope", FEMALE, 24),
                new Person("Anthony", MALE, 31),
                new Person("Goodluck", MALE, 30),
                new Person("Ruth", FEMALE, 26),
                new Person("David", MALE, 27),
                new Person("Adora", FEMALE, 28)
        );

        people.stream()
                .map(person -> person.name.length())
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
