# Patient Management System

This is a simple Java console application that manages a queue of patients based on their severity. The program uses a **priority queue** to ensure patients with higher severity are prioritized.

## Features

1. **Add Patient**  
   Users can add patients by entering their name and severity (1-10). A higher severity number means the patient needs immediate attention.

2. **View Next Patient**  
   Displays the patient with the highest severity in the queue without removing them.

3. **Process Next Patient**  
   Removes and processes the patient with the highest severity from the queue.

4. **Exit**  
   Allows the user to exit the program.

## How It Works

The application uses Java's `PriorityQueue` to manage patients. Patients are sorted in descending order of severity using the `Comparable` interface. The program continually displays a menu for user interaction until the user chooses to exit.

## Classes and Methods

### `Patient`
- Represents a patient with a name and severity level.
- Implements the `Comparable` interface to define custom priority rules.

#### Key Methods:
- `compareTo(Patient other)`: Ensures patients with higher severity are prioritized.
- `toString()`: Provides a readable representation of a patient's details.

### `PatientManagementSystem`
- Contains the main method to handle user interactions.
- Uses a loop to display a menu and perform actions based on user input.

## Usage

1. **Compile the Program**:
   ```bash
   javac PatientManagementSystem.java
