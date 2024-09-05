package lab8;

public class Question {
    private String text ;
    private String answer ;

    public Question() {
        text = null;
        answer = null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public void display(){
        System.out.println("Q ) "+getText());
    }
    
    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }
    
    
}
