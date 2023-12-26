package assignmentinheritance;

public class parentchild {
    public static void main(String[] args) {
        parent p = new parent();
        p.printparent();
        child c = new child();
        c.print();
        c.printparent();

    }
}
 class parent {
    void printparent(){
        System.out.println("This is a parent class");
    }
}
class child extends parent{
    void print(){

        System.out.println("this is a chid class");
    }

}
