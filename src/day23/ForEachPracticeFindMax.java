package day23;

public class ForEachPracticeFindMax {

    public static void main(String[] args) {

        long [] salaries = {80000,90000,95000,100000,111000, 123456};

        long maxSalary = salaries[0];

        for(long salary: salaries){
            if(salary>maxSalary){
                maxSalary = salary;
            }
        }

        System.out.println("max Salary = " + maxSalary);
    }
}
