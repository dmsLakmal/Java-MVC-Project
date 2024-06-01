# Java-MVC-Project
![Screenshot 2024-06-01 174801](https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/7a07f559-60b9-4987-bcf7-58e2b0fcaa56)
 
This project is built using the Java MVC architecture and serves as a simple admin management system for a food store. It supports CRUD operations and manages multiple databases. Through this system, the admin can manage:
01. Product
02. Seller
03. Staff

Admin Login: Admin can log into the system using a username and password. Authentication is used to verify login credentials. After logging in, the admin can choose to manage products, sellers, or staff. Each category allows for Create, Read, Update, and Delete operations.

## Database
The system uses a database named 'studentdb', which contains four tables:
01. login
02. product
03. seller
04. staff  

Admins can add data to these tables and retrieve data from them as needed.

## Screenshots
<table>
  <tr>
    <td>
      <b>Login Screen</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/ff07477c-59dc-448c-b77f-b93363753f3b" alt="Login Screen">
    </td>
    <td>
      <b>Product Management</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/3fb846ec-afa4-427e-8c06-c396242b24bb" alt="Product Management">
    </td>
    <td>
      <b>Seller Management</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/806cd0b8-cfb6-490d-8bf4-3781c8d6675b" alt="Seller Management">
    </td>
    <td>
      <b>Staff Management</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/401ff989-9600-40eb-8fd5-d07a43fc7a36" alt="Staff Management">
    </td>
  </tr>
</table>

<table>
  <tr>
    <td>
      <b>Catogary Screen</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/b1056adb-7201-4da2-99ed-958ecd9ad088" alt="Login Screen">
    </td>
    <td>
      <b>Product View</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/f167f6c2-6bba-4c75-965c-c5b754d1a1e2" alt="Product Management">
    </td>
    <td>
      <b>Seller View</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/14421992-a542-4a26-aeff-6ab98647ca7c" alt="Seller Management">
    </td>
    <td>
      <b>Staff View</b><br>
      <img src="https://github.com/dmsLakmal/Java-MVC-Project/assets/143265507/c275469e-6c28-498d-b06b-29b215a7d26e" alt="Staff Management">
    </td>
  </tr>
</table>

## Introduction to MVC Architecture

MVC (Model-View-Controller) is a design pattern commonly used in software development to separate an application into three interconnected components: Model, View, and Controller. This separation helps manage the complexity of application development, improves code organization, and facilitates testing and maintenance.

### Components of MVC

1. **Model**
   - The Model represents the data and the business logic of the application. It directly manages the data, logic, and rules of the application.
   - Responsibilities:
     - Fetching data from the database.
     - Processing data and applying business rules.
     - Notifying the View of any data changes.
   - Example: In a food store management system, the `Product`, `Seller`, and `Staff` classes that handle CRUD operations are part of the Model.

2. **View**
   - The View is responsible for displaying the data to the user. It represents the UI (User Interface) of the application.
   - Responsibilities:
     - Rendering data from the Model to the user.
     - Providing a means for user interaction.
   - Example: HTML pages, JSPs, or any other UI representation showing the product list, seller details, or staff information.

3. **Controller**
   - The Controller acts as an intermediary between the Model and the View. It listens to the input from the View, processes it (by updating the Model), and returns the output display to the View.
   - Responsibilities:
     - Handling user input.
     - Updating the Model based on user actions.
     - Selecting the appropriate View for rendering the output.
   - Example: Servlets or specific controller classes that handle requests for product management, such as adding a new product or updating seller information.

### How MVC Works Together

1. **User Interaction**: The user interacts with the UI (View), for example, by clicking a button or entering data.
2. **Controller Receives Input**: The Controller receives this input and determines what action to take.
3. **Model Update**: The Controller communicates with the Model to update the application's data. For instance, it might add a new product or retrieve seller details.
4. **View Update**: Once the Model is updated, it notifies the View to refresh the displayed data.
5. **Updated UI**: The View then renders the updated data, and the user sees the changes.

### Benefits of MVC Architecture

- **Separation of Concerns**: Each component (Model, View, Controller) has a distinct responsibility, which makes the application easier to manage and understand.
- **Reusability**: Components can be reused across different parts of the application or even in different projects.
- **Testability**: Because of the separation, each component can be tested independently, improving the application's robustness.
- **Maintainability**: Changes in one part of the application (e.g., the UI) can be made with minimal impact on the other parts (e.g., business logic).

### Example in Java

In a Java-based web application, the MVC pattern might be implemented as follows:

- **Model**: Java classes representing the business entities (e.g., `Product.java`, `Seller.java`) and data access objects (DAOs) to interact with the database.
- **View**: JSP (JavaServer Pages) files or HTML/CSS/JavaScript files displaying the data to the user.
- **Controller**: Servlets or Spring MVC controllers handling HTTP requests, processing input, and determining which View to display.

By adhering to the MVC architecture, developers can build scalable, maintainable, and testable applications.










