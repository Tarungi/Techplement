/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import com.quiz.main.Master;
import java.util.Scanner;
public class Create_quiz {
    Scanner ob=new Scanner (System.in);
    Scanner sc=new Scanner (System.in);
    String n,o1,o2,o3,o4,ansr;
   public void creQuiz()
   {
       System.out.println("Welcome to create your own quiz");
       
       System.out.println("Enter a question");
        n=ob.nextLine();
       
       System.out.println("Enter first option");
       o1 =ob.nextLine();
       
       System.out.println("Enter second option");
       o2 =ob.nextLine();
       
       System.out.println("Enter third option");
       o3 =ob.nextLine();
       
       System.out.println("Enter fourth option");
       o4 =ob.nextLine();
       
       System.out.println("please specify one answer");
       ansr =ob.nextLine();
       
       
       System.out.println("do you want to play your created quiz, press \n 1 for yes \n 2 for No");
       int n=ob.nextInt();
       
       if (n==1)
       {
       plQuiz();
       }
       else{System.out.println("thank you");}
       
//       System.out.println("Your question was \n"+n);
//       System.out.println("options are \n A."+o1+"\n B."+o2+"\n C."+o3+"\n D."+o4);
   }
   
   public void plQuiz()
   {
   int count=0;
        System.out.println("\n"+n+"\n A."+o1+"\n B."+o2+"\n C."+o3+"\n D."+o4);
        
        System.out.println("\n Enter answer");
        String ans2=sc.nextLine();
        
        if (ans2.equals(ansr))
        {
           count=5;
        }else{System.out.println("you are wrong");}
        
        System.out.println("you got : "+count+ "out of 5");
        
        System.out.println("\n Return to Main Menu. enter \n 1 for yes\n 2 for Exit ");
        int x=sc.nextInt();
        if(x==1)
        {
        Master ms = new Master();
        }else{System.out.println("Thank You");}
   }
   
//    public static void main(String[] args) {
//        Create_quiz qu=new Create_quiz();
//        qu.creQuiz();
//    }
}
