package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入生产日期（格式为yyyy-MM-dd）：");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = s.next();
        System.out.println("请输入保质期：");
        int i = s.nextInt();
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(str));
            c.add(Calendar.DATE,i);
            c.add(Calendar.DATE,-7);
            c.set(Calendar.DAY_OF_WEEK,4);
            System.out.println(sdf.format(c.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
