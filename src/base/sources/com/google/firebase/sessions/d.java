package com.google.firebase.sessions;

import android.content.Context;
import kl.j;
import z0.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f22442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f22443b;

    private d(pe.e eVar, pe.e eVar2) {
        this.f22442a = eVar;
        this.f22443b = eVar2;
    }

    public static d a(pe.e eVar, pe.e eVar2) {
        return new d(eVar, eVar2);
    }

    public static h c(Context context, j jVar) {
        return (h) pe.d.d(b.InterfaceC0330b.f22439a.j(context, jVar));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c((Context) this.f22442a.get(), (j) this.f22443b.get());
    }
}
