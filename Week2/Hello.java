import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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

        /*//challenge #7 - calculate 5 test scores
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
        */

        /*//challenge #8 REPL App
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my REPL App!");
        String input = scan.nextLine().toLowerCase();
        int num1 = 0;
        int num2 = 0;
        while(!input.equals("quit")){
            switch(input){
                case "help":
                    System.out.print("Available commands:\nadd\nsubtract\nmultiply\ndivide\nrandom\nreverse\nquit\n");
                    break;
                case "add":
                    System.out.print("First number: ");
                    num1 = scan.nextInt();
                    System.out.print("Second number: ");
                    num2 = scan.nextInt();
                    System.out.printf("Result: %d%n", num1+num2);
                    scan.nextLine();
                    break;
                case "subtract":
                    System.out.print("First number: ");
                    num1 = scan.nextInt();
                    System.out.print("Second number: ");
                    num2 = scan.nextInt();
                    System.out.printf("Result: %d%n", num1-num2);
                    scan.nextLine();
                    break;
                case "multiply":
                    System.out.print("First number: ");
                    num1 = scan.nextInt();
                    System.out.print("Second number: ");
                    num2 = scan.nextInt();
                    System.out.printf("Result: %d%n", num1*num2);
                    scan.nextLine();
                    break;
                case "divide":
                    System.out.print("First number: ");
                    num1 = scan.nextInt();
                    System.out.print("Second number: ");
                    num2 = scan.nextInt();
                    System.out.printf("Result: %d%n", num1/num2);
                    scan.nextLine();
                    break;
                case "reverse":
                    System.out.print("Enter text: ");
                    input = scan.nextLine();
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.printf("Result: %s%n", reversed);
                    break;
                case "random":
                    System.out.print("Minimum: ");
                    num1 = scan.nextInt();
                    System.out.print("Maximum: ");
                    num2 = scan.nextInt();
                    System.out.printf("Random number: %d%n", (int)(Math.random() * (num2 - num1 + 1)) + num1);
                    scan.nextLine();
                    break;
                default:
                    System.out.println("Invalid command, please trype a valid command");
                    break;
            }
            input = scan.nextLine().toLowerCase();
        }
        System.out.println("Goodbye!");

        //challenge #9 - Password Validator
        //Scanner scan = new Scanner(System.in);
        System.out.println("The password must:\nBe at least 8 characters\nContain at least one uppercase letter\nContain at least one lowercase letter\nContain at least one number");
        System.out.print("Please enter a password: ");
        String password = scan.nextLine();
        int lower = 0;
        int upper = 0;
        int num = 0;
        for(int i = 0; i < password.length(); i++){
            char cur = password.charAt(i);
            if(Character.isLowerCase(cur)){
                lower++;
            }
            if(Character.isUpperCase(cur)){
                upper++;
            }
            if(Character.isDigit(cur)){
                num++;
            }
        }
        if(password.length() >= 8 && lower > 0 && upper > 0 && num > 0){
            System.out.println("Password accepted!");
        } else{
            System.out.println("Password rejected:");
            if(password.length() < 8){
                System.out.println("- Must be at least 8 characters");
            }
            if(upper == 0){
                System.out.println("- Must contain an uppercase letter");
            }
            if (lower == 0){
                System.out.println("- Must contain a lowercase letter");
            }
            if (num == 0){
                System.out.println("- Must contain a number");
            }
        }

        // challenge #10 - Word Analyzer
        //Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if(cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u' || cur == 'A' || cur == 'E' || cur == 'I' || cur == 'O' || cur == 'U'){
                vowels++;
            } else if(Character.isLetter(cur)){
                consonants++;
            } else if(Character.isDigit(cur)){
                digits++;
            } else if(Character.isWhitespace(cur)){
                spaces++;
            }
        }
        System.out.println("Characters: " + word.length());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces); */

        //challenge #11 - Datetime API
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth date(YYYY-MM-DD): ");
        LocalDate birthday = LocalDate.parse(scan.nextLine());
        Period age = Period.between(birthday, date);
        System.out.println("You are " + age.getYears() + " years old.");
        System.out.println("\n");
        System.out.print("Enter your birthday(YYYY-MM-DD): ");

        birthday = LocalDate.parse(scan.nextLine());
        LocalDate nextBirthday = birthday.withYear(date.getYear());
        if (nextBirthday.isBefore(date) || nextBirthday.isEqual(date)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntil = ChronoUnit.DAYS.between(date, nextBirthday);
        System.out.println("Days until your next birthday: " + daysUntil);

    }

    /*public static void printGrade(int score){
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
    }*/
}