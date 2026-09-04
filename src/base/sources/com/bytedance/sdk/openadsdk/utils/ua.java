package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ua {
    private static volatile com.bytedance.sdk.component.aq.hn.dse aq;
    private static volatile com.bytedance.sdk.component.aq.hn.dse bug;
    private static volatile com.bytedance.sdk.component.aq.hn.dse dkl;
    private static volatile com.bytedance.sdk.component.aq.hn.dse dnm;
    private static volatile com.bytedance.sdk.component.aq.hn.dse dse;
    private static volatile com.bytedance.sdk.component.aq.hn.dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f14718hn;
    private static volatile ScheduledExecutorService hnj;
    private static volatile com.bytedance.sdk.component.aq.hn.dse ojm;
    private static volatile boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.aq.hn.dse f14719sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.aq.hn.dse f14720ta;

    static {
        com.bytedance.sdk.component.aq.hn.gjv.hnj(new com.bytedance.sdk.component.aq.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.utils.ua.1
            @Override // com.bytedance.sdk.component.aq.hn.hnj
            public void hnj(com.bytedance.sdk.component.aq.hn.dse dseVar, com.bytedance.sdk.component.aq.hn.qor qorVar) {
                qorVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.aq.hnj.hnj(new com.bytedance.sdk.component.hnj() { // from class: com.bytedance.sdk.openadsdk.utils.ua.2
            @Override // com.bytedance.sdk.component.hnj
            public void hnj(Runnable runnable) {
                ua.qor(runnable);
            }
        });
        f14718hn = null;
        qor = false;
    }

    public static ExecutorService aq() {
        return fc();
    }

    private static ThreadPoolExecutor bug() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = gjv;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(gjv)) {
                    try {
                        gjv = hnj("ad", gjv);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (gjv == null) {
                        gjv = uua();
                    }
                }
                dseVar = gjv;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static boolean dkl() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static com.bytedance.sdk.component.aq.hn.dse dnm() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = f14720ta;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(f14720ta)) {
                    try {
                        f14720ta = hnj("net", f14720ta);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (f14720ta == null) {
                        f14720ta = uua();
                    }
                }
                dseVar = f14720ta;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static boolean dse() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    private static com.bytedance.sdk.component.aq.hn.dse fc() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = dse;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(dse)) {
                    try {
                        dse = hnj("io", dse);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (dse == null) {
                        dse = uua();
                    }
                }
                dseVar = dse;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static ExecutorService gjv() {
        return orl();
    }

    public static ExecutorService hn() {
        return mjg();
    }

    public static ScheduledExecutorService hnj() {
        if (hnj == null) {
            synchronized (ua.class) {
                try {
                    if (hnj == null) {
                        hnj = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.aq.hn.sk("scheduled"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private static com.bytedance.sdk.component.aq.hn.dse jip() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = dnm;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(dnm)) {
                    try {
                        dnm = hnj("imgdisk", dnm);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (dnm == null) {
                        dnm = uua();
                    }
                }
                dseVar = dnm;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    private static com.bytedance.sdk.component.aq.hn.dse mjg() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = aq;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(aq)) {
                    try {
                        aq = hnj("image", aq);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (aq == null) {
                        aq = uua();
                    }
                }
                dseVar = aq;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static com.bytedance.sdk.component.aq.hn.dse ojm() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = dkl;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(dkl)) {
                    try {
                        dkl = hnj("cache", dkl);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (dkl == null) {
                        dkl = uua();
                    }
                }
                dseVar = dkl;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    private static com.bytedance.sdk.component.aq.hn.dse orl() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = f14719sk;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(f14719sk)) {
                    try {
                        f14719sk = hnj("log", f14719sk);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (f14719sk == null) {
                        f14719sk = uua();
                    }
                }
                dseVar = f14719sk;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static ExecutorService qor() {
        return jip();
    }

    public static ExecutorService sk() {
        return ojm();
    }

    public static com.bytedance.sdk.component.aq.hn.dse ta() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = ojm;
        if (!hnj(dseVar2)) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (hnj(ojm)) {
                    try {
                        ojm = hnj("express", ojm);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (ojm == null) {
                        ojm = uua();
                    }
                }
                dseVar = ojm;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    private static com.bytedance.sdk.component.aq.hn.dse uua() {
        com.bytedance.sdk.component.aq.hn.dse dseVar;
        com.bytedance.sdk.component.aq.hn.dse dseVar2 = bug;
        if (dseVar2 != null) {
            return dseVar2;
        }
        synchronized (ua.class) {
            try {
                if (bug == null) {
                    try {
                        bug = hn("default").hnj();
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                dseVar = bug;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dseVar;
    }

    public static void gjv(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (gm.hnj) {
            return;
        }
        bug().execute(qorVar);
    }

    public static void hn(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.fc.qor().removeCallbacks(runnable);
    }

    public static void qor(Runnable runnable) {
        if (gm.hnj) {
            return;
        }
        fc().execute(runnable);
    }

    public static void sk(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        dnm().execute(qorVar);
    }

    public static void hn(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (qorVar == null || gm.hnj) {
            return;
        }
        orl().execute(qorVar);
    }

    public static void qor(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (qorVar == null || gm.hnj) {
            return;
        }
        bug().execute(qorVar);
    }

    public static void hn(com.bytedance.sdk.component.aq.hn.qor qorVar, int i10) {
        if (qorVar == null || gm.hnj) {
            return;
        }
        qorVar.setPriority(i10);
        orl().execute(qorVar);
    }

    public static void hnj(Runnable runnable) {
        if (runnable == null || gm.hnj) {
            return;
        }
        if (dkl()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.fc.qor().post(runnable);
        }
    }

    private static com.bytedance.sdk.component.aq.hn.dse.hnj hn(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.aq.hn.dse.hnj hnjVar = new com.bytedance.sdk.component.aq.hn.dse.hnj();
        str.getClass();
        switch (str) {
            case "express":
                return hnjVar.hnj(str).hnj(2).hn(4).qor(0).hnj(10000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "ad":
                return hnjVar.hnj(str).hnj(4).hn(4).qor(0).hnj(20000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "io":
                return hnjVar.hnj(str).hnj(4).hn(10).qor(0).hnj(20000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "log":
                return hnjVar.hnj(str).hnj(4).hn(6).qor(2).hnj(20000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "net":
                return hnjVar.hnj(str).hnj(10).hn(10).qor(0).hnj(10000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "aidl":
                return hnjVar.hnj(str).hnj(2).hn(4).qor(0).hnj(10000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "cache":
                return hnjVar.hnj(str).hnj(0).hn(0).qor(0).hnj(5000L).hnj(true).sk(-1).gjv(20).hn(false);
            case "image":
                return hnjVar.hnj(str).hnj(3).hn(3).qor(0).hnj(20000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "monitor":
                return hnjVar.hnj(str).hnj(2).hn(2).qor(0).hnj(10000L).hnj(true).sk(-1).gjv(10).hn(false);
            case "imgdisk":
                return hnjVar.hnj(str).hnj(1).hn(2).qor(3).hnj(10000L).hnj(true).sk(-1).gjv(10).hn(false);
            default:
                return hnjVar.hnj(str).hnj(8).hn(16).qor(2).hnj(20000L).hnj(true).sk(-1).gjv(10).hn(false);
        }
    }

    public static void hnj(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (gm.hnj) {
            return;
        }
        ojm().execute(qorVar);
    }

    public static void hnj(com.bytedance.sdk.component.aq.hn.qor qorVar, int i10) {
        if (qorVar == null || gm.hnj) {
            return;
        }
        qorVar.setPriority(i10);
        fc().execute(qorVar);
    }

    private static boolean hnj(com.bytedance.sdk.component.aq.hn.dse dseVar) {
        if (dseVar != null) {
            return !dseVar.hnj() && com.bytedance.sdk.openadsdk.core.settings.dnm.bgg();
        }
        return true;
    }

    private static com.bytedance.sdk.component.aq.hn.dse hnj(String str, com.bytedance.sdk.component.aq.hn.dse dseVar) {
        com.bytedance.sdk.component.aq.hn.dse.hnj hnjVarHnj = hnj(str);
        if (dseVar == null) {
            return hnjVarHnj.hnj();
        }
        dseVar.hnj(hnjVarHnj);
        return dseVar;
    }

    private static com.bytedance.sdk.component.aq.hn.dse.hnj hnj(String str) {
        com.bytedance.sdk.component.aq.hn.dse.hnj hnjVarHn = hn(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.dnm.bgg()) {
                hnjVarHn.hn(true);
                JSONObject jSONObjectVh = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().vh();
                JSONObject jSONObjectOptJSONObject = jSONObjectVh != null ? jSONObjectVh.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    hnjVarHn.hn(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        hnjVarHn.hnj(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        hnjVarHn.hn(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        hnjVarHn.qor(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        hnjVarHn.hnj(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        hnjVarHn.hnj(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return hnjVarHn;
        } catch (Throwable th2) {
            th2.getMessage();
            return hnjVarHn;
        }
    }
}
