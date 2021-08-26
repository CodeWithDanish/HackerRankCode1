package com.codewithharry;

import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        String st1,st;
        int i,j,l,c=0,v=0;
        System.out.println("Enter the String");
            st1 = d.readLine();
         StringTokenizer st2 = new StringTokenizer(st1);
         System.out.print("Word");
         for (i=0;i<10;i++){
             System.out.print(" ");
         }
        System.out.print("Vowel");
        for (i=0;i<10;i++){
            System.out.print(" ");
        }
        System.out.println("Consonant");
         int y= st2.countTokens();
         while(st2.hasMoreTokens())
         {
            st=st2.nextToken();
            l = st.length();
            for (i=0;i<l;i++)
            {
                if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U'||
                        st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            System.out.print(st);
            for (i=0;i<16-st.length();i++){
                System.out.print(" ");
            }
             System.out.print(v);
             for (i=16-st.length();i<32-st.length();i++){
                 System.out.print(" ");
             }             System.out.println(c);
             v=0;
            c=0;
         }
        System.out.println("The number of words in the string is:"+y);
    }
}
