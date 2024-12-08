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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
        
public class Deletequiz {
    
    public void funDltquz()
    {
         try{
        String where ="";
        int n;
        Scanner sc =new Scanner(System.in);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
        
        System.out.println("enter option first to delete quiz");
        where=sc.nextLine();
        
        PreparedStatement smt=cn.prepareStatement("delete from quiztable where option1 = ?");
        smt.setString(1, where);
        
        boolean bln=smt.execute();
        
        if(bln==false)
        {
        System.out.println("\n Quiz deleted");
       
        }
        
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

