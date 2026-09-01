public class Hello {
    public static void main(String[] args) {

        //challenge #1 - printing
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
    }
}