package visitors;

import element.impls.DoubleRoom;
import element.impls.LuxuryRomm;
import element.impls.SingleRoom;

public interface RoomVisitor {
    void visit(SingleRoom element);
    void visit(DoubleRoom element);
    void visit(LuxuryRomm element);
}
