package by.academy.Test3.Task1;

    public class Vine extends Product{

        private String color;
        private String shugar;
        private int age;
      //  public Vine(){
    //        super();
    //    }
        public Vine (int quantity, String type, double price, String name, String color, String shugar, int age){
            super(quantity, type, name, price);
            this.color = color;
            this.shugar = shugar;
            this.age = age;
        }
        @Override
        public double getDiscount(){
            if(age > 20){
                return 0.9;
            }
            return 0.85;
        }
        @Override
        public String toString() {
            return "Vine{" +
                    "color='" + color + '\'' +
                    ", shugar='" + shugar + '\'' +
                    ", age=" + age +
                    '}';
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getShugar() {
            return shugar;
        }

        public void setShugar(String shugar) {
            this.shugar = shugar;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

