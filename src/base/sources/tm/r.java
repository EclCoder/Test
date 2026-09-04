package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f53568a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53569b = new m2("kotlin.Char", rm.e.c.f51392a);

    private r() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Character.valueOf(decoder.v());
    }

    public void b(sm.f encoder, char c10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.y(c10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53569b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
