package element.impls;

import element.RoomElement;
import visitors.RoomVisitor;

public class SingleRoom implements RoomElement{

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
    
}
