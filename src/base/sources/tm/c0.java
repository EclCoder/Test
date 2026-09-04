package tm;

import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f53448a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f53449b = new m2(SVWsZyNSAChGIA.WbJxvZuH, rm.e.i.f51398a);

    private c0() {
    }

    public long a(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return cm.a.f10121b.c(decoder.C());
    }

    public void b(sm.f encoder, long j10) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        encoder.G(cm.a.C(j10));
    }

    @Override // pm.c
    public /* bridge */ /* synthetic */ Object deserialize(sm.e eVar) {
        return cm.a.e(a(eVar));
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f53449b;
    }

    @Override // pm.l
    public /* bridge */ /* synthetic */ void serialize(sm.f fVar, Object obj) {
        b(fVar, ((cm.a) obj).G());
    }
}
