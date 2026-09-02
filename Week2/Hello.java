import java.util.*;
public class Hello {
    public static void main(String[] args) {

        /*//challenge #1 - printing
        System.out.println("Hello World!");

        //challenge #2 - variables
        int age = 22;
        double height = 5.6;
        String name = "Naomi";

        System.out.printf("Name:%s, Age:%d, Height:%.1f%n", name, age, height);

        //challenge #3 - operators
        int a = 20;
        int b = 10;
        System.out.printf("Addition: %d%n", a+b);
        System.out.printf("Subtraction: %d%n", a-b);
        System.out.printf("Multiplication: %d%n", a*b);
        System.out.printf("Division: %d%n", a/b);

        boolean greater = (a > b) ?  true : false;
        boolean result = (a > b && b > 0) ? true : false;

        System.out.printf("Is a greater than b? %b%n", greater);
        System.out.printf("Is a > b and b > 0? %b%n", result);

        //challenge #4 - control flow
        int score = 75;
        char grade = 'B';
        String rst = "";
        if(score >= 50){
            rst = "Passed";
        } else{
            rst = "Failed";
        }
        System.out.println(rst);
        
        if(score >= 90){
            grade = 'A';
        } else if(score >= 75){
            grade = 'B';
        } else if(score >= 60){
            grade = 'C';
        } else{
            grade = 'D';
        }
        System.out.printf("Grade: %c%n", grade);

        //Challenge #5 - loops

        //for loops
        System.out.print("For Loop: ");
        for(int i = 1; i <= 5; i++){
            if(i == 5){
                System.out.print(i + "\n");
            } else{
                System.out.print(i + " ");
            }
        }
        //While loop
        System.out.print("While Loop: ");
        int i = 1;
        while(i <= 5){
            if(i == 5){
                System.out.print(i + "\n");
            } else{
                System.out.print(i + " ");
            }
            i++;
        }

        //Do While Loop
        System.out.print("Do-While Loop: ");
        i = 1;
        do {
            if(i == 5){
                System.out.print(i + "\n");
            } else{
                System.out.print(i + " ");
            }
            i++;
        }
        while(i <= 5);

        //challenge #6 - calculator
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";
        double toReturn = 0;
        String toPrint = "";
        while(again.equals("y")){
            if(operator == '+'){
                toReturn = num1 + num2;
            } else if(operator == '-'){
                toReturn = num1 - num2;
            } else if(operator == '*'){
                toReturn = num1 * num2;
            } else {
                if(num2 == 0){
                    toPrint = "Cannot divide by zero";
                } else{
                    toReturn = (num1 / num2);
                }
            }
            toPrint = "Result: " + toReturn;
            System.out.println(toPrint);
            again = "n";
        }
        System.out.println("Thank you for using the calculator.");
        */

        //challenge #7 - calculate 5 test scores
        Scanner scan = new Scanner(System.in);
        int index = 0;
        int count = 5;
        int input = 0;
        int total = 0;
        int average = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        char grade = 'A';
        int[] arr = new int[5];
        while(index < 5){
            System.out.printf("Please input %d more test scores%n", count);
            input = scan.nextInt();
            arr[index] = input;
            total += input;
            if(input > highest){
                highest = input;
            }
            if(input < lowest){
                lowest = input;
            }
            index++;
            count--;
        }
        average = total/index;
        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Highest: %d%n", highest);
        System.out.printf("Lowest: %d%n%n", lowest);
        System.out.println("Your values were:");
        for(int i = 0; i < arr.length; i++){
            printGrade(arr[i]);
        }
        System.out.println("");


        //challenge #8 Repl
        input = 0;
        double balance = 0;
        while(input != 4){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            input = scan.nextInt();
            if(input == 1){
                System.out.printf("Balance: $%.2f%n", balance);
            } else if(input == 2){
                System.out.println("Please enter an amount");
                input = scan.nextInt();
                while(input <= 0){
                    System.out.println("Please enter an amount more than $0.00");
                    input = scan.nextInt();
                }
                balance += input;
                System.out.printf("Deposit $%d.00%nBalance: $%.2f%n", input, balance);
                input = 0;
            } else if(input == 3){
                if(balance > 0){
                    System.out.println("Please enter an amount");
                    input = scan.nextInt();
                    while(input <= 0 || balance - input < 0 ){
                        System.out.println("Please enter a valid amount of more than $0.00 or you do not have withdrawable amount in your account");
                        input = scan.nextInt();
                    }
                    balance -= input;
                    System.out.printf("Withdraw $%d.00%nBalance: $%.2f%n", input, balance);
                    input = 0;
                } else{
                    System.out.println("You do not have any money to withdraw from");
                }
            }
        }
        scan.close();
    }

    public static void printGrade(int score){
            char grade;
            if(score >= 90){
            grade = 'A';
        } else if(score > 75){
            grade = 'B';
        } else if(score > 60){
            grade = 'C';
        } else if(score > 20){
            grade = 'D';
        } else{
            grade = 'F';
        }
        System.out.printf("%d - %c%n", score, grade);
    }
}