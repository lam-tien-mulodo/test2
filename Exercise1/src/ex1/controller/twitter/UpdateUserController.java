package ex1.controller.twitter;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

import ex1.meta.UserMeta;
import ex1.service.TwitterService;

public class UpdateUserController extends Controller {

    TwitterService service = new TwitterService();
    UserMeta userMeta = UserMeta.get();
    @Override
    public Navigation run() throws Exception {
        service.update(asKey(userMeta.key), new RequestMap(request));
        return redirect(basePath);
    }
}
