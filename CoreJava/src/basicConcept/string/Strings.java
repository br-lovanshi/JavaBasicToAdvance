package basicConcept.string;

class Strings {

    public static void main(String[] args) {
        String str = "Hello"; // "Hello" is stored in the string pool and remain if not garbeg collected
        str = "Hey"; // str is pointing to new memory location
        System.out.println(str); // Hey
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer stb = new StringBuffer("Hello");
        System.out.println(str == sb.toString()); // false
        System.out.println(str == stb.toString()); // false
        System.out.println(str.equals(sb.toString())); // true
        System.out.println(str.equals(stb.toString())); // true

        sb.append(" World");
        System.out.println(sb); // Hello World


        // Reverse String
        String reversedStr = new StringBuilder("Hello").reverse().toString();
        System.out.println("Reversed String: " + reversedStr); // olleH

        // Using intern() method
        //  force a string to move to the pool using .intern():
        String str1 = new String("Hello").intern();


        /**
         * String : Immutable, thread safe
         * StringBuilder : Mutable, not thread safe, Faster then sb and str in singel threaded env
         * StringBuffer : Mutable, thread safe, slower then sb but best in multi threaded env
         * Concept	Explanation
String Pool	Memory area for storing string literals
Immutable	Strings cannot be changed once created
intern()	Moves string to pool (if not already there)
== vs .equals()	== compares reference, .equals() compares content
         */
    }

}