package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f53534a = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53535b = r0.a("kotlin.ULong", qm.a.H(kotlin.jvm.internal.u.f43611a));

    private l3() {
    }

    public long a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return fl.b0.b(decoder.r(getDescriptor()).k());
    }

    public void b(sm.f encoder, long j10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.m(getDescriptor()).o(j10);
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        return fl.b0.a(a(eVar));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53535b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((fl.b0) obj).f());
    }
}
