Higher order functions
   functions that take or return other functions as arguments. Javascript. lambda in java8
   
When you say that a language has first-class functions, it means that the language treats functions as values – that you can assign 
a function into a variable, pass it around etc. Higher-order functions are functions that work on other functions, meaning that they
take one or more functions as an argument and can also return a function.


First class functions versus higher order functions
===================================================

First class functions

Values in a language that are handled uniformly throughout are called "first class". They may be stored in data structures, passed as
arguments, or used in control structures.

Languages which support values with function types, and treat them the same as non-function values, can be said to have
"first class functions".

Higher order functions

One of the consequences of having first class functions is that you should be able to pass a function as an argument to another function.
The latter function is now "higher order". It is a function that takes a function as an argument.

Functional languages -- languages where functions are the primary means of building programs -- all have first class functions. Most 
also have higher order functions (very rare exceptions being languages like Excel, which can be said to be functional, but not higher 
order).

JavaScript has first class functions. What does that mean? Just like numbers, strings, or objects, functions can be:

      Assigned as an identifier (variable) value
      Assigned to object property values
      Passed as arguments
      Returned from functions
Basically, we can use functions just like any other bits of data in our programs, and that makes abstraction a lot easier. For instance, we can create a function that abstracts the process of iterating over a list and accumulating a return value by passing in a function that handles the bits that are different.



    
