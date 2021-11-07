package Assignment_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static Assignment_2.Total_method.Total;
public class mcq_assignment {//class which contains all of the methods and codes of execution of the project
    public static void Print(String message, long timer ) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));

            try {
                Thread.sleep(timer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void question_selection(){


        System.out.println("Enter Your Name:");//output the text of insertion of name
        Scanner student = new Scanner(System.in);
        String name = student.next();//enter the input into the name
        System.out.println("Choose Course");//after inserting the name, list of courses has to be displayed
        System.out.println("1.Java Basics");//courses
        System.out.println("2. HTML");//courses
        System.out.println("3. Microsoft Office");//courses
        System.out.println("4. Programming in .NET");//courses
        Scanner c = new Scanner(System.in);
        int course = c.nextInt();//object created in order to insert the name into the variables
        int correct = 0;//variable for the calculation of the answers
        int wrong = 0;//variable for the calculation of the answers
        if (course == 1)//conditional state for the questions
        {//for division of question into arrays
            String csvFlle = "C:\\Users\\ASUS\\IdeaProjects\\Assignment-2\\src\\Assignment_2\\JAVA.csv";
            BufferedReader br = null;
            String line = "";//declaration of the variables for the insertion of the space
            // between the questions to divide them into arrays
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(csvFlle));
                while ((line = br.readLine()) != null) {
                    String[] q = line.split(csvSplitBy);

                    System.out.println(q[0] + "\n" + q[1] + "\n" + q[2] + "\n" + q[3] + "\n" + q[4]);//display of the questions onto the console
                    System.out.println("Your answer is :");
                    String ans = c.next();//insertion of the answer
                    if (q[5].equals(ans)) {//conditional state
                        System.out.println("Your answer is correct");
                        correct = correct + 10;
                    } else {//conditional state
                        System.out.println("Wrong answer");
                        wrong++;
                        System.out.println("The correct answer is" + "\n" + q[6]);
                    }
                }
                Total(name, correct, wrong);//another class that is inherited for the calculation of the answers

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (course == 2) {//conditional state for the questions
            //for division of question into arrays
            String csvFlle = "C:\\Users\\ASUS\\IdeaProjects\\Assignment-2\\src\\Assignment_2\\HTML_question.csv";
            BufferedReader br = null;
            String line = "";
            //declaration of the variables for the insertion of the space
            // between the questions to divide them into arrays
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(csvFlle));
                while ((line = br.readLine()) != null) {
                    String[] q = line.split(csvSplitBy);

                    System.out.println(q[0] + "\n" + q[1] + "\n" + q[2] + "\n" + q[3] + "\n" + q[4]);//display of the questions onto the console
                    System.out.println("Your answer is :");
                    String ans = c.next();//insertion of the answer
                    if (q[5].equals(ans)) //conditional state
                    {
                        System.out.println("Your answer is correct");
                        correct = correct + 10;
                    }
                    else //conditional state
                        {
                        System.out.println("Wrong answer");
                        wrong++;
                        System.out.println("The correct answer is" + "\n" + q[6]);
                    }
                }
                Total(name, correct, wrong);//another class that is inherited for the calculation of the answers

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else if (course == 3) //conditional state for the questions
        {

            String csvFlle = "C:\\Users\\ASUS\\IdeaProjects\\Assignment-2\\src\\Assignment_2\\Microsoft_Office.csv";
            BufferedReader br = null;
            String line = "";
            //declaration of the variables for the insertion of the space
            // between the questions to divide them into arrays
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(csvFlle));
                while ((line = br.readLine()) != null) {
                    String[] q = line.split(csvSplitBy);

                    System.out.println(q[0] + "\n" + q[1] + "\n" + q[2] + "\n" + q[3] + "\n" + q[4]);//display of the questions onto the console
                    System.out.println("Your answer is :");
                    String ans = c.next();//insertion of the questions
                    if (q[5].equals(ans)) //conditional state
                    {
                        System.out.println();
                        correct = correct + 10;
                    }
                    else //conditional state
                        {
                        System.out.println("Wrong answer");
                        wrong++;
                        System.out.println("The correct answer is" + "\n" + q[6]);
                    }
                }
                Total(name, correct, wrong);//another class that is inherited for the calculation of the answers

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else if(course == 4) //conditional state for the questions
        {
            String csvFlle = "C:\\Users\\ASUS\\IdeaProjects\\Assignment-2\\src\\Assignment_2\\Programming_in_.net.csv";
            BufferedReader br = null;
            String line = "";
            //declaration of the variables for the insertion of the space
            // between the questions to divide them into arrays
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(csvFlle));
                while ((line = br.readLine()) != null) {
                    String[] q = line.split(csvSplitBy);

                    System.out.println(q[0] + "\n" + q[1] + "\n" + q[2] + "\n" + q[3] + "\n" + q[4]);//display of the questions onto the console
                    System.out.println("Your answer is :");
                    String ans = c.next();//insertion of the answer
                    if (q[5].equals(ans)) //conditional state
                    {
                        System.out.println("Your answer is correct");
                        correct = correct + 10;
                    }
                    else //conditional state
                    {
                        System.out.println("Wrong answer");
                        wrong++;
                        System.out.println("The correct answer is" + "\n" + q[6]);
                    }
                }
                Total(name, correct, wrong);//another class that is inherited for the calculation of the answers

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    }




