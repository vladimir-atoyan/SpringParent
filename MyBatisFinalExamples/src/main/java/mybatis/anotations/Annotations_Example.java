package mybatis.anotations;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Annotations_Example {

    public static void main(String args[]) throws IOException {
//        insert();
//        read();
//        uptate();
        delete();
    }

    public static void insert() throws IOException {
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Student_mapper.class);

        Student_mapper mapper = session.getMapper(Student_mapper.class);

        //Create a new student object
        Student student = new Student();

        //Set the values
        student.setName("zara");
        student.setBranch("EEE");
        student.setEmail("zara@gmail.com");
        student.setPercentage(90);
        student.setPhone(123412341);

        //Insert student data
        mapper.insert(student);
        System.out.println("record inserted successfully");
        session.commit();
        session.close();
    }

    public static void read() throws IOException {

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Student_mapper.class);
        Student_mapper mapper = session.getMapper(Student_mapper.class);

        //Get the student details
        Student student = mapper.getById(1);
        System.out.println(student.getBranch());
        System.out.println(student.getEmail());
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getPercentage());
        System.out.println(student.getPhone());
        session.commit();
        session.close();
    }

    public static void uptate() throws IOException {

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Student_mapper.class);
        Student_mapper mapper = session.getMapper(Student_mapper.class);

        //select a particular student using id
        Student student = mapper.getById(1);
        System.out.println("Current details of the student are " + student.toString());

        //Set new values to the mail and phone number of the student
        student.setEmail("Shyam123@yahoo.com");
        student.setPhone(984802233);

        //Update the student record
        mapper.update(student);
        System.out.println("Record updated successfully");
        session.commit();
        session.close();
    }

    public static void delete() throws IOException {

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Student_mapper.class);

        Student_mapper mapper = session.getMapper(Student_mapper.class);
        mapper.delete(1);
        System.out.println("record deleted successfully");
        session.commit();
        session.close();
    }
}