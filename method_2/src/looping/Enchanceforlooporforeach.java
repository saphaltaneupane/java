package method_2.src.looping;

public class Enchanceforlooporforeach {
	/* 
	 * ------Enhance forloop/forEach)---
	 * use to read data from collection (array,list,set,map)
	 * syntax:
	 *  for(data_type var :collection name ){
	 *  //statements}*/
	public static void main(String[] args) {
		int [] values= {4,5,6,7,8};// value ko data type halna parxa loop ma i mean array banako ko
		int sum=0;
		for(int x: values) {// size is indicated by the size of collection
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println("sum:"+sum);
	}

}
