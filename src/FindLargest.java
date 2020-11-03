
import java.util.Scanner;


public class FindLargest {
    public static void main(String[] args) {
        
        int[] numbers = new int[6];
        
        Scanner scan = new Scanner(System.in);
        
        //read inputs from user
        for(int i=0; i<numbers.length; i++){
            
            System.out.print("Enter value : ");
            numbers[i] = scan.nextInt();
        }
        
        int largest = 0;
        for(int value : numbers){
            if(value > largest){
                largest  = value;
            }
        }
        
        int count = 0;
        for(int value : numbers){
            if(value == largest){
               count++;
            }
        }
        
        
        System.out.println("Largest number : " + largest);
        System.out.println("Count : " + count);
    }
}
