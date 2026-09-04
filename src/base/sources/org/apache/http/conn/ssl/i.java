package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f49232b = new i();

    @Override // org.apache.http.conn.ssl.l
    public final void a(String str, String[] strArr, String[] strArr2) throws SSLException {
        g(str, strArr, strArr2, true);
    }

    public final String toString() {
        return "STRICT";
    }
}
