/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.create;

/**
 *
 * @author HP
 */

import com.quiz.main.Master;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Playquiz {
    
    public void funPlQuz()
    {
        
        try{
        String quest,opt1,opt2,opt3,opt4,ans,ans2;
        int count=0,score=0,i=5,no=0;
        Scanner sc =new Scanner(System.in);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
        
        PreparedStatement smt=cn.prepareStatement("select * from quiztable");
        ResultSet rst=smt.executeQuery();
        
        while(rst.next())
        {
        quest = rst.getString(1);
        opt1 = rst.getString(2);
        opt2 = rst.getString(3);
        opt3 = rst.getString(4);
        opt4 = rst.getString(5);
        ans = rst.getString(6);
        
            System.out.println(quest+"\n \n A."+opt1+"\n B."+opt2+"\n C."+opt3+"\n D."+opt4);
            
            System.out.println("\n Enter answer \n");
            ans2 =sc.nextLine();
            
            if(ans2.equals(ans))
            {
            count=5;
            }else {count=0;}
            score=count+score;
            no=i+no;
//            System.out.println("you got - "+count+" out of 5 \n");
        }
        
            System.out.println("\n you got : "+ score + " "
                    + "out of "+ no);
        
        System.out.println("\n Return to Main Menu. enter \n 1 for yes\n 2 for Exit ");
        int x=sc.nextInt();
        if(x==1)
        {
        Master ms = new Master();
        }else{System.out.println("Thank You");}
        
        }
        
        catch(Exception e){System.out.println(e);}
        
    }
    
}
