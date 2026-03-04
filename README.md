# Browser History Simulator using Doubly Linked List (Java)

##  🌟 Project Overview

This project is a **Browser History Simulator** built using **Java**, designed to demonstrate the practical use of **Doubly Linked Lists** and **Object-Oriented Programming (OOP)** concepts.

The application mimics how real web browsers manage history. It allows users to:

* Visit new web pages
* Navigate backward to previously visited pages
* Move forward to the next page
* View the current page
* Display the complete browsing history

This project helps in understanding how **data structures work in real-world systems**, particularly how browsers internally maintain navigation history.

---

##  👾 Learning Objectives

This project was developed to strengthen the understanding of:

### 1️⃣ Doubly Linked List Concepts

* Node creation
* Forward and backward traversal
* Dynamic memory structure
* Managing previous and next references
* Deleting forward history when visiting a new page

### 2️⃣ Object-Oriented Programming Concepts

* Classes and Objects
* Encapsulation
* Abstraction
* Modular design
* Separation of responsibilities

---

##  🤔 Why Doubly Linked List?

Browser history requires **two-way navigation**:

* **Back** → Move to the previous page
* **Forward** → Move to the next page

A **Doubly Linked List** is ideal for this because every node contains:

* A reference to the **previous page**
* A reference to the **next page**

Structure of a node:

```
Previous Page  ←  Current Page  →  Next Page
```

This makes navigation efficient and realistic compared to other data structures.

---

## ⚙️ Project Features

### Visit a New Page

When a new page is visited:

* A new node is created
* It is linked to the current page
* Forward history is cleared (similar to real browsers)

### Back Navigation

Moves to the previous node if it exists.

### Forward Navigation

Moves to the next node if available.

### Current Page

Displays the webpage the user is currently on.

### Print History

Displays the entire browsing history with the current page highlighted.

Example Output:

```
Browser History
google.com -> youtube.com -> [github.com] -> stackoverflow.com
```

The page inside **[ ]** represents the **current page**.

---

## 🏗 Project Structure

```
BrowserHistory.java
│
├── Node Class
│     Represents each webpage in the history
│
├── Browserhis Class
│     Contains all browser operations
│
└── Main Method
      Handles user interaction through a menu
```

---

## 🧩 Core Components

### Node Class

Each node represents a webpage.

Attributes:

* `link` → stores the URL
* `prev` → reference to the previous page
* `next` → reference to the next page

```
Node
 ├── String link
 ├── Node prev
 └── Node next
```

---

### Browser History Manager

The `Browserhis` class manages all operations including:

* Visiting pages
* Navigating backward
* Navigating forward
* Printing history

It maintains a pointer:

```
curr → points to the current page
```

---

## 💻 Menu Driven Interface

The program runs with a simple console menu.

```
===== Browser Menu =====
1. Visit New Page
2. Back
3. Forward
4. Show Current Page
5. Print History
6. Exit
```

This allows users to interactively test browser navigation.

---

## ▶️ How to Run the Program

### Step 1: Compile

```
javac BrowserHistory.java
```

### Step 2: Run

```
java BrowserHistory
```

---

## 📷 Example Execution

```
Enter HomePage: google.com

===== Browser Menu =====
1. Visit New Page
2. Back
3. Forward
4. Show Current Page
5. Print History
6. Exit
```

Example interaction:

```
Visit: youtube.com
Visit: github.com
Back
Current Page: youtube.com
Forward
Current Page: github.com
```

---

## 🔑 Concepts Strengthened

This project reinforces several important programming ideas:

### Data Structures

* Doubly Linked List implementation
* Dynamic navigation
* Pointer manipulation

### OOP Design

* Encapsulation using private variables
* Modular class structure
* Object interaction

### Problem Solving

* Understanding real-world system design
* Managing dynamic data structures
* Handling edge cases in navigation

---

## 🌐 Real-World Connection

Modern browsers like:

* Google Chrome
* Mozilla Firefox
* Microsoft Edge

internally maintain browsing history using structures **similar to linked lists**, enabling efficient backward and forward navigation.

This project replicates that behavior in a simplified form.

---

## 🚀 Future Improvements

Possible extensions for this project include:

* GUI version using Java Swing
* Tab management system
* History persistence using files
* Search within browser history
* Bookmark system

---

## 🫡 Author

**Naveen Prasath S**

This project was developed as part of practicing **Data Structures and Object-Oriented Programming in Java**, focusing on mastering **Linked Lists through real-world applications**.
