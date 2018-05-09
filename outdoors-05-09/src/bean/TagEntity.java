package bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tag", schema = "outdoors", catalog = "")
public class TagEntity {
    private int id;
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagEntity tagEntity = (TagEntity) o;
        return id == tagEntity.id &&
                Objects.equals(name, tagEntity.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
