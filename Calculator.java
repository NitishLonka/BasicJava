
public class Calculator {

	//Declare two variables here
	int number1=0;
	int number2=0;
	
	Calculator(int number1,int number2)
	{
       this.number1 = number1;
	   this.number2 = number2;
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

}
