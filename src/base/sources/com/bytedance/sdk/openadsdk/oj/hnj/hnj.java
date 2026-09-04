package com.bytedance.sdk.openadsdk.oj.hnj;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.eum;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile hnj f14581hn;
    final Context hnj;

    private hnj(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.hnj = context;
    }

    public static SQLiteDatabase hn() {
        try {
            hnj hnjVarQor = qor();
            if (hnjVarQor == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = hnjVarQor.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase hnj() {
        try {
            hnj hnjVarQor = qor();
            if (hnjVarQor == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = hnjVarQor.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    private static hnj qor() {
        if (f14581hn == null) {
            synchronized (hnj.class) {
                try {
                    if (f14581hn == null) {
                        if (eum.hnj(com.bytedance.sdk.openadsdk.oj.hnj.hnj())) {
                            f14581hn = new hnj(com.bytedance.sdk.openadsdk.oj.hnj.hnj(), "pag_monitor.db");
                        } else {
                            f14581hn = new hnj(com.bytedance.sdk.openadsdk.oj.hnj.hnj(), "pag_monitor_" + eum.qor(com.bytedance.sdk.openadsdk.oj.hnj.hnj()) + ".db");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14581hn;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                hnj(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private ArrayList<String> hn(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            apu.qor("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }

    private void hnj(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListHn = hn(sQLiteDatabase);
        if (arrayListHn == null || arrayListHn.size() <= 0) {
            return;
        }
        int size = arrayListHn.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListHn.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
