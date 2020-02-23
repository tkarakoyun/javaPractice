package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);

    }

    public void turnToFullTime(){
        if(isFullTime==false){
            isFullTime = true;
        }else{
            System.out.println("Already FullTime!!");
        }

    }

    public void changeLocation(String newLocation){

        location = newLocation;


    }

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;

        displayInformation();


    }

    public boolean is100KOffer(){

        return salary>=100000;

    }


    public String toString() {
        String str = " [Location = " + location+ " | " +
                "Company = "+ company + " | " +
                "Salary = "+ salary + " | " +
                "isFullTime  = "  + isFullTime + " | " ;

                         return str;

    }
}
