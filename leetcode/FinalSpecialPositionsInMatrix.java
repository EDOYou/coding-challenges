package leetcode;

public class FinalSpecialPositionsInMatrix {
    public static int numSpecial(int[][] mat) {
        int specials = 0;
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                if (mat[i][j] == 1) {
                    boolean isSpecial = true;
                    for (int k = 0; k < mat[0].length; ++k) {
                        if (k != j && mat[i][k] == 1) {
                            isSpecial = false;
                            break;
                        }
                    }

                    for (int k = 0; k < mat.length; ++k) {
                        if (k != i && mat[k][j] == 1) {
                            isSpecial = false;
                            break;
                        }
                    }
                    if (isSpecial) specials++;
                }
            }
        }
        return specials;
    }
}
