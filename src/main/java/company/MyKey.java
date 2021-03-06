package company;

import java.util.Objects;

final class MyKey {
    private final String month;
    private final Integer prod;

    MyKey(String month, Integer prod) {
        this.month = month;
        this.prod = prod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return Objects.equals(month, myKey.month) &&
                Objects.equals(prod, myKey.prod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, prod);
    }


}
