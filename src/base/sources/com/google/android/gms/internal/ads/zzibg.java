package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzibg {
    @Deprecated
    public zzibg() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzicf zzicfVar = new zzicf(zzica.zza(sb2));
            zzicfVar.zza(zzibl.LENIENT);
            zzicb.zza.zza(zzicfVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzibi zze() {
        if (this instanceof zzibi) {
            return (zzibi) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzibf zzf() {
        if (this instanceof zzibf) {
            return (zzibf) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzibk zzg() {
        if (this instanceof zzibk) {
            return (zzibk) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
