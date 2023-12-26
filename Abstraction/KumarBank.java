package Abstraction;

public class KumarBank  extends CentralBank{
// implement garnai parxa abstract class
    @Override
    void getBankName() {
        System.out.println("Kumari bank");
    }

    @Override
    void interestRate() {
        System.out.println("9%");
    }
}
