package lm;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f44698c = new k();

    private k() {
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        c.f44682i.Y0(runnable, true, false);
    }

    @Override // em.k0
    public k0 V0(int i10, String str) {
        jm.l.a(i10);
        return i10 >= j.f44695d ? jm.l.b(this, str) : super.V0(i10, str);
    }

    @Override // em.k0
    public String toString() {
        return "Dispatchers.IO";
    }
}
