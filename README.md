# Palindrome Checker App

A console-based Java application that demonstrates multiple algorithms and data structure approaches to determine whether a given string is a palindrome.

## Objective

The goal of this project is to implement and compare different palindrome-checking techniques while practicing core programming concepts, data structures, and software design patterns.

## Technologies Used

* Java
* Git & GitHub
* IntelliJ IDEA

## Implemented Use Cases

| Use Case | Description                                      |
| -------- | ------------------------------------------------ |
| UC1      | Application entry and welcome message            |
| UC2      | Hardcoded palindrome check using two pointers    |
| UC3      | Palindrome check using string reversal           |
| UC4      | Character array based palindrome check           |
| UC5      | Stack based palindrome checker                   |
| UC6      | Queue + Stack palindrome comparison              |
| UC7      | Deque based optimized palindrome check           |
| UC8      | Linked list based palindrome check               |
| UC9      | Recursive palindrome checker                     |
| UC10     | Case-insensitive and space-ignored palindrome    |
| UC11     | Object-oriented palindrome service class         |
| UC12     | Strategy pattern for dynamic algorithm selection |
| UC13     | Performance comparison of palindrome algorithms  |

## Project Structure

```
PALINDROME_CHECKER_APP
│
├── PalindromeChecker
│   └── src
│       └── PalindromeCheckerApp.java
│
├── .gitignore
└── README.md
```

## Git Workflow

This project follows a feature-based Git workflow:

```
main
  │
develop
  ├─ feature/UC1
  ├─ feature/UC2
  ├─ feature/UC3
  ├─ ...
  └─ feature/UC13
```

Each use case was implemented in its own branch and then merged into `develop`.

## How to Run

Compile the program:

```
javac PalindromeCheckerApp.java
```

Run the program:

```
java PalindromeCheckerApp
```

## Author

Subhodeep Mitra
