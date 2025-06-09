package visitors.impls;

import element.impls.DoubleRoom;
import element.impls.LuxuryRomm;
import element.impls.SingleRoom;
import visitors.RoomVisitor;

public class PricingOperation implements RoomVisitor{

    @Override
    public void visit(SingleRoom element) {
        System.out.println("Calculate pricing for single room.");
    }

    @Override
    public void visit(DoubleRoom element) {
        System.out.println("Calculate pricing for Double room.");
    }

    @Override
    public void visit(LuxuryRomm element) {
        System.out.println("Calculate pricing for Luxury room.");
    }
    
}
