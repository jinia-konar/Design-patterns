package visitors.impls;

import element.impls.DoubleRoom;
import element.impls.LuxuryRomm;
import element.impls.SingleRoom;
import visitors.RoomVisitor;

public class MaintainanceOpeartion implements RoomVisitor{

    @Override
    public void visit(SingleRoom element) {
        System.out.println("Started maintaince for single room.");
    }

    @Override
    public void visit(DoubleRoom element) {
        System.out.println("Started maintaince for double room.");
    }

    @Override
    public void visit(LuxuryRomm element) {
        System.out.println("Started maintaince for luxury room.");
    }
    
}
