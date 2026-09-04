package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziz {
    public static final zziz zza = new zziy().zzg();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziz) {
            return this.zzb.equals(((zziz) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final Set zza() {
        return this.zzb.keySet();
    }

    public final void zzb(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.zzb.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    final /* synthetic */ Map zzc() {
        return this.zzb;
    }
}
