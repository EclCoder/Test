package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f53499c = new h();

    private h() {
        super(qm.a.B(kotlin.jvm.internal.d.f43583a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, g builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(decoder.x(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public g k(boolean[] zArr) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        return new g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.l2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(sm.d encoder, boolean[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11, content[i11]);
        }
    }
}
