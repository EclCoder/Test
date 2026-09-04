package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class L1 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f25165a;

    public L1(M1 m10) {
        this.f25165a = m10;
    }

    public final fl.g0 a(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25165a.f25242e;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z10);
        }
        this.f25165a.f25240c.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
        return fl.g0.f38750a;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ Object emit(Object obj, kl.f fVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
