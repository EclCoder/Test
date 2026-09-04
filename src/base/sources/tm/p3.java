package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p3 implements pm.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3 f53560b = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ u1 f53561a = new u1("kotlin.Unit", fl.g0.f38750a);

    private p3() {
    }

    public void a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        this.f53561a.deserialize(decoder);
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, fl.g0 value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        this.f53561a.serialize(encoder, value);
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        a(eVar);
        return fl.g0.f38750a;
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53561a.getDescriptor();
    }
}
