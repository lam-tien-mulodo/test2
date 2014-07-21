package ex1.controller.twitter;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;
import org.slim3.util.RequestMap;

import ex1.meta.UserMeta;
import ex1.model.User;
import ex1.service.TwitterService;

public class EditUserController extends Controller {

    TwitterService service = new TwitterService();
    UserMeta userMeta = UserMeta.get();
    
    @Override
    protected Navigation run() throws Exception {
        requestScope("tweetList", service.getAllTweet());
        User user = service.get(new RequestMap(request));
        BeanUtil.copy(user, request);
        return forward("user.jsp");
    }

}
