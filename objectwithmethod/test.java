package objectwithmethod;

public class test {
    public static void main(String[] args) {
//       student sd = new student();
//        sd.setId(100);
//        sd.setFname("saphalta");
//        sd.setLname("Neupane");
//        sd.setAge(30);
//        sd.setCity("biratnagar");
//        sd.setCollege("Asian ");
        test t = new test();// printStudent baney method test class bitra xa so  tesko object banauney
//        t.printStudent(sd);
        student sd =t.getStudentData();
        t.printStudent(sd);


    }
    //--------------Object as parameter----------
    void printStudent(student s){
        System.out.println("Id:"+s.getId());
        System.out.println("Fname"+s.getFname());
        System.out.println("Lname:"+s.getLname());
        System.out.println("college:"+s.getCollege());
        System.out.println("Age:"+s.getAge());
        System.out.println("city:"+s.getCity());
    }
    // Object as return type
    student getStudentData() {
        student sd = new student();
        sd.setId(100);
        sd.setFname("saphalta");
        sd.setLname("Neupane");
        sd.setAge(30);
        sd.setCity("biratnagar");
        sd.setCollege("Asian ");
       return sd;
    }
}

