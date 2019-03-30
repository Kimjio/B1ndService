package dgsw.hs.kr.b1ndservice.model;


import android.support.annotation.NonNull;

public class Class_ {
    private int idx;
    private int grade;
    private int room;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @NonNull
    @Override
    public String toString() {
        return grade + "학년 " + room + "반";
    }
}
