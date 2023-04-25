
import java.util.Arrays;

public class Calculator {

	//Declare two variables here
	int number1=0;
	int number2=0;
	int[] array1;
	int[] array2;
	Calculator(int number1,int number2)
	{
       this.number1 = number1;
	   this.number2 = number2;
	}
	
	Calculator(int[] array1,int[] array2)
	{
		this.array1 = Arrays.copyOf(array1,array1.length);
		this.array2 = Arrays.copyOf(array2,array2.length);
	}
	
	//Pass two variables into the below method and return sum
	public int sum(int number1,int number2) {
		return number1 + number2;
	}
	
	//Pass two variables into the below method and return product
	public  int multiply(int number1,int number2) {
		return number1*number2;
	}
	
	//Pass two variables into the below method and return quotient
	public  int division(int number1,int number2) {
		return number1/number2;
	}
	
	//Pass two variables into the below method and return difference
	public  int subtract(int number1,int number2) {
		return number1-number2;
	}

	public int[] measure(String type )
	{
	   //Both the arrays are equal in length...	
		if(type!=""){

		//Code here 
       

        //return an array of sums of corresponding numbers from array 1 and array 2 if type is "sum"
		//return an array of products of corresponding numbers from array 1 and array 2  if type is "product"
		//return an array of divisions of corresponding numbers from array 1 and array 2 if type is "division"
		//return an array of sums of corresponding numbers from array 1 and array 2 if type is "subtract"

        

		}
        return new int[3];		

	}

}
