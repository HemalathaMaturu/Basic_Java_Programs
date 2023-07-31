
public class Calculator 
{
	public static void calculator(int a, int b, char z) {
switch(z)
{ 
case '+' :
	System.out.println((a+b));
	break;
case '-' :
	System.out.println((a-b));
	break;

case '*' :
	System.out.println((a*b));
	break;
case '/' :
	System.out.println((a/b));
	break;
case '%' :
	System.out.println((a%b));
	break;
case '^':
	System.out.println((a*a));
	break;
}
	}

}
