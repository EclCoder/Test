package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v2 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f53598a = new v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53599b = new m2("kotlin.String", rm.e.i.f51398a);

    private v2() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return decoder.C();
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, String value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        encoder.G(value);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53599b;
    }
}
