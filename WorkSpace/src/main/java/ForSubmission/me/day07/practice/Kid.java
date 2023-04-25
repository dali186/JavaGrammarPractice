package ForSubmission.me.day07.practice;

public class Kid extends Person implements SaleAble {
    @Override
    public double rate() {
        return 1.0; // 100%
    }

    @Override
    public double getDiscountRate() {
        return DiscountRate.KID.discountRate;
    }
}