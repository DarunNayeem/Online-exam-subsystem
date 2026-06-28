import java.util.ArrayList;
import java.util.List;

interface Exam {
    String getType();
    void displayInfo();
    void setConfiguration(ExamConfiguration config);
    void addQuestion(Question q);
}