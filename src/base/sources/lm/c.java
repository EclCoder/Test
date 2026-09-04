package lm;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f44682i = new c();

    private c() {
        super(j.f44694c, j.f44695d, j.f44696e, j.f44692a);
    }

    @Override // em.k0
    public k0 V0(int i10, String str) {
        jm.l.a(i10);
        return i10 >= j.f44694c ? jm.l.b(this, str) : super.V0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // em.k0
    public String toString() {
        return "Dispatchers.Default";
    }
}
