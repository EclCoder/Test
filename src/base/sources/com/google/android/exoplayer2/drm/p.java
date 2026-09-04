package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nb.z;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.j.a f16881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f16884d;

    public p(String str, boolean z10, nb.j.a aVar) {
        ob.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f16881a = aVar;
        this.f16882b = str;
        this.f16883c = z10;
        this.f16884d = new HashMap();
    }

    private static byte[] c(nb.j.a aVar, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        z zVar = new z(aVar.createDataSource());
        com.google.android.exoplayer2.upstream.a aVarA = new com.google.android.exoplayer2.upstream.a.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        com.google.android.exoplayer2.upstream.a aVarA2 = aVarA;
        while (true) {
            try {
                nb.k kVar = new nb.k(zVar, aVarA2);
                try {
                    byte[] bArrC1 = r0.c1(kVar);
                    r0.n(kVar);
                    return bArrC1;
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    try {
                        String strD = d(e10, i10);
                        if (strD == null) {
                            throw e10;
                        }
                        i10++;
                        aVarA2 = aVarA2.a().j(strD).a();
                        r0.n(kVar);
                    } catch (Throwable th2) {
                        r0.n(kVar);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(aVarA, (Uri) ob.a.e(zVar.i()), zVar.getResponseHeaders(), zVar.f(), e11);
            }
        }
    }

    private static String d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map map;
        List list;
        int i11 = httpDataSource$InvalidResponseCodeException.f18739d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f18741f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.q
    public byte[] a(UUID uuid, n.d dVar) {
        return c(this.f16881a, dVar.b() + "&signedRequest=" + r0.E(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // com.google.android.exoplayer2.drm.q
    public byte[] b(UUID uuid, n.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f16883c || TextUtils.isEmpty(strB)) {
            strB = this.f16882b;
        }
        if (TextUtils.isEmpty(strB)) {
            com.google.android.exoplayer2.upstream.a.b bVar = new com.google.android.exoplayer2.upstream.a.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.i(uri).a(), uri, e0.q(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = o9.b.f48266e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = o9.b.f48264c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f16884d) {
            map.putAll(this.f16884d);
        }
        return c(this.f16881a, strB, aVar.a(), map);
    }

    public void e(String str, String str2) {
        ob.a.e(str);
        ob.a.e(str2);
        synchronized (this.f16884d) {
            this.f16884d.put(str, str2);
        }
    }
}
