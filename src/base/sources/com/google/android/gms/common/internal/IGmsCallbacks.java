package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i10, IBinder iBinder, Bundle bundle);

    void zzb(int i10, Bundle bundle);

    void zzc(int i10, IBinder iBinder, zzj zzjVar);
}
