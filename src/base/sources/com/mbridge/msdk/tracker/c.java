package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.coremedia.iso.boxes.UserBox;
import java.util.List;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f33705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33707c = new Object();

    public c(b bVar, String str) {
        this.f33705a = bVar;
        this.f33706b = str;
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            if (a.f33703a) {
                Log.e("TrackManager", "transactionSuccess: ", e10);
            }
        }
    }

    public long a(i iVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            long jInsert = -1;
            if (y.b(this.f33705a)) {
                return -1L;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1L;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e eVarD = iVar.d();
                    contentValues.put("name", eVarD.g());
                    contentValues.put("type", Integer.valueOf(eVarD.m()));
                    contentValues.put("time_stamp", Long.valueOf(eVarD.l()));
                    contentValues.put("properties", eVarD.i().toString());
                    contentValues.put("priority", Integer.valueOf(eVarD.h()));
                    contentValues.put("state", Integer.valueOf(iVar.j()));
                    contentValues.put("report_count", Integer.valueOf(iVar.h()));
                    contentValues.put(UserBox.TYPE, eVarD.n());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!eVarD.p() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!eVarD.o() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    jInsert = writableDatabase.insert(this.f33706b, null, contentValues);
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "insert: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
                return jInsert;
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public int b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            int iMax = 0;
            if (y.b(this.f33705a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return 0;
                }
                a(writableDatabase);
                cursorQuery = writableDatabase.query(this.f33706b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    iMax = Math.max(cursorQuery.getCount(), 0);
                }
                d(writableDatabase);
                return iMax;
            } catch (Exception e11) {
                if (a.f33703a) {
                    Log.e("TrackManager", "getAvailableCount: " + e11.getMessage());
                }
            } finally {
                b(writableDatabase);
                y.a(cursorQuery);
            }
        }
    }

    public void c(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            if (y.b(this.f33705a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", XTkUEXuiK.jKyMcKiKMjezvEP + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        writableDatabase.update(this.f33706b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public void c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            if (y.b(this.f33705a)) {
                return;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    contentValues.put("report_error_message", "update from reporting");
                    writableDatabase.update(this.f33706b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public void b(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            if (y.b(this.f33705a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        writableDatabase.update(this.f33706b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public List<i> a(int i10) {
        SQLiteDatabase writableDatabase;
        List<i> list;
        synchronized (this.f33707c) {
            Cursor cursor = null;
            List<i> listB = null;
            cursor = null;
            if (y.b(this.f33705a)) {
                return null;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return null;
            }
            try {
                try {
                    a(writableDatabase);
                    Cursor cursorQuery = writableDatabase.query(this.f33706b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i10));
                    try {
                        listB = y.b(cursorQuery);
                        d(writableDatabase);
                        b(writableDatabase);
                        y.a(cursorQuery);
                    } catch (Exception e11) {
                        e = e11;
                        List<i> list2 = listB;
                        cursor = cursorQuery;
                        list = list2;
                        if (a.f33703a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        b(writableDatabase);
                        y.a(cursor);
                        listB = list;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        b(writableDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    list = null;
                }
                return listB;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e10) {
            if (a.f33703a) {
                Log.e("TrackManager", "endTransaction: ", e10);
            }
        }
    }

    public void a(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            if (y.b(this.f33705a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.j()));
                        contentValues.put("report_count", Integer.valueOf(iVar.h()));
                        String strI = iVar.i();
                        if (!TextUtils.isEmpty(strI)) {
                            contentValues.put("report_error_message", strI);
                        }
                        writableDatabase.update(this.f33706b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public int a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f33707c) {
            int iDelete = -1;
            if (y.b(this.f33705a)) {
                return -1;
            }
            try {
                writableDatabase = this.f33705a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f33703a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1;
            }
            try {
                try {
                    a(writableDatabase);
                    iDelete = writableDatabase.delete(this.f33706b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f33703a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
                return iDelete;
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e10) {
            if (a.f33703a) {
                Log.e("TrackManager", "beginTransaction: ", e10);
            }
        }
    }
}
