package HWclass10;

public class Task3 {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String[][] groceryList = {{"tomato", "cucumber", "paprika", "olives"},
                {"apple", "Strawbery", "banana"},
                {"milk", "sour cream", "cheese"},
                {"chocolate", "lollipops", "cake", "cookies"},
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j <groceryList[i].length ; j++){
                System.out.print(groceryList[i][j]+" ");}
            System.out.println();
        }
        System.out.println();

        for (String[] array1 : groceryList){
            for (String gList:array1){
                System.out.print(gList+" ");
            }
            System.out.println();


        }
    }
}