/*
Second Master File
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.main;


import com.quiz.classes.*;
import com.quiz.create.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Master {
    
    public Master()
    {
    
     System.out.println("***Welcome to the quiz generator application*** \n \n [ Note : this program is case and space sensitive."
                + "if the option \n" +"has small letters and giving answer in capital letters will give error or may it give"
                + " your answer wrong. \n while giving the answer please make sure all spells must be correct as the option are"
                + " to eliminate the error. \n \n example option A. \"Apple\" Answer : \"apple\"  => Wrong "
                + "\n option A. \"Apple\" Answer : Apple  => Right \n \n option A. \"apple\" Answer : 'apple_'  => Wrong "
                + "\n option A. \"apple\" Answer : \"apple\"  => Right ]" );
        
        System.out.println("\n **Main Menu** Please enter\n 1 for Play a Quiz \n 2 for Create a Quiz (local database requird) \n 3 for Play your created quiz (local database requird) "
                + "\n 4 for Delete quiz (local database requird) \n 5 for create and play instant 1 question quiz (no database requird) ");
       
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter : "); 
        int choice=obj.nextInt();
       
        
        
        
        General_knowledg_quiz n1 = new General_knowledg_quiz();
        Sports n2=new Sports();
        History n3=new History();
        Foods n4=new Foods();
        Politics n5=new Politics();
        Science n6=new Science();
        Createquiz cr =new Createquiz();
        Playquiz pl = new Playquiz();
        Deletequiz dlt=new Deletequiz();
        PlayInstantquiz crzn=new PlayInstantquiz();
        
        
        switch(choice)
        {
            case 1:
            {
                
                 System.out.println("choose any topic to take the quiz \nenter\n 1 for General knowledge \n 2 for Sports "
                        + "\n 3 for History \n 4 for Foods \n 5 for Politics \n 6 for sciecne \n ");
                
                Scanner obj2= new Scanner(System.in);
                int choice2=obj2.nextInt();
                switch(choice2)
                {
                case 1:
                {
                    n1.funGk();
                    break;
                }
                case 2:
                {
                    n2.funSpo();
                    break;
                }
                case 3:
                {
                    n3.funHis();
                    break;
                }
                case 4:
                {
                    n4.funFoo();
                    break;
                }
                case 5:
                {
                    n5.funFoo();
                    break;
                }
                case 6:
                {
                    n6.funSci();
                    break;
                }
                default:System.out.println("please enter a valid input");
                }
                
                
              break;  
            }
            
            case 2:
            {
              
                cr.funCreQuiz();
                
                System.out.println("Do you want to play your created quiz, enter \n 1 for yes \n 2 for return to Main Menu \n "
                        + "Note : - There may be previously saved or loaded questions come into view \n "
                        + "so don't worry your question will come accordingly.");
                
                int x = obj.nextInt();
                
                if (x==1)
                {pl.funPlQuz();}
                else
                {Master ms=new Master();
                }
                break;
            }
            
            case 3:
            {
                System.out.println("Play your created quiz \n");
                pl.funPlQuz();
                 break;
            }
            
            case 4:
            {
              System.out.println("[Note : - You need to remember and enter first option of your created quiz to perform deletion ]");  
              dlt.funDltquz();
               break;
            }
            
            case 5:
            {
            crzn.creQuiz();
                System.out.println("play quiz soon");
             break;
            }
            
            default:System.out.println("please enter a valid input");
           
        }
        
    }
    
    public static void main(String[] args) {
        Master ms=new Master();
    }
          
}
