package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f30956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile JSONObject f30957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f30959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f30960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, String> f30961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.setting.g f30962j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0 f30963a = new s0();
    }

    public static s0 a() {
        return b.f30963a;
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.f30954b) {
            try {
                if (this.f30961i == null) {
                    this.f30961i = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f30961i;
    }

    private boolean e() {
        return this.f30962j.E() == 1;
    }

    private s0() {
        this.f30953a = new Object();
        this.f30954b = new Object();
        this.f30955c = new Object();
        this.f30956d = new Object();
    }

    private int a(String str, String str2, int i10) {
        if (!a(true)) {
            try {
                String strOptString = this.f30957e.optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strA = k0.a(strOptString);
                    if (!TextUtils.isEmpty(strA)) {
                        return new JSONObject(strA).optInt(str2, i10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f30953a) {
            try {
                if (this.f30960h == null) {
                    this.f30960h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f30960h;
    }

    public int b(String str, int i10) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i10;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
            Integer numB = b(str, concurrentHashMapC);
            if (numB != null) {
                return numB.intValue();
            }
            try {
                numValueOf = Integer.valueOf(a(str, i10));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i10);
            }
            concurrentHashMapC.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
        }
    }

    private int a(String str, int i10) {
        if (!a(true)) {
            try {
                return this.f30957e.optInt(str, i10);
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    public String b(String str, String str2, boolean z10) {
        String strA;
        String strC;
        try {
            if (!TextUtils.isEmpty(str)) {
                ConcurrentHashMap<String, String> concurrentHashMapD = d();
                if (z10 && (strC = c(str, concurrentHashMapD)) != null) {
                    return strC;
                }
                try {
                    strA = a(str, str2, z10);
                } catch (Exception unused) {
                    strA = str2;
                }
                concurrentHashMapD.put(str, strA);
                return strA;
            }
        } catch (Exception unused2) {
        }
        return str2;
    }

    private String a(String str, String str2, boolean z10) {
        if (!a(z10)) {
            try {
                return this.f30957e.optString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(String str, boolean z10, boolean z11) {
        if (!a(z11)) {
            try {
                return this.f30957e.optInt(str, z10 ? 1 : 0) != 0;
            } catch (Exception unused) {
            }
        }
        return z10;
    }

    public int b(String str, String str2, int i10) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i10));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i10);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[Catch: all -> 0x0010, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:21:0x0046, B:23:0x004a, B:24:0x0052, B:12:0x0012, B:14:0x001a, B:16:0x002a, B:17:0x0036, B:20:0x0044), top: B:35:0x0003, inners: #1 }] */
    private boolean a(boolean z10) {
        synchronized (this.f30956d) {
            if (this.f30962j == null || e() || !z10) {
                try {
                    if (TextUtils.isEmpty(this.f30958f)) {
                        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                        this.f30958f = strB;
                        if (TextUtils.isEmpty(strB)) {
                            this.f30958f = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(MBridgeConstans.APP_ID);
                        }
                    }
                    this.f30962j = com.mbridge.msdk.setting.h.b().d(this.f30958f);
                } catch (Exception unused) {
                    this.f30962j = null;
                }
                if (this.f30962j != null) {
                    this.f30957e = this.f30962j.n0();
                }
            } else if (this.f30962j != null) {
                this.f30957e = this.f30962j.n0();
            }
            throw th;
        }
        return this.f30962j == null || this.f30957e == null;
    }

    public boolean b(String str, boolean z10, boolean z11) {
        Boolean boolValueOf;
        Boolean boolA;
        try {
            if (!TextUtils.isEmpty(str)) {
                ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
                if (z11 && (boolA = a(str, concurrentHashMapB)) != null) {
                    return boolA.booleanValue();
                }
                try {
                    boolValueOf = Boolean.valueOf(a(str, z10, z11));
                } catch (Exception unused) {
                    boolValueOf = Boolean.valueOf(z10);
                }
                concurrentHashMapB.put(str, boolValueOf);
                return boolValueOf.booleanValue();
            }
        } catch (Exception unused2) {
        }
        return z10;
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.f30955c) {
            try {
                if (this.f30959g == null) {
                    this.f30959g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f30959g;
    }
}
