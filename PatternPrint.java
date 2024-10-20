public class PatternPrint {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print((k - Math.min(i, j)) + " ");
            }
            System.out.println();
        }
    }
}

