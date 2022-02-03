import java.util.*;

public abstract class Statement {

    abstract String[] getStringOut();

    public String value(Customer aCustomer) {
        String[] stringOut = getStringOut();
        Enumeration rentals = aCustomer.getRentals();
        String result = stringOut[0] + aCustomer.getName() + stringOut[1] + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            result += stringOut[2] + each.getMovie().getTitle()+ stringOut[3] +
                    String.valueOf(each.getCharge()) + stringOut[4] + "\n";
        }

        result += stringOut[5] + String.valueOf(aCustomer.getTotalCharge()) + stringOut[6] + "\n";
        result += stringOut[7] + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + stringOut[8];
        return result;
    }
}
