class EssayEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        return q.getPoints();
    }
}