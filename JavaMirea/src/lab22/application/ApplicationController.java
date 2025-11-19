package lab22.application;

import lab22.CalculatorRPN;

public class ApplicationController {
    private final CalculatorRPN model;
    private final ApplicationView view;

    public ApplicationController(CalculatorRPN model, ApplicationView view){
        this.model = model;
        this.view = view;
    }

    public void calculate(String expression){
        model.calculate(expression);
    }

    public String getAnswer(){
        return model.getAnswerAsPlainText();
    }

    public void updateView(String answer){
        view.displayAnswer(answer);
    }
}
