package model;

public class UserClient extends User {
    private String email;
    private String name;
    private String surname;
    private String phoneNumber;


    public UserClient(Role role, String email, String name, String surname, String phoneNumber) {
        super(Role.CLIENT);
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        UserClient other = (UserClient) obj;

        if (this.email != other.email)
            return false;
        if (this.name != other.name)
            return false;
        if (this.phoneNumber != other.phoneNumber)
            return false;
        return (this.surname == other.surname);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + email.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }
}
