import java.util.Arrays;

public class ComparacionImprobable {

    public static void main(String[] args) {

        // Inícialo, si te atreves

        boolean sonIguales;

        do {
            double notRandy = Math.random() * 10 + 2;
            int randy = (int)notRandy;

            int[][] arrayNum = new int[randy][];

            for (int i = 0; i < randy; i++) {
                arrayNum[i] = new int[randy];
                
                for (int j = 0; j < randy; j++) {
                    arrayNum[i][j] = (int)(Math.random() * 10);
                }
            }

            for (int k = 0; k < arrayNum.length; k++) {
                for (int l = 0; l < arrayNum[k].length; l++) {
                    if (l == (arrayNum[k].length) - 1) {
                        System.out.print(arrayNum[k][l]);
                    } else {
                        System.out.print(arrayNum[k][l]);
                        System.out.print(" - ");
                    }
                    
                }
                System.out.println();
            }

            System.out.println();
            int[][] arrayNum2 = new int[randy][];

            for (int m = 0; m < randy; m++) {
                arrayNum2[m] = new int[randy];
                
                for (int n = 0; n < randy; n++) {
                    arrayNum2[m][n] = (int)(Math.random() * 10);
                }
            }

            for (int r = 0; r < arrayNum.length; r++) {
                for (int t = 0; t < arrayNum2[r].length; t++) {
                    if (t == (arrayNum2[r].length) - 1) {
                        System.out.print(arrayNum2[r][t]);
                    } else {
                        System.out.print(arrayNum2[r][t]);
                        System.out.print(" - ");
                    }
                    
                }
                System.out.println();
            }
            System.out.println();

            sonIguales = Arrays.deepEquals(arrayNum, arrayNum2);
            System.out.println(sonIguales);
            System.out.println();
            System.out.println();

        } while (!sonIguales);
    }
}
