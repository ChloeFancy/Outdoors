package bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "strategy", schema = "outdoors", catalog = "")
public class StrategyEntity {
    private int id;
    private String content;
    private String photoPath;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "photoPath")
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrategyEntity that = (StrategyEntity) o;
        return id == that.id &&
                Objects.equals(content, that.content) &&
                Objects.equals(photoPath, that.photoPath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, content, photoPath);
    }
}
