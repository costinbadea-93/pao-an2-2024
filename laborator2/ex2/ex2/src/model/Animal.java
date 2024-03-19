package model;

import java.util.Objects;

public class Animal {
    private String nume;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nume, animal.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
