  public class AirthmeticOperations {
     public static void main(String[] args) {
    	
    	int r= subtractNumber(20,5);
    	int r1= multiplyNumbers(4,5);
    	double r2= divideNumbers(20,4);
    	int r3= findRemainder(10,3);
    	 System.out.println(r);
	System.out.println(r1);
	System.out.printf("%.2f\n",r2);
	System.out.println(r3);
	
	}  

public static int subtractNumber(int n, int m)
{
	return n-m;
}
public static int multiplyNumbers(int n, int m)
{
	return n*m;
}
public static double divideNumbers(int n, int m)
{
	double d=(double)n/m;
	return d;
}
public static int findRemainder (int n, int m)
{
	return n%m;
}
}
