import java.util.Enumeration;

public class HtmlStatement extends Statement {

    private String stringHtmlOut[] = {
            "<H1>Rentals for <EM>",
            "</EM></H1><P>",
            "",
            ": ",
            "<BR>",
            "<P>You owe <EM>",
            "</EM><P>",
            "On this rental you earned <EM>",
            "</EM> frequent renter points<P>"};

    @Override
    public String[] getStringOut() {
        return stringHtmlOut;
    }


}