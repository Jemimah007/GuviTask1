package javaTask5;

public class Pattern {
    public static void main(String[] args) {
        
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(currentNumber);
                currentNumber++;
            }
            System.out.println(); 
        }
    }
}

		

	


