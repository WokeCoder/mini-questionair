//Created by T Borden
// Questionnair.java - Driver class

/**
 * This is simply the driver class to show how Menu2 is used.
 * @author T Borden
 */
public class Questionnaire
{
    public static void main(String[] args)
    {
        //Menu2 created with no parameters
        Quiz obj = new Quiz();
        obj.display();
        System.out.println();

        //Menu2 created with four question added
        Quiz math = new Quiz("The Simple Math Test");
        math.addQuestion(
            "What is 1 + 2 ?",
            "3",
            "4",
            "5",
            "A");

        math.addQuestion(
            "What is  3 - 1 ?",
            "4",
            "6",
            "2",
            "C");

        math.addQuestion(
            "What is  2 x 2 ?",
            "7",
            "4",
            "2",
            "B");

        math.addQuestion(
            "What is 9 / 3 ?",
            "3",
            "7",
            "10",
            "A");

        //Displaying the questions
        math.display();
        //Displaying the score
        math.score();

    }
}
