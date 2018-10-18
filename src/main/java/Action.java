public class Action {

    public Action(){

    }

    public int add(int[] table){
        int result = table[0] + table[1];
        return result;
    }

    public int subtract(int[] table){
        int result = table[0] - table[1];
        return result;
    }

    public int multiply(int[] table) {
        int result = table[0] * table[1];
        return result;
    }

    public String divide(int[] table){
        if(table[1] == 0)
            return "nie podzielę przez 0.";
        else {
            int result = table[0] / table[1];
            return "" + result;
        }
    }
}
