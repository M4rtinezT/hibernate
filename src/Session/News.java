package Session;
import javax.persistence.*;

/**
 * @author TJ
 * @create 2021-1003 19:32
 */
@Entity
public class News {

    private Integer id;

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public News(Integer id) {
        this.id = id;
    }

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                '}';
    }
}
