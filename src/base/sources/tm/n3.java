package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f53543c = new n3();

    private n3() {
        super(qm.a.z(fl.e0.f38745b));
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((fl.f0) obj).x());
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((fl.f0) obj).x());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ Object r() {
        return fl.f0.a(w());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ void u(sm.d dVar, Object obj, int i10) {
        z(dVar, ((fl.f0) obj).x(), i10);
    }

    protected int v(short[] collectionSize) {
        kotlin.jvm.internal.s.h(collectionSize, "$this$collectionSize");
        return fl.f0.o(collectionSize);
    }

    protected short[] w() {
        return fl.f0.b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, m3 builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(fl.e0.b(decoder.y(getDescriptor(), i10).p()));
    }

    protected m3 y(short[] toBuilder) {
        kotlin.jvm.internal.s.h(toBuilder, "$this$toBuilder");
        return new m3(toBuilder, null);
    }

    protected void z(sm.d encoder, short[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11).t(fl.f0.m(content, i11));
        }
    }
}
