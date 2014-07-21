package ex1.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-07-18 09:43:11")
/** */
public final class UserMeta extends org.slim3.datastore.ModelMeta<ex1.model.User> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<ex1.model.User> firstName = new org.slim3.datastore.StringAttributeMeta<ex1.model.User>(this, "firstName", "firstName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<ex1.model.User, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<ex1.model.User, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<ex1.model.User> lastName = new org.slim3.datastore.StringAttributeMeta<ex1.model.User>(this, "lastName", "lastName");

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<ex1.model.User, org.slim3.datastore.ModelRef<ex1.model.Tweet>, ex1.model.Tweet> tweetRef = new org.slim3.datastore.ModelRefAttributeMeta<ex1.model.User, org.slim3.datastore.ModelRef<ex1.model.Tweet>, ex1.model.Tweet>(this, "tweetRef", "tweetRef", org.slim3.datastore.ModelRef.class, ex1.model.Tweet.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<ex1.model.User> userName = new org.slim3.datastore.StringAttributeMeta<ex1.model.User>(this, "userName", "userName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<ex1.model.User, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<ex1.model.User, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UserMeta slim3_singleton = new UserMeta();

    /**
     * @return the singleton
     */
    public static UserMeta get() {
       return slim3_singleton;
    }

    /** */
    public UserMeta() {
        super("User", ex1.model.User.class);
    }

    @Override
    public ex1.model.User entityToModel(com.google.appengine.api.datastore.Entity entity) {
        ex1.model.User model = new ex1.model.User();
        model.setFirstName((java.lang.String) entity.getProperty("firstName"));
        model.setKey(entity.getKey());
        model.setLastName((java.lang.String) entity.getProperty("lastName"));
        if (model.getTweetRef() == null) {
            throw new NullPointerException("The property(tweetRef) is null.");
        }
        model.getTweetRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("tweetRef"));
        model.setUserName((java.lang.String) entity.getProperty("userName"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        ex1.model.User m = (ex1.model.User) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("firstName", m.getFirstName());
        entity.setProperty("lastName", m.getLastName());
        if (m.getTweetRef() == null) {
            throw new NullPointerException("The property(tweetRef) must not be null.");
        }
        entity.setProperty("tweetRef", m.getTweetRef().getKey());
        entity.setProperty("userName", m.getUserName());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        ex1.model.User m = (ex1.model.User) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        ex1.model.User m = (ex1.model.User) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        ex1.model.User m = (ex1.model.User) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        ex1.model.User m = (ex1.model.User) model;
        if (m.getTweetRef() == null) {
            throw new NullPointerException("The property(tweetRef) must not be null.");
        }
        m.getTweetRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        ex1.model.User m = (ex1.model.User) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        ex1.model.User m = (ex1.model.User) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getFirstName() != null){
            writer.setNextPropertyName("firstName");
            encoder0.encode(writer, m.getFirstName());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getLastName() != null){
            writer.setNextPropertyName("lastName");
            encoder0.encode(writer, m.getLastName());
        }
        if(m.getTweetRef() != null && m.getTweetRef().getKey() != null){
            writer.setNextPropertyName("tweetRef");
            encoder0.encode(writer, m.getTweetRef(), maxDepth, currentDepth);
        }
        if(m.getUserName() != null){
            writer.setNextPropertyName("userName");
            encoder0.encode(writer, m.getUserName());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected ex1.model.User jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        ex1.model.User m = new ex1.model.User();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("firstName");
        m.setFirstName(decoder0.decode(reader, m.getFirstName()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("lastName");
        m.setLastName(decoder0.decode(reader, m.getLastName()));
        reader = rootReader.newObjectReader("tweetRef");
        decoder0.decode(reader, m.getTweetRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("userName");
        m.setUserName(decoder0.decode(reader, m.getUserName()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}