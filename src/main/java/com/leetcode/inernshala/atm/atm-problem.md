### ATM Problem Statement (Short Version)

Create a simple ATM application in Java using only static methods and basic control structures (no OOP). The application should provide the following functionalities:

1. **Check Balance**: Display the current account balance.
2. **Deposit Money**: Allow the user to deposit a specified amount.
3. **Withdraw Money**: Allow the user to withdraw a specified amount if sufficient funds are available.
4. **Exit**: Exit the application.

**Requirements**:
- Start with an initial balance of $1000.00.
- Display a menu for user interactions.
- Validate user inputs:
    - Positive amounts for deposits and withdrawals.
    - Sufficient funds for withdrawals.
- Loop until the user chooses to exit.

### Sample Menu

```
ATM Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option:
```

**Example Interaction**:

```
Choose an option: 1
Your current balance is: $1000.00

Choose an option: 2
Enter amount to deposit: 500
You have successfully deposited $500.00
Your current balance is: $1500.00

Choose an option: 3
Enter amount to withdraw: 200
You have successfully withdrawn $200.00
Your current balance is: $1300.00

Choose an option: 4
Thank you for using the ATM. Goodbye!
```

### Implementation

- Use a static variable for the balance.
- Implement static methods for each operation.
- Use `Scanner` for input.
- Use a `do-while` loop for the menu.

### Deliverable

Provide a well-structured Java program implementing the described ATM functionality.