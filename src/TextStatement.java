import java.util.Enumeration;

public class TextStatement extends Statement {

    private String stringTextOut[] = {
            "Rental Record for ",
            "",
            "\t",
            "\t",
            "",
            "Amount owed is ",
            "",
            "You earned ",
            " frequent renter points"};
    @Override
    public String[] getStringOut() {
        return stringTextOut;
    }

}