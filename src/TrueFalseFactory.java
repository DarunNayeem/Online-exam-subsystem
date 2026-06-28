class TrueFalseFactory implements QuestionFactory {
    private final QuestionSource source;
    public TrueFalseFactory(QuestionSource source) { this.source = source; }
    @Override public Question createQuestion() { return source.getQuestion("True/False"); }
    @Override public QuestionRenderer createRenderer() { return new TrueFalseRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new TrueFalseEvaluator(); }
}