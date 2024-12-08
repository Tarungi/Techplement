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
public class Foods {
    public void funFoo()
    {
        System.out.println("welcome to Foods quiz");
        
         int n,c,c2,c3,c4,c5,total;
        Scanner obj=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println(" A. Which of these is the complete Dish? \n 1 for Ginger\n 2 for Biryani"+
                "\n 3 for Lemon \n 4 for tomato ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==2)
        {
        c=5;
        }else{c=0;}
       
        System.out.println("B. The word cutting related to which food? \n 1 for Chai\n 2 for Vada Pav"+
                "\n 3 for juice \n 4 for ice-creame ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==1)
        {
        c2=5;
        }else{c2=0;}
        
        System.out.println("C. Which country is famous for its sushi? \n 1 for Indonesia\n 2 for China"+
                "\n 3 for Korea \n 4 for Japan ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==4)
        {
        c3=5;
        }else{c3=0;}
        
        System.out.println("D. Which cheese is traditionally used on pizza? \n 1 for Cottage cheese\n 2 for Feta"+
                "\n 3 for Mozzarella \n 4 for Cheddar ");
        
        System.out.println("Enter answer : ");
        n=obj.nextInt();
        
        if (n==3)
        {
        c4=5;
        }else{c4=0;}
        
        System.out.println("E. Which gas makes fizzy drinks fizz? \n 1 for Carbon dioxide gas\n 2 for Nitrogen gas"+
                "\n 3 for oxygen \n 4 for argon ");
        
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
