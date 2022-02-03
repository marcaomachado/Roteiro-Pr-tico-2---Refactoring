
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Marco");
        Movie filme = new Movie("Homem Aranha", 1);
        Rental venda = new Rental(filme, 3);
        customer.addRental(venda);

        TextStatement teste1 = new TextStatement();
        HtmlStatement teste2 = new HtmlStatement();
        System.out.println(teste1.value(customer));
        System.out.println(teste2.value(customer));

    }
}
