package Assignment_2;

import java.util.Scanner;

public class Main_Process extends mcq_assignment {
    public static void main(String[]args){
        String name1;//declaration of the variable name1
        mcq_assignment a=new mcq_assignment();//creation of the object "a"
        do//do_while loop
            {
            String Welcome="Welcome to ABC learning center\n";//inserting data into the string variable "welcome"
            Print(Welcome,100);
            System.out.println("Hi Learner\n");
            a.question_selection();//inheritance which was taken from the mcq_assignment to display the questions
            System.out.println("Enter y if you want to continue");
            Scanner line1=new Scanner(System.in);
            name1= line1.next();//insertion data into name1
        }while(name1.equals("Y")|| name1.equals("y"));
    }
}
