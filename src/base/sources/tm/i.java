package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f53507a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53508b = new m2("kotlin.Boolean", rm.e.a.f51390a);

    private i() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Boolean.valueOf(decoder.u());
    }

    public void b(sm.f encoder, boolean z10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.u(z10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53508b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
