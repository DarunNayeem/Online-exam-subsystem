class ExamBuilder {
    private final ExamConfiguration config = new ExamConfiguration();
    
    public ExamBuilder setTitle(String title) {
        config.title = title;
        return this;
    }
    
    public ExamBuilder setDuration(int duration) {
        config.duration = duration;
        return this;
    }
    
    public ExamBuilder setPassingScore(int passingScore) {
        config.passingScore = passingScore;
        return this;
    }
    
    public ExamBuilder setNegativeMarking(boolean negativeMarking) {
        config.negativeMarking = negativeMarking;
        return this;
    }
    
    public ExamBuilder setQuestionShuffle(boolean questionShuffle) {
        config.questionShuffle = questionShuffle;
        return this;
    }
    
    public ExamBuilder setAutoSubmit(boolean autoSubmit) {
        config.autoSubmit = autoSubmit;
        return this;
    }
    
    public ExamBuilder setCalculatorAllowed(boolean calculatorAllowed) {
        config.calculatorAllowed = calculatorAllowed;
        return this;
    }
    
    public ExamConfiguration build() {
        return this.config;
    }
}