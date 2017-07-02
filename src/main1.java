/**
 * Created by hrith on 02/07/2017.
 */
public class main1 {
    public static void main(String[] args){
        Printer myPrinter = new Printer(50, true);



        System.out.println(myPrinter.increaseTonerLevel(40));
        //System.out.println(myPrinter.getTonerLevel());
        System.out.println(myPrinter.printPages(5));
    }
}
