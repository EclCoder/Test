package org.apache.http.conn.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public interface l extends HostnameVerifier {
    void a(String str, String[] strArr, String[] strArr2);

    void b(String str, SSLSocket sSLSocket);
}
