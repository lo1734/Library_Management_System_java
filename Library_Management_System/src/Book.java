import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Book {
    protected String bookId;
    protected String title;
    protected boolean isIssued;
    protected LocalDateTime issueDate;
    protected LocalDateTime dueDate;

//    public Book (String bookId,String title, boolean isIssued){
//        this.bookId = bookId;
//        this.title = title;
//        this.isIssued = false;
//    }

    public Book (String bookId,String title){
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    public abstract int getMaxIssueDays();

    public abstract double calculateFine(long extraDays);

    public void issueBook(){
        this.isIssued=true;
        this.issueDate = LocalDateTime.now();
        this.dueDate = issueDate.plusDays(getMaxIssueDays());
    }
    public LocalDateTime getDueDate(){
        this.dueDate = issueDate.plusDays(getMaxIssueDays());
        return dueDate;
    }

    public double returnBook(){
        this.isIssued=false;
        long extraDays = java.time.temporal.ChronoUnit.DAYS.between(dueDate, LocalDate.now());

        if(extraDays > 0){
            return calculateFine(extraDays);
        }
        return 0;
    }
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }
    public LocalDateTime getIssueDate() { return dueDate; }
}
