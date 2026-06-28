class MCQFactory implements QuestionFactory {
    private final QuestionSource source;
    public MCQFactory(QuestionSource source) { this.source = source; }
    @Override public Question createQuestion() { return source.getQuestion("MCQ"); }
    @Override public QuestionRenderer createRenderer() { return new MCQRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new MCQEvaluator(); }
}