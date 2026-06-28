class ProgrammingFactory implements QuestionFactory {
    private final QuestionSource source;
    public ProgrammingFactory(QuestionSource source) { this.source = source; }
    @Override public Question createQuestion() { return source.getQuestion("Programming"); }
    @Override public QuestionRenderer createRenderer() { return new ProgrammingRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new ProgrammingEvaluator(); }
}