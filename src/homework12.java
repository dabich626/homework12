public class homework12 {
    public static class Book {
        private String bookName;
        private Author authorName;
        private int bookYear;

     public String getBookName (){
        return this.bookName;

     }
    public Author getAuthorName(){
         return this.authorName;
    }
    public int getBookYear(){
         return this.bookYear;
    }
    public void setBookYear (int bookYear){
         this.bookYear = bookYear;
    }
    }
    public static class Author {
        private String name;
        private String secondName;
        private String lastName;

        public String getName(){
            return this.name;
        }
        public  String getSecondName (){
            return  this.secondName;
        }
        public String getLastName (){
            return this.lastName;
        }
    }
    public static Book createBook (int bookYear, String bookName,Author authorName){
        Book Book = new Book();
        Book.bookName = bookName;
        Book.authorName = authorName;
        Book.bookYear = bookYear;
        return Book;

    }

    public static Author namedAuthor (String name, String secondName, String lastName){
        Author Author = new Author();
        Author.name = name;
        Author.secondName = secondName;
        Author.lastName = lastName;
        return Author;
    }

}