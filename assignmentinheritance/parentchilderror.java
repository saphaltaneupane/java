package assignmentinheritance;

public class parentchilderror {
    public static void main(String[] args) {
        parent2 p = new parent2();
       // p.printparent();
        child2 c = new child2();
        c.print();
//   c.printparent();

    }
}
   class parent2{
        private void printparent(){
        System.out.println("This is a parent class");
    }
}
class child2 extends parent2{
    void print(){

        System.out.println("this is a chid class");
    }

}
