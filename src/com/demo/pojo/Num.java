package com.demo.pojo;

public class Num {
    private Long id;
    private Float top_d;
    private Float bottom_d;
    private Float left_d;
    private Float right_d;
    private String dot;

    public Num(){}

    public Num(Long id, Float top_d, Float bottom_d, Float left_d, Float right_d, String dot) {
        this.id = id;
        this.top_d = top_d;
        this.bottom_d = bottom_d;
        this.left_d = left_d;
        this.right_d = right_d;
        this.dot = dot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTop_d() {
        return top_d;
    }

    public void setTop_d(Float top_d) {
        this.top_d = top_d;
    }

    public Float getBottom_d() {
        return bottom_d;
    }

    public void setBottom_d(Float bottom_d) {
        this.bottom_d = bottom_d;
    }

    public Float getLeft_d() {
        return left_d;
    }

    public void setLeft_d(Float left_d) {
        this.left_d = left_d;
    }

    public Float getRight_d() {
        return right_d;
    }

    public void setRight_d(Float right_d) {
        this.right_d = right_d;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    @Override
    public String toString() {
        return "Num{" +
                "id=" + id +
                ", top_d=" + top_d +
                ", bottom_d=" + bottom_d +
                ", left_d=" + left_d +
                ", right_d=" + right_d +
                ", dot='" + dot + '\'' +
                '}';
    }
}
