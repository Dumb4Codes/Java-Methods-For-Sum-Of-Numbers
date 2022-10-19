
public class Z14_JavaMethods1 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 4;
		int z = add(x, y);
		
		System.out.println(z);

	}
	
	//we need to list the data type of the value we're returning if we are going to add two integers
	//then we are going to list the return type (void) as integer coz that's the data type of values
	
	static int add(int x, int y) {
		
		int z = x + y;
		
		return z;   //when we list return type (int) we need to list return statement
	}

}
