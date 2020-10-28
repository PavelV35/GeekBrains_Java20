package lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivanov@mailbox.com", "892312310", 30_000, 30);
        emplArray[1] = new Employee("Sidorov Sergey", "Sales", "Sidorov.Sergey@mailbox.com", "892312311", 40_000, 18);
        emplArray[2] = new Employee("Olonov Alexey", "Engineer", "Olonov.Alexey@mailbox.com", "892312312", 50_000, 49);
        emplArray[3] = new Employee("Samsonova Olga", "Head of Purch. dpt.", "Samsonova.Olga@mailbox.com", "892312313", 100_000, 39);
        emplArray[4] = new Employee("Malyshev Oleg2", "IT", "Malyshev.Oleg@mailbox.com", "892312314", 80_000, 55);

        for (Employee employee : emplArray) {
            if (employee.getAge() > 40) {
                employee.print();
            }
        }

    }


}
