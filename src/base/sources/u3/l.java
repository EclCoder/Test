package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0[] f53916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53920f = C.TIME_UNSET;

    public l(List list) {
        this.f53915a = list;
        this.f53916b = new o0[list.size()];
    }

    private boolean a(w1.u uVar, int i10) {
        if (uVar.a() == 0) {
            return false;
        }
        if (uVar.G() != i10) {
            this.f53917c = false;
        }
        this.f53918d--;
        return this.f53917c;
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        if (this.f53917c) {
            if (this.f53918d != 2 || a(uVar, 32)) {
                if (this.f53918d != 1 || a(uVar, 0)) {
                    int iF = uVar.f();
                    int iA = uVar.a();
                    for (o0 o0Var : this.f53916b) {
                        uVar.T(iF);
                        o0Var.c(uVar, iA);
                    }
                    this.f53919e += iA;
                }
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f53917c = true;
        this.f53920f = j10;
        this.f53919e = 0;
        this.f53918d = 2;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        for (int i10 = 0; i10 < this.f53916b.length; i10++) {
            k0.a aVar = (k0.a) this.f53915a.get(i10);
            dVar.a();
            o0 o0VarTrack = rVar.track(dVar.c(), 3);
            o0VarTrack.b(new t1.o.b().a0(dVar.b()).o0(MimeTypes.APPLICATION_DVBSUBS).b0(Collections.singletonList(aVar.f53904c)).e0(aVar.f53902a).K());
            this.f53916b[i10] = o0VarTrack;
        }
    }

    @Override // u3.m
    public void e(boolean z10) {
        if (this.f53917c) {
            w1.a.g(this.f53920f != C.TIME_UNSET);
            for (o0 o0Var : this.f53916b) {
                o0Var.e(this.f53920f, 1, this.f53919e, 0, null);
            }
            this.f53917c = false;
        }
    }

    @Override // u3.m
    public void seek() {
        this.f53917c = false;
        this.f53920f = C.TIME_UNSET;
    }
}
