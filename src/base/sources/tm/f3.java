package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f53477a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53478b = r0.a("kotlin.UByte", qm.a.C(kotlin.jvm.internal.e.f43584a));

    private f3() {
    }

    public byte a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return fl.x.b(decoder.r(getDescriptor()).F());
    }

    public void b(sm.f encoder, byte b10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.m(getDescriptor()).h(b10);
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        return fl.x.a(a(eVar));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53478b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((fl.x) obj).f());
    }
}
