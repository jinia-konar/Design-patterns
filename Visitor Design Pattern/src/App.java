import element.RoomElement;
import element.impls.DoubleRoom;
import visitors.RoomVisitor;
import visitors.impls.MaintainanceOpeartion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hotel Booking System: Visitor Design pattern");
        System.out.println("It seperates all the operations from the element on which to operate");

        RoomElement room = new DoubleRoom();
        RoomVisitor opeartion = new MaintainanceOpeartion();
        room.accept(opeartion);
    }
}
