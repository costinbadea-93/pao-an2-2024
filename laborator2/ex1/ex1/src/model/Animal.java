package model;

public class Animal {
    private String nume;

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
