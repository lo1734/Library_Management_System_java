

public class PrintedBook extends Book {

    public PrintedBook(String bookId,String title){
        super(bookId,title);
    }

    public int getMaxIssueDays(){ return 14; }

    public double calculateFine(long extraDays){
        return extraDays*5;
    }
}
