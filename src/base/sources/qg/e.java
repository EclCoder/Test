package qg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f50788a;

    public e(el.a aVar) {
        this.f50788a = aVar;
    }

    public static e a(el.a aVar) {
        return new e(aVar);
    }

    public static d c() {
        return new d();
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        d dVarC = c();
        f.a(dVarC, (lg.a) this.f50788a.get());
        return dVarC;
    }
}
