import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class QuizGenerator {
    private static Map<String, Quiz> quizzes = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
           
            System.out.println("1)Create");
            System.out.println("2)Take");
            System.out.println("3)Exit");
            System.out.print("Enter Your Choice:");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("1")) {
                createQuiz(scanner);
            } else if (command.equalsIgnoreCase("2")) {
                takeQuiz(scanner);
            } else if (command.equalsIgnoreCase("3")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }

    private static void createQuiz(Scanner scanner) {
        System.out.print("Enter quiz title: ");
        String title = scanner.nextLine();
        Quiz quiz = new Quiz(title);

        while (true) {
            System.out.print("Enter question (or type 'done' to finish): ");
            String questionText = scanner.nextLine();
            if (questionText.equalsIgnoreCase("done")) {
                break;
            }

            List<String> options = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter option " + (i + 1) + ": ");
                options.add(scanner.nextLine());
            }

            System.out.print("Enter correct answer: ");
            String correctAnswer = scanner.nextLine();

            quiz.addQuestion(new Question(questionText, options, correctAnswer));
        }

        quizzes.put(title, quiz);
        System.out.println("Quiz created successfully!");
    }

    private static void takeQuiz(Scanner scanner) {
        System.out.print("Enter quiz title to take: ");
        String title = scanner.nextLine();
        Quiz quiz = quizzes.get(title);

        if (quiz == null) {
            System.out.println("Quiz not found.");
            return;
        }

        int score = 0;
        for (Question question : quiz.getQuestions()) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Your answer: ");
            int answerIndex = scanner.nextInt() - 1;
            scanner.nextLine(); 

            if (options.get(answerIndex).equals(question.getCorrectAnswer())) {
                score++;
            }
        }
        if(score>1){
             System.out.println("Good");
             System.out.println("Your score: " + score + "/" + quiz.getQuestions().size());
            
        }else{
            System.out.println("Improve your knowladge");
            System.out.println("Your score: " + score + "/" + quiz.getQuestions().size());
        }
    }
}