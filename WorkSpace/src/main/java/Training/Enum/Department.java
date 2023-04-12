package Training.Enum;

public enum Department {
    //열거형, 클래스처럼 정의
    //상수값들을 정의할 수 있음
    //static final int ADMIN = 0;
    //static final int DEVELOP = 1;
    //static final int RESEARCH = 2;
    //생성자를 만들 수 있음

    //열거 상수
    ADMIN("경영관리부서"), DEVELOP("개발부서"), RESEARCH("연구부서"),
    LAW("법무부서"), MARKETING("홍보부서"), PRODUCTION("생산부서");

    //field
    private String departmentName = null;

    //클래스처럼 사용가능
    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
