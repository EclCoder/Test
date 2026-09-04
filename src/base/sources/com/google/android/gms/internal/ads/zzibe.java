package com.google.android.gms.internal.ads;

import java.util.Objects;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibe {
    public static final zzibe zza = new zzibe("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    static {
        new zzibe("\n", "  ", true);
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    private zzibe(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, CIdIVqKnNZ.DRZeQv);
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.zzb = str;
                this.zzc = str2;
                this.zzd = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
