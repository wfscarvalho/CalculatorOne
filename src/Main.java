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
                System.out.println("0 - Exit, 1 - Sum, 2 - Subtraction, 3 - Multiplication, 4 - Division, 5 - Reverse String, 6 - TriangleArea, 7 - Rectangle area, 8 - Employee, 9- FinalGrade, 10 - Currency Converter");

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

                    System.out.printf("AREA = %.2f \nPERIMETER = %.2f  \nDIAGONAL = %.2f ", areaResult,perimeterResult,diagonalResult);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                }else if(operationNum==8){
                    System.out.println("Please share the employee details.");
                    TimeUnit.SECONDS.sleep(1);
                    sc.nextLine();
                    System.out.println("Employee Name:");
                    String employeeName=sc.nextLine();
                    System.out.println("Employee Gross Salary: ");
                    double employeeGrossSalary=sc.nextDouble();
                    System.out.println("Employee Tax: ");
                    double employeeTax=sc.nextDouble();

                    Employee employee=new Employee();

                    employee.name=employeeName;
                    employee.grossSalary=employeeGrossSalary;
                    employee.tax=employeeTax;
                    employee.NetSalary();
                    System.out.println("Employee: "+employee);
                    TimeUnit.SECONDS.sleep(2);

                    System.out.println("Which percentage increase the salary?");

                    double percentage = sc.nextDouble();

                    employee.IncreaseSalary(percentage);
                    employee.NetSalary();

                    System.out.println("Updated data: "+employee);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                } else if (operationNum==9){
                    sc.nextLine();
                    System.out.println("Please enter the Student Name");
                    String name=sc.nextLine();
                    System.out.println("Please enter the 3 notes of the Student:");
                    double grade1=sc.nextDouble();
                    double grade2=sc.nextDouble();
                    double grade3=sc.nextDouble();

                    Student student=new Student();

                    student.name=name;
                    student.grade1=grade1;
                    student.grade2=grade2;
                    student.grade3=grade3;

                    double finalGrade= student.FinalGrade();
                    String finalResult=student.EndYearResult();

                    System.out.printf("FINAL GRADE= %.2f\n%s",finalGrade,finalResult);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                } else if(operationNum==10){
                    System.out.println("What is the dollar Price?");
                    double dollarPrice=sc.nextDouble();
                    System.out.println("How many dollar will be bought?");
                    double dollarBought=sc.nextDouble();

                    double amount=CurrencyConverter.Ammount(dollarPrice,dollarBought);

                    System.out.printf("Amount to be paid in REAIS: %.2f\n\n",amount);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\n\n\nWant to perform a new operation?");
                    System.out.println("0 - Exit, 1 - New");
                    int exit = sc.nextInt();
                    if (exit == 0) {
                        break;
                    }
                }
                else {
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