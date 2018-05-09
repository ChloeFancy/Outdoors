package bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "spot", schema = "outdoors", catalog = "")
public class SpotEntity {
    private int id;
    private String name;
    private String countryName;
    private String shortIntro;
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
    @Column(name = "countryName")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "shortIntro")
    public String getShortIntro() {
        return shortIntro;
    }

    public void setShortIntro(String shortIntro) {
        this.shortIntro = shortIntro;
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
        SpotEntity that = (SpotEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(shortIntro, that.shortIntro) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(photoPath, that.photoPath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, countryName, shortIntro, introduction, photoPath);
    }
}
