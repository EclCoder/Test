package com.bytedance.adsdk.hn;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static int aq = 0;
    private static volatile com.bytedance.adsdk.hn.gjv.dse bug = null;
    private static long[] dkl = null;
    private static volatile com.bytedance.adsdk.hn.gjv.aq dnm = null;
    private static int dse = 0;
    private static boolean gjv = true;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static boolean f12127hn = false;
    public static boolean hnj = false;
    private static com.bytedance.adsdk.hn.gjv.dkl ojm = null;
    private static boolean qor = true;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static String[] f12128sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static com.bytedance.adsdk.hn.gjv.sk f12129ta;

    public static float hn(String str) {
        int i10 = aq;
        if (i10 > 0) {
            aq = i10 - 1;
            return 0.0f;
        }
        if (!f12127hn) {
            return 0.0f;
        }
        int i11 = dse - 1;
        dse = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f12128sk[i11])) {
            Trace.endSection();
            return (System.nanoTime() - dkl[dse]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f12128sk[dse] + ".");
    }

    public static void hnj(String str) {
        if (f12127hn) {
            int i10 = dse;
            if (i10 == 20) {
                aq++;
                return;
            }
            f12128sk[i10] = str;
            dkl[i10] = System.nanoTime();
            Trace.beginSection(str);
            dse++;
        }
    }

    public static com.bytedance.adsdk.hn.gjv.aq hnj(Context context) {
        com.bytedance.adsdk.hn.gjv.aq aqVar;
        com.bytedance.adsdk.hn.gjv.aq aqVar2 = dnm;
        if (aqVar2 != null) {
            return aqVar2;
        }
        synchronized (com.bytedance.adsdk.hn.gjv.aq.class) {
            try {
                aqVar = dnm;
                if (aqVar == null) {
                    com.bytedance.adsdk.hn.gjv.dse dseVarHn = hn(context);
                    com.bytedance.adsdk.hn.gjv.dkl hnVar = ojm;
                    if (hnVar == null) {
                        hnVar = new com.bytedance.adsdk.hn.gjv.hn();
                    }
                    aqVar = new com.bytedance.adsdk.hn.gjv.aq(dseVarHn, hnVar);
                    dnm = aqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aqVar;
    }

    public static com.bytedance.adsdk.hn.gjv.dse hn(Context context) {
        com.bytedance.adsdk.hn.gjv.dse dseVar;
        if (!qor) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.hn.gjv.dse dseVar2 = bug;
        if (dseVar2 != null) {
            return dseVar2;
        }
        synchronized (com.bytedance.adsdk.hn.gjv.dse.class) {
            try {
                dseVar = bug;
                if (dseVar == null) {
                    com.bytedance.adsdk.hn.gjv.sk skVar = f12129ta;
                    if (skVar == null) {
                        skVar = new com.bytedance.adsdk.hn.gjv.sk() { // from class: com.bytedance.adsdk.hn.sk.1
                            @Override // com.bytedance.adsdk.hn.gjv.sk
                            public File hnj() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    dseVar = new com.bytedance.adsdk.hn.gjv.dse(skVar);
                    bug = dseVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dseVar;
    }

    public static boolean hnj() {
        return gjv;
    }
}
