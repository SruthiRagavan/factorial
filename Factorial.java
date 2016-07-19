package sample;

public class Factorial {

	public static void main(String[] args) {
		 int i,fact=1;  
		  int number=5;   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		

	}




class FactorialDemo2{
	   public static void main(String args[]){
	      int factorial = fact(4);
	      System.out.println("Factorial of 4 is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	   }
	}