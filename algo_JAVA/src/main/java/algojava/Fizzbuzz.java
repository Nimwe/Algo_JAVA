package algojava;

public class Fizzbuzz {
    public static void main(String[] args) {

       int n = 15 ; 

        for (int i=1 ; i <= n ; i++ ) {                                
            if (i % 3 == 0 && i % 5 == 0) { 
                System.out.println("FizzBuzz"); // if n %3 et % 5 => FizzBuzz
            } else if (i % 3 == 0) { 
                System.out.println("Fizz"); // if n % 3 => Fizz
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // if n % 5 => Buzz
            } else { 
                System.out.println(i); // if n !%3 || !%5 => n
            }                                                         
        }
     
    }
}
