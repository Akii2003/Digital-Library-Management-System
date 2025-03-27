# Digital-Library-Management-System

1. Overview of the System
The Library Management System consists of four Java classes:

Book.java: Represents the blueprint for individual book objects.
Library.java: Contains the catalog of books using a HashMap and provides methods to add, retrieve, or remove books.
LibraryService.java: Handles the operations on the library, including adding, searching, updating, and deleting books.
LibraryManage.java: The main program that interacts with the user through a console-based menu.

2.How It Works
🗂️ Book.java (Model Class)
This defines the structure of a book with five properties:

id: Unique ID for each book (an int type).
title: Book title.
author: Author's name.
genre: Category of the book (e.g., Fiction, Science).
availStatus: Availability status ("Available" or "Checked Out").

Includes:
Constructors: To create book objects with or without initial values.
Getters and Setters: To access and modify book properties.
toString() Method: For easily displaying book details in a readable format.

📚 Library.java (Storage Layer)
This manages the collection of books using a HashMap: The key is the Book ID (integer).The value is the Book object.

Operations included:
addBook(Book book): Adds a book to the catalog.
getBook(int id): Retrieves a book by its ID.
containsBook(int id): Checks if the book exists by ID.
removeBook(int id): Deletes a book from the catalog.

⚙️ LibraryService.java (Service Layer)
This class contains the business logic and interacts with the Library.java class:
Add Book: Adds a new book only if: The ID is unique.
Title and Author are not empty.
Availability status is either "Available" or "Checked Out".
View All Books: Prints details of all books.
Search Book: Searches by either: ID (numerical search) OR Title (textual search).
Update Book: Modifies book details by ID.
Delete Book: Removes a book by ID.

🖥️ LibraryManage.java (Main Class)
This is the entry point of the program.
Provides a console-based menu to:
Add, view, search, update, and delete books.
Use Scanner to accept user inputs.
Runs in a loop until the user chooses the Exit option.


