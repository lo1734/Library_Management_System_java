

public class EBook extends Book {

    public EBook(String bookId, String title){
        super(bookId, title);
    }
    public int getMaxIssueDays(){
        return 7;
    }

    public double calculateFine(long extraDays){
        return extraDays*2;
    }
}
