package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list) {
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list, long j10) {
    }

    public void registerReleaseEvent(Context context, Intent intent) {
    }

    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i10, String str4) {
    }

    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i10, List<String> list, boolean z10, long j10) {
    }
}
