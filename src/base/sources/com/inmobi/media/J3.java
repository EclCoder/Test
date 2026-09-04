package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J3 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f10) {
        try {
            return vl.a.b(f10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f10) {
        try {
            return (int) (f10 / N5.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        kotlin.jvm.internal.s.h(inputStream, "<this>");
        kotlin.jvm.internal.s.h(mimeType, "mimeType");
        Map mapF = gl.l0.f(fl.w.a("Access-Control-Allow-Origin", "*"));
        B5.f24500a.getClass();
        return B5.x() ? new WebResourceResponse(mimeType, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, 200, "OK", mapF, inputStream) : new WebResourceResponse(mimeType, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, inputStream);
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / N5.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final float a(float f10) {
        return b(f10 * 10.0f) / 10.0f;
    }

    public static final String a(xn.g gVar, int i10) {
        kotlin.jvm.internal.s.h("\"main\"", "startMarker");
        kotlin.jvm.internal.s.h("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (gVar != null) {
                int i11 = i10;
                boolean z10 = false;
                do {
                    try {
                        String strI = gVar.I();
                        if (strI == null) {
                            break;
                        }
                        if (i10 > 0 && !z10) {
                            sb3.append(strI);
                            sb3.append("\n");
                            i10--;
                        }
                        if (bm.r.N(strI, "\"main\"", false, 2, null)) {
                            bm.r.m(sb3);
                            z10 = true;
                        }
                        if (z10) {
                            i11--;
                            sb2.append(strI);
                            sb2.append("\n");
                        }
                        if (bm.r.T(strI, "ZygoteInit.java", false, 2, null)) {
                            break;
                        }
                    } catch (IOException e10) {
                        Log.e("CommonExt", "Error reading from input stream", e10);
                    }
                } while (i11 > 0);
            }
            if (sb2.length() == 0) {
                String string = sb3.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                if (gVar != null) {
                    kotlin.jvm.internal.s.h(gVar, "<this>");
                    try {
                        gVar.close();
                    } catch (IOException unused) {
                    }
                }
                return string;
            }
            String string2 = sb2.toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            if (gVar != null) {
                kotlin.jvm.internal.s.h(gVar, "<this>");
                try {
                    gVar.close();
                } catch (IOException unused2) {
                }
            }
            return string2;
        } catch (Throwable th2) {
            if (gVar != null) {
                kotlin.jvm.internal.s.h(gVar, "<this>");
                try {
                    gVar.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    public static final boolean a(Context context) {
        int i10;
        kotlin.jvm.internal.s.h(context, "<this>");
        B5.f24500a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            kotlin.jvm.internal.s.g(packageInfo, "getPackageInfo(...)");
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i10 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        } catch (Exception unused) {
        }
        return i10 >= 35;
    }

    public static final void a(No no2, RelativeLayout.LayoutParams layoutParams, Lf lf2) {
        kotlin.jvm.internal.s.h(no2, "<this>");
        kotlin.jvm.internal.s.h(layoutParams, "layoutParams");
        String str = WwUgngZLNA.Yxz;
        kotlin.jvm.internal.s.h(lf2, str);
        no2.getClass();
        kotlin.jvm.internal.s.h(lf2, str);
        Mo mo2 = (Mo) no2.f25373a.get(lf2);
        int i10 = mo2 != null ? mo2.f25295a : 0;
        kotlin.jvm.internal.s.h(lf2, str);
        Mo mo3 = (Mo) no2.f25373a.get(lf2);
        int i11 = mo3 != null ? mo3.f25297c : 0;
        kotlin.jvm.internal.s.h(lf2, str);
        Mo mo4 = (Mo) no2.f25373a.get(lf2);
        layoutParams.setMargins(i10, 0, i11, mo4 != null ? mo4.f25298d : 0);
    }

    public static final String a(HashMap map) {
        String strEncode;
        String strEncode2;
        kotlin.jvm.internal.s.h(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String string = bm.r.V0((String) entry.getValue()).toString();
            if (string.length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    kotlin.jvm.internal.s.g(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(string, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    kotlin.jvm.internal.s.g(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                String str2 = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2));
                kotlin.jvm.internal.s.g(str2, "format(...)");
                sb2.append(str2);
            }
        }
        String string2 = sb2.toString();
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        return string2;
    }

    public static final String a(xn.e eVar) {
        kotlin.jvm.internal.s.h(eVar, "<this>");
        String strEncodeToString = Base64.encodeToString(eVar.l0(), 0);
        kotlin.jvm.internal.s.g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final void a(em.o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        try {
            em.p0.c(o0Var, null, 1, null);
        } catch (IllegalStateException unused) {
        }
    }

    public static final em.z1 a(em.o0 o0Var, long j10, long j11, Function1 action) {
        kotlin.jvm.internal.s.h(o0Var, "<this>");
        kotlin.jvm.internal.s.h(action, "action");
        return em.k.d(o0Var, null, null, new F3(j10, action, j11, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3484zh c3484zh, Function1 function1, kl.f fVar) {
        H3 h10;
        if (fVar instanceof H3) {
            h10 = (H3) fVar;
            int i10 = h10.f24910b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h10.f24910b = i10 - Integer.MIN_VALUE;
            } else {
                h10 = new H3(fVar);
            }
        } else {
            h10 = new H3(fVar);
        }
        Object obj = h10.f24909a;
        Object objF = ll.b.f();
        int i11 = h10.f24910b;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                I3 i12 = new I3(function1, null);
                h10.f24910b = 1;
                if (c3484zh.a(i12, h10) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (IllegalStateException e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
        }
        return fl.g0.f38750a;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        kotlin.jvm.internal.s.h(context, "<this>");
        kotlin.jvm.internal.s.h(filter, "filter");
        try {
            B5.f24500a.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, filter, 2);
            }
            return context.registerReceiver(broadcastReceiver, filter);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            return null;
        }
    }
}
