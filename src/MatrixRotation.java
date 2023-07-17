import java.util.Scanner;

public class MatrixRotation {
    static void rotation(int mat[][],int row,int col){
        for(int i=0;i<row;i++){
            for (int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();

            }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];


        for(int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                mat[j][i]=scan.nextInt();


            }

        }
        rotation(mat,rowsize,colsize);

    }
}
