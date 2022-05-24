package btOnTap;

import java.util.Comparator;

public class SortByRoomRate implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        if(o1.getRoomRate()> o2.getRoomRate()){
            return 1;
        }else {
            return -1;
        }
    }
}
