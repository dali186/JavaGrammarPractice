package Training.Enum;

import java.util.Objects;

public class Employee {
    private String Id;
    private String name;
    private Position position;
    private Department department;
    public static final String company = "Google"; //모든 객체들이 동일한 값을 가짐
    private static int total = 0;

    public Employee() {
        this.Id = String.format("%04d", (total + 1));
        total++;
    }

    public Employee(String name) {
        this.Id = String.format("%04d", (total + 1));
        this.name = name;
        total++;
    }

    public Employee(String name, Position position, Department department) {
        this.Id = String.format("%04d", (total + 1));
        this.name = name;
        this.position = position;
        this.department = department;
        total++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(Id, employee.Id) && Objects.equals(name, employee.name) && position == employee.position && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, position, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", department=" + department +
                '}';
    }
}
