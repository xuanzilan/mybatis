package com.xuanzilan.mybatis.dao;

import com.xuanzilan.mybatis.beans.Student;
import com.xuanzilan.mybatis.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author dengshaoheng
 */
public class StudentDaoImpl implements IStudentDao {
    SqlSession sqlSession = null;

    @Override
    public void insertStudent(Student student) {
        try {
            sqlSession = DBUtil.getSqlSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public void insertStudentCacheId(Student student) {
        try {
            sqlSession = DBUtil.getSqlSession();
            sqlSession.insert("insertStudentCacheId",student);
            sqlSession.commit();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public void deleteStudentById(int id) {
        try {
            sqlSession = DBUtil.getSqlSession();
            sqlSession.delete("deleteStudentById",id);
            sqlSession.commit();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            sqlSession = DBUtil.getSqlSession();
            sqlSession.insert("updateStudent",student);
            sqlSession.commit();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            sqlSession = DBUtil.getSqlSession();
            students = sqlSession.selectList("selectAllStudents");
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return students;
    }


    @Override
    public Map<Integer, Object> selectAllStudentsMap() {
        Map<Integer, Object> map = new HashMap<Integer, Object>();
        try {
            sqlSession = DBUtil.getSqlSession();
            //这里selectMap的第二个参数是属性名，即id/name/age等,查出来的map的object字段是bean对象，如果name字段有重复的，
            // 则后面的对象会覆盖前面的,Map的key的属性根据选择的字段来说，如id为Map<Integer,Object>，name就是Map<String,Object>
            map = sqlSession.selectMap("selectAllStudents","id");
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return map;
    }

    @Override
    public Student selectStudentById(int id) {
        try {
            sqlSession = DBUtil.getSqlSession();
            Student student = sqlSession.selectOne("selectStudentById",id);
            return student;
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Student> selectStudentsByName(String name) {
        List<Student> students = new ArrayList<Student>();
        try {
            sqlSession = DBUtil.getSqlSession();
            students = sqlSession.selectList("selectStudentsByName", name);
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return students;
    }
}
