package ForSubmission.me.day07.practice;

public enum DiscountRate {
    STUDENT(0.3), KID(1), WORKER(0);

    double discountRate;
    DiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
}
