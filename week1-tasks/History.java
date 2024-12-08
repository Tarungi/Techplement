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
public class History {
    public void funHis()
    {
        System.out.println("welcome to History quiz");
        
         int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" \n A. When Indian national Anthem was first sung? \n 1 for August 15, 1947, Independence of Indian\n 2 for 1857 revolt"+
                "\n 3 for  December 27, 1911 Calcutta \n 4 for None of the Above ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. In the third battle of Panipat, who defeated Marathas? \n 1 for  Afghans\n 2 for Mughals"+
                "\n 3 for British Army \n 4 Mysores ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. The Indus Valley Civilization flourished during which period? \n 1 for 2nd century BC\n 2 for 2600–1900 BCE"+
                "\n 3 for 5th century AD \n 4 for 10th century AD ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. The Indian Rebellion of 1857, also known as the Sepoy Mutiny, was against the rule of which colonial power? ? \n 1 for Portuguese\n 2 for French"+
                "\n 3 for Dutch \n 4 for British  ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. Which ancient Indian text is considered the oldest surviving scripture in the world?? \n 1 for Rigveda.\n 2 for The Panchatantra"+
                "\n 3 for The Bhagavad Gita \n 4 for The Ramayana ");
        
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
