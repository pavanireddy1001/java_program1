public class RecursiveJavaFactorialProgram {
	public static void main (String[]ars){
	long nFactorial = factorialProgram(9);
	System.out.println (nFactorial);
}
	public static long factorialProgram (long n){
	if ( n<=1){
	return 1;
	} else {
	return n * factorialProgram(n-1);
	}
}
}

 