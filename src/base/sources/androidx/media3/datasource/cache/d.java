package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f4814c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.a f4815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4816b;

    public d(y1.a aVar) {
        this.f4815a = aVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor c() {
        w1.a.e(this.f4816b);
        return this.f4815a.getReadableDatabase().query(this.f4816b, f4814c, null, null, null, null, null);
    }

    private static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map b() throws DatabaseIOException {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put((String) w1.a.e(cursorC.getString(0)), new c(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } catch (Throwable th2) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void e(long j10) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j10);
            this.f4816b = d(hexString);
            if (y1.c.b(this.f4815a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f4815a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    y1.c.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f4816b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f4816b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void f(String str) throws DatabaseIOException {
        w1.a.e(this.f4816b);
        try {
            this.f4815a.getWritableDatabase().delete(this.f4816b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void g(Set set) throws DatabaseIOException {
        w1.a.e(this.f4816b);
        try {
            SQLiteDatabase writableDatabase = this.f4815a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f4816b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public void h(String str, long j10, long j11) throws DatabaseIOException {
        w1.a.e(this.f4816b);
        try {
            SQLiteDatabase writableDatabase = this.f4815a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f4816b, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
