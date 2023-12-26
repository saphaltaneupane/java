package methodoverriding;

public class NABILBANK extends CentralBank  {
    @Override
    void getBankName() {
        System.out.println("NABILBANK");

    }

    @Override
    void interestRate() {
        System.out.println("9.1");
    }
}

