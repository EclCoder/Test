package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f49211b = new c();

    @Override // org.apache.http.conn.ssl.l
    public final void a(String str, String[] strArr, String[] strArr2) throws SSLException {
        g(str, strArr, strArr2, false);
    }

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }
}
