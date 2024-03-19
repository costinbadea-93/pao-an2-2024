package model;

public class SingletonService {

    /**
     * Enumurile prin definitie
     * sunt singleton
     */
    private SingletonService(){}

    /**
     * m1..
     * m2..
     * ..
     * ..
     * m20
     */

    private static class SINGLETON {
        private static final SingletonService INSTANCE = new SingletonService();
    }

    public static SingletonService getInstance() {
        return SINGLETON.INSTANCE;
    }
}
