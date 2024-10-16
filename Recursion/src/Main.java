public class Main {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println("The factorial is "+fact);
        int fibonacci = fib(8);
        System.out.println("The fibonacci is "+fibonacci);
    }
    public static int factorial (int n){
        if (n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static int fib(int n){
        if (n<=2){
            return 1;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }
}