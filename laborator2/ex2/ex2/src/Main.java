import model.DbConnectionI;
import model.MySqlImpl;
import model.OracleImpl;
import model.SingletonService;

public class Main {
    public static void main(String[] args) {

        //abstractizare : clase abstracte
        //              : interfete

        MySqlImpl mySql = new MySqlImpl();
        OracleImpl oracle = new OracleImpl();
        mySql.connectToDatabase();
        oracle.connectToDatabase();
        /**
         * O interfata poate extinde o singura alta clasa
         * dar poate implementa oricate interfete
         */
        DbConnectionI oracleConnection = () -> System.out.println("Connecting with oracle");
        oracleConnection.connectToDatabase();

        SingletonService singletonService = SingletonService.getInstance();

        /**
         *  Object -> parintele tuturor claselor
         *  Throwable -> parintele tuturor exceptilor in java
         *
         *  doua obiecte care sunt egale, au acelasi hashCode
         *  insa doua obicte care au acelasi hashcode, nu sunt neaparat egale
         */
    }
}
