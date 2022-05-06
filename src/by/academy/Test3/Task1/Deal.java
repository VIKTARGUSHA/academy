package by.academy.Test3.Task1;

import java.util.Arrays;

    public class Deal {
        protected String time;
        protected User buyer;
        protected User saller;
        protected int numberOfProdukts;
        protected Boolean isDone;
        protected Product [] basket;
        protected double fullPrice;
        protected int index;

        public Deal(String time, User buyer, User saller, Product[] basket, Boolean isDone, int numberOfProducts){
            this.time = time;
            this.buyer = buyer;
            this.saller = saller;
            this.basket = basket;
            this.isDone = isDone;
            this.numberOfProdukts = numberOfProducts;
        }
        public Deal(){
        }
        public void deal() {
            if (basket == null) {
                System.out.println("Error, the basket is empty");
                return;
            }

            for (Product product : basket) {
                if (product != null) {
                    fullPrice += product.getColculatedPrice();
                } else break;
            }
        }
        public void addProduct(Product product){
            for (int i = 0; i < basket.length; i++){
                if(basket[i] == null){
                    index = i;
                    break;
                }
            }
            if(index == basket.length -1){
                basketgrowth();
            }

            basket[index] = product;
        }
        private void basketgrowth(){
            Product[] tempBasket = new Product[basket.length*2 + 1];
            System.arraycopy(basket,0,tempBasket, 0, basket.length);
            basket = tempBasket;
        }
        public void removeProduct(int removeIndex){
            if(removeIndex < basket.length){
                System.arraycopy(basket, removeIndex+1, basket, removeIndex, basket.length - removeIndex-1);

            }
        }

        @Override
        public String toString() {
            return "Deal{" +
                    "time=" + time +
                    ", buyer=" + buyer +
                    ", saller=" + saller +
                    ", basket=" + Arrays.toString(basket) +
                    ", isDone=" + isDone +
                    '}';
        }

        public Boolean getDone() {
            return isDone;
        }

        public void setDone(Boolean done) {
            isDone = done;
        }

        public Product[] getProducts() {
            return basket;
        }

        public void setProducts(Product[] products) {
            this.basket = products;
        }

        public User getSaller() {
            return saller;
        }

        public void setSaller(User saller) {
            this.saller = saller;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public User getBuyer() {
            return buyer;
        }

        public void setBuyer(User buyer) {
            this.buyer = buyer;
        }
    }


