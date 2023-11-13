public class SentenciaRuptura {

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i+=2) {
            if (i != 16) {
                System.out.println(i);
            }
        }

        for (int j = 10; j <= 20; j++) {
            if (j % 2 == 0 && j != 16) {
                System.out.println(j);
            }
        }
        
        int k = 10;
        while (true) {
            if (k % 2 == 0) {
                System.out.println(k);
                k++;
            } else if (k == 16) {
                k++;
            } else if (k > 20) {
                break;
            } else {
                k++;
            }

        }
    }
}