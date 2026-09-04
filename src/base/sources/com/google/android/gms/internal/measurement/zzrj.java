package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzrj {
    static final zzrl zza;

    static {
        zzrl zzrhVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzrl.class, zzrl.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzrhVar = (zzrl) it.next();
                p.w(!it.hasNext(), "Expected at most one FlagsService");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                zzrhVar = new zzrh();
            }
            zza = zzrhVar;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
