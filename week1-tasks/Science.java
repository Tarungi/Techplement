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
public class Science {
    public void funSci()
    {
        System.out.println("welcome to Science quiz");
        
         int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" A. What is the process by which a liquid changes into a gas at any temperature below its boiling point?? \n 1 for Condensation\n 2 for Evaporation"+
                "\n 3 for Sublimation \n 4 for 192 Freezing ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. What is the chemical formula for sulfuric acid? \n 1 for H2SO4\n 2 for NaOH"+
                "\n 3 for CH4 \n 4 for HCl ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. Which organ pumps blood through your body? \n 1 for Brain\n 2 for Stomach"+
                "\n 3 for Heart \n 4 for Lungs ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. What do plants need to make their own food? \n 1 for Sunlight\n 2 for Water"+
                "\n 3 for Air \n 4 for All of the above ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. How many laws of newton? \n 1 for Five\n 2 for three"+
                "\n 3 for seven \n 4 for two ");
        
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
