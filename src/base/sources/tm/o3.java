package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f53549a = new o3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53550b = r0.a("kotlin.UShort", qm.a.I(kotlin.jvm.internal.n0.f43601a));

    private o3() {
    }

    public short a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return fl.e0.b(decoder.r(getDescriptor()).p());
    }

    public void b(sm.f encoder, short s10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.m(getDescriptor()).t(s10);
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        return fl.e0.a(a(eVar));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53550b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((fl.e0) obj).f());
    }
}
