package helloWorld;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author TJ
 * @create 2021-1003 14:48
 */
@Entity
@Table(name = "t_book", schema = "user_db", catalog = "")
public class TBookEntity {
    private long userId;
    private String username;
    private String ustatus;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "ustatus")
    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBookEntity that = (TBookEntity) o;
        return userId == that.userId && Objects.equals(username, that.username) && Objects.equals(ustatus, that.ustatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, ustatus);
    }
}
