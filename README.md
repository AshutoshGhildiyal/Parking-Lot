# Parking Lot ( Low Level Design) 


This project is an LLD implementation of Parking Lot Management System. The project is build using SOLID priciples and Design Patterns using Java and adheres to the SOLID 
priciples and utilizes design patterns to ensure modularity and scalability. It supports multiple vehicle types , parking spot types, and payment methods.


Features 

* Multi-floor parking lot with entry and exit gates.
* Support for different parking spot types(e.g. CAR , Bikes , Truck).
* Dynamic parking spot availability display.
* Ticket generation for parked vehicles.
* Payment processing via cash , credit card, or UPI.
* Hourly Charges.


Project Structure 
The project follows a modular structure for netter maintainability.

Key Components 


vehicle package
* Vehicle.java - Abstract class for vehicles.
* Car.java, Bike.java, Truck.java - Specific implementations for vehicle types.

payment package-
* Payment.java- Manages payment logic.
* PaymentStrategy.java - Strategy pattern for payment processing.
* UPIPayment - Specific implementation for payment methods.


service package
* ParkingLot.java - responsible for generating Ticket at the the time vehicle comes in and calculates the the total fare at exit.

pricing package
* PricingStrategy.java  - Strategy pattern for calculating prices on the basis of type of vehicle.
* BikePricingStrategy.java - Specific Implementation for calculating fare for BIKE.
* CarPricingStrategy.java - Specific implementation for calculating fare for CAR.








Main.java 
 Entry point of the application. Contains the main method to initialize and run the parking lot system.


Extending the System
The design ensures the system is easilty extensible. Eg

* Add New Vehicle Type: 
Create a new class extending Vehicle.java

* Add New Payment Methods:
  Implement the PaymentStrategy interface.

* Enhance Display boards:
  Modify ParkingFloor.java to update the display logic.
