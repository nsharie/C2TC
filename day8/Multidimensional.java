package day8;

public class Multidimensional {
    public static void main(String[] args) {
        int arr[][] = {{1,3,7},{2,4,6},{4,6,7}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
