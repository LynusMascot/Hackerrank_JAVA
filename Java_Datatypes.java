import java.util.*;
import java.io.*;
import java.lang.Math;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                
                long m = (long)(-1* Math.pow(2,31));
                long n = (long)((Math.pow(2,31))-1);
                long o = (long)(-1* Math.pow(2,63));
                long p = (long) (Math.pow(2,63)-1);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                 if(x>= m && x<= n)System.out.println("* int"); 
                 if(x>= o && x<=p)System.out.println("* long"); 
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        
        }
        
    }}




