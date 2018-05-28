package com.xuanzilan.mybatis.dao;

import com.xuanzilan.mybatis.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * @author dengshaoheng
 */
public interface IStudentDao {

    void insertStudent(Student student);
    void insertStudentCacheId(Student student);

    void deleteStudentById(int id);
    void updateStudent(Student student);

    List<Student> selectAllStudents();
    Map<Integer, Object> selectAllStudentsMap();

    Student selectStudentById(int id);
    List<Student> selectStudentsByName(String name);
}
