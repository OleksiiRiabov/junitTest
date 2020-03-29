package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class PriceTable {
    private HashMap<MyKey, Integer> map = new HashMap<MyKey, Integer>();

    public PriceTable(List<Integer> list) {
        List<String> months = new ArrayList<String>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");

        int prod = 1;
        int j = 0;

        for(int i = 0; i < list.size(); i++) {
            map.put(new MyKey(months.get(j), prod), list.get(i));
            if(months.get(j).equals("Dec")) {
                prod++;
                j = 0;
            } else {
                j++;
            }
        }
    }

    public int getPrice(String month, int prod) {
        return map.get(new MyKey(month, prod));
    }
}