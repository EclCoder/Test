package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxa {
    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final Runnable zza(Runnable runnable) {
        s.h(runnable, "runnable");
        return new zzwz(new k0(), zzvy.zzb(false), runnable);
    }

    public static final i zzb(i asyncCallable) {
        s.h(asyncCallable, "asyncCallable");
        return new zzwx(zzvy.zzb(false), asyncCallable);
    }

    public static final j zzc(j asyncFunction) {
        s.h(asyncFunction, "asyncFunction");
        return new zzwy(zzvy.zzb(false), asyncFunction);
    }
}
