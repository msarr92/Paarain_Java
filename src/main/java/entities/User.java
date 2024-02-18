package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nomUser")
    private String nomUser;
    @Basic
    @Column(name = "prenomUser")
    private String prenomUser;
    @Basic
    @Column(name = "loginUser")
    private String loginUser;
    @Basic
    @Column(name = "passwordUser")
    private String passwordUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(nomUser, user.nomUser) && Objects.equals(prenomUser, user.prenomUser) && Objects.equals(loginUser, user.loginUser) && Objects.equals(passwordUser, user.passwordUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomUser, prenomUser, loginUser, passwordUser);
    }
}
