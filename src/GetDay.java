import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class GetDay {

    public static void main(String[] args) {
        /*Date d = new Date(2015-1900, 7, 5);
        d.getDay();
        System.out.print(d.getDay());*/

        /*LocalDate date = LocalDate.of(2015, 8, 5);
        System.out.println(date.getDayOfWeek());

        Locale in = new Locale("en", "IN");
        double paym = 54634.43;
        NumberFormat nm = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nm2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nm3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nm4 = NumberFormat.getCurrencyInstance(in);

        String us = nm.format(paym);
        System.out.println(nm.format(paym));
        System.out.println(nm2.format(paym));
        System.out.println(nm3.format(paym));
        System.out.println(nm4.format(paym));

        Currency cur = Currency.getInstance(in.getCountry());
        System.out.println(cur.getSymbol());*/

    }
}
