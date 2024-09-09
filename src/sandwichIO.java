import java.io.*;
public class sandwichIO{
	public static void writeOrderToFile(Order order) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("orderline.txt", true));
            writer.write(order.getTime() + "\t" + order.getName() + "\t" +
                         order.getSandwich().getBread() + "\t" +
                         order.getSandwich().getVeggies() + "\t" +
                         order.getSandwich().getMeat() + "\t" +
                         String.format("$%.2f", order.getSandwich().getTotalPrice()) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
