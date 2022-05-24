package th.list;

public class MyListTest {
    public static void main(String[] args) {
        //ArrayList<Integer> al=new ArrayList<>(4);
        MyList<Integer> al=new MyList<>(4);
        al.add(1);
        al.add(12);
        al.add(12);
        al.add(3,7);

        System.out.println(al.get(12));

    }
}
