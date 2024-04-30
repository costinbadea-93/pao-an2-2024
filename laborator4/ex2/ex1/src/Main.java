import model.Car;
import model.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //type insurance -> tipurile generice
        List<Integer> list = new ArrayList<>();

        //setul nu admite duplicate
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set);

        Car car1 = new Car("red");
        Car car2 = new Car("red");
        Car car3 = new Car("blue");

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Cars set: " + cars);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(6);

        System.out.println("Tree set " + treeSet);


        // int compare(T o1, T o2);
        Comparator<Car> carComparator = (o1, o2) -> o1.getColor().compareTo(o2.getColor());

        Set<Car> carsTreeSet = new TreeSet<>(carComparator);
        carsTreeSet.add(car1);
        carsTreeSet.add(car2);
        carsTreeSet.add(car3);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "val1");
        map.put(2,"val2");

        String val1 = map.get(1);

        System.out.println("Map " + map);
        System.out.println("Val: " + val1);


        //Functional Interface:
        /**
         *   Supplier
         *   Consumer
         *   Predicate
         *   BiPredicate
         *   Function
         *   BiFunction
         *   UnaryOperator
         *   BinaryOperator
         */

        List<String> list1 = Arrays.asList("1","2","3","4","5");

        //list1 -> input de stream
       List<Integer> transformedList = list1.stream()
                .map(n -> Integer.valueOf(n))// operatie intermediara
                .filter(n -> n% 2 == 0)// operatie intermediara
                .collect(Collectors.toList()); // operatie terminala


        System.out.println(transformedList);


        R r = new R();
        r.run();

        Runnable runnable = () -> System.out.println("Salut runnable!!!");
        runnable.run();

        //generic types

        //wildCard -> extends, super
        /**
         *   PECS -> producer - extends
         *           consumer - super   -> Get and put principal
         */
//        List<? super B> aList = new ArrayList<B>();


        //Optional<T>
        String result = list1.stream()
                .filter(s -> s.equalsIgnoreCase("1"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nu s-a gasit stringul"));




    }
}


//class A {
//
//}
//
//class B extends A{
//
//}