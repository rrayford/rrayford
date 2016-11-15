public class Fibonacci {
	
	public static int recursiveFibonacci(int number){
		if(number == 1 || number == 2){
			return 1;
		}else{
			return recursiveFibonacci(number-1)+recursiveFibonacci(number-2);
		}
	}
	public static int iterativeFibonacci(int number){
		int x=1;
		int y=1;
		int z=0;
		
		if(number == 1 || number == 2){
			return 1;
		}
		if(number == 0){
			return 0;
		}
		
		for(int i = 2; i < number; i++){
			z=x+y;
			y=x;
			x=z;
			
		}return z;
	}
}
