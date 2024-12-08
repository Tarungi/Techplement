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
public class Sports {
    public void funSpo()
    {
        System.out.println("welcome to Sports quiz");
        
         int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" A. Which cricket team has the most ICC trophies? \n 1 for India \n 2 for England"+
                "\n 3 for New Zealand \n 4 for Australia ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. Who won the Gold medal in javelin throw game in paris olympic 2024? \n 1 for Neeraj Chopra\n 2 for Arshad Nadeem"+
                "\n 3 for Anderson Peter \n 4 for Max Dehining ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. Mex Verstappen is related to which sport? \n 1 Badminton\n 2 for Chess"+
                "\n 3 for Formula 1 \n 4 for Cricket ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. Which Indian badminton player became the first Indian to win an Olympic medal in the sport? \n 1 for PV Sindhu\n 2 for Prakash Padukone"+
                "\n 3 for Kidambi Srikanth \n 4 for Saina Nehwal ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. Which Indian chess player holds the prestigious title of Grandmaster? \n 1 for Harikrishna Koneru\n 2 for  Viswanathan Anand"+
                "\n 3 for  Pentala Harikrishna \n 4 for Adhiban Baskaran ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
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
