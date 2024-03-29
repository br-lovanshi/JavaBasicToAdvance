public class DataTypes{

    public void greeting(){
        System.out.println("Hello Brajesh!");
    }
    public static void main(String args[]){

        // Primitive types
        byte byteValue = 10;
        short shortValue = 1000;
        long longValue = 3343432434l;
        double doubleValue = 3.3;
        float floatValue = 3.3f;

        char ch = 'a';
        boolean flag = true;

        // reference data type
        DataTypes dataTypes = new DataTypes();
        dataTypes.greeting();

    }
}

/***
 * Data type represent the value type that variable can store.
 * Primitive type 
 *  Numeric 
 *   byte, shor, long, float, double, int
 *  Boolean 
 *   boolean 
 *  Character 
 *   char 16 bit unicode 
 * 
 * note:- Primite data types are used to store the simple value in memory eficiently.
 */