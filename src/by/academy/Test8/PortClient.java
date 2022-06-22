package by.academy.Test8;

public class PortClient {

    public static void main(String[] args) {
        Port port = new Port((int)(Math.random()*100));
        for(int i = 0; i < 100; i++){
            int shipCurrentCapacity = (int)(Math.random() * 20);
            int shipAddQuantity = (int)(Math.random()*shipCurrentCapacity);
            Ship ship1 = new Ship(shipCurrentCapacity, shipAddQuantity,
                     (int)(Math.random()*(Ship.maxCapacityShip-shipCurrentCapacity + shipAddQuantity)));
            Ship ship2 = new Ship(shipCurrentCapacity, shipAddQuantity,
                     (int)(Math.random()*(Ship.maxCapacityShip-shipCurrentCapacity + shipAddQuantity)));
            Terminal1Get terminal1 = new Terminal1Get(port,ship1);
            terminal1.start();
            Terminal2Get terminal2 = new Terminal2Get(port, ship2);
            terminal2.start();
            Terminal1Add terminal1Add = new Terminal1Add(port, ship1);
            terminal1Add.start();
            Terminal2Add terminal2AddObj = new Terminal2Add(port, ship2);
            Thread terminal2Add = new Thread(terminal2AddObj);
            terminal2Add.start();

        }
        System.out.println("Hello it's me a main thread");
    }

}
