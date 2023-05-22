package Model;

public class chat {
    private int ID;
    private UserStorageData userSent;
    private UserStorageData userRecived;
    private String content;

    public chat(int ID, UserStorageData userSent, UserStorageData userRecived, String content) {
        this.ID = ID;
        this.userSent = userSent;
        this.userRecived = userRecived;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public UserStorageData getUserSent() {
        return userSent;
    }

    public void setUserSent(UserStorageData userSent) {
        this.userSent = userSent;
    }

    public UserStorageData getUserRecived() {
        return userRecived;
    }

    public void setUserRecived(UserStorageData userRecived) {
        this.userRecived = userRecived;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
