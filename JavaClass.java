package helloworld;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1		
		System.out.println("hello world");
		System.out.println("its great");
		
//2		Session 2
		
		int myInt = 8;
		double myDouble = myInt;   //widening
		System.out.println(myDouble);
				
		
//3		
		if (myInt % 2 == 0) {
			System.out.println("its even");
		} else {
			 System.out.println("its odd");
		}
		
//4
		 System.out.println("1=1");
		 System.out.println("1=10");
		
		 if (1 == 1) {
				System.out.println("its true");
			} else {
				 System.out.println("its false");
			}
		
		 if (1 == 10) {
				System.out.println("its true");
			} else {
				 System.out.println("its false");
			}
		 if (4 != 10) {
				System.out.println("its true");
			} else {
				 System.out.println("its false");
			}
		 if (4 <= 4) {
				System.out.println("its true");
			} else {
				 System.out.println("its false");
			}
		
		
//5   
		 int myNum2=51;
		 if(myNum2 ==0) {
			 System.out.println("its zero");
		 }
		 else if (myNum2 % 2==0) {
			 System.out.println("its even");
		 }else {
			 System.out.println("its odd");
		 }
				
//6
		 int num1=0;
		 
		 if (num1>0 && num1 %2==0) {
			 System.out.println("its even positive");
		 }else  if (num1<0 && num1 %2==0) {
			 System.out.println("its even negative");
		 }else if (num1 ==0) {
			 System.out.println("its zero");
		 }else if (num1>0 && num1 %2 !=0) {
			 System.out.println("its odd positive");
		 }else {
			 System.out.println("its odd negative");
		 }	 
		 
		 
//7

		 int num2=50;
		 
		 if (num2>0 && num2 %2==0) {
			 System.out.println("its even positive");
		 }else  if (num2<0 && num2 %2==0) {
			 System.out.println("its even negative");
		 }else if (num2 ==0) {
			 System.out.println("its zero");
		 }else if (num2>0 && num2 %2 !=0) {
			 System.out.println("its odd positive");
		 }else {
			 System.out.println("its odd negative");
		 }	 
			 
			 
//8 
		 int num3 = -70;
				 if(num3 >0 || num3<0) {
					 System.out.println("non zero"); 
				 }else {
					 System.out.println("its zero");
				 }
		
		 boolean value=true;
		 System.out.println(!value);
		 
		 
//9		
		 int num4 = 70;
		 
		 if(num4 >0 || num4<0) {
			 System.out.println("non zero"); 
		 }else {
			 System.out.println("its zero");
		 }
          boolean term = true;
          System.out.println(!term);
		
		
// Session 3
          
          
// 10
          System.out.println(1); 
      		System.out.println(2);
      		System.out.println(3); 
      		System.out.println(4);
          	System.out.println(5); 
		
//11       different opertaions
          	int j = 10;
    		System.out.println(j);
    		
    		j = j + 1;    // j +=1; 
    		System.out.println(j); 
    		
    		j = j + 1;
    		System.out.println(j); 
    		
    		j = j + 5;  // j+=5;
    		System.out.println(j); 
    		
    		j = j - 7;   // j-=7;
    		System.out.println(j); 
    		
    		j = j / 5; // j/=5;
    		System.out.println(j); 
    		
    		j = j * 30; // j*=30;
    		System.out.println(j); //60
    		
    		
//12
    		for (int var = 1; var <= 6 ; var = var + 1) {
    			System.out.println(var); //0
    		}
    		System.out.println("hello");
		
	
//13           reverse order
    		for(int num=20;num>0;num=num-2) {
    			System.out.println(num);
    		}
          
    		
 // Assignments 
    		
    		
 //14   Sum of No's
    		int sum = 0;
    		
    		for (int i = 1; i<= 10; i= i +1) {
    			sum = sum + i;
    		}
    		
    		System.out.println(sum);
    		
    		
 //15 Count Digits in No's
    	
    		int num = 1893;
    		int count = 0;
    		
    		if (num==0) {
    			System.out.println(1);
    		}else {
    			for(int k = num; k > 0; k = k/10) {
    				count ++;
    			}
    			System.out.println(count);
    		}
          
         
    	
  			
 //16  Greatest No.		
  			
  			 // declaring double type variables
  		    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

  		    // checks if n1 is greater than or equal to n2
  		    if (n1 >= n2) {

  		     
  		      // checks if n1 is greater than or equal to n3
  		      if (n1 >= n3) {
  		        largest = n1;
  		      }

  		      else {
  		        largest = n3;
  		      }
  		    } else {
  		      // checks if n2 is greater than or equal to n3
  		      if (n2 >= n3) {
  		        largest = n2;
  		      }

  		      else {
  		        largest = n3;
  		      }
  		    }

  		    System.out.println("Largest Number: " + largest);

    	    
   
//17  No. is prime or not
    		  int n=7,i;
    			boolean isPrime = true;
    			for(i=2;i<n;i++)
    			{
    				if (n%i == 0){
    				System.out.println(n+"is not a prime number");
    				isPrime = false;
    				break;
    				}
    			}
    			
    			
    			if(isPrime == true) {
    				System.out.println(n+"is a prime number");
    			}	    
  		    
  		    
  		    
  		    
	}

}
