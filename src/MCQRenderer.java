class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[Rendering MCQ]: " + q.getText());
    }
}