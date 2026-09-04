package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f53441a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53442b = new m2("kotlin.Double", rm.e.d.f51393a);

    private b0() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Double.valueOf(decoder.t());
    }

    public void b(sm.f encoder, double d10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.g(d10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53442b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
