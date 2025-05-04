Day 4: Basic Arithmetic Operations
1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console.
2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.
3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points

Reading List:
1. Learn about formatting options such as precision, alignment, and decimal places to present output in a clear and concise manner

Formatting Options in Java


Precision (how many decimal places are shown)

Alignment (left, right, or center within a given field width)

Width (total space reserved for a value in the output)

Below are the most common formatting techniques in Java:

Using System.out.printf()
This method is similar to printf() in C. It formats and prints output directly to the console.

Decimal Places (Precision):

double pi = 3.14159265;
System.out.printf("Pi: %.2f%n", pi);  // Output: Pi: 3.14
%.2f means a floating-point number with two digits after the decimal point.

Alignment and Width:

System.out.printf("|%10s|%n", "Java");   // Right-aligned in a 10-character field
System.out.printf("|%-10s|%n", "Java");  // Left-aligned in a 10-character field
%10s aligns text to the right within 10 spaces.

%-10s aligns text to the left within 10 spaces.

Using String.format()
This method works like printf() but returns the formatted string instead of printing it.

String formatted = String.format("Result: %.2f", 25.6789);
System.out.println(formatted);  // Output: Result: 25.68

Using DecimalFormat from java.text
This class provides advanced control over number formatting, especially for things like currency or locale-specific output.


import java.text.DecimalFormat;

DecimalFormat df = new DecimalFormat("#.00");
System.out.println(df.format(12.3));  // Output: 12.30
# represents optional digits, and 0 represents mandatory digits.