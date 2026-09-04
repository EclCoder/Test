package ik;

import com.google.common.primitives.k;
import com.mbridge.msdk.MBridgeConstans;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import kk.n;
import kk.o;
import kk.s;
import kk.u;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class a extends mk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List f41475b = Collections.singletonList("X-Cloud-Trace-Context");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final s f41476c = s.a().b(true).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final s f41477d = s.f43512b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f41478e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u f41479f = u.b().b();

    a() {
    }

    private static long b(o oVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(oVar.c());
        return byteBufferAllocate.getLong(0);
    }

    @Override // mk.a
    public void a(n nVar, Object obj, mk.a.c cVar) {
        p.p(nVar, "spanContext");
        p.p(cVar, "setter");
        p.p(obj, "carrier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nVar.b().c());
        sb2.append('/');
        sb2.append(k.d(b(nVar.a())));
        sb2.append(";o=");
        sb2.append(nVar.c().d() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        cVar.put(obj, "X-Cloud-Trace-Context", sb2.toString());
    }
}
