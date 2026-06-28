class TrueFalseQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;
    
    public TrueFalseQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }
    
    @Override
    public String getType() { return "True/False"; }
    @Override
    public int getPoints() { return points; }
    @Override
    public String getDifficulty() { return difficulty; }
    @Override
    public String getText() { return text; }
}
