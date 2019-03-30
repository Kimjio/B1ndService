package dgsw.hs.kr.b1ndservice.model;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public final class Department {
    private int idx;
    private String name;

    public Department(int idx, String name) {
        this.idx = idx;
        this.name = name;
    }

    public Department() {

    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
