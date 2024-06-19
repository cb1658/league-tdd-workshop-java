package leaguetdd;

public class Calculator {

    // Main method for running the application
    public static void main(String[] args) {
        // Example usage of the methods: Uncomment after the methods are created
        System.out.println("Addition of 2 and 3: " + add(2, 3));
        System.out.println("Subtraction of 3 from 2: " + subtract(2, 3));
        System.out.println("Factorial of 5: " + factorial(5));
    }

    // For all 3 methods you will create they should be pulic and static and return an integer
    
    // Create a Method to add two integers called add


    public static int add(int blah, int blah2){
        return blah+blah2;
    }

    // Create a Method to subtract the second integer from the first integer called subtract

    public static int subtract(int blah, int blah2){
        return blah-blah2;
    }

    // Create a Method to calculate the factorial of a non-negative integer called factorial

    public static int factorial(int blah){

        if(blah == 1){
            return 1;
        }else{
            return blah*factorial(blah-1);
        }
    } // If this doesnt work i be sad

    public static int multiplication(int blah, int blah2){
return blah*blah2;
    }

    public static int division(int blah, int hopefullyNotZero){
try{
    return blah/hopefullyNotZero;
}
catch(Exception e){
    System.out.println("dude");
    return Integer.MAX_VALUE;
}
    }

}
