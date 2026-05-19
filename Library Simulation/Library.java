import java.util.ArrayList;

//Represents the entire library system
class Library {

    int currentDay; // Current simulation day

    public ArrayList<ArrayList<String>> BooksList = new ArrayList<>();
    public ArrayList<String> MemberList = new ArrayList<>();
    public ArrayList<ArrayList<String>> BookLoans = new ArrayList<>();
}

class Books extends Library {
    static void addBooks(Library lib, String name, boolean inLibrary) {
        String taken = (inLibrary) ? "In shelf" : "Taken out";

        ArrayList<String> values = new ArrayList<>();
        values.add(name);
        values.add(taken);

        lib.BooksList.add(values);
    }

    static void listOfBooks(Library lib) {
        for (int i = 0; i < lib.BooksList.size(); i++) {
            System.out.println(lib.BooksList.get(i));
        }
    }

    static void updateBookData(Library lib, int index) {
        
        boolean statusCheck = ("In shelf".equals(lib.BooksList.get(index).get(1)));

        String taken = (statusCheck) ? "Taken out" : "In shelf"; // flip status of book
        lib.BooksList.get(index).set(1, taken);
    }
}

class Members extends Library {
    static void addMembers(Library lib, String name) {
        lib.MemberList.add(name);
    }


    static void listOfMembers(Library lib) {
        for (int i = 0; i < lib.MemberList.size(); i++) {
            System.out.println(lib.MemberList.get(i));
        }
    }

    static void memberBookLoan(Library lib, String book) {
        int booksTaken = 0;
        ArrayList<String> temp = new ArrayList<>();
        String chosenBook;

        for (int i = 0; i < lib.BooksList.size(); i++) {
            if ("Taken out".equals(lib.BooksList.get(i).get(1))) {
                temp.add(lib.BooksList.get(i).get(0));
                booksTaken++;
            }
        }
        if (book == null) {
            chosenBook = temp.get(Rand.randomInt(0, booksTaken));
        } else {
            chosenBook = book;
        }
        String chosenMember = lib.MemberList.get(Rand.randomInt(0, lib.MemberList.size()));

        ArrayList<String> values = new ArrayList<>();

        values.add(chosenBook);
        values.add(chosenMember);

        lib.BookLoans.add(values);
    }
}

class Loan extends Library {
    static void listOfLoans(Library lib) {
        for (int i = 0; i < lib.BookLoans.size(); i++) {
            System.out.println(lib.BookLoans.get(i));
        }
    }
}