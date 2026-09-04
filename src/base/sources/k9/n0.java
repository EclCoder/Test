package k9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f43058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f43059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f43060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f43061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f43062e;

    public n0(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f43058a = aVar;
        this.f43059b = aVar2;
        this.f43060c = aVar3;
        this.f43061d = aVar4;
        this.f43062e = aVar5;
    }

    public static n0 a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(m9.a aVar, m9.a aVar2, Object obj, Object obj2, el.a aVar3) {
        return new m0(aVar, aVar2, (e) obj, (v0) obj2, aVar3);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((m9.a) this.f43058a.get(), (m9.a) this.f43059b.get(), this.f43060c.get(), this.f43061d.get(), this.f43062e);
    }
}
