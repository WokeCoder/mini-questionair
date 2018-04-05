//Created by T Borden March 27/2018
//Menu2.java

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is to be used to create a simple question simple multiple
 * choice questionnaire that allows the user to see there results as soon
 * as the questionnaire is completed.
 * @author T Borden
 */
public class Quiz
{
    //Instance varribles
    private String title;
    public ArrayList<QAndA> table = new ArrayList<>();
    public String choice = "Please choose the choice that best describes"
        + "how you feel: ";
    private QAndA stock = new QAndA("There are no questions",
        null,
        null,
        null,
        null);
    private int count = 0;

    /**
     * Default constructor.
     */
    public Quiz()
    {
        this("Empty Questionnaire");
    }

    /**
     * One parameter constructor that takes in a given title.
     * @param title
     */
    public Quiz(String title)
    {
        this.title = title;
        table.add(stock);

    }

    /**
     * This method takes in the question, the three possible choices, and
     * the correct answer.
     * @param question
     * @param c1
     * @param c2
     * @param c3
     * @param ans
     */
    public void addQuestion(
        String question,
        String c1,
        String c2,
        String c3,
        String ans)
    {
        QAndA questi = new QAndA(question,
            c1,
            c2,
            c3,
            ans);
        if (table.get(0).equals(stock))
        {
            table.set(0, questi);
        }
        else
        {
            table.add(questi);
        }

    }

    /**
     * This is a simple display method that shows all the questions in the
     * the table.
     */
    public void display()
    {
        System.out.println("\n" + this.title);
        for (int i = 0; i < table.size(); i++)
        {
            System.out.println(table.get(i));

            getAnswer(table.get(i).answer);
        }

    }

    /**
     * This method finds how many questions are in the table.
     * @return the table size
     */
    public int len()
    {
        return table.size();
    }

    /**
     * This method checks to see if the users answer is correct then,
     * tallies their score.
     * @param correct
     */
    private void getAnswer(String correct)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Which anwser do you think is best: ");
        String anwser = kbd.nextLine();
        if (correct == null)
        {
            return;
        }
        else if (correct.equalsIgnoreCase(anwser))
        {
            count++;
        }
    }

    /**
     * This method returns the users score out of how many questions there
     * are.
     */
    public void score()
    {
        System.out.println("You scored " + count + "/" + len());
    }

    /**
     * This is a private class that is used to create the question and
     * answer object.
     */
    private class QAndA
    {
        //Instance varibles
        private String question;
        private String choice1;
        private String choice2;
        private String choice3;
        private String answer;

        /**
         * This is the constructor that takes in the question, and three
         * choices, and the answer.
         * @param question
         * @param choice1
         * @param choice2
         * @param choice3
         * @param answer
         */
        public QAndA(
            String question,
            String choice1,
            String choice2,
            String choice3,
            String answer
        )
        {
            this.question = question;
            this.choice1 = choice1;
            this.choice2 = choice2;
            this.choice3 = choice3;
            this.answer = answer;

        }

        /**
         * This overrides the object toString into proper format.
         * @return
         */
        public String toString()
        {

            return String.format("\n%s \n A.%s \n B.%s \n C.%s",
                this.question, this.choice1, this.choice2, this.choice3);
        }
    }
}
