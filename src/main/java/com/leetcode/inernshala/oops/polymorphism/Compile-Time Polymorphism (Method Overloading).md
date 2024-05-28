
### Task: Implement a Shape Calculator

#### Objective:
The intern will create a simple shape calculator program that demonstrates compile-time polymorphism through method overloading. The program will calculate the area of different shapes such as a circle, rectangle, and triangle.

#### Instructions:

1. **Create a `ShapeCalculator` Class**:
    - Define methods to calculate the area of different shapes using method overloading.
        - `double calculateArea(double radius)` for calculating the area of a circle.
        - `double calculateArea(double length, double width)` for calculating the area of a rectangle.
        - `double calculateArea(double base, double height, String type)` for calculating the area of a triangle. The `type` parameter should specify the type of triangle (e.g., "equilateral", "isosceles", "scalene").

2. **Implement Method Overloading**:
    - Each method should accept parameters relevant to the shape being calculated.
    - Provide specific implementations for calculating the area of each shape in the respective methods.

3. **Create a Main Class**:
    - In the main class, create an instance of `ShapeCalculator`.
    - Call each method with appropriate arguments to calculate and print the areas of a circle, rectangle, and different types of triangles.

4. **Include Error Handling** (Optional):
    - Handle invalid input gracefully (e.g., negative values for dimensions, invalid triangle types).


#### UML Class Diagram:

```plaintext
+------------------+
|   ShapeCalculator   |
+------------------+
| + calculateArea(radius: double): double |
| + calculateArea(length: double, width: double): double |
| + calculateArea(base: double, height: double, type: String): double |
+------------------+
```

