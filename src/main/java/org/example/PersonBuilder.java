package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = 0;
    private String adress;

    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Имя не указано");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Фамииля не указана");
        } else {
            this.surname = surname;
            return this;
        }
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) throws IllegalStateException {
        if (address == null || address.isEmpty()) {
            throw new IllegalStateException("Адрес не указан");
        } else {
            this.adress = address;
            return this;
        }
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя или фамилия не указаны");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        } else {
            person = new Person(name, surname, age);
            person.setAddress(adress);
        }
        return person;
    }
}

