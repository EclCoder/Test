package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends a<Campaign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30245a = "com.mbridge.msdk.foundation.db.h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f30246b;

    private h(f fVar) {
        super(fVar);
    }

    public static h a(f fVar) {
        if (f30246b == null) {
            synchronized (h.class) {
                try {
                    if (f30246b == null) {
                        f30246b = new h(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30246b;
    }

    private synchronized void c(String str) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("first_insert_timestamp", (Integer) 0);
            contentValues.put("play_time", (Integer) 0);
            getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
        } catch (Throwable unused) {
            q0.c(f30245a, "resetTimeAndTimestamp error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[EXC_TOP_SPLITTER, PHI: r1
      0x00b0: PHI (r1v1 android.database.Cursor) = (r1v0 android.database.Cursor), (r1v2 android.database.Cursor) binds: [B:30:0x00ae, B:27:0x00a8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public synchronized void b(String str) {
        long j10;
        long j11;
        Cursor cursorRawQuery = null;
        try {
            try {
                if (getWritableDatabase() == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (a(str)) {
                    cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
                    if (cursorRawQuery == null || cursorRawQuery.getCount() <= 0) {
                        j10 = 0;
                        j11 = 0;
                    } else {
                        cursorRawQuery.moveToFirst();
                        j10 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("first_insert_timestamp"));
                        j11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("play_time"));
                        if (jCurrentTimeMillis - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS > j10) {
                            c(str);
                            j11 = 0;
                        }
                    }
                    if (j10 == 0) {
                        contentValues.put("first_insert_timestamp", Long.valueOf(jCurrentTimeMillis));
                    }
                    contentValues.put("play_time", Long.valueOf(j11 + 1));
                    getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
                } else {
                    contentValues.put("first_insert_timestamp", Long.valueOf(jCurrentTimeMillis));
                    contentValues.put("play_time", (Long) 1L);
                    contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    getWritableDatabase().insert("dailyplaycap", null, contentValues);
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable unused2) {
                }
            }
            try {
                throw th2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public synchronized boolean a(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean a(String str, int i10) {
        Cursor cursorRawQuery = null;
        boolean z10 = false;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                    long j10 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("first_insert_timestamp"));
                    long j11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("play_time"));
                    if (j10 != 0) {
                        if (System.currentTimeMillis() - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS > j10) {
                            c(str);
                        } else if (i10 > 0 && j11 >= i10) {
                            z10 = true;
                        }
                    }
                }
                if (cursorRawQuery == null) {
                    return z10;
                }
            } catch (Throwable th2) {
                try {
                    q0.c(f30245a, "isOverCap is error" + th2);
                    return z10;
                } finally {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return z10;
    }
}
