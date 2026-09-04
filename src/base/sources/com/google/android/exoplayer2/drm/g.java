package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.y0;
import com.google.common.collect.p1;
import java.util.Map;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements t9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16849a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y0.f f16850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f16851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nb.j.a f16852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16853e;

    private j b(y0.f fVar) {
        nb.j.a aVarB = this.f16852d;
        if (aVarB == null) {
            aVarB = new nb.q.b().b(this.f16853e);
        }
        Uri uri = fVar.f19037c;
        p pVar = new p(uri == null ? null : uri.toString(), fVar.f19042h, aVarB);
        p1 it = fVar.f19039e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pVar.e((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = new DefaultDrmSessionManager.b().e(fVar.f19035a, o.f16877d).b(fVar.f19040f).c(fVar.f19041g).d(com.google.common.primitives.g.n(fVar.f19044j)).a(pVar);
        defaultDrmSessionManagerA.F(0, fVar.e());
        return defaultDrmSessionManagerA;
    }

    @Override // t9.k
    public j a(y0 y0Var) {
        j jVar;
        ob.a.e(y0Var.f18982b);
        y0.f fVar = y0Var.f18982b.f19081c;
        if (fVar == null || r0.f48425a < 18) {
            return j.f16868a;
        }
        synchronized (this.f16849a) {
            try {
                if (!r0.c(fVar, this.f16850b)) {
                    this.f16850b = fVar;
                    this.f16851c = b(fVar);
                }
                jVar = (j) ob.a.e(this.f16851c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
