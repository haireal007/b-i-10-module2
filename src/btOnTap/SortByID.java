package btOnTap;

import java.util.Comparator;

public class SortByID implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        if(o1.getId()> o2.getId()){
            return 1;
        }else {
            return -1;
        }
    }
}
