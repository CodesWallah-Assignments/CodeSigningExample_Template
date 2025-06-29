import com.codeswallah.security.friend.Friend;
import com.codeswallah.security.stranger.Stranger;

public class Example2a {
  public static void main(String[] args) {
	TextFileDisplayer tfd = new TextFileDisplayer("question.txt");
	Friend friend = new Friend(tfd, true);
	Stranger stranger = new Stranger(friend, true);
	stranger.doYourThing();
  }
}
