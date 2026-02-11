import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private ArrayList<Book> issuedBooks;

    public Member(String memberId,String name){
        this.memberId = memberId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book book){
        issuedBooks.add(book);
    }

    public void returnBook(Book book){
        issuedBooks.remove(book);
    }

    public String getMemberId(){ return memberId; }
    public String getName() { return name; }


}
