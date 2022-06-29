package org.aposternak35.app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MODIFICATION_TABLE")
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    @Column(name="Modification")
    private String modification;

    @Column(name="Caption")
    private String caption;

    @Column(name="Period_Begin")
    private int periodBegin;

    @Column(name="Period_End")
    private int periodEnd;

    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    public Modification(long uid, String modification, String caption, int periodBegin,int periodEnd){
        this.uid=uid;
        this.modification=modification;
        this.caption=caption;
        this.periodBegin=periodBegin;
        this.periodEnd=periodEnd;
    }

    public Modification() {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }



    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPeriodBegin() {
        return periodBegin;
    }

    public void setPeriodBegin(int periodBegin) {
        this.periodBegin = periodBegin;
    }

    public int getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(int periodEnd) {
        this.periodEnd = periodEnd;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }
}
