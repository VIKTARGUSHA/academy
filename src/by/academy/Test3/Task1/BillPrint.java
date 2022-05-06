package by.academy.Test3.Task1;

public class BillPrint {
        public BillPrint(Deal deal){
            System.out.println("Deal is done is " + deal.isDone + "\n" +
                    "Bueyer: " + deal.buyer + "\n" +
                    "Saller: " + deal.saller + "\n" + " \n " +"        CHECK");
            for (Product product : deal.basket){
                if(product != null) {
                    System.out.println(product.type + " " + product.name + ": " + product.price
                            + " x " + product.quantity + " = " + product.quantity * product.price);
                }else break;
            }
            System.out.println("Total amount: " + deal.fullPrice);
        }
    }

