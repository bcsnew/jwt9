import java.util.Scanner;

class Employee {
int id;
String name;
double salary;

Employee(int id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
}

public class one {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of employees: ");
int n = sc.hasNextInt() ? sc.nextInt() : 3;
Employee[] emp = new Employee[n];
if (n <= 3) {
emp[0] = new Employee(101, "Alice", 45000.0);
emp[1] = new Employee(102, "Bob", 62000.0);
emp[2] = new Employee(103, "Charlie", 51000.0);
} else {
for (int i = 0; i < n; i++) {
emp[i] = new Employee(100 + i, "Emp" + i, 30000.0 + (i * 5000.0));
}
}
int maxIndex = 0;
for (int i = 1; i < n; i++) {
if (emp[i].salary > emp[maxIndex].salary) {
maxIndex = i;
}
}
System.out.println("Employee with Maximum Salary:");
System.out.println("ID: " + emp[maxIndex].id);
System.out.println("Name: " + emp[maxIndex].name);
System.out.println("Salary: " + emp[maxIndex].salary);
sc.close();
}
}
