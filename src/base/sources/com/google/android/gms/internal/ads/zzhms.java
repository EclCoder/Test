package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhms {
    public static final zziaz zza = zziaz.zza(new byte[0]);

    public static final zziaz zza(int i10) {
        return zziaz.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zziaz zzb(int i10) {
        return zziaz.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
