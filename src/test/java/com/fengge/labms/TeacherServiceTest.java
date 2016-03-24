package com.fengge.labms;

import com.fengge.labms.entity.Teacher;
import com.fengge.labms.service.TeacherService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ljf-梁燕双栖 on 2016/2/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring-mybatis.xml"})
public class TeacherServiceTest {
    @Autowired
    private TeacherService teacherService;

    private Logger logger = Logger.getLogger(TeacherServiceTest.class);


    @Test
    public void testFindAllStudents()
    {
        List<Teacher> teachers = teacherService.findAllTeachers();
        Assert.assertNotNull(teachers);
        for (Teacher teacher : teachers)
        {
            System.out.println(teacher.getName() + teacher.getGender());
        }
    }

    @Test
    public void testFindTeacherById() {
        System.out.println(teacherService.findTeacherById("336699").getName());
    }

    @Test
    public void testAddTeacher() {
        teacherService.addTeacher(new Teacher("336697", "336697", "张惠妹", "信息学院", "教授", "女", "13309687654", "123@qq.com", "2005", "湖北京山"));
        List<Teacher> teachers = teacherService.findAllTeachers();
        for (Teacher t : teachers) {
            System.out.println(t.getName()+"-"+t.getDepartment());
        }
    }

    @Test
    public void testDeleteTeacherById() {
        teacherService.deleteTeacherById("336697");
        List<Teacher> teachers = teacherService.findAllTeachers();
        for (Teacher t : teachers) {
            System.out.println(t.getName()+"-"+t.getDepartment());
        }
    }
}
