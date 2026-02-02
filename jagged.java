import java.util.Arrays;

public class jagged {
    public static void main(String[] args) {

        int[][] jy = new int[2][];

        jy[0] = new int[3];
        jy[0][0] = 10;
        jy[0][1] = 50;
        jy[0][2] = 30;

        jy[1] = new int[2];
        jy[1][0] = 20;
        jy[1][1] = 40;

        System.out.println(Arrays.deepToString(jy));
    }
}
