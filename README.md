 Project 1: File Processing and Character Transformation
This Java program reads a user-specified text file, processes its characters, and generates a modified version of the file:

Lowercase vowels (a, e, i, o, u) are converted to uppercase.

All other characters remain unchanged.

The processed content is written to a new file named processed_file.txt.

🛠 Features:
Reads and writes files using buffered streams.

Handles exceptions (FileNotFound, IO issues).

Uses StringBuilder for efficient string manipulation.

Outputs both the original and processed content.
Project 2: Employment System and Payroll Management
A full-featured object-oriented payroll system that simulates three types of employees and calculates their payments including bonuses:

Permanent Employees receive a 10% salary bonus.

Contract Employees receive a 5% salary bonus.

Interns receive a 2% salary bonus.

The system supports adding/removing employees and calculating total payroll via a PayrollSystem class that implements a Payable interface.

🛠 Features:
Abstract class Employee with subclasses:

PermanentEmployee

ContractEmployee

Intern

Bonus logic is handled via method overriding.

PayrollSystem uses a List<Employee> to manage employees.

Methods to:

Add and remove employees

Calculate total salary + bonus

Display employee info

A Test class demonstrates full functionality.
