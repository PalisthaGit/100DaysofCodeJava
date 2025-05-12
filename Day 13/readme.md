Day 13: Arrays

1. Write a program to declare and initialize an array of integers. Loop through the array and compute the average of the numbers.
2. Write a program to copy elements from one array to another array

Reading List:

1. Learn the difference between shallow-copy and deep-copy of arrays.

"A shallow copy means copying the reference of the original array or object — not the actual data. So, if the original is modified, the copied version also reflects those changes.

A deep copy creates a completely new copy of the data. The two objects or arrays are independent, and changes to one do not affect the other.

For example, in shallow copy of an array of objects, both arrays point to the same objects in memory. In a deep copy, each object inside the array is cloned or recreated.

Shallow Copy Example (with String[]):

String[] original = { "a", "b", "c" };
String[] shallowCopy = original;  // Shallow copy

shallowCopy[0] = "z";
System.out.println("Original[0]: " + original[0]);  // Output: z

Deep Copy Example (with String[]):
String[] original = { "a", "b", "c" };
String[] deepCopy = new String[original.length];

for (int i = 0; i < original.length; i++) {
    deepCopy[i] = original[i];  // Still shallow for immutable strings, but safe
}

deepCopy[0] = "z";
System.out.println("Original[0]: " + original[0]);  // Output: a


2. Learn about array index out of bounds exception.
ArrayIndexOutOfBoundsException is a runtime exception in Java that occurs when you try to access an invalid index in an array — meaning an index that is less than 0 or greater than or equal to the array length.

