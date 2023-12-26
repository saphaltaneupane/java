package aggregation;

public class test {
    public static void main(String[] args) {
        car c = new car();
        c.setModel("MVX1000");
        c.setColor("Black");
        c.setPrice(500000000);
        Employee emp = new Employee();
        emp.setId(10);
        emp.setName("sudershan");
        emp.setSalary(8000000);
        emp.setCar(c);
        System.out.println("name:"+emp.getName());
        System.out.println("------car info--------");
        System.out.println("color"+emp.getCar().getColor());
        System.out.println("model:"+emp.getCar().getModel());
    }
}
