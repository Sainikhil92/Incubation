package Core_Java_HomeTasks.Task_2;

import java.util.Scanner;

import static Utilities.Utilities.log;

public class HomeTask_2_2 {

    //    Create "calculator" which takes two numbers and an operation from the command line
  //    and outputs the result of the operation to the console. Add addition, subtraction,
 //    multiplication and division. (4 marks)
//Extra task : provide option for reminder, calcualte percentage (2 marks)
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double input1=scan.nextDouble(),input2=scan.nextDouble();
        Calculator calculate=new Calculator(input1,input2);
        log.info("Addition : "+calculate.add());
        log.info("Subtraction : "+calculate.sub());
        log.info("Multiplication : "+calculate.mul());
        log.info("Division : "+calculate.div());
        log.info("Remainderr : "+calculate.rem());
    }
}
