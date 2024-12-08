/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.classes;
import java.util.Scanner;

/**
 *
 * @author HP
 */
import com.quiz.main.Master;
public class General_knowledg_quiz {
    public void funGk()
    {
        System.out.println("welcome to General knowledg quiz");
        
                int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" A. How tall is the Statue of Unity? \n 1 for 182 meter\n 2 for 200 feet"+
                "\n 3 for 182 feet \n 4 for 192 meter ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. Which animal is known as the 'Ship of the Desert? \n 1 for Lion \n 2 for Kangaroo"+
                "\n 3 for deer \n 4 for Camel ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. Who is the author of Harry Potter series? \n 1 for J.K. Rowling\n 2 for R. Robinson"+
                "\n 3 for Neil Gaiman \n 4 for Jenna Levine ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. What is the name of the famous clock tower in London? \n 1 for manhattan \n 2 for London eye"+
                "\n 3 for big ben \n 4 for english tower ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. Who painted the Mona Lisa? \n 1 for Robert hook \n 2 for picaso"+
                "\n 3 for Vincent van Gogh \n 4 for Leonardo da Vinci ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
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
