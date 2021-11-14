import java.util.Date;
import java.util.Objects;
/***
 * equals 模板
 */

public class Equalss {
    private final int month;
    private final int day;
    private final int year;


    public Equalss(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Equalss{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                              //对象的引用和参数对象的用相同
        if (o == null) return false;                             //非空性
        if (this.getClass() != o.getClass()) return false;       //对象的类不同
        Date that = (Date)o;
        if (this.day != that.getDay()) return false;
        if (this.month != that.getMonth()) return false;
        if (this.year != that.getYear()) return false;

        return true;
    }


}
