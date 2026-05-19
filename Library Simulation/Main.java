public class Main {
    static void LibraryCatalogue(Library lib) {
        // Book Catalogue
        Books.addBooks(lib, "Test1", true);
        Books.addBooks(lib, "test2", false);
        Books.addBooks(lib, "teehee", false);

        // Member Catalogue
        Members.addMembers(lib, "Isaiah");
        Members.addMembers(lib, "Noah");
        Members.addMembers(lib, "Karan");
        Members.addMembers(lib, "Augusto");
        Members.addMembers(lib, "Lucian");
    }

    public static void main(String[] args) {

        /* 
            If I am completely honest, I completely do not know what to do here.
            I think the project structure wasn't clear enough with what we should do.
            I don't know, just my thoughts on this.
            I would REALLY prefer if next time, we got a more structural outline rather than "hey go mayhem lol"
        */

        Library lib = new Library();
        LibraryCatalogue(lib);

        while (true) {

            // Advance time
            lib.currentDay = lib.currentDay + 1;
            System.out.println("\n--- Day " + lib.currentDay + " ---");

            // for (int i=0; i < lib.BooksList.size(); i++) {
            //     System.out.println(lib.BooksList.get(i));
            // }
        

            // simulate a random event
            int randomNumber = Rand.randomInt(0, 4); // could generate 0, 1, 2, or 3

            switch (randomNumber) {
                case 0: // Update book status
                    int bookID = Rand.randomInt(0, lib.BooksList.size());
                    Books.updateBookData(lib, bookID);
                    Members.memberBookLoan(lib, lib.BooksList.get(bookID).get(0));
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

            // Call the lists of the catalogue to view changes at the end of the day
            Books.listOfBooks(lib);
            Loan.listOfLoans(lib);
        


            Input.waitForUserToPressEnter("Press Enter to simulate the next day.");
        }
    }
}