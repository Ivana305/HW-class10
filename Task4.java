package HWclass10;

public class Task4 {
    public static void main(String[] args) {
        //  Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        //  Print the sum of all numbers.
        int[][] numbers = {
                {21, 5, 80},
                {4, 2, 9, 7},
                {8, 4, 6, 0}
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];

            } System.out.println(sum);
    }
}
