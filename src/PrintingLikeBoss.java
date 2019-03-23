public class PrintingLikeBoss {

    public static void printStars(int amount) {
        //Create a method printStars that prints the given amount of stars and a line break.
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        
        System.out.println(""); //print a blank line
    }

    public static void printWhitespaces(int amount) {
        //Create a method printWhitespaces(int size) that prints the given amount of whitespaces. 
        //The method should not print a line break.
        
        int i = 1;
        while (i <= amount) {
            System.out.print(" "); //print a whitespace
            i++;
        }
    }

    public static void printTriangle(int size) {
        //Create the method printTriangle(int size) that prints a triangle using 
        //the methods printWhitespaces and printStars. 
        int row = 1;
        while (row <= size) {
            printWhitespaces(size - row);
            printStars(row);
            row++;
        }
    }

    public static void xmasTree(int height) {
        int spaces = height - 1; //starting value for spaces in row 1
        int stars = 1; //starting value for stars in row 1
        
        int i = 1;
        while (i <= height) {
            printWhitespaces(spaces);
            printStars(stars); //stars goes to new line when it reaches the end
            
            spaces--;
            stars += 2;
            i++;
        }
        
        int j = 1;
        while (j <= 2) {
            printWhitespaces(height - 2);
            printStars(3);
            j++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
