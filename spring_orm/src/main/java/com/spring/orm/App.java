package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml") ;
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class) ;
        
//       Insert data into data table 
        Student student = new Student("springboot",32.50,"Lonalva","surya") ;
//        int result=  studentDao.insert(student) ;
        
//         Get data from database table
//        Student student = new Student() ;
//        student.setCity("Bardoli") ;
//        Student dStudent = studentDao.getStudent(student) ;
        
//        Delete  data from database
        	

        
//         Get all student list 
        List<Student> students = studentDao.getAllStudent() ;
        System.out.println(students);
        
//        update data in database
        studentDao.update(student) ;
        
        System.out.println(students);
    }
}
