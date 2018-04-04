
public class Questionnaire
{
    public static void main(String[] args)
    {
        Menu2 obj = new Menu2();
        obj.display();
        System.out.println();
        System.out.println(obj.len());

        Menu2 good = new Menu2("The Test");
        good.addQuestion(
            "How was your day?",
            "Good",
            "Ok",
            "Better",
            "A");

        good.addQuestion(
            "Whats your favorite colour?",
            "Green",
            "Red",
            "Orange",
            "B");

        good.display();
        System.out.println(good.len());
        good.score();

    }
}
