package z1;

import java.util.ArrayList;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f58531b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f58533d;

    protected a(boolean z10) {
        this.f58530a = z10;
    }

    @Override // androidx.media3.datasource.a
    public final void c(m mVar) {
        w1.a.e(mVar);
        if (this.f58531b.contains(mVar)) {
            return;
        }
        this.f58531b.add(mVar);
        this.f58532c++;
    }

    protected final void d(int i10) {
        g gVar = (g) c0.h(this.f58533d);
        for (int i11 = 0; i11 < this.f58532c; i11++) {
            ((m) this.f58531b.get(i11)).b(this, gVar, this.f58530a, i10);
        }
    }

    protected final void e() {
        g gVar = (g) c0.h(this.f58533d);
        for (int i10 = 0; i10 < this.f58532c; i10++) {
            ((m) this.f58531b.get(i10)).g(this, gVar, this.f58530a);
        }
        this.f58533d = null;
    }

    protected final void f(g gVar) {
        for (int i10 = 0; i10 < this.f58532c; i10++) {
            ((m) this.f58531b.get(i10)).e(this, gVar, this.f58530a);
        }
    }

    protected final void g(g gVar) {
        this.f58533d = gVar;
        for (int i10 = 0; i10 < this.f58532c; i10++) {
            ((m) this.f58531b.get(i10)).f(this, gVar, this.f58530a);
        }
    }
}
