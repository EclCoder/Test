package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f53593a = new u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53594b = new m2("kotlin.Short", rm.e.h.f51397a);

    private u2() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return Short.valueOf(decoder.p());
    }

    public void b(sm.f encoder, short s10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.t(s10);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53594b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
