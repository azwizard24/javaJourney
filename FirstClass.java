import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class FirstClass {

    public static void main(String[] args) {

        /*
        boolean bool = true; // 1 bit
        byte b = 1; // 1 byte
        short s = 1; // 2 bytes
        int i = 1; // 4 bytes
        long l = 1; // 8 bytes

        double d = 1; // 8 bytes
        char c = 'c'; // 2 bytes
        String str = "Erfan";

        String x = "Water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = x;

        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

        System.out.println("Hello World");


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Hello "+ name);
        System.out.println("Your age is "+age);


        double friends = 10;

        friends++;

        System.out.println(friends);


         String name = JOptionPane.showInputDialog("Enter your name");
         JOptionPane.showMessageDialog(null,"Hello " + name);

         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
         JOptionPane.showMessageDialog(null, "Hello, your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Hello, your height is " + height);




        //use random class to generate random numbers in a range
        Random random = new Random();

        int x = random.nextInt(7);

        System.out.println(x);
        */

        int age = 3;

        if(age>=21){
            System.out.println("You are older than 21!");
        }
        System.out.println("You're a kid");
    }
}
