package androidx.media3.exoplayer.drm;

import android.net.Uri;
import com.google.common.collect.p1;
import java.util.Map;
import t1.r;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5248a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r.f f5249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f5250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a.InterfaceC0055a f5251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f5253f;

    private i b(r.f fVar) {
        androidx.media3.datasource.a.InterfaceC0055a interfaceC0055aB = this.f5251d;
        if (interfaceC0055aB == null) {
            interfaceC0055aB = new androidx.media3.datasource.c.b().b(this.f5252e);
        }
        Uri uri = fVar.f52869c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f52874h, interfaceC0055aB);
        p1 it = fVar.f52871e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            oVar.e((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager.b bVarE = new DefaultDrmSessionManager.b().f(fVar.f52867a, n.f5267d).c(fVar.f52872f).d(fVar.f52873g).e(com.google.common.primitives.g.n(fVar.f52876j));
        androidx.media3.exoplayer.upstream.b bVar = this.f5253f;
        if (bVar != null) {
            bVarE.b(bVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = bVarE.a(oVar);
        defaultDrmSessionManagerA.F(0, fVar.c());
        return defaultDrmSessionManagerA;
    }

    @Override // e2.k
    public i a(r rVar) {
        i iVar;
        w1.a.e(rVar.f52818b);
        r.f fVar = rVar.f52818b.f52912c;
        if (fVar == null) {
            return i.f5259a;
        }
        synchronized (this.f5248a) {
            try {
                if (!c0.c(fVar, this.f5249b)) {
                    this.f5249b = fVar;
                    this.f5250c = b(fVar);
                }
                iVar = (i) w1.a.e(this.f5250c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
