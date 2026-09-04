package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import nb.h;
import o9.p;
import ob.d0;
import ob.r0;
import ta.f;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.b f17604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17605b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private va.c f17609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17613j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TreeMap f17608e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f17607d = r0.x(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ja.b f17606c = new ja.b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17615b;

        public a(long j10, long j11) {
            this.f17614a = j10;
            this.f17615b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f17616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f17617b = new p();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ha.d f17618c = new ha.d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f17619d = C.TIME_UNSET;

        c(nb.b bVar) {
            this.f17616a = c0.l(bVar);
        }

        private ha.d g() {
            this.f17618c.b();
            if (this.f17616a.R(this.f17617b, this.f17618c, 0, false) != -4) {
                return null;
            }
            this.f17618c.n();
            return this.f17618c;
        }

        private void k(long j10, long j11) {
            e.this.f17607d.sendMessage(e.this.f17607d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f17616a.K(false)) {
                ha.d dVarG = g();
                if (dVarG != null) {
                    long j10 = dVarG.f16756e;
                    ha.a aVarA = e.this.f17606c.a(dVarG);
                    if (aVarA != null) {
                        ja.a aVar = (ja.a) aVarA.e(0);
                        if (e.h(aVar.f42195a, aVar.f42196b)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f17616a.s();
        }

        private void m(long j10, ja.a aVar) {
            long jF = e.f(aVar);
            if (jF == C.TIME_UNSET) {
                return;
            }
            k(j10, jF);
        }

        @Override // u9.b0
        public void b(d0 d0Var, int i10, int i11) {
            this.f17616a.c(d0Var, i10);
        }

        @Override // u9.b0
        public int d(h hVar, int i10, boolean z10, int i11) {
            return this.f17616a.a(hVar, i10, z10);
        }

        @Override // u9.b0
        public void e(v0 v0Var) {
            this.f17616a.e(v0Var);
        }

        @Override // u9.b0
        public void f(long j10, int i10, int i11, int i12, b0.a aVar) {
            this.f17616a.f(j10, i10, i11, i12, aVar);
            l();
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f17619d;
            if (j10 == C.TIME_UNSET || fVar.f53218h > j10) {
                this.f17619d = fVar.f53218h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f17619d;
            return e.this.n(j10 != C.TIME_UNSET && j10 < fVar.f53217g);
        }

        public void n() {
            this.f17616a.S();
        }
    }

    public e(va.c cVar, b bVar, nb.b bVar2) {
        this.f17609f = cVar;
        this.f17605b = bVar;
        this.f17604a = bVar2;
    }

    private Map.Entry e(long j10) {
        return this.f17608e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(ja.a aVar) {
        try {
            return r0.O0(r0.E(aVar.f42199e));
        } catch (ParserException unused) {
            return C.TIME_UNSET;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = (Long) this.f17608e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f17608e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f17608e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void i() {
        if (this.f17611h) {
            this.f17612i = true;
            this.f17611h = false;
            this.f17605b.b();
        }
    }

    private void l() {
        this.f17605b.a(this.f17610g);
    }

    private void p() {
        Iterator it = this.f17608e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f17609f.f55310h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f17613j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f17614a, aVar.f17615b);
        return true;
    }

    boolean j(long j10) {
        va.c cVar = this.f17609f;
        boolean z10 = false;
        if (!cVar.f55306d) {
            return false;
        }
        if (this.f17612i) {
            return true;
        }
        Map.Entry entryE = e(cVar.f55310h);
        if (entryE != null && ((Long) entryE.getValue()).longValue() < j10) {
            this.f17610g = ((Long) entryE.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f17604a);
    }

    void m(f fVar) {
        this.f17611h = true;
    }

    boolean n(boolean z10) {
        if (!this.f17609f.f55306d) {
            return false;
        }
        if (this.f17612i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f17613j = true;
        this.f17607d.removeCallbacksAndMessages(null);
    }

    public void q(va.c cVar) {
        this.f17612i = false;
        this.f17610g = C.TIME_UNSET;
        this.f17609f = cVar;
        p();
    }
}
