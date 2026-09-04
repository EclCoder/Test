package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsa {
    public static final /* synthetic */ int zzb = 0;
    private static final Pattern zzc = Pattern.compile("[a-z]+(_[a-z]+)*");
    static final Account zza = zzrv.zza;
    private static final Set zzd = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    private static final Set zze = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    public static zzrz zza(Context context) {
        return new zzrz(context, null);
    }

    static void zzb(String str) {
        Set set = zze;
        zzsq.zza(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
    }

    static void zzc(String str) {
        zzsq.zza(zzc.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzsq.zza(!zzd.contains(str), "Module name is reserved and cannot be used: %s", str);
    }
}
