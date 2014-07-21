package ex1.controller.twitter;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import ex1.model.Tweet;
import ex1.model.User;
import ex1.service.TwitterService;

public class IndexController extends Controller {

    TwitterService service = new TwitterService();
    @Override
    protected Navigation run() throws Exception {
        // TODO Auto-generated method stub
   /*     List<Tweet> tweetList = service.getAll();
        response.getWriter().println("<?xml version='1.0' encoding='utf-8'?>");
        response.getWriter().println ("<rows>");
        int page = 1;
        int total_pages = 1;
        int count = 1;
        response.getWriter().print ("<page>"+page+"</page>");
        response.getWriter().print ("<total>"+total_pages+"</total>");
        response.getWriter().print ("<records>"+count+"</records>");
        for (Tweet tweet : tweetList) {
            response.getWriter().print ("<row id='"+tweet.getKey()+"'>");            
            response.getWriter().print ("<cell>"+tweet.getContent()+"</cell>");
            response.getWriter().print ("<cell>"+tweet.getCreateDate()+"</cell>");
            response.getWriter().print ("</row>");
        }
       
        response.getWriter().print ("</rows>"); 
        */
        List<User> userList = service.getAllUser();
        response.setContentType("text/html");
        response.getWriter().println("<?xml version='1.0' encoding='utf-8'?>");
        response.getWriter().println ("<rows>");
        int page = 1;
        int total_pages = 1;
        int count = 1;
        response.getWriter().print ("<page>" + page + "</page>");
        response.getWriter().print ("<total>" + total_pages + "</total>");
        response.getWriter().print ("<records>" + count + "</records>");
        for (User user : userList) {
            Tweet tweetRef = user.getTweetRef().getModel();
            response.getWriter().print ("<row id='" + user.getKey().getId() + "'>");  
            response.getWriter().print ("<cell>" + user.getUserName() + "</cell>");
            response.getWriter().print ("<cell>" + user.getFirstName() + "</cell>");
            response.getWriter().print ("<cell>" + user.getLastName() + "</cell>");
            response.getWriter().print ("<cell>" + tweetRef.getKey() + "</cell>");
            response.getWriter().print ("<cell>" + tweetRef.getContent() + "</cell>");
            response.getWriter().print ("<cell>" + tweetRef.getCreateDate() + "</cell>");
            response.getWriter().print("<cell><![CDATA[<html> <body><a>Edit</a></body></html> ]]></cell>");
           // response.getWriter().print ("<cell>" + "<button>Edit</button>" + "</cell>");
            response.getWriter().print ("</row>");
        }
       
        response.getWriter().print ("</rows>"); 
        return null;
    }

}
