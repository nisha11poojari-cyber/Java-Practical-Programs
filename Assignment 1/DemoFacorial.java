/*Program to find the factorial of a number */

class DemoFactorial {
    public static void main(String[] args)
    {
        //Checking the number of parameters first
        int n = args.length;
        if(n != 1) {
            System.out.println("\nInvalid number of arguments");
            return;
        }
        //Converting the entered number which is a string(Command line argument) to an Integer
        int num = Integer.parseInt(args[0]);
        int fact = 1;
        //Negative numbers don't have factorial
        if(num < 0) {
            System.out.println("\nInvalid input");
            return;
        }
        //Works for zero as well
        else {
            for(int i=1;i<=num;i++) {
                fact *= i;
            }
            System.out.println("\nFactorial = " + fact);
        }
    }
}
