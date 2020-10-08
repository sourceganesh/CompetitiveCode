/*
Check each letter in roman number and add the corresponding number to sum
*/


import java.util.Scanner;
import java.io.*;

public class solution {
    public static void main(String[] args)
    { 

        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int num=convert(s);
        System.out.println(num);



    }
    public static int convert(String s)
    {
        int sum=0;
        char roman;
        for(int i=0;i<s.length();i++)
        {
            roman=s.charAt(i);
            if(roman=='I')
            {
                sum+=1;
                continue;
            }
            if(roman=='V')
            {
                sum+=5;
                continue;
            }
            if(roman=='X')
            {
                sum+=10;
                continue;
            }
            if(roman=='L')
            {
                sum+=50;
                continue;
            }
            if(roman=='C')
            {
                sum+=100;
                continue;
            }
            if(roman=='D')
            {
                sum+=500;
                continue;
                
            }
            if(roman=='M')
            {
                sum+=1000;
                continue;
                
            }
        }
        
        return sum;
    
    }
}
