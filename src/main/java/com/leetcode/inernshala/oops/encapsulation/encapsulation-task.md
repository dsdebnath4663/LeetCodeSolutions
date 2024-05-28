Here's a medium-level problem that can be solved using encapsulation in Java along with a UML diagram:

### Problem: Online Bookstore Management System

Design an online bookstore management system that allows users to buy books, view their order history, and manage their account information. Implement the system using encapsulation to ensure data privacy and modularity.

#### Requirements:

1. **Book Class:**
    - Attributes: title, author, ISBN, price, quantityAvailable.
    - Methods: getters and setters for all attributes.

2. **User Class:**
    - Attributes: username, email, password, address, orderHistory (list of purchased books).
    - Methods: getters and setters for all attributes, addToOrderHistory(Book book), viewOrderHistory().

3. **Bookstore Class:**
    - Attributes: bookInventory (list of available books), registeredUsers (list of registered users).
    - Methods: addBook(Book book), removeBook(Book book), registerUser(User user), getUserByUsername(String username), purchaseBook(User user, Book book).

#### UML Diagram:

```
---------------------------------
|         OnlineBookstore        |
---------------------------------
| - bookInventory: List<Book>    |
| - registeredUsers: List<User>  |
---------------------------------
| + addBook(Book book)           |
| + removeBook(Book book)        |
| + registerUser(User user)      |
| + getUserByUsername(username)  |
| + purchaseBook(User user,      |
|         Book book)             |
---------------------------------

---------------------------------
|             Book              |
---------------------------------
| - title: String               |
| - author: String              |
| - ISBN: String                |
| - price: double               |
| - quantityAvailable: int      |
---------------------------------
| + getters and setters         |
---------------------------------

---------------------------------
|             User              |
---------------------------------
| - username: String            |
| - email: String               |
| - password: String            |
| - address: String             |
| - orderHistory: List<Book>    |
---------------------------------
| + getters and setters         |
| + addToOrderHistory(Book book)|
| + viewOrderHistory()          |
---------------------------------
```

#### Explanation:

- The `OnlineBookstore` class represents the main system with attributes for book inventory and registered users. It has methods to add/remove books, register users, get a user by username, and purchase books for a user.
- The `Book` class encapsulates book-related data and provides getters/setters for its attributes.
- The `User` class encapsulates user-related data and provides methods to add books to order history and view order history.
- The UML diagram shows the relationships between these classes, including associations (such as `OnlineBookstore` having lists of `Book` and `User` objects) and methods (such as `addToOrderHistory` in the `User` class).

To solve this problem, you would implement the classes and methods according to the UML diagram, ensuring proper encapsulation of data and functionality within each class.