import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        ScaleCuboidBox myBox = new ScaleCuboidBox(length, width, height);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            int mod = input.nextInt();
            if (mod >= 1 & mod <= 3) {
                if (mod == 1) {
                    System.out.println(myBox.getLength());
                }
                else if (mod == 2) {
                    System.out.println(myBox.getWidth());
                }
                else {
                    System.out.println(myBox.getHeight());
                }
            }
            else if (mod >= 4 & mod <= 6) {
                if (mod == 4) {
                    length = input.nextDouble();
                    myBox.setLength(length);
                }
                else if (mod == 5) {
                    width = input.nextDouble();
                    myBox.setWidth(width);
                }
                else {
                    height = input.nextDouble();
                    myBox.setHeight(height);
                }
            }
            else {
                System.out.println(myBox.getVolume());
            }
        }
    }
}
