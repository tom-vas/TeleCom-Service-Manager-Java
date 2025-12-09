# TeleCom Service Manager 📱

A Java-based console application that simulates a complete management system for a mobile telecommunications provider. This project was developed as part of the "Computer Programming in Java" course at Athens University of Economics and Business (AUEB).

## 📖 Overview

The application manages communication services (Mobile Telephony & Internet) and customer contracts. It supports **File Persistence**, meaning it loads service and contract data from text files upon startup and saves changes when exiting.

## ✨ Features

* **File Persistence:** Automatically loads/saves data from `service_list.txt` and `contracts_list.txt`.
* **Service Management:** Handles various plan types:
    * **Contracts:** Fixed monthly fee, free minutes/SMS.
    * **Card-Contracts:** Pre-paid balance logic.
    * **Internet:** Data-only plans.
* **Billing Engine:** Calculates monthly costs based on usage (Minutes, SMS, Data) vs. free allowance, applying specific rates and discounts.
* **Statistics:** Tracks remaining free time/data and account balance.
* **CLI Menu:** User-friendly command-line interface for creating contracts and viewing stats.

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher.

### Installation
1.  Clone the repository or download the source code.
2.  Ensure `service_list.txt` and `contracts_list.txt` are in the same folder as the `.java` files.

### Compilation
Navigate to the project directory and compile:

    javac *.java

### Execution
Run the main application:

    java mainApp

## 🕹️ Usage (Menu)

1.  **See Services:** View details of loaded service plans.
2.  **Create a new contract:** interactive form to register a new customer.
3.  **View active contracts:** Filter contracts by service type.
4.  **Update statistics:** Input usage data (e.g., minutes talked) for a specific contract ID.
5.  **Calculation of monthly cost:** Prints the final bill for all clients, including extra charges.
6.  **Current client stats:** Shows remaining balance/allowance.
0.  **Exit:** Saves data to files and closes the app.

## 📂 File Structure

* `mainApp.java`: The entry point and menu logic.
* `Service.java`, `symvolaio_kin.java`, `Kartosymvolaio.java`, `Internet.java`: The Service inheritance hierarchy.
* `Symvolaia.java`: Represents a customer contract.
* `ServiceCollection.java`, `SymvolaiaCollection.java`: Data structures managing lists of objects.
* `ServicesFile.java`, `ContractFiles.java`: Handlers for parsing and writing text files.
* `*.txt`: Database files for storing services and contracts.

## 👥 Contributors

* **Gewrgios Vlasshs**
* **Thomas Vasilas**
* **Iwanna Zaxarakh**

---
*Disclaimer: This project uses Greek terminology (Greeklish) for variable names and specific business logic as per the assignment requirements.*
