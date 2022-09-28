import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "Who won the 2010 world cup?";
        questions[1] = "What is 2+2";
        questions[2] = "Who made Minecraft?";
        questions[3] = "Who is Tony Stark?";
        questions[4] = "What year is it?";

        String[] answers = new String[5];
        answers[0] = "Spain";
        answers[1] = "4";
        answers[2] = "Mojang";
        answers[3] = "ironman";
        answers[4] = "2022";

        Scanner scanner = new Scanner(System.in);
        int points = 0;

        for (int i = 0; i < questions.length; i++) {
            outputQuestions(questions[i]);
            String usersAnswer = scanner.next();

            if (isAnswerCorrect(usersAnswer, answers[i])) {
                points = pointsIncrease(points);
                System.out.println("You got it correct");

            } else {
                wrongAnswer(answers[i]);


            }
        }
        pointsPrint(points);


    }

    public static void outputQuestions(String questions) {

        System.out.println(questions);
    }

    public static boolean isAnswerCorrect(String userAnswer, String realAnswer) {
        return userAnswer.equals(realAnswer);
    }

    public static int pointsIncrease(int points) {

        return points++;
    }

    public static void pointsPrint(int points) {

        System.out.println("You got " + points + " points");
    }

    public static void wrongAnswer(String realAnswer) {
        System.out.println("The correct answer is " + realAnswer);
    }

}
