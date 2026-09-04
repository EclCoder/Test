package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f53438c = new a0();

    private a0() {
        super(qm.a.E(kotlin.jvm.internal.k.f43596a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        kotlin.jvm.internal.s.h(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, z builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(decoder.i(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public z k(double[] dArr) {
        kotlin.jvm.internal.s.h(dArr, "<this>");
        return new z(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(sm.d encoder, double[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.j(getDescriptor(), i11, content[i11]);
        }
    }
}
