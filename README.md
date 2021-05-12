# Amex-Project

Built using Spring, Thymeleaf and MySql

Step 3 seems to have commited to a different folder. Step 1 can be found in a previous commit.

--Full Instructions--


**Step 1**: Build an Orders Service

Code to receive and send back orders with the total price and order summary

Using Thymeleaf and Spring

To use run either AmexProjectApplicaiton.java or compile it into a .jar

Then go to http://localhost:8080/order to use




**Step 2**: Simple Offers

Adds Offers to the program which applys the following discounts: Apples (2 for 1), Oranges (3 for 2)




**Step 3**: Store and retrieve orders

Adds the saving and retrieval of orders to a MySQL database


To use: Run a local MySQL server on the port 3306 and have the username set to: root  and the password to user.
This can be changed in the application.properties.

To retrieve all orders go to http://localhost:8080/api/order
To retrieve a specific order by its id use: http://localhost:8080/api/order/(id-number-here)
