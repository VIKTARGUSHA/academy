package by.academy.Test3.Task1;


    public class User {
        protected String name;
        protected int age;
        protected double money;
//        public User(){
//            super();
//        }
        public User(String name, int age, double money){
            this.name = name;
            this.age = age;
            this.money = money;
        }

        public void getCheckMoney(double totalPrice){
            if(totalPrice > money){
                System.out.println("Buyer doesn't have enough money");
                return;
            }else {
                System.out.println("Buyer is rich");
            }
        }
        public double sallerSold(double fullPrice){
            this.money += fullPrice;
            return money;
        }

        public double buyerPay(double fullPrice){
            this.money -= fullPrice;
            return money;
        }
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", money=" + money +
                    '}';
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


