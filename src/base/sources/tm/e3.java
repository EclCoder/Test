package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e3 f53470c = new e3();

    private e3() {
        super(qm.a.w(fl.x.f38783b));
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((fl.y) obj).x());
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((fl.y) obj).x());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ Object r() {
        return fl.y.a(w());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ void u(sm.d dVar, Object obj, int i10) {
        z(dVar, ((fl.y) obj).x(), i10);
    }

    protected int v(byte[] collectionSize) {
        kotlin.jvm.internal.s.h(collectionSize, "$this$collectionSize");
        return fl.y.o(collectionSize);
    }

    protected byte[] w() {
        return fl.y.b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, d3 builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(fl.x.b(decoder.y(getDescriptor(), i10).F()));
    }

    protected d3 y(byte[] toBuilder) {
        kotlin.jvm.internal.s.h(toBuilder, "$this$toBuilder");
        return new d3(toBuilder, null);
    }

    protected void z(sm.d encoder, byte[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11).h(fl.y.m(content, i11));
        }
    }
}
