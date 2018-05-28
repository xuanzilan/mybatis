import com.xuanzilan.mybatis.beans.Student;
import com.xuanzilan.mybatis.dao.IStudentDao;
import com.xuanzilan.mybatis.dao.StudentDaoImpl;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    final static Logger logger = Logger.getLogger(StudentTest.class);
    private IStudentDao dao;

    @Before
    public void init(){
//        BasicConfigurator.configure();
        dao = new StudentDaoImpl();
    }

    @Test
    public void testInsert(){
        logger.info("插入学生记录");
        Student student = new Student("吴七",17,89.3);
        dao.insertStudent(student);
    }
}
