package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f53585c = new t0();

    private t0() {
        super(qm.a.G(kotlin.jvm.internal.r.f43604a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, s0 builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(decoder.s(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public s0 k(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        return new s0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(sm.d encoder, int[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.i(getDescriptor(), i11, content[i11]);
        }
    }
}
