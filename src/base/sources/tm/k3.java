package tm;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends l2 implements pm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k3 f53530c = new k3();

    private k3() {
        super(qm.a.y(fl.b0.f38735b));
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((fl.c0) obj).x());
    }

    @Override // tm.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((fl.c0) obj).x());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ Object r() {
        return fl.c0.a(w());
    }

    @Override // tm.l2
    public /* bridge */ /* synthetic */ void u(sm.d dVar, Object obj, int i10) {
        z(dVar, ((fl.c0) obj).x(), i10);
    }

    protected long[] w() {
        return fl.c0.b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.v, tm.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(sm.c decoder, int i10, j3 builder, boolean z10) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(builder, "builder");
        builder.e(fl.b0.b(decoder.y(getDescriptor(), i10).k()));
    }

    protected j3 y(long[] toBuilder) {
        kotlin.jvm.internal.s.h(toBuilder, "$this$toBuilder");
        return new j3(toBuilder, null);
    }

    protected void z(sm.d encoder, long[] content, int i10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11).o(fl.c0.m(content, i11));
        }
    }

    protected int v(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, IAoPeRfJn.NrjvBWnxCKQCmqo);
        return fl.c0.o(jArr);
    }
}
