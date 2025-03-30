import java.util.*;

class day1 { // Ensure class name matches the filename (case-sensitive)
    public static void main(String[] args) {
        System.out.println("Rushikesh Sapkal, oh yeah baby!");
        System.out.print("Rushikesh Sapkal, oh yeah baby!\n");
        System.out.print("Rushikesh Sapkal, oh yeah baby!\n");
        Scanner ok = new Scanner(System.in);
        String name = ok.next();
        System.out.println("Hello " + name + ", welcome to the world of Java!");
        // The following code is commented out as it seems to be incomplete or not relevant
        int a = ok.nextInt();
        int b = ok.nextInt();
        System.out.println(a + b);
        ok.close(); // Close the scanner to prevent resource leaks

    }
}