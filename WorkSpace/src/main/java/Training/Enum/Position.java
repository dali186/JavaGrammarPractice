package Training.Enum;

public enum Position {
    PRESIDENT("사장"), DIRECTOR("이사"), MANAGER("과장"), SENIOR("주임"), STAFF("사원");

    private String positionName = null;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
