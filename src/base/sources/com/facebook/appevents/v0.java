package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import c1.pGX.geAgcEazw;
import com.facebook.internal.e1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f15015c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f15013a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15014b = v0.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f15016d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f15017e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap f15018f = new ConcurrentHashMap();

    private v0() {
    }

    public static final String b() {
        if (x7.a.c(v0.class)) {
            return null;
        }
        try {
            if (!f15016d.get()) {
                f15013a.d();
            }
            HashMap map = new HashMap();
            map.putAll(f15017e);
            map.putAll(f15013a.c());
            return e1.n0(map);
        } catch (Throwable th2) {
            x7.a.b(th2, v0.class);
            return null;
        }
    }

    private final Map c() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set setB = c7.d.f9578d.b();
            for (String str : f15018f.keySet()) {
                if (setB.contains(str)) {
                    map.put(str, f15018f.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final synchronized void d() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f15016d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.h0.m());
            kotlin.jvm.internal.s.g(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            f15015c = defaultSharedPreferences;
            SharedPreferences sharedPreferences = null;
            if (defaultSharedPreferences == null) {
                kotlin.jvm.internal.s.w(CIdIVqKnNZ.DhRvPhzocuSaL);
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = f15015c;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.s.w("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f15017e.putAll(e1.j0(string));
            f15018f.putAll(e1.j0(string2));
            atomicBoolean.set(true);
            return;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return;
        }
        throw th;
    }

    public static final void e() {
        if (x7.a.c(v0.class)) {
            return;
        }
        try {
            if (f15016d.get()) {
                return;
            }
            f15013a.d();
        } catch (Throwable th2) {
            x7.a.b(th2, v0.class);
        }
    }

    private final String f(String str, String str2) {
        String strSubstring;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.s.i(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String lowerCase = str2.subSequence(i10, length + 1).toString().toLowerCase();
            kotlin.jvm.internal.s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.s.c("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(f15014b, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (kotlin.jvm.internal.s.c("ph", str)) {
                    return new bm.o("[^0-9]").i(lowerCase, "");
                }
                if (kotlin.jvm.internal.s.c("ge", str)) {
                    if (lowerCase.length() > 0) {
                        strSubstring = lowerCase.substring(0, 1);
                        kotlin.jvm.internal.s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = "";
                    }
                    if (!kotlin.jvm.internal.s.c("f", strSubstring) && !kotlin.jvm.internal.s.c("m", strSubstring)) {
                        Log.e(f15014b, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void g(Map ud2) {
        String[] strArr;
        List listJ;
        if (x7.a.c(v0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(ud2, "ud");
            if (!f15016d.get()) {
                f15013a.d();
            }
            for (Map.Entry entry : ud2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                v0 v0Var = f15013a;
                int length = str2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = kotlin.jvm.internal.s.i(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                String strI0 = e1.I0(v0Var.f(str, str2.subSequence(i10, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = f15018f;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listJ = new bm.o(",").j(str3, 0)) == null || (strArr = (String[]) listJ.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setF = gl.s0.f(Arrays.copyOf(strArr, strArr.length));
                    if (setF.contains(strI0)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strI0);
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(strI0);
                    } else {
                        for (int i11 = 1; i11 < 5; i11++) {
                            sb2.append(strArr[i11]);
                            sb2.append(",");
                        }
                        sb2.append(strI0);
                        setF.remove(strArr[0]);
                    }
                    f15018f.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, strI0);
                }
            }
            f15013a.h("com.facebook.appevents.UserDataStore.internalUserData", e1.n0(f15018f));
        } catch (Throwable th2) {
            x7.a.b(th2, v0.class);
        }
    }

    private final void h(final String str, final String str2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.appevents.u0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.i(str, str2);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String key, String str) {
        if (x7.a.c(v0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(key, "$key");
            kotlin.jvm.internal.s.h(str, geAgcEazw.WsNnqjgFvJrqnw);
            if (!f15016d.get()) {
                f15013a.d();
            }
            SharedPreferences sharedPreferences = f15015c;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.s.w("sharedPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(key, str).apply();
        } catch (Throwable th2) {
            x7.a.b(th2, v0.class);
        }
    }
}
