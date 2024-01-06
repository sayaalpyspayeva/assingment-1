public class NumberOutput {
    public static void printNumbers(int A, int B) {
        if (A < B) {
            printAscending(A, B);
        } else {
            printDescending(A, B);
        }
    }

    private static void printAscending(int current, int B) {
        if (current <= B) {
            System.out.print(current + " ");
            printAscending(current + 1, B);
        }
    }

    private static void printDescending(int current, int B) {
        if (current >= B) {
            System.out.print(current + " ");
            printDescending(current - 1, B);
        }
    }

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        printNumbers(A, B);
    }
}

