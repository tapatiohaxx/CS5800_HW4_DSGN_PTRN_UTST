# Project Overview

This project consists of two main components: the **Micronutrient Management System** and the **Pizza Ordering System**. Each component is designed to demonstrate specific software design patterns and testing strategies using Java.

## 1. Micronutrient Management System

The Micronutrient Management System is designed to simulate the creation of customized meals based on different dietary restrictions. It utilizes the Abstract Factory and Singleton design patterns to manage the creation of macronutrient components (Carbs, Proteins, Fats) according to specified diet plans.

### Features

- **Abstract Factory Pattern**: Used to create families of related objects (Carbs, Proteins, Fats) without specifying their concrete classes.
- **Singleton Pattern**: Ensures that a class has only one instance and provides a global point of access to it.
- **Dietary Customization**: Supports various diet plans including Paleo, Vegan, No Restriction, and Nut Allergy.

### Key Classes

- `Macronutrient`: Defines enums for Carbs, Proteins, and Fats and contains nested static factory classes for each diet type.
- `PaleoFactory`, `VeganFactory`, `NoRestrictionFactory`, `NutAllergyFactory`: Concrete factories for creating diet-specific macronutrients.

### Unit Tests

Unit tests for the Macronutrient Management System verify the correct instantiation and functionality of each diet-specific factory, ensuring that dietary restrictions are respected.

## 2. Pizza Ordering System

The Pizza Ordering System demonstrates the Builder design pattern through a customizable pizza creation process. Users can create different pizzas by specifying the size, toppings, and the chain from which the pizza is ordered.

### Features

- **Builder Pattern**: Simplifies the construction of a complex `Pizza` object by breaking the construction process into multiple steps.
- **Customizable Pizzas**: Allows for adding multiple toppings and choosing sizes.

### Key Classes

- `Pizza`: Main class that holds pizza properties and includes a nested `PizzaBuilder` static class.
- `Topping`: Enum that lists possible toppings for pizzas.
- `PizzaOrder`: Contains a `main` method demonstrating various pizza orders.

### Unit Tests

Unit tests for the Pizza Ordering System validate the functionality of the `PizzaBuilder`, ensuring that pizzas are built correctly with the specified attributes and toppings. They also test the behavior of the `eat()` method, which simulates eating the pizza.

## How to Run the Programs

1. **Compile the Classes**: Make sure all Java files are compiled. You can use any Java IDE or the command line:
    ```bash
    javac *.java
    ```
2. **Run the Programs**:
    - For the Macronutrient Management System:
        ```bash
        java MacronutrientTester
        ```
    - For the Pizza Ordering System:
        ```bash
        java PizzaOrder
        ```

3. **Execute Unit Tests**: Run the unit tests using JUnit. Ensure that JUnit is configured in your IDE, or use Maven/Gradle if your project is configured with one of these build tools.

## Dependencies

- Java JDK 8 or higher.
- JUnit 5 for unit testing.

## Authors

- **Your Name** - Initial work and documentation.

Feel free to expand this README with installation guides, more detailed usage instructions, screenshots, and contributions guidelines as needed for your project.
