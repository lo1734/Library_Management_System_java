import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("\n1. Add Printed Book");
            System.out.println("2. Add EBook");
            System.out.println("3. Add Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Book Id: ");
                    String pid = sc.nextLine();
                    System.out.println("Title: ");
                    String ptitle = sc.nextLine();
                    library.addBook(new PrintedBook(pid, ptitle));
                    break;
                case 2:
                    System.out.println("Book Id: ");
                    String eid = sc.nextLine();
                    System.out.println("Title: ");
                    String etitle = sc.nextLine();
                    library.addBook(new EBook(eid, etitle));
                    break;

                case 3:
                    System.out.println("Member Id: ");
                    String mid = sc.nextLine();
                    System.out.println("Title: ");
                    String mName = sc.nextLine();
                    library.addMember(new Member(mid, mName));
                    break;

                case 4:
                    System.out.println("Book Id: ");
                    String issueBookId = sc.nextLine();
                    System.out.println("Member Id: ");
                    String issueMemberId = sc.nextLine();
                    library.issueBook(issueBookId,issueMemberId);
                    break;

                case 5:
                    System.out.println("Book Id: ");
                    String returnBookId = sc.nextLine();
                    System.out.println("Member Id: ");
                    String returnMemberId = sc.nextLine();
                    library.returnBook(returnBookId, returnMemberId);
                    break;

                case 6:
//                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}