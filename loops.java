public class loops
{
    static boolean isArmstrong(int n)   
    {   
        int temp, digits=0, last=0, sum=0;   
 
        temp=n;   
  
        while(temp>0)    
        {   
            temp = temp/10;   
            digits++;   
        }   
        temp = n;   
        while(temp>0)   
        {   
     
        last = temp % 10;   
        sum +=  (Math.pow(last, digits));   
  
        temp = temp/10;   
        }  
 
        if(n==sum)   
 
            return true;      
  
        else return false;   
    }   
    
    public static void isPrime(int n){
        int i,m=0,flag=0;      
           
        m=n/2;      
        if(n==0||n==1){  
            System.out.println(n+" is not prime number");      
        }else{  
        
        for(i=2;i<=m;i++){      
            if(n%i==0){      
                System.out.println(n+" is not prime number");      
                flag=1;      
                break;      
            }      
        }      
        if(flag==0)  { System.out.println(n+" is prime number"); }  
    } 
    }
    
    
    public static void isPalinderom(int n){
        int r,sum=0,temp;    
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum)    
             System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome"); 
    }
    
    
    public static void evenOddUsingSwitch(int num1){
        
        switch(num1%2){//this will return 0
            case 0:
                System.out.println(num1+" is an Even number");
            break;
            case 1:
                System.out.println(num1+" is an Odd number");
        }
    }
    
    public static void maleFemale(char c){
        
        switch(c){
            case 'M':
                System.out.println("Male");
            break;
            case 'F':
                System.out.println("Female");
        }
    }
    
    
    
    
    
    
	public static void main(String[] args) {
		//1. Brigth It career ten times;
		System.out.println("--------Bright career------");
		for(int i=0; i<10; i++){
		    System.out.println("Bright IT career");
		}
		
		//2. 1 to 20 using while loop 
		System.out.println("----- 1 to 20 using while loop-----");
		int p=1;
		while(p<=20){
		    System.out.println(p);
		    p++;
		}
		
		//3.program to equal operator and not equal operator
		System.out.println("--program to equal operator and not equal operator---");
		int j=1;
		if(p==j){
		  System.out.println(true);
		}else{
		  System.out.println(false);
		}
		
		//4. write a program to print odd even numbers
		System.out.println("-----ODD EVEN---");
		System.out.println("EVEN NUMBERS");
		for(int i=1; i<=20; i++){
		    
		    if(i%2==0){
		        
		        System.out.println(i);
		    }
		}
        System.out.println("ODD NUMBERS");	
		for(int i=1; i<=20; i++){
		    
		    if(i%2!=0){
		        
		        System.out.println(i);
		    }
		}
		
		
		// 5 write a program to print largest no. amoung 3 nos.
		int s=6,t=9,u =10;
		int temp;
		int max;
		if(s>t){
		     temp = s;
		}else{
		    temp = t;
		}
		if(temp>u){
		    max =temp;
		}else{
		    max = u;
		}
		System.out.println("Max among three is -"+max);
		
		// 6. write a program to print even number betw 1 to 100
		
	    System.out.println("---- even numbers 1 to 100");
	    int r = 1;
	    while(r<=100){
	        if(r%2==0){
	            System.out.println(r);
	        }
	        r++;
	    }
	    
	    
	    // 7.write a program to write 1 to 10 using do while loop-----
	    System.out.println("--- do while ----");
	    int q=1;    
        do{    
            System.out.println(q);    
            q++;    
        }while(q<=10); 
        
        
        //8.write a program to find armstrong number or not
        System.out.println("------Check ArmStrong-----");
        int num = 153;
        if(isArmstrong(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
        
        //9.write a program to write number is prime or not 
        
        System.out.println("---- Prime number check----");
        isPrime(2);
        isPrime(3);
        isPrime(6);
        
        //10.write a program to check palindrom or not
        
        System.out.println("---- palindrom check----");
        isPalinderom(454);
        isPalinderom(36);
        
        //11.program to check number ie even or odd using swithch
        System.out.println("---- even odd using switch---");
        evenOddUsingSwitch(3);
        evenOddUsingSwitch(2);
        
        //12 program to write male female using switch---
        System.out.println("----- Male female-----");
        maleFemale('M');
        maleFemale('F');
        
        //refer to 5
		
	}
}
