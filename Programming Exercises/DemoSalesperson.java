/**
 * Created by Graeme on 1/09/2016.
 */
public class DemoSalesperson {
    public static void main(String[] args) {
        int i;
        Salesperson[] salesperson = new Salesperson[10];
        for (i = 0; i < salesperson.length; ++i) {
            salesperson[i] = new Salesperson(9999, 0);
        }

        for (i = 0; i < salesperson.length; ++i) {
            System.out.println("Salesperson " + i + " has ID" + salesperson[i].getId() +
                    " and sales of " + salesperson[i].getSales());
        }
    }
}
