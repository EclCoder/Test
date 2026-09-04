package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import sc.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzqh implements x {
    static final /* synthetic */ zzqh zza = new zzqh();

    private /* synthetic */ zzqh() {
    }

    @Override // sc.x
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z10 = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i10 = runningAppProcessInfo.importance;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17);
            sb2.append("Memory state is: ");
            sb2.append(i10);
            Log.i("PhenotypeProcessReaper", sb2.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z10 = true;
            }
        } catch (RuntimeException e10) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e10);
        }
        return new Boolean(z10);
    }
}
