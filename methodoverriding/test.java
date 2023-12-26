package methodoverriding;

public class test {
    public static void main(String[] args) {
        //static or early binding of the object
        NABILBANK b = new NABILBANK();
        b.moneyExRate();
        b.getBankName();
        b.interestRate();
        //up-casting
        CentralBank pb = new PrabhuBank();

    }
    // run time polymorphism -run garesi thaha huna le
    //dynamic or late binding of object
    void printBankInfo(CentralBank b){
        b.getBankName();
        b.interestRate();
    }
}
