package day03;

import javax.lang.model.element.NestingKind;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入生日（格式为yyyy-MM-dd）:");
        String str = s.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(str);
            Date date1 = new Date();
            long l = date.getTime();
            long l2 = date1.getTime();
            long l3 = l2 -l;
            System.out.println(l3/1000/60/60/24/7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
