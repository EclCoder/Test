package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f53531a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53532b = new m2("kotlin.Byte", rm.e.b.f51391a);

    private l() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Byte.valueOf(decoder.F());
    }

    public void b(sm.f encoder, byte b10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.h(b10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53532b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
