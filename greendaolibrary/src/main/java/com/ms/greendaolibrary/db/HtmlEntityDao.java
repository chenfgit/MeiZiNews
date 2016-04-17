package com.ms.greendaolibrary.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ms.greendaolibrary.db.HtmlEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HTML_ENTITY".
*/
public class HtmlEntityDao extends AbstractDao<HtmlEntity, Long> {

    public static final String TABLENAME = "HTML_ENTITY";

    /**
     * Properties of entity HtmlEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property Html = new Property(4, String.class, "html", false, "HTML");
        public final static Property Summary = new Property(5, String.class, "summary", false, "SUMMARY");
        public final static Property Collect = new Property(6, String.class, "collect", false, "COLLECT");
        public final static Property HireDate = new Property(7, java.util.Date.class, "hireDate", false, "HIRE_DATE");
    };


    public HtmlEntityDao(DaoConfig config) {
        super(config);
    }
    
    public HtmlEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HTML_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"URL\" TEXT," + // 1: url
                "\"TYPE\" TEXT," + // 2: type
                "\"TITLE\" TEXT," + // 3: title
                "\"HTML\" TEXT," + // 4: html
                "\"SUMMARY\" TEXT," + // 5: summary
                "\"COLLECT\" TEXT," + // 6: collect
                "\"HIRE_DATE\" INTEGER);"); // 7: hireDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HTML_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HtmlEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String html = entity.getHtml();
        if (html != null) {
            stmt.bindString(5, html);
        }
 
        String summary = entity.getSummary();
        if (summary != null) {
            stmt.bindString(6, summary);
        }
 
        String collect = entity.getCollect();
        if (collect != null) {
            stmt.bindString(7, collect);
        }
 
        java.util.Date hireDate = entity.getHireDate();
        if (hireDate != null) {
            stmt.bindLong(8, hireDate.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HtmlEntity readEntity(Cursor cursor, int offset) {
        HtmlEntity entity = new HtmlEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // html
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // summary
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // collect
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)) // hireDate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HtmlEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setHtml(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSummary(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCollect(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHireDate(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HtmlEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HtmlEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
