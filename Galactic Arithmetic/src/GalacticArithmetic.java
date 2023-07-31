import java.util.Scanner;

public class GalacticArithmetic {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long a=s.nextLong();
	long b=s.nextLong();
	long r=galacticAddition(a,b);
	System.out.println(r);
}
public static long galacticAddition(long a, long b)
{
	return a+b;
}
}
