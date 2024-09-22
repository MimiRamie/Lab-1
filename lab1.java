
import java.util.Scanner;

public class lab1 {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello, "+name+"!");



        //1,2
        System.out.println("Enter length of regtangle");
        int leng = sc.nextInt();

        System.out.println("Enter width of regtangle");
        int width = sc.nextInt();

        System.out.println("Regtangle Propeties: \nLength: "+leng+"\nWdidth: "+width);

        System.out.println("Area: "+leng*width);
        System.out.println("Perimeter: "+(leng+width)*2);

        

        //2
        System.out.println("Enter student 1 Name: ");
        String stu1 = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter student 1 Age: ");
        int stu1Age = sc.nextInt();

        System.out.println("Enter student 2 Name: ");
        String stu2 = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter student 2 Age: ");
        int stu2Age = sc.nextInt();

        System.out.println("Name: "+stu1+", Age: "+stu1Age );
        System.out.println("Name: "+stu2+", Age: " +stu2Age);

        sc.close();
    }
}

