package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzejo {
    public static void zza(SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zzb(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzh(sQLiteDatabase, "failed_requests", 0);
        zzh(sQLiteDatabase, "total_requests", 0);
        zzh(sQLiteDatabase, "completed_requests", 0);
    }

    public static int zzc(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorZzg = zzg(sQLiteDatabase, i10);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            i11 = cursorZzg.getInt(cursorZzg.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        }
        cursorZzg.close();
        return i11;
    }

    public static long zzd(SQLiteDatabase sQLiteDatabase, int i10) {
        long j10;
        Cursor cursorZzg = zzg(sQLiteDatabase, 2);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            j10 = cursorZzg.getLong(cursorZzg.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            j10 = 0;
        }
        cursorZzg.close();
        return j10;
    }

    public static void zze(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean z10, boolean z11) {
        if (!z11) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z10) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.VALUE};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
