import java.util.Scanner;
public class Smallestno
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter three no:");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b && a<c)
        {
        System.out.println("Smallest no is="+a);
        }
        else if(b<c)
        {
        System.out.println("Smallest no. is="+b);
        }
        else
        {
            System.out.println("Smallest no. is="+c);
        }
    }
        
}
