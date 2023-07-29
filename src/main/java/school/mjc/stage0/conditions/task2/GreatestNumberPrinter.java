package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean biggerNumber= first > second;

        if(biggerNumber == true){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

    }

    public static void main(String[]args){
        GreatestNumberPrinter gnp = new GreatestNumberPrinter();
        gnp.printGreatest(-400,1);
    }

    //Implement the program that will find the greatest number from two that are passed as parameters to the method and print the greatest.
    // In case of equality print any of them.
    // Implement program in the code snippet:
}
