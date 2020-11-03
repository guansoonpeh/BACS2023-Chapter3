
public class DemoArray {
    public static void main(String[] args) {
        
        int [] a = new int[10];
        
        
        for(int value: a)   
            value = 100;            // this statement will alter the original data 
             
        for(int value : a)          // to display the data in the array 
           System.out.println(value);   
        
        
    }
}
