package org.aposternak35.app.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MARK_TABLE")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    @Column(name="Mark")
    private String mark;

    @Column(name="Caption")
    private String caption;

    private Boolean active;

    @OneToMany(mappedBy = "mark")
    List<Model> models;



    public Mark(Long uid,String mark, String caption){
        this.uid=uid;
        this.mark=mark;
        this.caption=caption;
    }

    public Mark() {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
