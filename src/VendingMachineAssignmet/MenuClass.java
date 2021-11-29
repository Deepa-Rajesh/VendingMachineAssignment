// Java Vending Machine Assignment

package VendingMachineAssignmet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

    public class MenuClass {


        public static void main(String[] args) throws IOException {
            try (
                 Scanner sc = new Scanner(System.in)) {
                Boolean ch=true;
                //product list creation
                Product p1=new Product();
                p1.icode=384;
                p1.prodname="pen stand";
                p1.price=201.50;

                Product p2=new Product();
                p2.icode=385;
                p2.prodname="clock";
                p2.price=400.50;

                Product p3=new Product();
                p3.icode=386;
                p3.prodname="lamp";
                p3.price=500.50;
                int i=0;
                Transaction []t=new Transaction[50];
                double balance=0.0;
                double vmcamt=0.0;
                double amount;
                Date date = new Date();
                while(ch==true) {
                    System.out.println("Press 0 to exit...");
                    System.out.println("Press 1 to continue...");

                    System.out.println("Press 2 to view amount in venting machine");
                    System.out.println("Press 3 to view previous transactions..");
                    int userChoice=sc.nextInt();
                    switch(userChoice) {

                        case 0:ch=false;
                            break;
                        case 1:System.out.println("Menu");
                            System.out.println("Itemcode\tproductname\t price");
                            System.out.println(p1.icode+"\t\t"+p1.prodname+"\t"+p1.price);
                            System.out.println(p2.icode+"\t\t"+p2.prodname+"\t\t"+p2.price);
                            System.out.println(p3.icode+"\t\t"+p3.prodname+"\t\t"+p3.price);

                            System.out.println("Please enter Item code and Amount");
                            System.out.print("Enter Itemcode- ");
                            int a= sc.nextInt();
                            switch (a) {
                                case 384:System.out.print("Enter Amount- ");
                                    amount= sc.nextDouble();
                                    if(amount>p1.price) {
                                        balance=amount-p1.price;
                                    }else {
                                        System.out.println("please pay amount equal to or greater than price ");
                                        break;
                                    }
                                    System.out.println("Dispensing product...  "+p1.prodname);


                                    Timestamp tm=new Timestamp(date.getTime());
                                    t[i]=new Transaction(p1.icode,p1.prodname,p1.price,amount,balance,tm);
                                    t[i].display();
                                    i++;
                                    vmcamt+=p1.price;
                                    break;
                                case 385:System.out.println("product--"+p2.prodname);
                                    System.out.print("Enter Amount- ");
                                    amount= sc.nextDouble();
                                    if(amount>p2.price) {
                                        balance=amount-p2.price;
                                    }else {
                                        System.out.println("please pay amount equal to or greater than price ");
                                        break;
                                    }
                                    System.out.println("Dispensing product...  "+p2.prodname);

                                    //Date date = new Date();
                                    Timestamp tm1=new Timestamp(date.getTime());
                                    t[i]=new Transaction(p2.icode,p2.prodname,p2.price,amount,balance,tm1);
                                    t[i].display();
                                    i++;
                                    vmcamt+=p2.price;

                                    break;
                                case 386:
                                    System.out.println("product--"+p3.prodname);
                                    System.out.print("Enter Amount- ");
                                    amount= sc.nextDouble();

                                    if(amount>p3.price) {
                                        balance=amount-p3.price;
                                    }else {
                                        System.out.println("please pay amount equal to or greater than price ");
                                        break;
                                    }
                                    System.out.println("Dispensing product...  "+p3.prodname);
//				Date date = new Date();
                                    Timestamp tm2=new Timestamp(date.getTime());
                                    t[i]= new Transaction(p3.icode,p3.prodname,p3.price,amount,balance,tm2);
                                    t[i].display();

                                    i++;
                                    vmcamt+=p3.price;


                                    break;
                                default: System.out.println("Please enter valid itemcode");
                            }
                            break;
                        case 2:
                            System.out.println("\n************\n"+"The amount in venting machine is ...\t"+vmcamt);
                            System.out.println(vmcamt);
                            break;
                        case 3:System.out.println("Viewing previous transactions...");
                            System.out.print("Item code\tVendingMachineAssignmet.Product Name\tprice\tAmount given\t\t");
                            System.out.println("\tBalance returned\ttimestamp");
                            // loop to display all previous transaction
                            for(int j=0;j<i;j++) {
                                t[j].display();
                            }
                    }//end switch


                }
            }

        }

    }

