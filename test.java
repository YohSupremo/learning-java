import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.println("Hello World");

        int hello = 1;
        int hatdog = 4;

            System.out.println(hello + hatdog);
        
        int age = 0;

      
        char answer = ' ';

       do { 

          System.out.println("Please Enter Your Age: ");

       age = input.nextInt();
    
       System.out.println("You Age is " + age);


            if(age < 18) {
        System.out.println("Your are a minor");
       } else if (age >= 18) {
        System.out.println("You are in the legal age");
       } else {
        System.out.println("Invalid Age");
       }

      System.out.println("Do you want to continue?");

     answer = input.next().charAt(0);

   
    for (int i = 1; i <= 5; i++) {
        System.out.println("Hello" + i);
    }



       } while (answer != 'n');
      
       System.out.println("Please Enter A Number");

       int num = 0;

       num = input.nextInt();

       switch (num) {
        case 1 -> System.out.println("You Entered 1");
        case 2 -> System.out.println("You Entered 2");
        case 3 -> System.out.println("You Entered 3");

        default -> System.out.println("Out of the choices");
       }

    }

    


}

