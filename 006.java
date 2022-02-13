//Write a java program to enter three numbers and find the maximum number using the conditional operator.

import java.util.*;
class maximum {
    public static void main(String args[]) 
    {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Value of A:");
        a=sc.nextInt();

        System.out.println("Enter Your Value of B:");
        b=sc.nextInt();

        System.out.println("Enter Your Value of C:");
        c=sc.nextInt();

        if (a>b) {
            if (a>c) {
                max=a;
            }
            else {
                max=c;
            }
        }
        else
        {
            if (b>c) {
                max=b;
            }
            else {
                max=c;
            }
        }
        System.out.println("Maximum No. Is "+max);
    }
}