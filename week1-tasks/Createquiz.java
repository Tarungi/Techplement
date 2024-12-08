/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//this program is about create quiz by user

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

public class Createquiz {
    public void funCreQuiz()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("creat your own question");
        
        System.out.println("\n Enter your question ");
        String quest=sc.nextLine();
        
        System.out.println(" \n Enter first option ");
        String option1=sc.nextLine();
        
        System.out.println("\n Enter second option ");
        String option2=sc.nextLine();
        
        System.out.println("\n Enter three option ");
        String option3=sc.nextLine();
        
        System.out.println("\n Enter fourth option ");
        String option4=sc.nextLine();
        
        System.out.println("\n Specify a answer ");
        String ans=sc.nextLine();
        
        PreparedStatement smt=cn.prepareStatement("insert into quiztable values(?,?,?,?,?,?)");
        smt.setString(1, quest);
        smt.setString(2, option1);
        smt.setString(3, option2);
        smt.setString(4, option3);
        smt.setString(5, option4);
        smt.setString(6, ans);
        
        boolean bln=smt.execute();
        
        if(bln==false)
        {
            System.out.println("quiz created");
        }
        
            System.out.println("add more questions? press \n 1 for yes \n 2 for no ");
            int x = sc.nextInt();
            
            if(x==1)
            {
                funCreQuiz();
            }
            
        cn.close();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    
   
  }
}
