/*Program to determine if the given sides can form a triangle using command line arguments */
public class TriangleDemo {
    public static void main(String[] args) {
        int n = args.length;
        if(n != 3) {
            System.out.println("\nInvalid number of parameters");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        /*The sides of a triangle cannot be negative */
        if(a<0 || b<0 || c<0) {
            System.out.println("\nInvalid input of sides of a triangle. Sides cannot be negative!");
        }
        else {
            if(((a+b)>c) || ((a+c)>b) || ((b+c)>a)) //Using the inequality theorem to check the validity of a triangle
            System.out.println("\nThe given sides form a valid triangle");
            else
                System.out.println("\nThe given sides do not form a valid triangle");

        }
        return;
    }
}
