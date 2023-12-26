package constructor;

public class User {
//    --------default constructor------
    // instance variable

    String userName;
    String password;
//    User(){
//        userName="root";
//        password="2222";
//    }
    //-----parameterized constructor------
    User(String un,String psw){
        userName=un; // local variable ma   bako instance ma gako
        // this.userName=userName;// this rakhney same keyword bayo baney instance variable
        password=psw;
        this.printUser();// calling method
//        this("sdf","sddf");

        // calling paramermiterrized constructor
    }
    void printUser(){
        System.out.println("username"+userName);
        System.out.println("password:"+password);
    }

    public static void main(String[] args) {
        int a,b,c;
        a=10;
        User u1,u2;
        u1 = new User("sefsd","sefsf");
        User u =new User("hello","ssss");
        u.printUser();
        u.password="ssdddf"; // individual laye change bo
        // new User().printUser();
    }
}
