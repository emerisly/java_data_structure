package Formatting1;

public class Formatting1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int x=70;
        int y=80;
        System.out.println("\nSystem.out.printf(\""
                + "I received a %d on my first "
                + "test and a %d on my second "
                + "test\\n\", x,y);");
        System.out.printf("I received a %d on my first test and a %d "
                + "on my second test\n",x,y);
        double a=1234.5753;
        double b=93948.6741;
        System.out.println("\nSystem.out.printf(\"The number %."
                + "2f is \\n\",a);");
        System.out.printf("The number %.2f is \n",a);
       
        System.out.println("\nSystem.out.printf(\"The number %20.2f is and "
                + "the other number is %20.2f\\n\",a,b);");
        System.out.printf("The number %20.2f is and "
                + "the other number is %20.2f\n",a,b);
       
        System.out.println("\nSystem.out.printf(\"The number %20.2f%20.2f \\n\",a,b);");
        System.out.printf("The number %20.2f%20.2f \n",a,b);
       
        System.out.println("System.out.printf(\"\\n,20.2f %,20.2f\\n\",a,b);");
        System.out.printf("\n,20.2f %,20.2f\n",a,b);
       
        System.out.println("System.out.printf(\"$%,.2f $%,.2f \\n\",a,b);");
        System.out.printf("%,.2f %,.2f \n",a,b);
       
        System.out.println("System.out.printf(\"$%,-20.2f $%,-20.2f\\n\",a,b);");
        System.out.printf("%,-20.2f %,-20.2f\n",a,b);
    }
   
}
