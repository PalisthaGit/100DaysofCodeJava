Day 12: StringBuffer and StringBuilder
Write a program that performs the following tasks:
Initialise a StringBuffer with value "Hello" and append a space and "World" and print it
Initialise a StringBuilder with value "Hello" and append a space and "World" and print it

Reading List:

1. Learn the difference between String, StringBuffer and StringBuilder.
String is immutable and thread-safe by design, but it's not ideal for scenarios with frequent modifications, because each change creates a new object, which impacts performance.

StringBuffer is mutable and thread-safe — it synchronizes methods to ensure safe use in multi-threaded environments. However, this synchronization introduces performance overhead.


StringBuilder is also mutable but not thread-safe. It performs better than StringBuffer in single-threaded contexts because it avoids the cost of synchronization.


2. Learn when StringBuffer and StringBuilder should be preferred over String.
1. Use String when:
The string does not need to change after it's created.

You're working with constants, keys, or read-only values.

You want to take advantage of memory efficiency via string pooling.

Example: "Welcome" used as a static header or a label in UI.

2. Use StringBuilder when:
You need to modify the string frequently (e.g., appending, inserting, deleting).

You're in a single-threaded environment.

You care about performance and want to avoid creating multiple string objects.

Example: Building a dynamic SQL query or constructing XML/JSON data in memory.

3. Use StringBuffer when:
You need to modify strings in a multi-threaded environment.

Multiple threads might access and change the same string.

You still want to avoid the inefficiency of String's immutability.

Example: A logging system shared across threads where each thread appends to a common message buffer.