package mybatis.xml;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//class X {
//    <T> List<T> getL1() {
//        return null;
//    }
//}


public class MybatisRead_ALL {

    public static void main(String args[]) throws IOException {

//        X x = new X();
//        List<Student> lInt = x.getL1();
//        List<Integer> lInt1 = x.getL1();

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        //select contact all contacts
        List<Student> student = session.selectList("mybatis.xml.Student.getAll");

        // what is this? :)))
        List<Integer> Ints = session.selectList("mybatis.xml.Student.getAll");
//        for (Integer n: Ints) { } // cast exception here is thrown

        for (Student st : student) {
            System.out.println(st.getId());
            System.out.println(st.getName());
            System.out.println(st.getBranch());
            System.out.println(st.getPercentage());
            System.out.println(st.getEmail());
            System.out.println(st.getPhone());
        }

        System.out.println("Records Read Successfully ");
        session.commit();
        session.close();
    }
}