package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3 f53516a = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53517b = r0.a("kotlin.UInt", qm.a.G(kotlin.jvm.internal.r.f43604a));

    private i3() {
    }

    public int a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return fl.z.b(decoder.r(getDescriptor()).g());
    }

    public void b(sm.f encoder, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.m(getDescriptor()).D(i10);
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        return fl.z.a(a(eVar));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53517b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((fl.z) obj).f());
    }
}
