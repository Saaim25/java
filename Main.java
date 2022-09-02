// to creat a main class, use keyword class

// to creat an object call "myObj" and print value of x:

//to creat method we need to call it as public 
// and then define it as static and then give it a return type
// if any or keep it as void 
// then we need to call it in the main function



public class Main
{
	int x = 5;
	
	//creating method
	public static void myMethod(){
	    int y =7;
	    System.out.println("I just created the Method");
	}
	
	
	// 6 function to print a name 
	public static void printName(String name){
	    System.out.println(name);
	}
	
	
	
	public static void main(String args[]){
	    Main myObj = new Main();
	    
	    System.out.println(myObj.x);
	    //calling method
	    myMethod();
	    
	    //2. program to print name
	    String name = "Saaim";
	    System.out.println(name);
	    
	    
	    // 4.define different type of variables like int, float
	    // boolean,char,double
	    System.out.println("-----DATA TYPES----");
	    int i = 6;
	    float f = 4.2f;
	    double d = 12.5;
	    boolean b = true;
	    char c = 'A';
	    System.out.println(i);
	    System.out.println(f);
	    System.out.println(d);
	    System.out.println(b);
	    System.out.println(c);
	    
	    System.out.println("----funciton for print name----");
	    printName(name);
	    
	    //5 local and global variables
	    
	    /*local variables are just created upto the function
	      as the function is executed the variables got distroied
	    */
	    
	    /*
	       global variables stay in the main function as the main
	       function is called 
	       
	    */
	    // like here int X is global and the int Y is in the function
	    // it is local
	}
}


// 3. java comments
//  java Single line comments are defined by "//"

// java multiline comments by using /*.....*/

// java documentation comments special comments like the autor
// of the code we can use html tags by using documentation comments





