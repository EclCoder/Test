package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements fl.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.c f4466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.a f4467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tl.a f4468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tl.a f4469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p1 f4470e;

    public r1(zl.c viewModelClass, tl.a storeProducer, tl.a factoryProducer, tl.a extrasProducer) {
        kotlin.jvm.internal.s.h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.s.h(storeProducer, "storeProducer");
        kotlin.jvm.internal.s.h(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.s.h(extrasProducer, "extrasProducer");
        this.f4466a = viewModelClass;
        this.f4467b = storeProducer;
        this.f4468c = factoryProducer;
        this.f4469d = extrasProducer;
    }

    @Override // fl.k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 getValue() {
        p1 p1Var = this.f4470e;
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1VarC = s1.f4482b.a((t1) this.f4467b.invoke(), (s1.c) this.f4468c.invoke(), (q1.a) this.f4469d.invoke()).c(this.f4466a);
        this.f4470e = p1VarC;
        return p1VarC;
    }

    @Override // fl.k
    public boolean isInitialized() {
        return this.f4470e != null;
    }
}
