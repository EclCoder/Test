package c9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f9684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f9685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f9686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f9687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f9688e;

    public w(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f9684a = aVar;
        this.f9685b = aVar2;
        this.f9686c = aVar3;
        this.f9687d = aVar4;
        this.f9688e = aVar5;
    }

    public static w a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(m9.a aVar, m9.a aVar2, i9.e eVar, j9.r rVar, j9.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((m9.a) this.f9684a.get(), (m9.a) this.f9685b.get(), (i9.e) this.f9686c.get(), (j9.r) this.f9687d.get(), (j9.v) this.f9688e.get());
    }
}
