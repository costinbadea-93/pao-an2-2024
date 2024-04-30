import model.Car;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try{
//
//        }catch (Exception e){
//
//        }finally {
//
//        }

        //Throwable -> parintele tuturor exceptiilor

        //Exceptions -> checked exceptions
        //           -> unchecked exceptionsCar

        //unchecked exception
        Car car = null;
        try{
            System.out.println(car.getColor());
        }catch (NullPointerException npe) {
            System.out.println("Instanta de masina este null;");
            npe.printStackTrace();
        }

        //checked exception
//        Scanner scanner = new Scanner(System.in);
//        try {
//            Scanner scanner = new Scanner(Paths.get("C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\laborator4\\ex3\\ex3\\src\\model\\data.txt"));
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // pentru aruncare exceptie in java -> throw
        // pentru a marca o metoda ca arunca exceptie -> throws (trebuie tratata mai sus)

        //try with ressources  -> management automat pe resurse (trebuie ca resursa sa impementeze cloasable sau autocloaseble)

//        try(declarare resursa) {
//
//        }catch (Exception e){
//
//        }


    }


    static void m1() throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\laborator4\\ex3\\ex3\\src\\model\\data.txt"));
    }
}
