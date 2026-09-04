package y1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import t1.s;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    static {
        s.a("media3.database");
    }

    private static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws DatabaseIOException {
        try {
            if (!c0.X0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", a(i10, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i11 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i11;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws DatabaseIOException {
        try {
            if (c0.X0(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i10, str));
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws DatabaseIOException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
