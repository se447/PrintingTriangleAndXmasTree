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
        // 40.3
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
