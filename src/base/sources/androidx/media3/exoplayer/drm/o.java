package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0055a f5271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f5274d;

    public o(String str, boolean z10, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
        w1.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f5271a = interfaceC0055a;
        this.f5272b = str;
        this.f5273c = z10;
        this.f5274d = new HashMap();
    }

    private static byte[] c(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        z1.k kVar = new z1.k(interfaceC0055a.createDataSource());
        z1.g gVarA = new z1.g.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        z1.g gVarA2 = gVarA;
        while (true) {
            try {
                z1.e eVar = new z1.e(kVar, gVarA2);
                try {
                    byte[] bArrE = vc.a.e(eVar);
                    c0.l(eVar);
                    return bArrE;
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    try {
                        String strD = d(e10, i10);
                        if (strD == null) {
                            throw e10;
                        }
                        i10++;
                        gVarA2 = gVarA2.a().j(strD).a();
                        c0.l(eVar);
                    } catch (Throwable th2) {
                        c0.l(eVar);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(gVarA, (Uri) w1.a.e(kVar.e()), kVar.getResponseHeaders(), kVar.d(), e11);
            }
        }
    }

    private static String d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map map;
        List list;
        int i11 = httpDataSource$InvalidResponseCodeException.f4712d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f4714f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] a(UUID uuid, m.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f5273c || TextUtils.isEmpty(strB)) {
            strB = this.f5272b;
        }
        if (TextUtils.isEmpty(strB)) {
            z1.g.b bVar = new z1.g.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.i(uri).a(), uri, e0.q(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = t1.e.f52667e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = t1.e.f52665c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f5274d) {
            map.putAll(this.f5274d);
        }
        return c(this.f5271a, strB, aVar.a(), map);
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] b(UUID uuid, m.d dVar) {
        return c(this.f5271a, dVar.b() + "&signedRequest=" + c0.G(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public void e(String str, String str2) {
        w1.a.e(str);
        w1.a.e(str2);
        synchronized (this.f5274d) {
            this.f5274d.put(str, str2);
        }
    }
}
