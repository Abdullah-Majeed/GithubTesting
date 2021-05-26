package lab11;

public class NumberCheckerAndCal {
	
	public boolean oddInteger (int number) {
		
		 if ( number % 2 != 0 ) {
			 return true;
		 }
		return false;
	}
	
	public boolean evenInteger (int number) {
		
		 if ( number % 2 == 0 ) {
			 return true;
		 }
		return false;
	}
	public boolean primeInteger (int number) {
		
		 if (number <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(number); i++) {  
	           if (number % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	}
	public int factorial (int number) {
		
		if (number == 0)    
		    return 1;    
		  else    
		    return(number * factorial(number-1));    
	}
	
}
