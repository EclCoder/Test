package org.apache.http.conn.ssl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements so.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f49219e = b.f49210b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f49220f = c.f49211b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f49221g = i.f49232b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f49222h = Collections.unmodifiableList(Arrays.asList(Pattern.compile("^(TLS|SSL)_(NULL|ECDH_anon|DH_anon|DH_anon_EXPORT|DHE_RSA_EXPORT|DHE_DSS_EXPORT|DSS_EXPORT|DH_DSS_EXPORT|DH_RSA_EXPORT|RSA_EXPORT|KRB5_EXPORT)_(.*)", 2), Pattern.compile("^(TLS|SSL)_(.*)_WITH_(NULL|DES_CBC|DES40_CBC|DES_CBC_40|3DES_EDE_CBC|RC4_128|RC4_40|RC2_CBC_40)_(.*)", 2)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f49223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HostnameVerifier f49224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f49225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f49226d;

    public e(SSLContext sSLContext) {
        this(sSLContext, a());
    }

    public static HostnameVerifier a() {
        return new d(to.g.a());
    }

    public static e b() {
        return new e(hp.a.a(), a());
    }

    public e(SSLContext sSLContext, HostnameVerifier hostnameVerifier) {
        this(((SSLContext) ip.a.h(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, hostnameVerifier);
    }

    public e(SSLContext sSLContext, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier) {
        this(((SSLContext) ip.a.h(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, hostnameVerifier);
    }

    public e(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier) {
        zn.h.k(getClass());
        this.f49223a = (javax.net.ssl.SSLSocketFactory) ip.a.h(sSLSocketFactory, "SSL socket factory");
        this.f49225c = strArr;
        this.f49226d = strArr2;
        this.f49224b = hostnameVerifier == null ? a() : hostnameVerifier;
    }
}
