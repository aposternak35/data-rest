package org.aposternak35.app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MODEL_TABLE")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    @Column(name="Model")
    private String model;

    @Column(name="Caption")
    private String caption;

    @Column(name="Image_URL")
    private String imgUrl;

    private Boolean active;

    @OneToMany(mappedBy = "model")
    List<Modification> modifications;

    @ManyToOne
    @JoinColumn(name = "mark")
    private Mark mark;

    public Model(long uid,String model, String caption, String imgUrl){
        this.uid=uid;
        this.model=model;
        this.caption=caption;
        this.imgUrl=imgUrl;
    }

    public Model() {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
