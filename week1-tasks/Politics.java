/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.classes;

import com.quiz.main.Master;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Politics {
    public void funFoo()
    {
        System.out.println("welcome to Politics quiz");
        
         int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" A. How many houses are there in the Indian Parliament? \n 1 for Two\n 2 for Four"+
                "\n 3 for one \n 4 for Seven ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. In which year did India adopt the Constitution?? \n 1 for 1947\n 2 for 1952"+
                "\n 3 for 1945 \n 4 for 1950 ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. Who is the Defence Minister? \n 1 for Dr. Subrahmanyam Jaishankar\n 2 for Shri Raj Nath Singh"+
                "\n 3 for Smt. Nirmala Sitharaman \n 4 for  Nitin Jairam Gadkari ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. Who is the vice president of the India? \n 1 for Shri Om Birla\n 2 for Shri Siddaramaiah"+
                "\n 3 for Jagdeep Dhankhar \n 4 for  Amit Shah ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. Who is the cheif justic of India? \n 1 for Sanjiv Khanna\n 2 for D Y Chandrachud"+
                "\n 3 for  ‎Bhuvaneshwar Prasad Sinha \n 4 for Manmohan ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c5=5;
        }else{c5=0;}
        
        System.out.println("We want your valuable feedback - ");
        String feed=sc.nextLine();
        
        total = c+c2+c3+c4+c5;
        
        System.out.println("\n do you want to see the score \nEnter \n 1 for yes \n2 for No");
        n=obj.nextInt();
        if(n==1)
        {
        System.out.println("Your got :"+total+" out of 25");
        }else{System.out.println("Thank You");}
        
        System.out.println("\n Return to Main Menu. enter \n 1 for yes\n 2 for Exit ");
        int x=sc.nextInt();
        if(x==1)
        {
        Master ms = new Master();
        }else{System.out.println("Thank You");}
    }
}
