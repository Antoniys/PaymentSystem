package model;



public class User {
    private String login;
    private String password;
    private Role role;
    private int id;

    public User(Role role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        User other = (User) obj;

        if (this.login != other.login)
            return false;
        if (this.login != other.login)
            return false;
        if (this.id != other.id)
            return false;
        return (this.role == other.role);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        result = 31 * result + id;
        return result;
    }
}
