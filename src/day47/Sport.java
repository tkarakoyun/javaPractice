package day47;

public class Sport {
    //final method can no be overwritten in sub class.
    //it can be just used as is in sub class.
    //

    public final void doSomething(){

        System.out.println("doing regular sport" );
    }

    public void doSomethingElse(){

        System.out.println("something else");
    }
}
