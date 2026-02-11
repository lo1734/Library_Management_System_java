import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();

    public void addBook(Book book){
        books.put(book.getBookId(), book);
        System.out.println(book.title+" added to list.");
    }
    public void addMember(Member member){
        members.put(member.getMemberId(), member);
        System.out.println(member.getName()+" added to list.");
    }

    public void issueBook(String BookId, String memberId){
        Book book = books.get(BookId);
        Member member = members.get(memberId);

        if(book == null|| member == null) {
            System.out.println("Invalid Book/Member ID.");
            return ;
        }
        if(book.isIssued()){
            System.out.println("Book already issued.");
            return ;
        }

        book.issueBook();
        member.issueBook(book);
        System.out.println("Book issued successfully. Due Date: "+ book.getDueDate());
    }

    public void returnBook(String bookId, String memberId){
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if(book==null || member==null){
            System.out.println("Invalid return.");
            return ;
        }

        double fine = book.returnBook();
        member.returnBook(book);

        System.out.println("Book returned!");
        if(fine > 0){
            System.out.println("Late Fee: "+fine);
        }
    }

}
