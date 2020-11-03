
public class PassingArrayDemo {
    
    public static void doSomething(int x, int []y){
        x = 100;
        y[0] = 100;
    }
    
    public static void main(String[] args) {
        
        int x = 0;

        
        doSomething(x, new int[]{1,2,3,4});
        
        System.out.println(x);    //?? 0
        System.out.println(y[0]); //?? 100
        
    }
}
