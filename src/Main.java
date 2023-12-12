import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, welcome, tell me your name:");
        String userName = sc.nextLine();

        int operationNum;

        System.out.println("Hello " + userName+",");
        try {
            do {
                System.out.println("which operation you would like to perform? \n");
                System.out.println("0 - Exit, 1 - Sum, 2 - Subtraction, 3 - Multiplication, 4 - Division, 5 - Reverse String, 6 - TriangleArea, 7 - Rectangle area");

                operationNum = sc.nextInt();

                if (operationNum == 0) {
                    System.out.println("Thank you, have a nice day");

                } else if (operationNum == 1) {
                    System.out.println("Tell me the first number you want to sum: ");
                    int firstSum = sc.nextInt();
                    System.out.println("Now tell me the second one: ");
                    int secondSum = sc.nextInt();

                    int sumResult = firstSum + secondSum;

                    System.out.println("The result is: " + sumResult);

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }

                } else if (operationNum == 2) {
                    System.out.println("Tell me the first number you want to subtract to: ");
                    int firstSubtract = sc.nextInt();
                    System.out.println("Now tell me the second one: ");
                    int secondSubtract = sc.nextInt();

                    int subtractionResult = firstSubtract - secondSubtract;

                    System.out.println("The subtraction result is: " + subtractionResult);

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }

                } else if (operationNum == 3) {
                    System.out.println("Tell me the first number you want to multiply: ");
                    int firstMultiply = sc.nextInt();
                    System.out.println("Now tell me the second one: ");
                    int secondMultiply = sc.nextInt();

                    int multiplicationResult = firstMultiply * secondMultiply;

                    System.out.println("The multiplication result is: " + multiplicationResult);

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }

                } else if (operationNum == 4) {
                    System.out.println("Tell me the first number you want do divide: ");
                    int firstDivide = sc.nextInt();
                    System.out.println("Now tell me the second one:");
                    int secondDivide = sc.nextInt();

                    int divisionResult = firstDivide / secondDivide;

                    System.out.println("The division result is: " + divisionResult);

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                } else if (operationNum == 5){
                        System.out.println("Please digit the string that you would like to reverse: ");
                        sc.nextLine();
                        String toReverse = sc.nextLine();

                        ReverseString funcoes = new ReverseString();

                        String reversedString=funcoes.RevertString(toReverse);


                        System.out.println("A palavra revertida é: "+reversedString);


                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                } else if (operationNum==6){
                    System.out.println("Please digit the 3 sides of the triangle: ");
                    double triangleA = sc.nextDouble();
                    double triangleB = sc.nextDouble();
                    double triangleC = sc.nextDouble();

                    TriangleCalculus areaTriangle = new TriangleCalculus();

                    double resultArea1 = areaTriangle.triangleCalculation(triangleA,triangleB,triangleC);

                    System.out.println("The result area of the triangle is: "+resultArea1);
                    TimeUnit.SECONDS.sleep(2);

                    System.out.println("Want to compare the area with other triangle? 0 - exit, 1 - yes");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                    System.out.println("Please tell me the other triangles sides: ");
                    triangleA = sc.nextDouble();
                    triangleB = sc.nextDouble();
                    triangleC = sc.nextDouble();

                    double resultArea2 = areaTriangle.triangleCalculation(triangleA,triangleB,triangleC);
                    System.out.println("The result area of the triangle is: "+resultArea2);
                    TimeUnit.SECONDS.sleep(2);

                    if (resultArea1<resultArea2){
                        System.out.println("The bigger triangle is: The second");
                    } else {
                        System.out.println("The bigger triangle is: The second");
                    }
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }

                }else if (operationNum==7) {
                    System.out.println("Please enter the width and then the height of the triangle: ");
                    double width=sc.nextDouble();
                    double height=sc.nextDouble();

                    Rectangle rectangle= new Rectangle();

                    rectangle.width=width;
                    rectangle.height=height;

                    double areaResult = rectangle.area();
                    double perimeterResult = rectangle.perimeter();
                    double diagonalResult = rectangle.diagonal();

                    System.out.printf("AREA = %f \nPERIMETER = %f  \nDIAGONAL = %f ", areaResult,perimeterResult,diagonalResult);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                } else {
                        System.out.println("Invalid number, please try again.");
                        TimeUnit.SECONDS.sleep(3);
                }

            } while (operationNum != 0);
        }
        catch (Exception e){
            System.out.println("erro do try-catch");
        }
    }
}