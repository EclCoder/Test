package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgtd {
    static final CharSequence zza(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder zzb(StringBuilder sb2, Iterable iterable, String str) {
        zzc(sb2, iterable.iterator(), str);
        return sb2;
    }

    public static final StringBuilder zzc(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb2.append(zza(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    sb2.append(zza(it.next()));
                }
            }
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static final String zzd(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        zzc(sb2, it, str);
        return sb2.toString();
    }
}
