package lab8;

public class ChoiceQuestion extends Question{
    private String choices[];
    private int i ; // i for index of array.

    public ChoiceQuestion() {
        super(); // it is ok to delete it because it has no parameters in super class Question.
        choices = new String[4];
        i = 0 ;
    }
    
    public void addChoice(String choice , boolean state){
        String answerNum = ""+(i+1);
        choices[i] = choice;
        if(state){
            setAnswer(answerNum);
        }
        i++;
    }
    
    @Override
    public void display(){
        super.display();
        for (int j = 0; j < choices.length; j++) {
            System.out.println("  "+(j+1)+" ) "+choices[j]);
            
        }
    }
    
}
