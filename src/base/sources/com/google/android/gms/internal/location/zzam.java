package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzam extends IInterface {
    void zzd(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzakVar);

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str);

    void zzf(String[] strArr, zzak zzakVar, String str);

    void zzg(com.google.android.gms.location.zzbq zzbqVar, zzak zzakVar);

    void zzh(long j10, boolean z10, PendingIntent pendingIntent);

    void zzi(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzj(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbcVar);

    void zzp(boolean z10);

    void zzq(Location location);

    void zzr(zzai zzaiVar);

    LocationAvailability zzs(String str);

    void zzt(LocationSettingsRequest locationSettingsRequest, zzao zzaoVar, String str);

    void zzu(zzl zzlVar);

    void zzv(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback);
}
