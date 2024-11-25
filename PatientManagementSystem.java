import java.util.PriorityQueue;
import java.util.Scanner;

class Patient implements Comparable<Patient> {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    public String toString() {
        return "Patient: " + name + " | Severity: " + severity;
    }
}

public class PatientManagementSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Patient Management System!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Patient");
            System.out.println("2. View Next Patient");
            System.out.println("3. Process Next Patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter severity (1-10, where 10 is the most severe): ");
                    int severity = scanner.nextInt();
                    scanner.nextLine();

                    patientQueue.offer(new Patient(name, severity));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    if (!patientQueue.isEmpty()) {
                        System.out.println("Next patient in queue: " + patientQueue.peek());
                    } else {
                        System.out.println("No patients in the queue.");
                    }
                    break;

                case 3:
                    if (!patientQueue.isEmpty()) {
                        System.out.println("Processing patient: " + patientQueue.poll());
                    } else {
                        System.out.println("No patients to process.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Stay safe!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
