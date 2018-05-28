import com.xuanzilan.mybatis.beans.Student;
import com.xuanzilan.mybatis.dao.IStudentDao;
import com.xuanzilan.mybatis.dao.StudentDaoImpl;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StudentTest {
    final static Logger logger = Logger.getLogger(StudentTest.class);
    private IStudentDao dao;

    @Before
    public void init(){
//        BasicConfigurator.configure();
        dao = new StudentDaoImpl();
    }

    @Test
    public void testInsertStudent(){
        logger.info("testInsertStudent");
        Student student = new Student("吴七",17,89.3);
        logger.info("插入前，student="+student);
        dao.insertStudent(student);
        logger.info("插入后，student="+student);
    }

    @Test
    public void insertStudentCacheId(){
        logger.info("insertStudentCacheId");
        Student student = new Student("吴七",17,89.3);
        logger.info("插入前，student="+student);
        dao.insertStudentCacheId(student);
        logger.info("插入后，student="+student);
    }

    @Test
    public void deleteStudentById(){
        logger.info("insertStudentCacheId");
        int id = 17;
        dao.deleteStudentById(id);
    }

    @Test
    public void updateStudent(){
        logger.info("updateStudent");
        Student student = new Student("吴老七",17,89.3);
        student.setId(17);
        dao.updateStudent(student);
    }

    @Test
    public void selectAllStudents(){
        logger.info("selectAllStudents");
        List<Student> students = dao.selectAllStudents();
        logger.info(students.size());
    }

    @Test
    public void selectAllStudentsMap(){
        logger.info("selectAllStudentsMap");
        Map<Integer, Object> map  = dao.selectAllStudentsMap();
        logger.info(map.get(16));
    }

    @Test
    public void selectStudentById(){
        logger.info("selectStudentById");
        Student student  = dao.selectStudentById(16);
        logger.info("student="+student);
    }

    @Test
    public void selectStudentsByName(){
        logger.info("selectStudentsByName");
        List<Student> students = dao.selectStudentsByName("吴七");
        logger.info(students.size());
    }
}
