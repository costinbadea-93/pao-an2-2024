package enums;

public enum Anotimp {
    VARA("30-40") {
        @Override
        public void printWeather() {
            System.out.println("cald");
        }
    },
    IARNA("-10-5") {
        @Override
        public void printWeather() {
            System.out.println("frig");
        }
    },
    PRIMAVARA("20-25") {
        @Override
        public void printWeather() {
            System.out.println("caldut");
        }
    },
    TOAMNA("25-30") {
        @Override
        public void printWeather() {
            System.out.println("caldut");
        }
    };

    private String temperatura;

    public abstract void printWeather();

    Anotimp(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }
}
