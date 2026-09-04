package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(rm.f primitive) {
        super(primitive, null);
        kotlin.jvm.internal.s.h(primitive, "primitive");
        this.f53529c = primitive.i() + "Array";
    }

    @Override // rm.f
    public String i() {
        return this.f53529c;
    }
}
