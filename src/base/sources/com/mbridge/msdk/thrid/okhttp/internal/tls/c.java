package com.mbridge.msdk.thrid.okhttp.internal.tls;

import com.mbridge.msdk.thrid.okhttp.internal.platform.g;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static c a(X509TrustManager x509TrustManager) {
        return g.d().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
