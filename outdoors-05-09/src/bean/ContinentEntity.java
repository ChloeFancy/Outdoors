package bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "continent", schema = "outdoors", catalog = "")
public class ContinentEntity {
    private int id;
    private String name;
    private String introduction;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
        ContinentEntity that = (ContinentEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(photoPath, that.photoPath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, introduction, photoPath);
    }
}
