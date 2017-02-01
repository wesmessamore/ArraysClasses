import java.time.LocalDateTime;

/**
 * Created by Wesley on 1/30/17.
 * This is for a Day 1 Homework Assignment at The Iron Yard Nashville
 * It stores a single Instagram post with the origin timestamp.
 */

public class InstagramPost {
    public String text = "Initial value";
    public int userId;
    public LocalDateTime timestamp;
    public boolean isPrivate;

    public static void main(String[] args) {

        InstagramPost instagramPost1 = new InstagramPost();
        instagramPost1.text = "Caption";
        System.out.println(instagramPost1.text);


    }
}