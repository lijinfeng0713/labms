package com.fengge.labms.service;

import com.fengge.labms.dao.TeacherMapper;
import com.fengge.labms.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ljf-ÁºÑàË«ÆÜ on 2016/2/28.
 */

@Service("teacherService")
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapperer;

    public List<Teacher> findAllTeachers() {
        return teacherMapperer.findAllTeachers();
    }

    public Teacher findTeacherById(String id) {
        return teacherMapperer.findTeacherById(id);
    }

    public void addTeacher(Teacher teacher){
        teacherMapperer.addTeacher(teacher);
    }

    public void deleteTeacherById(String teacherId) {
        teacherMapperer.deleteTeacherById(teacherId);
    }
}
