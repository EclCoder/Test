package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 extends f0 implements zl.j {
    public d0(Class cls, String str, String str2, int i10) {
        super(f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.f
    protected zl.b computeReflected() {
        return l0.h(this);
    }

    @Override // zl.j
    public zl.j.a d() {
        ((zl.j) getReflected()).d();
        return null;
    }

    @Override // tl.o
    public Object invoke(Object obj, Object obj2) {
        return l(obj, obj2);
    }
}
