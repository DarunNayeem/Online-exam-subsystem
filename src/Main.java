public class Main {
    public static void main(String[] args) {
        // Step 1: Instantiate a targeted ExamFactory subclass to pick the foundational exam format
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();
        
        // Step 2: Declare an active QuestionSource configuration strategy
        QuestionSource source = new BankQuestionSource();
        String sourcingStrategyName = "Question Bank Mode";
        
        // Step 3: Initialize Abstract Factories by feeding them the target data source strategy context
        QuestionFactory mcqFactory = new MCQFactory(source);
        QuestionFactory essayFactory = new EssayFactory(source);
        QuestionFactory programmingFactory = new ProgrammingFactory(source);
        QuestionFactory tfFactory = new TrueFalseFactory(source);
        
        // Step 4: Chain fluid API method calls via an ExamBuilder pipeline instance to construct parameters
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setQuestionShuffle(true)
                .setCalculatorAllowed(false)
                .setAutoSubmit(true)
                .build();
        
        exam.setConfiguration(config);
        if (exam instanceof AbstractExam) {
            ((AbstractExam) exam).setSourcingStrategy(sourcingStrategyName);
        }
        
        // Add questions created dynamically via abstract factories using the injected source strategy
        exam.addQuestion(mcqFactory.createQuestion());
        exam.addQuestion(mcqFactory.createQuestion());
        exam.addQuestion(essayFactory.createQuestion());
        exam.addQuestion(programmingFactory.createQuestion());
        exam.addQuestion(tfFactory.createQuestion());
        
        // Step 5: Generate and log a clean, unified dashboard summary to the console window
        exam.displayInfo();
    }
}