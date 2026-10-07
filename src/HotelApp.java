public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestCart(2);
        frontDesk.cleanRoom(204);
        frontDesk.pickUpVehicle("ABC-123");
    }
}