package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = 0;
    private String adress;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не указано");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Фамииля не указана");
        } else {
            this.surname = surname;
            return this;
        }
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Адрес не указан");
        } else {
            this.adress = address;
            return this;
        }
    }

    public Person build() {
        Person person;
        if (name == null || surname == null || age < 0) {
            throw new IllegalArgumentException("Имя или фамилия не указаны, либо возраст был указан меньше нуля");
        } else {
            person = new Person(name, surname, age);
            person.setAddress(adress);
        }
        return person;
    }
}

