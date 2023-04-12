package Training.Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Employee.company + "에는 다음과 같은 부서가 있습니다.");
        for (Department department : Department.values()) {
            System.out.printf("%s[%d], ", department.getDepartmentName(), department.ordinal());
        }
        System.out.println();
        System.out.println(Employee.company + "에는 다음과 같은 직책이 있습니다.");
        for (Position position : Position.values()) {
            System.out.printf("%s[%d], ", position.getPositionName(), position.ordinal());
        }
        System.out.println();
        System.out.println();

        Employee employee1 = new Employee();
        System.out.println(employee1);

        Employee employee2 = new Employee("Steve");
        System.out.println(employee2);

        Employee employee3 = new Employee("Kevin", Position.STAFF, Department.DEVELOP);
        System.out.println(employee3);
    }
}
