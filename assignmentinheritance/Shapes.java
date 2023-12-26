package assignmentinheritance;
/*
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to
print the area and perimeter of the rectangle respectively. Its constructor having parameters for length
and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the
'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor
of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square
 */
public class Shapes {
    public static void main(String[] args) {

    }
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(int l , int b){
        length=l;
        breadth = b;
    }
    int area(){
        return length * breadth;
    }
    int perimeter(){
        return 2 * (length + breadth);
    }
}

//class Square extends  Rectangle{
////    Square(){
////        super(int s,int s);
//    }
//}