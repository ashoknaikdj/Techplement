# Techplement
This is a simple Java-based console application that allows users to create and take quizzes. The application supports multiple-choice questions and provides users with the ability to add, take, and score quizzes.

## Features

- **Create Quizzes**: Users can create quizzes by entering a quiz title, multiple questions, and their corresponding options and correct answers.
- **Take Quizzes**: Users can take any created quiz by selecting the quiz title, answering questions, and receiving a score based on their answers.
- **Multiple Choice**: Each question supports four possible options.
- **Command-line Interface**: The application runs in the console and accepts commands to create and take quizzes.

## Technologies Used

- Java (JDK 8+)
- Java's `ArrayList`, `HashMap`, and `Scanner` classes for storing questions and handling user input.

## Getting Started

### Prerequisites

- You must have Java installed on your system. You can download the latest version of Java from the official website: [Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html).

### How to Run the Project

1. Clone this repository:

    ```bash
    git clone https://github.com/your-username/quiz-generator-java.git
    ```

2. Navigate to the project directory:

    ```bash
    cd quiz-generator-java
    ```

3. Compile the Java files:

    ```bash
    javac QuizGenerator.java
    ```

4. Run the application:

    ```bash
    java QuizGenerator
    ```

### Usage

Once the program is running, you can use the following commands in the console:

- **create**: Create a new quiz.
    - Enter a quiz title.
    - Enter one or more questions, along with four possible options for each question.
    - Specify the correct answer for each question.
- **take**: Take an existing quiz.
    - Enter the quiz title of the quiz you'd like to take.
    - Answer the multiple-choice questions by selecting the corresponding option number.
    - Get a final score at the end of the quiz.
- **exit**: Exit the program.

Example Flow:

```text
Enter command (create, take, exit): create
Enter quiz title: Java Basics
Enter question (or type 'done' to finish): What is the size of int in Java?
Enter option 1: 2 bytes
Enter option 2: 4 bytes
Enter option 3: 8 bytes
Enter option 4: 16 bytes
Enter correct answer: 4 bytes
Enter question (or type 'done' to finish): done
Quiz created successfully!

Enter command (create, take, exit): take
Enter quiz title to take: Java Basics
What is the size of int in Java?
1. 2 bytes
2. 4 bytes
3. 8 bytes
4. 16 bytes
Your answer: 2
Your score: 1/1

#Project Structure
QuizGenerator.java: Main class that handles the program logic.
Quiz.java: Represents a quiz, which contains a list of questions.
Question.java: Represents a single question, which contains the question text, possible options, and the correct answer.

#Future Enhancements
Add validation for user input to ensure valid option selection.
Extend the quiz to support more than four options per question.
Implement saving and loading of quizzes from a file to allow persistence between runs.
Contributing
Contributions are welcome! If you'd like to improve this project, feel free to open a pull request or submit an issue.
