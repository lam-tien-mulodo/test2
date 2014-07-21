package ex1.controller.twitter;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import ex1.service.TwitterService;

public class CreateUserController extends Controller {

    TwitterService service = new TwitterService();
    @Override
    public Navigation run() throws Exception {
        requestScope("tweetList", service.getAllTweet());
        return forward("CreateUser.jsp");
    }
}
