package day03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入员工数量：");
        int num = s.nextInt();
        String name;
        int age;
        String gender;
        int salary;
        String hireDate;
        ArrayList<Emp> arr = new ArrayList();
        f1:for (int i = 0; i < num; i++) {
            System.out.println("请输入员工姓名：");
            name = s.next();
            System.out.println("请输入员工年龄：");
            age = s.nextInt();
            System.out.println("请输入员工性别：");
            gender = s.next();
            System.out.println("请输入员工月薪：");
            salary = s.nextInt();
            System.out.println("请输入员工入职时间：");
            hireDate = s.next();
           f2: for (int j = 0; j < arr.size(); j++) {
                if (name == arr.get(j).getName()){
                    System.out.println("该用户已存在，请重新输入");
                    i--;
                    continue f1;
                }
            }
            arr.add(new Emp(name,age,gender,salary,hireDate));
        }
        System.out.println(arr);
    }
}
