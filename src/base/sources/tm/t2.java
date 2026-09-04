package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t2 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f53587c = new t2();

    private t2() {
        super(qm.a.I(kotlin.jvm.internal.n0.f43601a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        kotlin.jvm.internal.s.h(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, s2 builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(decoder.h(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public s2 k(short[] sArr) {
        kotlin.jvm.internal.s.h(sArr, "<this>");
        return new s2(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(sm.d encoder, short[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.v(getDescriptor(), i11, content[i11]);
        }
    }
}
