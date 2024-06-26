Java Collections Framework:

1. Iterator vs. ListIterator:

Question: What is the difference between an Iterator and a ListIterator in the Java Collections framework?
Answer: An Iterator allows forward traversal of a collection and supports basic operations like next() and remove(). A ListIterator extends Iterator and additionally allows bidirectional traversal, modifications, and access to index positions in List collections.
2. Comparable vs. Comparator:

Question: What are Comparable and Comparator interfaces used for in Java Collections?
Answer: Comparable is used to define the default natural ordering of objects within a class. Comparator provides a way to define custom sorting logic for classes that you may not have control over.
3. HashSet vs. LinkedHashSet vs. TreeSet:

Question: What are the differences between HashSet, LinkedHashSet, and TreeSet in Java Collections?
Answer: HashSet stores elements in a hash table, LinkedHashSet maintains insertion order, and TreeSet stores elements in a sorted order.
Functional Programming:

1. Lambda Expressions:

Question: What are lambda expressions in Java, and how do they simplify coding?
Answer: Lambda expressions are anonymous functions that enable you to express instances of single-method interfaces (functional interfaces) concisely. They help reduce boilerplate code and make your code more readable.
2. Stream API:

Question: What is the Java Stream API, and how does it differ from collections?
Answer: The Stream API provides a way to process sequences of elements using functional-style operations, which can be performed in parallel. It differs from collections in that it doesn't store data but operates on it, allowing for more efficient and concise data manipulation.
3. Functional Interfaces:

Question: What is a functional interface, and why is it essential for using lambda expressions?
Answer: A functional interface is an interface with only one abstract method. It's crucial for lambda expressions because they are used to provide the implementation for the single method. Java's functional interfaces ensure type safety and compatibility when working with lambda expressions.
4. Method References:

Question: How do method references relate to lambda expressions, and when would you use them?
Answer: Method references provide a shorthand notation for using existing methods as lambda expressions. They can be used when you're passing a method as an argument to a higher-order function. Method references make the code more readable and concise.
5. Map and Reduce:

Question: What are the concepts of "map" and "reduce" in functional programming?
Answer: "Map" transforms each element in a collection using a given function, creating a new collection. "Reduce" combines the elements to produce a single result, often by applying an accumulation function. These operations are fundamental in functional programming and are used extensively in the Stream API for data processing.