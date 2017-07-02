/**
 * Created by hrith on 02/07/2017.
 */
public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{this.tonerLevel = 0;}
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }
    public  int increaseTonerLevel(int amount){
        if((amount <= 0) || (amount + tonerLevel) > 100){
            return -1;
        }else{
            tonerLevel += amount;
            return tonerLevel;

        }

    }
    //1 page costs 5% toner level
    public int printPages(int amount){
        int tempTonerLevel = amount * 5;
        int numberOfPagesPrinted = 0;

        if(duplexPrinter == true) {
            tempTonerLevel *= 2;
            if ((tonerLevel - tempTonerLevel) >= 0) {
                tonerLevel -= tempTonerLevel;
                numberOfPagesPrinted = amount;
                numberOfPagesPrinted /= 2;
                return numberOfPagesPrinted;
            } else {
                return -1;
            }
        }else if(duplexPrinter == false){
            if((tonerLevel - tempTonerLevel) >= 0){
                tonerLevel -= tempTonerLevel;
                numberOfPagesPrinted += amount;
                return numberOfPagesPrinted;
            }else{
                return -1;
            }

        }

        return tempTonerLevel;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
