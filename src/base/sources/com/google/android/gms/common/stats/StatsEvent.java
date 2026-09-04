package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long jZza = zza();
        int iZzb = zzb();
        String strZzc = zzc();
        int length = String.valueOf(jZza).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(iZzb).length() + 3 + strZzc.length());
        sb2.append(jZza);
        sb2.append("\t");
        sb2.append(iZzb);
        sb2.append("\t-1");
        sb2.append(strZzc);
        return sb2.toString();
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract String zzc();
}
