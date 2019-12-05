package day12;

public class CarShopping {

    public static void main(String[] args) {

        String carBrand = "Corolla";
        int carPrice = 60000;
        int budget = 40000;

        //if (carBrand.equals("Corolla") || carBrand.equals("Tesla") && carPrice <= budget ){
          //  System.out.println("Car Acquired!!");
      //  }else{
       //     System.out.println("Not What I am looking for");
        if (carBrand.equals("Corolla")){
            System.out.println("Car Acquired");
        }else if (carBrand.equals("Tesla") && carPrice <= budget){
            System.out.println("Car Acquired");
        }else{
            System.out.println("not what I a looking for");
        }


    }
}
