package dgsw.hs.kr.b1ndservice.retrofit2.response.member.lookup.Response;

import java.util.ArrayList;
import java.util.Arrays;

import dgsw.hs.kr.b1ndservice.model.Member;
import dgsw.hs.kr.b1ndservice.model.Parent;
import dgsw.hs.kr.b1ndservice.model.Student;
import dgsw.hs.kr.b1ndservice.model.Teacher;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public class Data {

    private Student[] students;
    private Teacher[] teachers;
    private Parent[] parents;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public ArrayList<Member> getMembers() {
        ArrayList<Member> members = new ArrayList<>();

        members.addAll(Arrays.asList(students));
        members.addAll(Arrays.asList(teachers));
        members.addAll(Arrays.asList(parents));

        return members;
    }

}
