import java.util.ArrayList;
import java.util.List;

class BankQuestionSource implements QuestionSource {
    private final List<Question> bank = new ArrayList<>();
    private int mcqIndex = 0; // Ensures sequential delivery for the demo output
    
    public BankQuestionSource() {
        // Predefined question pool matching the layout
        bank.add(new MCQQuestion("What is encapsulation?", 2, "Medium"));
        bank.add(new MCQQuestion("What is inheritance?", 2, "Easy"));
        bank.add(new EssayQuestion("Discuss the benefits of Dependency Injection.", 10, "Hard"));
        bank.add(new ProgrammingQuestion("Implement a Factory Pattern in Java.", 20, "Hard"));
        bank.add(new TrueFalseQuestion("Java supports multiple class inheritance.", 1, "Easy"));
    }
    
    @Override
    public Question getQuestion() {
        return bank.get(0);
    }
    
    @Override
    public Question getQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            List<Question> mcqs = new ArrayList<>();
            for (Question q : bank) {
                if (q.getType().equalsIgnoreCase("MCQ")) {
                    mcqs.add(q);
                }
            }
            if (!mcqs.isEmpty()) {
                Question selected = mcqs.get(mcqIndex % mcqs.size());
                mcqIndex++;
                return selected;
            }
        }
        for (Question q : bank) {
            if (q.getType().equalsIgnoreCase(type)) {
                return q;
            }
        }
        return getQuestion();
    }
}
