public class HouseKeeping implements HotelService {
    @Override
    public void provideService() {
        System.out.println("Housekeeping service is ready.");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room: " + roomNumber);
    }
}