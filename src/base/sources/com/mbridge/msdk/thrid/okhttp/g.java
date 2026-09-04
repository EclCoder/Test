package com.mbridge.msdk.thrid.okhttp;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f33095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Comparator<String> f33028b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, g> f33031c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f33034d = a("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f33037e = a("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f33040f = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f33043g = a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f33046h = a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f33049i = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f33052j = a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f33055k = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f33058l = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f33061m = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f33064n = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f33067o = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f33070p = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f33073q = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f33076r = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f33079s = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f33081t = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f33083u = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f33085v = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f33087w = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f33089x = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f33091y = a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f33093z = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final g A = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g B = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g C = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g D = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g E = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g F = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g G = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g H = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g I = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g J = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g K = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g L = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g M = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g N = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g O = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g P = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g Q = a(IAoPeRfJn.CvhB, 61);
    public static final g R = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g S = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g T = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g U = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g V = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final g W = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g X = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final g Y = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Z = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final g f33026a0 = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk$SDKError.b.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f33029b0 = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final g f33032c0 = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final g f33035d0 = a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final g f33038e0 = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final g f33041f0 = a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final g f33044g0 = a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final g f33047h0 = a("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final g f33050i0 = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final g f33053j0 = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final g f33056k0 = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final g f33059l0 = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final g f33062m0 = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final g f33065n0 = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final g f33068o0 = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f33071p0 = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final g f33074q0 = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final g f33077r0 = a("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final g f33080s0 = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final g f33082t0 = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final g f33084u0 = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final g f33086v0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final g f33088w0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final g f33090x0 = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final g f33092y0 = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final g f33094z0 = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final g A0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C0 = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D0 = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E0 = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G0 = a(IAoPeRfJn.uwIuuh, 49167);
    public static final g H0 = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I0 = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J0 = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M0 = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N0 = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O0 = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P0 = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q0 = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final g f33027a1 = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final g f33030b1 = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final g f33033c1 = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final g f33036d1 = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final g f33039e1 = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final g f33042f1 = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final g f33045g1 = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final g f33048h1 = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final g f33051i1 = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final g f33054j1 = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final g f33057k1 = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final g f33060l1 = a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final g f33063m1 = a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final g f33066n1 = a("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final g f33069o1 = a("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final g f33072p1 = a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final g f33075q1 = a("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final g f33078r1 = a("TLS_AES_256_CCM_8_SHA256", 4869);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private g(String str) {
        str.getClass();
        this.f33095a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        try {
            Map<String, g> map = f33031c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f33095a;
    }

    static List<g> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static g a(String str, int i10) {
        g gVar = new g(str);
        f33031c.put(str, gVar);
        return gVar;
    }
}
