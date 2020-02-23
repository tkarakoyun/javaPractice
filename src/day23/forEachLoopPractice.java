package day23;

public class forEachLoopPractice {

    public static void main(String[] args) {

        /**
         *
         * long array of 5 items called salaries
         * put your salary amount that ok for your offer
         *
         * use for each loop to iterate over them
         *
         * optionally:
         * print only the salary more than 1000000
         *
         */

        long [] salaries = {80000,90000,95000,100000,111000, 123456};

       // for ( long eachSalary   : salaries  ){
      //      System.out.println("Each Salary = " + eachSalary);
      //  }
        
        for (long salary : salaries){
            if (salary<=100000){
                continue;

            }
            System.out.println("salary = " + salary);
        }


    }
}
