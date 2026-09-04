package com.facebook.internal;

import android.net.Uri;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f15481a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f15483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static e0 f15484d;

    static {
        String strK = kotlin.jvm.internal.l0.b(z0.class).k();
        if (strK == null) {
            strK = "UrlRedirectCache";
        }
        f15482b = strK;
        f15483c = strK + "_Redirect";
    }

    private z0() {
    }

    public static final void a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStreamI = null;
        try {
            e0 e0VarB = b();
            String string = uri.toString();
            kotlin.jvm.internal.s.g(string, "fromUri.toString()");
            outputStreamI = e0VarB.i(string, f15483c);
            String string2 = uri2.toString();
            kotlin.jvm.internal.s.g(string2, "toUri.toString()");
            byte[] bytes = string2.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStreamI.write(bytes);
        } catch (IOException e10) {
            r0.f15352e.a(com.facebook.r0.CACHE, 4, f15482b, "IOException when accessing cache: " + e10.getMessage());
        } finally {
            e1.j(outputStreamI);
        }
    }

    public static final synchronized e0 b() {
        e0 e0Var;
        try {
            e0Var = f15484d;
            if (e0Var == null) {
                e0Var = new e0(f15482b, new e0.e());
            }
            f15484d = e0Var;
        } catch (Throwable th2) {
            throw th2;
        }
        return e0Var;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:132), block:B:29:0x0084 */
    public static final Uri c(Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        kotlin.jvm.internal.s.g(string, PAFNPq.BSn);
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                e0 e0VarB = b();
                InputStream inputStreamF = e0VarB.f(string, f15483c);
                inputStreamReader = null;
                boolean z10 = false;
                while (inputStreamF != null) {
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStreamF);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = inputStreamReader4.read(cArr, 0, 128); i10 > 0; i10 = inputStreamReader4.read(cArr, 0, 128)) {
                                sb2.append(cArr, 0, i10);
                            }
                            e1.j(inputStreamReader4);
                            String string2 = sb2.toString();
                            kotlin.jvm.internal.s.g(string2, "urlBuilder.toString()");
                            if (hashSet.contains(string2)) {
                                if (kotlin.jvm.internal.s.c(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    z10 = true;
                                    break;
                                }
                                r0.f15352e.a(com.facebook.r0.CACHE, 6, f15482b, "A loop detected in UrlRedirectCache");
                                e1.j(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamF = e0VarB.f(string2, f15483c);
                            string = string2;
                            inputStreamReader = inputStreamReader4;
                            z10 = true;
                        } catch (IOException e10) {
                            e = e10;
                            inputStreamReader = inputStreamReader4;
                            r0.f15352e.a(com.facebook.r0.CACHE, 4, f15482b, "IOException when accessing cache: " + e.getMessage());
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamReader3 = inputStreamReader4;
                            e1.j(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                }
                if (z10) {
                    Uri uri2 = Uri.parse(string);
                    e1.j(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader3 = inputStreamReader2;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
        }
        e1.j(inputStreamReader);
        return null;
    }
}
