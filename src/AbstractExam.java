import java.util.ArrayList;
import java.util.List;

abstract class AbstractExam implements Exam {
    protected ExamConfiguration config;
    protected List<Question> questions = new ArrayList<>();
    protected String sourcingStrategy = "Question Bank Mode";
    
    @Override
    public void setConfiguration(ExamConfiguration config) {
        this.config = config;
    }
    
    @Override
    public void addQuestion(Question q) {
        this.questions.add(q);
    }
    
    public void setSourcingStrategy(String strategy) {
        this.sourcingStrategy = strategy;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");
        
        System.out.println("Type:          " + getType());
        System.out.println("Title:         " + (config != null ? config.title : ""));
        System.out.println();
        System.out.println("Duration:      " + (config != null ? config.duration : 0) + " minutes");
        System.out.println("Passing Score: " + (config != null ? config.passingScore : 0) + " Marks");
        System.out.println();
        
        System.out.println("Configuration Profiles:");
        if (config != null) {
            System.out.println((config.negativeMarking ? "✓" : "✗") + " Negative Marking Enabled");
            System.out.println((config.questionShuffle ? "✓" : "✗") + " Question Shuffle Activated");
            System.out.println((config.calculatorAllowed ? "✓" : "✗") + " Embedded Calculator Allowed");
            System.out.println((config.autoSubmit ? "✓" : "✗") + " Auto-Submit On Timeout");
        }
        
        System.out.println("Question Sourcing Strategy: " + sourcingStrategy);
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.println("- [Type: " + q.getType() + "] Points: " + q.getPoints() + " Difficulty: " + q.getDifficulty());
        }
        System.out.println("=====================================================================");
    }
}