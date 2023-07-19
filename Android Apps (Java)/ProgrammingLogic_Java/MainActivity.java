import java.util.ArrayList;

public class MainActivity {

    // TODO #1: add integer member variables here
    public int currentQuestionIndex;
    public int totalCorrect;
    public int totalQuestions;
    // TODO #2: add ArrayList member variable here
    ArrayList<Question> questions;
    // TODO #3 add startNewGame() here
    public void startNewGame() {

        Question question1 = new Question(921238, "How tall is the Eiffel tower?",
                "1024 ft", "1034 ft", "1064 ft", "1124 ft", 1);
        Question question2 = new Question(107343, "Who invented the computer algorithm?",
                "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
        Question question3 = new Question (748294, "What is the name for the patch " +
                "of skin found on your elbow", "Elbow Skin", "Fascia Elbora", "Wenis", "Todd", 2);

        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        totalCorrect = 0;
        totalQuestions = 0;
    }
    Question firstQuestion = chooseNewQuestion();
//      displayQuestion(firstQuestion);
//      displayQuestionsRemaining(questions.size());


    // TODO #4 add chooseNewQuestion() here
    public Question chooseNewQuestion(){
        int randomQuestion = generateRandomNumber(questions.size()-1);
        currentQuestionIndex = randomQuestion;
        return questions.get(currentQuestionIndex);
    }

    // TODO #5 add getCurrentQuestion() here
    public Question getCurrentQuestion(){
        return questions.get(currentQuestionIndex);
    }
    // TODO #6 add onAnswerSubmission() here
    public void onAnswerSubmission(){
        Question currentQues = getCurrentQuestion();
        if (currentQues.isCorrect()){
            totalCorrect += 1;
            questions.remove(currentQuestionIndex);

            if(questions.size() == 0){
                System.out.println("game over");
                startNewGame();

            } else{
                chooseNewQuestion();
            }

        }
    }

    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " +
                    totalQuestions + ". Better luck next time!";
        }

    }
}