public class Car {
    private String culoare, marca;
    private int pret;

    public Car(String culoare, String marca, int pret) {
        this.culoare = culoare;
        this.marca = marca;
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString()
    {
        return "Car details: " + this.culoare + " " + this.marca + " " + this.pret;
    }
}
