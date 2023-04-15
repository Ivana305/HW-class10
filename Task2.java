package HWclass10;

public class Task2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops
String [][] cars={
        {"Ford","Chevrolet","Dodge","Lincoln"},
        {"BMW","Audi","Volkswagen","Porsche"},
        {"Hyundai","Kia","Genesis"},
        {"Alfa Romeo","Maserati","Ferrari","Fiat"},
};
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println();

        for (String[] car:cars){
            for (String x:car){
                System.out.print(x+" ");}
            System.out.println();
        }


        }

    }

