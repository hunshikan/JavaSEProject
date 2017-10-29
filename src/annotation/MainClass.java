package annotation;

import annotation.anno.SqlFactory;
import annotation.pojo.Person;

public class MainClass {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Tom");
        p.setAge(24);

        String sql = SqlFactory.getSql(p);

        System.out.println(sql);
    }
}
