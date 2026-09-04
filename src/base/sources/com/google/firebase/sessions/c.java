package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f22441a;

    private c(pe.e eVar) {
        this.f22441a = eVar;
    }

    public static ne.b a(com.google.firebase.f fVar) {
        return (ne.b) pe.d.d(b.InterfaceC0330b.f22439a.e(fVar));
    }

    public static c b(pe.e eVar) {
        return new c(eVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ne.b get() {
        return a((com.google.firebase.f) this.f22441a.get());
    }
}
