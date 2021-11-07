package Assignment_2;

class Total_method extends mcq_assignment {


    public static void Total(String n,int a, int w)//encapsulation which is wrapped in a one unit and used in the class-
    {
        System.out.println("Terminate Multiple chocie and calculates your score");
        double percentage= a*100/80;//creating an object which contains function of calculation of the scores
        System.out.println("Congrats"+ n);//display of the name of the student
        System.out.println("YOUR SCORE"+ a);//display of the score of the student
        System.out.println("Your name is:"+ n);//diaplay of the name of the student
        System.out.println("You answered 8 Questions and "+ w + "question(s) wrong. So you get" + percentage + "%");//display the final score of the student
    }
}
