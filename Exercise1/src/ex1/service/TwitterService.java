package ex1.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;
import org.slim3.util.RequestMap;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import ex1.meta.TweetMeta;
import ex1.meta.UserMeta;
import ex1.model.Tweet;
import ex1.model.User;

public class TwitterService {

   private TweetMeta meta = TweetMeta.get();
   private UserMeta userMeta = UserMeta.get();
    
    public void insertTweet(Map<String, Object> input) {
        Tweet tweet = new Tweet();
        Transaction tx = Datastore.beginTransaction();
        BeanUtil.copy(input, tweet);
        Datastore.put(tx, tweet);
        System.out.println(tweet.getKey());
        tx.commit();
    }

    public List<Tweet> getAllTweet() {
        Transaction tx = Datastore.beginTransaction();
        
        List<Tweet> tweetList = Datastore.query(meta).sort(meta.createDate.desc).asList();
        
        tx.commit();
        
        return tweetList;
    }
    public List<User> getAllUser() {
        Transaction tx = Datastore.beginTransaction();
        
        List<User> userList = Datastore.query(userMeta).sort(userMeta.userName.asc).asList();
        
        tx.commit();
        
        return userList;
    }

    public void insertUser(Map<String, Object> input) {
        User user = new User();
        Tweet tweet = new Tweet();
        Transaction tx = Datastore.beginTransaction();
        BeanUtil.copy(input, user);
        Key key = Datastore.createKey(Tweet.class, Long.valueOf(input.get("tweetKey").toString()));
        tweet.setKey(key);
        //System.out.println(tweet.getKey());
        user.getTweetRef().setModel(tweet);
        Datastore.put(tx, user);
        tx.commit();
        
    }

    public User get(Key key, Long version) {
        
        return Datastore.get(userMeta, key, version);
    }

    public User update(Map<String, Object> input) {
        Transaction tx = Datastore.beginTransaction();
        Key key = Datastore.createKey(User.class, Long.valueOf(input.get("id").toString()));
        User user = Datastore.get(tx, userMeta, key);
        BeanUtil.copy(input, user);
        Datastore.put(tx, user);
        tx.commit();
        return user;
    }

}
