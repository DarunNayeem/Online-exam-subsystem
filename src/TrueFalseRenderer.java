class TrueFalseRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[Rendering True/False]: " + q.getText());
    }
}