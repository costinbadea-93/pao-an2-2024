import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut!!!");
        //jdk -> java development kit
        //jre -> java runtime environment

        /*variable declaration:
         *primitive types: long short byte double float int boolean char
         *wrapper classes: Long Short Byte Double Float Integer Boolean Character
         * String -> clasa string
         */


        int n1 = 5;
        int n2 = 10;

        Integer n3 = 5;
        Integer n4 = 10;
//        System.out.println(n3.compareTo(n4));

        //static -> o singura instanta pentru toate
        //final -> imutabilitate

        //instructiuni de control:
        //for, while, do while, forEach, enahancedFor
        //if else if, switch case....


//        switch (n3) {
//            case 1 :
//                System.out.println("Valoarea este 1");
//                break;
//            default:
//                System.out.println("valoare default!!!");

//             case 1 -> System.out.println("Valoarea este 1");
//             default -> System.out.println("valoare default!!!");

//
//        int[] arr1 = {1, 2, 3, 4, 5, 6};
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("val: " + arr1[i]);
//        }
//
//        for(int i : arr1) {
//            System.out.println(i);
//        }
//
//        Arrays.asList(arr1).forEach(System.out::println);
//        Book book = new Book("B1", "A1");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduceti o variabila in consola: ");
//
//        while (true){
//            int value = sc.nextInt();
//            if(value > 10){
//                System.out.println("Exiting program...");
//                break;
//            } else {
//                System.out.println("Introduceti o alta valoare...");
//            }
//        }
//

//        int [] arr  = new int[0];
//        arr = addElement(arr, 1);
//        arr = addElement(arr, 2);
//        arr = addElement(arr, 4);
//        arr = addElement(arr, 6);
//
//        arr = removeElement( arr,2);

//        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1, 6, 3,4,7};

        Book [] arr2 = {
          new Book("B5", "A5"),
          new Book("B4", "A4"),
          new Book("B6", "A6"),
        };
        Comparator<Book> bookComparator = (b1, b2) -> b1.getName().compareTo(b2.getName());
        Arrays.sort(arr2, bookComparator);
        System.out.println(Arrays.toString(arr2));

        /**
         * Car -> culoare, marca, pret
         * Car [] -> add carr
         *        -> list cars
         *
         *  citire instructiuni din consola
         *  1. -> add car -> read from console values for car
         *  2. -> list cars ->
         *  3. -> Exit program
         */
    }

    private static int [] addElement(int [] arr , int elem){
        int [] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = elem;
        return temp;
    }

    private static int[] removeElement(int[] arr, int elem){
        int i, ap = 0;
        int[] temp = new int[arr.length - 1];

        for(i = 0;i < arr.length;++i)
        {
            if(arr[i] == elem)
                ap = 1;
            else
                temp[i - ap] = arr[i];
        }

        return temp;
    }
}
