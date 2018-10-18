import java.util.Scanner;

public class Calculator {


    public Calculator(){
    }


    public int[] takeNumbers(int firstNumber, int secondNumber){
        int[] numbers = {firstNumber, secondNumber};
        return numbers;
    }

    public int makeAction(String action, int[] table) {
        Action akcja = new Action();

        if (action == "+") {
            return akcja.add(table);
        }
        if (action == "-") {
            return akcja.subtract(table);
        }
        if (action == "*") {
            return akcja.multiply(table);
        }
        if (action == "/") {
            return Integer.parseInt(akcja.divide(table));
        } else
            return 0;
    }



}
