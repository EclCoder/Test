package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private static final Object qor = new Object();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f13723hn;
    private qor hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hn extends AbstractCursor {
        private hn() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    dse(Context context) {
        try {
            this.f13723hn = context == null ? oj.hnj() : context.getApplicationContext();
            if (this.hnj == null) {
                this.hnj = new qor();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context qor() {
        Context context = this.f13723hn;
        return context == null ? oj.hnj() : context;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private SQLiteDatabase f13725hn = null;

        public qor() {
        }

        private synchronized void hn() {
            hnj hnjVar;
            try {
                synchronized (dse.qor) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f13725hn;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (com.bytedance.sdk.component.utils.eum.hnj(dse.this.qor())) {
                                dse dseVar = dse.this;
                                hnjVar = dseVar.new hnj(dseVar.qor(), "ttopensdk.db");
                            } else {
                                dse dseVar2 = dse.this;
                                hnjVar = dseVar2.new hnj(dseVar2.qor(), "ttopensdk_" + com.bytedance.sdk.component.utils.eum.qor(dse.this.qor()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = hnjVar.getWritableDatabase();
                            this.f13725hn = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", th3.getMessage());
                if (qor()) {
                    throw th3;
                }
            }
        }

        private synchronized boolean qor() {
            SQLiteDatabase sQLiteDatabase = this.f13725hn;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public SQLiteDatabase hnj() {
            hn();
            return this.f13725hn;
        }

        public synchronized Cursor hnj(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                hn();
                cursorQuery = this.f13725hn.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", th2.getMessage());
                hn hnVar = new hn();
                if (qor()) {
                    throw th2;
                }
                cursorQuery = hnVar;
            }
            return cursorQuery;
        }

        public synchronized int hnj(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                hn();
                iUpdate = this.f13725hn.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", e10.getMessage());
                if (qor()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long hnj(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                hn();
                jReplace = this.f13725hn.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", e10.getMessage());
                if (qor()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int hnj(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                hn();
                iDelete = this.f13725hn.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", e10.getMessage());
                if (qor()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public qor hnj() {
        return this.hnj;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj extends SQLiteOpenHelper {
        final Context hnj;

        public hnj(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.hnj = context;
        }

        private ArrayList<String> gjv(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
            return arrayList;
        }

        private void hn(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.bug.hnj.qor.gjv());
        }

        private void hnj(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.gjv.hnj());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.dnm.qor());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.jip.hnj());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.fc.hnj());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.p000do.hn.hnj());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.oj.qor());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hnj.hn.hn.qor());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.bug.hnj.qor.qor());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.uua.hnj());
        }

        private void qor(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListGjv = gjv(sQLiteDatabase);
            if (arrayListGjv == null || arrayListGjv.size() <= 0) {
                return;
            }
            int size = arrayListGjv.size();
            int i10 = 0;
            while (i10 < size) {
                String str = arrayListGjv.get(i10);
                i10++;
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                hnj(sQLiteDatabase, this.hnj);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    qor(sQLiteDatabase);
                    hnj(sQLiteDatabase, dse.this.f13723hn);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= i11) {
                hnj(sQLiteDatabase, dse.this.f13723hn);
                switch (i10) {
                    case 1:
                        hnj(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        hnj(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.jip.hnj());
                        hnj(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hnj.hn.hn.qor());
                        hnj(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.fc.hnj());
                        hnj(sQLiteDatabase);
                        break;
                    case 6:
                        hnj(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    qor(sQLiteDatabase);
                    hnj(sQLiteDatabase, dse.this.f13723hn);
                    switch (i10) {
                        case 1:
                            hnj(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            hnj(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.jip.hnj());
                            hnj(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hnj.hn.hn.qor());
                            hnj(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.fc.hnj());
                            hnj(sQLiteDatabase);
                            break;
                        case 6:
                            hnj(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i10 < 11) {
                try {
                    hn(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.p000do.hn.hnj(sQLiteDatabase);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.qor("DBHelper", th2.getMessage());
                }
            }
        }

        private void hnj(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.gjv.hn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.dnm.gjv());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.jip.hn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gjv.fc.hn());
        }
    }
}
