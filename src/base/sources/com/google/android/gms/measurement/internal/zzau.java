package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzau {
    final /* synthetic */ zzaw zza;
    private final String zzb;
    private long zzc;

    public zzau(zzaw zzawVar, String str) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    public final List zza() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.zza.zze().query("raw_events", new String[]{"rowid", "name", CampaignEx.JSON_KEY_TIMESTAMP, "metadata_fingerprint", DataSchemeDataSource.SCHEME_DATA, "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{this.zzb, String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        long j12 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.zzc) {
                            this.zzc = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursorQuery.getLong(2));
                            zzhrVar.zzw(j12);
                            arrayList.add(new zzat(j10, j11, z10, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd()));
                        } catch (IOException e10) {
                            this.zza.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(this.zzb), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.zza.zzu.zzaW().zzb().zzc("Data loss. Error querying raw events batch. appId", zzgu.zzl(this.zzb), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzau(zzaw zzawVar, String str, long j10) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = zzawVar.zzaj("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
