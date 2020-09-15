import java.util.Scanner;

public class main {

        public static void main(String[] args) throws Exception {

            int result = 0;
            String outputStr = "";
            int op1, op2 = 0;

            Scanner scanner = new Scanner(System.in);

            String input1 = scanner.next();
            String operator = scanner.next();
            String input2 = scanner.next();


            System.out.println("=");

            input1 = input1.toUpperCase();
            input2 = input2.toUpperCase();

            Accept validate = new Accept();



            if (validate.acceptInput(input1, input2, operator) == "roman") {
                ConvertRoman romanOp = new ConvertRoman();
                op1 = romanOp.romanToInt(input1);
                op2 = romanOp.romanToInt(input2);
                switch (operator) {
                    case "+": result = op1 + op2;
                        break;
                    case "-": result = op1 - op2;
                        break;
                    case "/": result = op1 / op2;
                        break;
                    case "*": result = op1 * op2;
                        break;
                }
                outputStr = romanOp.intToRoman(result);
            }
            else {
                op1 = Integer.valueOf(input1);
                op2 = Integer.valueOf(input2);
                switch (operator) {
                    case "+": result = op1 + op2;
                        break;
                    case "-": result = op1 - op2;
                        break;
                    case "/": result = op1 / op2;
                        break;
                    case "*": result = op1 * op2;
                        break;
                }
                outputStr = Integer.toString(result);
            }

            System.out.println(outputStr);

            scanner.close();
        }
    }



