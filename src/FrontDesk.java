public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}