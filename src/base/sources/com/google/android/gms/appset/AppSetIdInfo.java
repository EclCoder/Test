package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final String zza;
    private final int zzb;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}
