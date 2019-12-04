package pl.accenture;

import java.util.Objects;

public class Person {
    String name;
    String pesel;
    double age;
    String hair;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.age, age) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(pesel, person.pesel) &&
                Objects.equals(hair, person.hair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, age, hair);
    }
}
