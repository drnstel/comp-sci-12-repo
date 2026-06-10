public class Birthday {
    // fields: private

    // Fields are what an object knows about itself.  
    private int month;
    private int day;

    //methods: public

    // Methods operate on the fields of their object.
    // Methods can change/rely on the state of their object.
    // A method uses (or can use) its object's fields.

    // This kind of method that just returns the value of a field
    // is called a GETTER method
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = (month > 1 && month < 12) ? month : 0;

        if (this.month == 0) {
            System.out.println("Not a valid month. Must be between the ranges of 1 and 12.");
            throw new IllegalArgumentException();
        }
    }

    public void setDay(int day) {
        this.day = day;
    }
}
