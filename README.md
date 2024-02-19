# Showroom-Management-System

Mini Project On OOP Concept

Overview:

This Java code implements a simple showroom management system. It allows users to add and retrieve details of showrooms, employees, and cars.

Components:

Object Oriented Programming

Utility Interface:

Defines two methods: setDetails() and getDetails().

Showroom Class:

Implements the Utility interface.

Manages details related to a showroom such as name, address, manager name, total employees, and total cars in stock.
Provides methods to set and get showroom details.

Employee Class:

Extends the Showroom class and implements the Utility interface.
Manages details of an employee such as ID, name, age, department, and associated showroom.
Provides methods to set and get employee details.

Cars Class:

Extends the Showroom class and implements the Utility interface.
Manages details related to cars such as name, color, fuel type, price, type, and transmission.
Provides methods to set and get car details.

Main Class:

Contains the main method to run the program.
Displays a menu for users to choose options like adding showrooms, employees, or cars, and retrieving their details.
Uses arrays to store objects of showrooms, employees, and cars.
Provides options to go back to the main menu or exit the program.

Usage:

Compile and run the Main class.
Choose options from the menu to perform various operations like adding and retrieving details.
Follow the prompts to input details when required.
