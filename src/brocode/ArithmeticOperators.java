package brocode;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        //addition
        z = x + y;

        //substraction
        z = x -y;

        // multiplication
        z = x * y;

        //division
        z = x / y;

        //remainder
        z = x % 3;

        //augmented assignment operators
        x += 10;
        x -= 10;
        y *= 2;
        y /= 5;

        //increment and decrement operators
        x++;
        y--;

        //order of operation [ P E M D A S ]
        double result = 3 + 4 * ( 7 - 5) / 2.0;



    }


}
