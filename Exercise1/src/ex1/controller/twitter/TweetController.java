package ex1.controller.twitter;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

import ex1.model.Tweet;
import ex1.service.TwitterService;

public class TweetController extends Controller {

    TwitterService service = new TwitterService();
    
    @Override
    public Navigation run() throws Exception {

        service.insertTweet(new RequestMap(request));
        return redirect(basePath);
    }

    /*public String toJSONString() {
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("{"); // 
 
        sb.append("\"content\":\"" + "abc" + "\"");
                                                   
        sb.append(","); 
 
        sb.append("\"createDate\":\"" + "1" + "\"");
      
 
        sb.append("}");
          
        return sb.toString();
    }*/
}
