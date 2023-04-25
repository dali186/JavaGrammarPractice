package ForSubmission.me.day07.practice;

public class Student extends Person implements SaleAble {
    @Override
    public double rate() {
        return 0.3; // 30%
    }

    @Override
    public double getDiscountRate() {
        return DiscountRate.STUDENT.discountRate;
    }
}