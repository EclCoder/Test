package v5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends m6.h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f55174e;

    public g(long j10) {
        super(j10);
    }

    @Override // v5.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            n(i() / 2);
        }
    }

    @Override // v5.h
    public void d(h.a aVar) {
        this.f55174e = aVar;
    }

    @Override // v5.h
    public /* bridge */ /* synthetic */ t5.c e(r5.e eVar, t5.c cVar) {
        return (t5.c) super.l(eVar, cVar);
    }

    @Override // v5.h
    public /* bridge */ /* synthetic */ t5.c f(r5.e eVar) {
        return (t5.c) super.m(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int j(t5.c cVar) {
        return cVar == null ? super.j(null) : cVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(r5.e eVar, t5.c cVar) {
        h.a aVar = this.f55174e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.d(cVar);
    }
}
