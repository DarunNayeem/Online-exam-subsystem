class FakerQuestionSource implements QuestionSource {
    @Override
    public Question getQuestion() {
        return getQuestion("MCQ");
    }
    
    @Override
    public Question getQuestion(String type) {
        switch (type) {
            case "MCQ":
                return new MCQQuestion("Procedural MCQ Question", 2, "Medium");
            case "True/False":
                return new TrueFalseQuestion("Procedural T/F Question", 1, "Easy");
            case "Essay":
                return new EssayQuestion("Procedural Essay Question", 10, "Hard");
            case "Programming":
                return new ProgrammingQuestion("Procedural Coding Challenge", 20, "Hard");
            default:
                return new MCQQuestion("Default Faker Question", 2, "Easy");
        }
    }
}
