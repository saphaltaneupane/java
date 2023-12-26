package arraywithmethod;

public class Calculation {
    public static void main(String[] args) {
        int mat1[][]={{33,44,55},{55,66,77},{3,5,7}};
        int mat2[][]={{1,2,3},{5,8,3},{9,55,44}};
        int mat3[][] = new int[3][3];
        // addition
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.println(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
