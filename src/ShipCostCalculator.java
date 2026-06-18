import java.util.Scanner;
//Class ShipCostCalculator
//  main()
//      num itemCost = 0
//      num shipCost = 0
//      num itemTotalCost = 0
//      output "Please give the price of your item: "
//      input itemCost
//      if (itemCost >= 100)
//          itemTotalCost = itemCost
//          output "Your shipping is 0 and your total cost is: " + itemTotalCost
//      else (itemCost < 100)
//          shipCost = itemCost * .02
//          itemTotalCost = itemCost + shipCost
//          output "Your shipping is: " + shipCost + " and your total cost is: " + itemTotalCost
//      endif
//  return
//EndClass
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            double itemCost = 0;
            double shipCost = 0;
            double itemTotalCost = 0;
            System.out.println("Please give the price of your item: ");
            itemCost = in.nextDouble();
            if (itemCost >= 100) {
                itemTotalCost = itemCost;
                System.out.println("Your shipping is 0 and your total cost is: " + itemTotalCost);
            } else {
                shipCost = itemCost * 0.02;
                itemTotalCost = itemCost + shipCost;
                System.out.println("Your shipping is: " + shipCost + " and your total cost is: " + itemTotalCost);
            }
    }
}
