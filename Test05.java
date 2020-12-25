package day03;

import javax.security.sasl.SaslClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        do {
            System.out.println("请输入身份证号：");
            str = s.next();
            System.out.println(str.matches("\\d{18}")?"输入成功":"格式错误请重输");
        }while (!str.matches("\\d{18}"));
        byte[] bs = str.getBytes();
        String str1 = new String(bs,6,8);
        System.out.println(str1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(str1));
            c.add(Calendar.YEAR,20);
            System.out.println(c.getTime());
            c.set(Calendar.DAY_OF_WEEK,4);
            System.out.println(c.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
