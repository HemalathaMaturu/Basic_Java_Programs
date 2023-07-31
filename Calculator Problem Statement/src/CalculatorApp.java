import java.util.Scanner;
public class CalculatorApp {
  public static void main(String[] args) {
	for(;;)
	{
	  System.out.println("Hello user welcome to KodnestCalculator");
	System.out.println("+ --> addition");
	System.out.println("- --> subtraction");
	System.out.println("* --> multiplication");
	System.out.println("/ --> division");
	System.out.println("% --> remainder");
	System.out.println("^ --> square");
	Scanner s=new Scanner(System.in);
	
	System.out.println("select your character :");
	System.out.println("Enter two values : ");
	int a=s.nextInt();
	int b=s.nextInt();
	char z=s.next().charAt(0);
	Calculator.calculator(a,b,z);
	if(z=='!')
	{
		System.out.println("bye ");
		return;
	}
	}
	
	
}
}
