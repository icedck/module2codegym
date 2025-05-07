public class BookBorrower {
    private BookSingleton brrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        brrowedBook = BookSingleton.borrowBook();
        if (brrowedBook==null) {
            haveBook = false;
        }else
            haveBook = true;
    }

    public String getAuthorAndTitle(){
        if (haveBook) {
            return brrowedBook.getAuthorAndTitle();
        }else{
            return "I don't have a book";
        }
    }

    public void returnBook(){
        brrowedBook.returnBook(brrowedBook);
    }
}
