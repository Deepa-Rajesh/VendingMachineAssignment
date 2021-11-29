package VendingMachineAssignmet;
import java.sql.Timestamp;

public class Transaction{

        int itemcode;
        String productname;
        double price;
        double amount;
        double balanceret;
        Timestamp timestamp;
      Transaction(int i, String pn, double p, double a, double br, Timestamp t) {
            itemcode=i;
            productname=pn;
            price=p;
            amount=a;
            balanceret=br;
            timestamp=t;
        }

        public void display() {
            System.out.print(itemcode+"\t\t"+productname+"\t\t"+price+"\t\t"+amount);
            System.out.println("\t\t"+balanceret+"\t\t"+timestamp);

        }

    }

