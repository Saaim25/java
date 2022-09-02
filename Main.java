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
	    System.out.println("I just created the Method");
	}
	
	
	
	public static void main(String args[]){
	    Main myObj = new Main();
	    
	    System.out.println(myObj.x);
	    myMethod();
	}
}
