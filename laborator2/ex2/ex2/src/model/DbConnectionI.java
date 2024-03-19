package model;

@FunctionalInterface
public interface DbConnectionI {
    /**
     * interfata functionala
     * este o interfata ce are o
     * singura metoda abstracta
     */
    void connectToDatabase();

    default void m1() {

    }
    default void m2() {

    }

    static void m3() {

    }
}
