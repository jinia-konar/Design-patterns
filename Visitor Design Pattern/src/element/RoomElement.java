package element;

import visitors.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
