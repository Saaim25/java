*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void addallInt(int arr[]){
        int n = arr.length;
        int sum =0; 
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all int in the array: "+ sum);;
    }
    
    public static void calcAvg(int arr[]){
        
        int n = arr.length;
        int sum = 0;
        int avg =0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        avg = sum/n;
        System.out.println("Average of the array el: "+ avg);
    }
    
    public static void findIdx(int arr[], int el){
        
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]==el){
                System.out.println("Index of the el "+ el + " is "+i);
                
            }
        }
    }
    
    public static void contains(int arr[], int el){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]==el){
                System.out.println("Yes the element "+el+" is present in the array");
                return;
            }
        }
        System.out.println("No the element "+el+" is not in the array");
    }
    
    public static int[] remove(int arr[], int el){
        int n =arr.length;
        int newarr [] = new int [n-1];
        int k=0;
        for(int i=0; i<n; i++){
            if(arr[i]==el){
                continue;
            }else{
                newarr[k++] = arr[i];
            }
            
        }
        return newarr;
    }
    
    
    public static void copy(int arr[]){
        int n =arr.length;
        int newarr [] = new int[n];
        
        for(int i=0; i<n; i++){
            newarr[i] = arr[i];
        }
        System.out.println("Array copied");
    }
    
    
    public static int [] insert(int arr[],int x, int idx){
        
        int n = arr.length;
        int newarr [] = new int [n+1];
        for(int i=0; i<n+1; i++){
            if (i < idx)
                newarr[i] = arr[i];
            else if (i == idx )
                newarr[i] = x;
            else
                newarr[i] = arr[i-1];
        }
        return newarr;
    }
    
    public static void min_max(int arr[]){
        int n=arr.length;
        int min = arr[0];
        int max = arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i]>max)
                max = arr[i];
            else if(arr[i]<min)
                min= arr[i];
        }
        System.out.println("max of arr:"+ max);
        System.out.println("min of arr:"+ min);
    }
    
    
    public static int [] reverse(int arr[]){
        int n=arr.length;
        int newarr [] = new int[n];
        int k=0;
        for(int i=n-1; i>=0; i--){
            newarr[k++] = arr[i];
        }
        return newarr;
    }
    
    
    public static void find_duplicate(int arr[]){
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    
    }
    
    public static void find_common(int arr[], int arr1[]){
        
        int n=arr.length;
        int m = arr.length;
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i]==arr1[j]){
                    System.out.println("Integer "+arr[i]+" is common");
                }
                
            }
        }
        
    }
    
   public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
    
    
    public static void secondLargest(int arr[]){
        Arrays.sort(arr);
        int n= arr.length;
        System.out.println("Second largest Element : "+ arr[n-2]);
    }
    
    
    public static void noOfEvenOdd(int arr[]){
        int n= arr.length;
        int evenCount = 0;
        int oddCount =0;
        
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even numbers: "+evenCount);
        System.out.println("Odd numbers: "+oddCount);
    }
    
    public static void diff_larg_small(int arr[]){
        int n= arr.length;
        int max =arr[0];
        int min=arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i]>max)
                max = arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Difference between larget and smallest "+ (max-min) );
    }
    
    public static void check(int arr[] ){
        int n= arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]==26)
                System.out.println("26 is present in the array");
            else if(arr[i]==30)
                System.out.println("30 is present in the array");
            
                
        }
        System.out.println("no 26 and 30 present");
    }
    
  
    
     
    
    
    
    
    
    public static void print(int arr[]){
        int n=arr.length;
        System.out.print("[");
        for(int i=0; i<n; i++){
            
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
        System.out.println();
    }
    
	public static void main(String[] args) {
		int arr [] = {3,4,5,6,1,7,3,5};
		int a []= {1,3,4,5,3};
		int b []={1,3,4,6,7};
		int c [] ={1,2,2,3,4,5};
		addallInt(arr);
		calcAvg(arr);
		findIdx(arr,5);
		contains(arr, 5);
		contains(arr,10);
		//arr = remove(arr, 5);
		print(arr);
		copy(arr);
		arr = insert(arr,8,2);
		print(arr);
		min_max(arr);
		arr = reverse(arr);
		print(arr);
		find_duplicate(arr);
		find_common(a,b);
		Arrays.sort(c);
		int l = c.length;
		l = removeDuplicateElements(c,l);
		for (int i=0; i<l; i++){  
           System.out.print(arr[i]+" "); 
		}
		System.out.println();
        
        secondLargest(a);
        noOfEvenOdd(a);
        diff_larg_small(arr);
        check(arr);
        
        
	}
}
