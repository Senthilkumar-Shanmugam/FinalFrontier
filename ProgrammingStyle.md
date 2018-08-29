A programming paradigm is a fundamental style of computer programming. There are four main paradigms: imperative, declarative, functional 
(which is considered a subset of the declarative paradigm) and object-oriented.

Declarative programming is a programming paradigm that expresses the logic of a computation(What do) without describing its
control flow(How do). Some well-known examples of declarative domain specific languages (DSLs) include CSS, regular expressions, and
a subset of SQL (SELECT queries, for example) Many markup languages such as HTML, MXML, XAML, XSLT... are often declarative. 
The declarative programming try to blur the distinction between a program as a set of instructions and a program as an assertion about
the desired answer.

Imperative programming is a programming paradigm that describes computation in terms of statements that change a program state. The declarative programs can be dually viewed as programming commands or mathematical assertions.


Declarative programming is when you say what you want, and imperative language is when you say how to get what you want.

A simple example in Python:
# Declarative
small_nums = [x for x in range(20) if x < 5]

# Imperative
small_nums = []
for i in range(20):
if i < 5:
small_nums.append(i)

The example is declarative because we do not specify any "implementation details" of building the list.

generally, using LINQ results in a declarative style, because you aren't saying how to obtain what you want; you are only saying what you want. You could say the same about SQL

https://codeburst.io/declarative-vs-imperative-programming-a8a7c93d9ad2


