package Assignment.day03.practice04;

public class TeslaCar { // 테슬라 자동차만 만드는 공장
    private String ID;
    private String modelName;
    private String color;
    public static final String BRAND = "Tesla";

    public TeslaCar() {}

    public TeslaCar(String ID, String modelName, String color) {
        this.ID = ID;
        this.modelName = modelName;
        this.color = color;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TeslaCar{" +
                "ID='" + ID + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /*
    1.아래 코드에서 BRAND라는 새로운 필드를 정의하려고 해보자. BRAND는 모든 객체들이 변하지 않는 동일한 값인 “Tesla”를 저장한다고 가정하자.
        A. 1) "Tesla"는 모든 객체들의 변하지 않는 동일한 값이기 때문에 static final으로 선언한다.
             public이냐 private이냐에 대해서는 이미 static final이라는 변경 불가능한 변수가 되었기 때문에 public을 써도 무방하다.
    2. 새로운 필드인 BRAND를 접근하는 코드를 작성하시오
        A. System.out.println(tc.BRAND);
     */
}
