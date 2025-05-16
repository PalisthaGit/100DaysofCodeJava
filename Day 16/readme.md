Day 16: Enums
Write a program which performs the following tasks:
Initialise an enum named weekdays which contains strings from Monday to Sunday
Print all the elements in the enum weekdays

Reading List:

1. When should you use enums in Java programming?

Type Safety
With enums, only valid values can be used. The compiler enforces this.
enum Day { MONDAY, TUESDAY }

Day today = Day.FUNDAY;
But with strings:
String today = "FUNDAY"; // This is allowed – no error!
Enum protects your code from invalid values. Strings don't.

No Typos or Case Mistakes
With strings:
switch (day) {
case "monday": // Typo or wrong case — won't match "MONDAY"
...
}
This fails silently. With enum, the compiler forces you to use correct names. 2. Can we remove elements from enums? And why?You cannot remove elements from an enum at runtime in Java.
Enums in Java are:

Fixed

Immutable

Defined at compile time
Java enums are designed to be:

Type-safe constants — they represent a closed set of known values

Efficient — they're implemented as final static instances

Reliable — their immutability avoids bugs

Imagine if you could remove MONDAY from the enum — any code using Day.MONDAY would break!

If you need a "modifiable list of options", you should not use enum. Instead, use a data structure
