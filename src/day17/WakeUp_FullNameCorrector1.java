package day17;

public class WakeUp_FullNameCorrector1 {

    public static void main(String[] args) {
        //                 0123456789
        String fullName = "arYa sTark";
        
        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5);
        
        String firstNameCorrected
                = firstName.toUpperCase().substring(0,1) +
                firstName.toLowerCase().substring(1);

        System.out.println(firstNameCorrected);
        
        String lastNameCorrected = lastName.toUpperCase().substring(0,1) + 
                                    lastName.toLowerCase().substring(1);

        System.out.println("lastNameCorrected = " + lastNameCorrected);

        fullName = firstNameCorrected+ " " + lastNameCorrected;

        System.out.println(fullName);
    }
}
