package ex1.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-07-18 09:16:13")
/** */
public final class TweetMeta extends org.slim3.datastore.ModelMeta<ex1.model.Tweet> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<ex1.model.Tweet> content = new org.slim3.datastore.StringAttributeMeta<ex1.model.Tweet>(this, "content", "content");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, java.util.Date> createDate = new org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, java.util.Date>(this, "createDate", "createDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<ex1.model.Tweet, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final TweetMeta slim3_singleton = new TweetMeta();

    /**
     * @return the singleton
     */
    public static TweetMeta get() {
       return slim3_singleton;
    }

    /** */
    public TweetMeta() {
        super("Tweet", ex1.model.Tweet.class);
    }

    @Override
    public ex1.model.Tweet entityToModel(com.google.appengine.api.datastore.Entity entity) {
        ex1.model.Tweet model = new ex1.model.Tweet();
        model.setContent((java.lang.String) entity.getProperty("content"));
        model.setCreateDate((java.util.Date) entity.getProperty("createDate"));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        ex1.model.Tweet m = (ex1.model.Tweet) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("content", m.getContent());
        entity.setProperty("createDate", m.getCreateDate());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        ex1.model.Tweet m = (ex1.model.Tweet) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        ex1.model.Tweet m = (ex1.model.Tweet) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        ex1.model.Tweet m = (ex1.model.Tweet) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        ex1.model.Tweet m = (ex1.model.Tweet) model;
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
        ex1.model.Tweet m = (ex1.model.Tweet) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getContent() != null){
            writer.setNextPropertyName("content");
            encoder0.encode(writer, m.getContent());
        }
        if(m.getCreateDate() != null){
            writer.setNextPropertyName("createDate");
            encoder0.encode(writer, m.getCreateDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected ex1.model.Tweet jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        ex1.model.Tweet m = new ex1.model.Tweet();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("content");
        m.setContent(decoder0.decode(reader, m.getContent()));
        reader = rootReader.newObjectReader("createDate");
        m.setCreateDate(decoder0.decode(reader, m.getCreateDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}