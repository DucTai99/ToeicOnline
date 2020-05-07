package vn.myclass.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name = "context")
    private String context;

    @ManyToOne
    @Column(name = "userid")
    private User user;

    @ManyToOne
    @Column(name = "listenguidelineid")
    private ListenGuideline listenGuideline;

    @Column(name = "createdate")
    private Timestamp createDate;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ListenGuideline getListenGuideline() {
        return listenGuideline;
    }

    public void setListenGuideline(ListenGuideline listenGuideline) {
        this.listenGuideline = listenGuideline;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}
