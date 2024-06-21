package chapter11.src.clazz2;

import java.time.LocalDateTime;

public class Member {
    private String userID;
    private String email;
    private LocalDateTime regDt;

    private final String str = "ABC";//상수로 정의

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userID='" + userID + '\'' +
                ", email='" + email + '\'' +
                ", regDt=" + regDt + '\'' +
                ", str=" + str +
                '}';
    }
}
