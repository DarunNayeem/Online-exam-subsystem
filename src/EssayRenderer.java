class EssayRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[Rendering Essay]: " + q.getText());
    }
}
