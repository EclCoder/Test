package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.s;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f33196a = com.mbridge.msdk.thrid.okio.f.c("\"\\");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f33197b = com.mbridge.msdk.thrid.okio.f.c("\t ,=");

    public static long a(a0 a0Var) {
        return a(a0Var.m());
    }

    public static boolean b(a0 a0Var) {
        if (a0Var.s().e().equals(HttpMethods.HEAD)) {
            return false;
        }
        int iK = a0Var.k();
        return (((iK >= 100 && iK < 200) || iK == 204 || iK == 304) && a(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static long a(r rVar) {
        return a(rVar.b("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(l lVar, s sVar, r rVar) {
        if (lVar == l.f33492a) {
            return;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> listA = com.mbridge.msdk.thrid.okhttp.k.a(sVar, rVar);
        if (listA.isEmpty()) {
            return;
        }
        lVar.a(sVar, listA);
    }

    public static int b(String str, int i10) {
        char cCharAt;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\t')) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
