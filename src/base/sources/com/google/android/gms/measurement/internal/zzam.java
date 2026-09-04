package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
enum zzam {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    zzam(char c10) {
        this.zzk = c10;
    }

    public static zzam zza(char c10) {
        for (zzam zzamVar : values()) {
            if (zzamVar.zzk == c10) {
                return zzamVar;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char zzb() {
        return this.zzk;
    }
}
