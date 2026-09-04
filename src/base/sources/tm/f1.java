package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f53474a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53475b = new m2("kotlin.Long", rm.e.g.f51396a);

    private f1() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Long.valueOf(decoder.k());
    }

    public void b(sm.f encoder, long j10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.o(j10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53475b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
