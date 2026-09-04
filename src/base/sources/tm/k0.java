package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f53526a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53527b = new m2("kotlin.Float", rm.e.C0794e.f51394a);

    private k0() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Float.valueOf(decoder.q());
    }

    public void b(sm.f encoder, float f10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.x(f10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53527b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
