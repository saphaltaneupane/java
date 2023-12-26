package Abstraction;

public class Test {
    public static void main(String[] args) {
        CentralBank b = new KumarBank();

        b.getBankName();
        b.interestRate();
        UserService us = new UserServiceImpl();
      us.addUser();
       us.deleteUser();
//      CommaonService cs = new  UserServiceImpl();  //dynamic binding -- decides which which methods to run during runtime ----> also known as dynaic method dispatch
//       cs.print();

        us.print();
    }
}
// class extends hunxa ani matrai implements hunxa  

