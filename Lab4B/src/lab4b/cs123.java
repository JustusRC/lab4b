import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//read user input
		Scanner pam = new Scanner (System.in);
	     //Variable declaration
		int value=5, i=0, n, sum=0, average ;
		
		//Has enters 5 integers
		System.out.print("Enter 5 integer number and press enter: ");
		
		
		do {    //do-while loop    
        	n=pam.nextInt();
    		sum=sum+n;
			i++;  
           }
        while (i<value);
		//calculates average
		average=sum/value;
		
		System.out.println("The average value is: "+average);
		

	}

}
