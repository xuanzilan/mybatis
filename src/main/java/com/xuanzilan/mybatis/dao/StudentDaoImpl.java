package com.xuanzilan.mybatis.dao;

import com.xuanzilan.mybatis.beans.Student;
import com.xuanzilan.mybatis.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;


/**
 * @author dengshaoheng
 */
public class StudentDaoImpl implements IStudentDao {

    @Override
    public void insertStudent(Student student) {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtil.getSqlSession();
            sqlSession.insert("studentDao.insertStudent",student);
            sqlSession.commit();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }

    }
}
