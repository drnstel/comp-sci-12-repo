public class Birthday {
    // These are fields.
    // Fields are a specific kind of variable that are defined in the largest possible scope inside a class.

    // fields represent the properties of a datatype
    @SuppressWarnings("unused")
    int month;
    int day;


    public Birthday(int month, int day) {
        // this.month is the month FIELD defined in this class
        this.month = month;
        this.day = day;
    }
  }