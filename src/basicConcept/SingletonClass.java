package basicConcept;

public final class SingletonClass {

    private static SingletonClass singletonClass;

    private  SingletonClass() {
    }

    public static SingletonClass getSingletonClass() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) { // Double-checked locking
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass1);

        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();
        SingletonClass singletonClass3 = new SingletonClass();
        System.out.println(singletonClass2);

        // Both instances should be the same
        System.out.println("Are both instances the same? " + (singletonClass1 == singletonClass2));
    }
}
