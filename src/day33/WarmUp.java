package day33;

public class WarmUp {

    public static void main(String[] args) {

        System.out.println(getSpelledName("DefneVera"));
        System.out.println(getSpelledName2("TugbaKarakoyun"));
    }

    public static String getSpelledName2 (String name){

        String result = "";

        for (int x = 0; x <name.length()-1 ; x++) {
            result += name.charAt(x)+ "-";
        }

        return result+name.charAt(name.length()-1);
    }



    public static String getSpelledName(String name){

        String result = "";
        for (int x = 0; x < name.length() ; x++) {

            result = result + name.charAt(x);
            if(x!=name.length()-1){
                result= result +"-";
            }

        }

        return result;
    }







}
