package datatype;

public class WrapperTest {
	// Wrapper classes
	// every primitive data type has respective class is known as wrapper class class ko m
	//method haru use garna milxa wrapper class bata int a=600;a. garna mildena because it 
	//is primitive but in wrapper class it is used toString() // memory same linxa dubai le
    // Wrapper class:
	// primite     Wrapper
	// byte        Byte
	// int         Integer
	// char        Character
	//short        Short
	//long         Long
	//float        Float
	//double       Double
	//boolean      Boolean
	// autoboxing:process of conversion of primitive type to wrapper type
	// int x=3443;
	//Integer a=x;
	// unboxing: wrapper type to primitive type
	// example:
	//Double k=3443.545454545;
	// double p=k;
	public static void main(String args[]) {
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toOctalString(5));
		System.out.println(Integer.max(234, 567));
	}
	
}
