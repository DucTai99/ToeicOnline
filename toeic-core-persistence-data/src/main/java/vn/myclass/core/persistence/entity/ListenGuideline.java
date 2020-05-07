package vn.myclass.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "listenguideline")
public class ListenGuideline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listenguidelineId;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "context")
    private String context;

    @Column(name = "createdate")
    private Timestamp createDate;

    @Column(name = "modifieddate")
    private Timestamp modifiedDate;

    @OneToMany(mappedBy = "listenGuideline", fetch = FetchType.LAZY)
    private List<Comment> commentList;

    public Integer getListenguidelineId() {
        return listenguidelineId;
    }

    public void setListenguidelineId(Integer listenguidelineId) {
        this.listenguidelineId = listenguidelineId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
