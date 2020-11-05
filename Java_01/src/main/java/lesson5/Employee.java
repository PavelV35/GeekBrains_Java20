package lesson5;

public class Employee {

    private String fullname;
    private String job;
    private String email;
    private String phone;
    private Integer salary;
    private Integer age;

    public Employee(String fullname, String job, String email, String phone, Integer salary, Integer age) {
        this.fullname = fullname;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + fullname + '\'' +
                ", должность='" + job + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + phone + '\'' +
                ", зарплата=" + salary +
                ", возраст=" + age +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }

    public Integer getAge() {
        return age;
    }
}
