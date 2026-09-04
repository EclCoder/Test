package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 extends f0 implements zl.i {
    public b0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.f
    protected zl.b computeReflected() {
        return l0.g(this);
    }

    @Override // zl.i
    public zl.i.a d() {
        ((zl.i) getReflected()).d();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }
}
