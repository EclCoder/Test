package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q3 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3 f53566a = new q3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53567b = new m2("kotlin.uuid.Uuid", rm.e.i.f51398a);

    private q3() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dm.a deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return dm.a.f36989c.c(decoder.C());
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, dm.a value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        encoder.G(value.toString());
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53567b;
    }
}
