package nb;

import java.util.ArrayList;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f46971b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.a f46973d;

    protected e(boolean z10) {
        this.f46970a = z10;
    }

    @Override // nb.j
    public final void d(a0 a0Var) {
        ob.a.e(a0Var);
        if (this.f46971b.contains(a0Var)) {
            return;
        }
        this.f46971b.add(a0Var);
        this.f46972c++;
    }

    protected final void i(int i10) {
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) r0.j(this.f46973d);
        for (int i11 = 0; i11 < this.f46972c; i11++) {
            ((a0) this.f46971b.get(i11)).c(this, aVar, this.f46970a, i10);
        }
    }

    protected final void j() {
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) r0.j(this.f46973d);
        for (int i10 = 0; i10 < this.f46972c; i10++) {
            ((a0) this.f46971b.get(i10)).f(this, aVar, this.f46970a);
        }
        this.f46973d = null;
    }

    protected final void k(com.google.android.exoplayer2.upstream.a aVar) {
        for (int i10 = 0; i10 < this.f46972c; i10++) {
            ((a0) this.f46971b.get(i10)).h(this, aVar, this.f46970a);
        }
    }

    protected final void l(com.google.android.exoplayer2.upstream.a aVar) {
        this.f46973d = aVar;
        for (int i10 = 0; i10 < this.f46972c; i10++) {
            ((a0) this.f46971b.get(i10)).e(this, aVar, this.f46970a);
        }
    }
}
