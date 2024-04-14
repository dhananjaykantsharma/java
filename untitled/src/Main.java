import java.util.*;
class main
{
    public static void main(String args[])     throws Exception
    {
        System.out.println("enter the name and age");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Name :" +name+ "age"+age);
    }
}
