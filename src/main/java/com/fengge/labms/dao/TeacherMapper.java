package com.fengge.labms.dao;

import com.fengge.labms.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ljf-ÁºÑàË«ÆÜ on 2016/2/28.
 */
@Repository("teacherMapper")
public interface TeacherMapper {

    List<Teacher> findAllTeachers();

    Teacher findTeacherById(String id);

    void addTeacher(Teacher teacher);

    void deleteTeacherById(String teacherId);

}