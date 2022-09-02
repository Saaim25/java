public class operators{
    public static void operators(){
        // + operator
        System.out.println(2+2);
        // - operator
        System.out.println(4-2);
        // * operator
        System.out.println(2*2);
        // / operator
         System.out.println(4/2); 
    }
    
    public static void increment_decrement(){
        int i=0;
        System.out.println(i++);
        System.out.println(i--);
    }
    
    public static void equal_not_eual(){
        int i =5;
        if(i==5){
            System.out.println("equal");
        }
        if(i!=6){
            System.out.println("Not eual");
       
        }
    }
    
    public static void two_no_equal(){
        int i=5;
        int j=5;
        
        if(i==j){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }
    }
    
    public static void logical_operator(){
        int i=5;
        
        if(i>0 && i!=0){
            System.out.println(true);
        }
        if(i==5 || i==0){
            System.out.println(true);
        }
    }
    
    public static void print_min_max(){
        int i=5;
        int j=6;
        if(i>j){
            System.out.println("max-"+i);
            System.out.println("min-"+j);
        }else{
            System.out.println("max-"+j);
            System.out.println("min-"+i);
        }
    }
    
    
    public static void main(String args []){
        System.out.println("-------operators-----");
        operators();
        System.out.println("------increment and decriment---");
        increment_decrement();
        System.out.println("------equal not equal-----");
        equal_not_eual();
        System.out.println("---------two number are equal---- ");
        two_no_equal();
        System.out.println("-------logical operators----");
        logical_operator();
        System.out.println("----------max min ------");
        print_min_max();
    }
}
