### Project Title: Array Equilibrium(balance point) Index Finder
### Description
This project implements an efficient Java solution to find the equilibrium index (also known as the balance point) in an array. The equilibrium index is a position where the sum of elements on the left is equal to the sum of elements on the right.

**Features**

- Time complexity: O(n)
- Efficient space usage.
- Handles both positive and negative numbers in the array.
- Returns all equilibrium indices if more than one exists.

### Approach

Prefix sum method: The solution uses the concept of prefix sums to avoid recalculating sums repeatedly. We calculate the total sum of the array and iterate through it to find the equilibrium index by maintaining a left sum at each step.

### Technology Stack

**Java:** Core Java (no external dependencies).

### Installation and Setup

1. Clone the repository:

`git clone https://github.com/hasnaindar8/ArrayEquilibriumIndex.git`

3. Navigate to the project directory and run the program:
```
cd ArrayEquilibriumIndex
javac Main.java
java Main

``` 
### How to Use

1. Input an integer array.
2. The program will return the equilibrium index where the sum of elements on both sides is equal.

**Example:**
```
Input: [1, 7, 3, 6, 5, 6]
Output: Equilibrium Index: 3

```
### Code Structure

```
ArrayEquilibriumIndex/
├── src/
│   └── Main.java        # Main implementation of the equilibrium index finder
├── README.md            # Project documentation
├── .gitignore           # Ignore unnecessary files like class files, IDE-specific files

```
