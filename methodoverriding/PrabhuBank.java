package methodoverriding;

public class PrabhuBank  extends CentralBank{
    @Override
    void getBankName() {
        System.out.println("Prabhubank");

    }

    @Override
    void interestRate() {
        System.out.println("14%");
    }
}
