package Labs;
// Assignment-2. 
// • Write a Java program that demonstrates method overloading by creating a class called Calculator. 
// • Add three methods called add(). 
// • The first add() method should take two int variables as arguments and return their sum as int. 
// • The second add() method should take three int variables as arguments and return their sum as int. 
// • The third add() method should take two doubles as arguments and return their sum as double.  
// • The program should allow the user to display the results of each method.

import java.util.Scanner ;

public class Calculator {
    //POLYMORPHISM

    //adding two variables
    public int add(int a , int b){
        int sum =  a + b ;
        return sum;
    }

    //adding three variables
    public int add(int x , int y , int z){
        int sum = x + y + z ;
        return sum;
    }

    //adding two decimal/integer numbers
    public double add(double a , double b){
        double sum = a + b ;
        return sum;
    }

    
    public static void main(String[] args) {
        //Scanner class to takes an input
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        //adding two integers
        System.out.println("Enter two integer value :");
        int a = sc.nextInt(); //input 1
        int b = sc.nextInt(); //input 2
        System.out.println("sum of two integer value is :" + calculator.add(a , b));

        //adding three integers
        System.out.println("Enter three integer value :");
        int x = sc.nextInt(); //input 1
        int y = sc.nextInt(); //input 2
        int z = sc.nextInt(); //input 3
        System.out.println("sum of three numbers is :" + calculator.add(x , y , z));

        //adding two decimal/integer value
        System.out.println("Enter two decimal/integer value :");
        double m = sc.nextDouble(); //input 1
        double n = sc.nextDouble(); //input 2
        System.out.println("sum of two decimal/integer number is :" + calculator.add(m , n ));
        
        sc.close();
    }
}
