# Compare the Triplets
# https://www.hackerrank.com/challenges/compare-the-triplets/problem


import java.util.*;
import java.io.*;
import java.math.*;

public class CompareTiplets
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int [] a = new int[3];
        int b [] = new int[3];
        int ca = 0,cb = 0;
        for(int i = 0;i<3;i++)
            a[i] = sc.nextInt();
        for(int i = 0;i<3;i++)
            b[i] = sc.nextInt();
        for(int i = 0;i<3;i++)
        {
            if(a[i] == b[i])
                continue;
            if(a[i]>b[i])
                ca++;
            else 
                cb++;
        }
        System.out.println(ca + " " + cb);
    }
}
