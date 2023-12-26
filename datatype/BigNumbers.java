package datatype;

import java.math.BigInteger;

public class BigNumbers {
	// a>BigInteger
	//b>BigDecimal
	public static void main(String[] args) {
		
		BigInteger a= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger c =a.add(b);
		System.out.println(c);// long long add garnu paryo bane aatdena so
	}
	
	}


