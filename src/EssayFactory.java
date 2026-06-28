class EssayFactory implements QuestionFactory {
    private final QuestionSource source;
    public EssayFactory(QuestionSource source) { this.source = source; }
    @Override public Question createQuestion() { return source.getQuestion("Essay"); }
    @Override public QuestionRenderer createRenderer() { return new EssayRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new EssayEvaluator(); }
}