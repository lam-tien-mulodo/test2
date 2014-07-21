package ex1.controller.twitter;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

import ex1.meta.TweetMeta;
import ex1.service.TwitterService;

public class UserController extends Controller {

    TwitterService service = new TwitterService();
    TweetMeta meta = TweetMeta.get();
    @Override
    public Navigation run() throws Exception {
        service.insertUser(new RequestMap(request));
        return redirect(basePath);
    }
}
