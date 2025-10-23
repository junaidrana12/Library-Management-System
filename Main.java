package Task3.LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
              System.out.println("\n %%%%  LIBRARY MANAGEMENT SYSTEM  %%%%");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
             System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
             System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                     System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                  case 2:
                    library.showBooks();
                    break;
                    case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;
                 case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                      break;

                   case 5:
                    System.out.println("Exiting... Thank you!");
                     break;
                default:
                      System.out.println("Invalid choice!");
            }
        }  while(choice!=5);
    }
}
