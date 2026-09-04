package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzafr implements zzafs {
    static final /* synthetic */ zzafr zza = new zzafr();

    private /* synthetic */ zzafr() {
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final /* synthetic */ Constructor zza() throws IllegalAccessException, InvocationTargetException {
        int i10 = zzafu.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzafy.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
