
import java.util.ArrayList;
import java.util.Scanner;

public class Menu2
{

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

    public Menu2()
    {
        this("Empty Questionair");
    }

    public Menu2(String title)
    {
        this.title = title;
        table.add(stock);

    }

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

    public void display()
    {
        System.out.println("\n" + this.title);
        for (int i = 0; i < table.size(); i++)
        {
            System.out.println(table.get(i));

            getAnwser(table.get(i).anwser);
        }

    }

    public int len()
    {
        return table.size();
    }

    private void getAnwser(String correct)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Which anwser do think is best: ");
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

    public void score()
    {
        System.out.println("You scored " + count + "/" + len());
    }

    private class QAndA
    {
        private String question;
        private String choice1;
        private String choice2;
        private String choice3;
        private String anwser;

        public QAndA(
            String question,
            String choice1,
            String choice2,
            String choice3,
            String anwser
        )
        {
            this.question = question;
            this.choice1 = choice1;
            this.choice2 = choice2;
            this.choice3 = choice3;
            this.anwser = anwser;

        }

        public String toString()
        {

            return String.format("\n%s \n A.%s \n B.%s \n C.%s",
                this.question, this.choice1, this.choice2, this.choice3);
        }
    }
}
