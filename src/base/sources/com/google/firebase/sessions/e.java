package com.google.firebase.sessions;

import android.content.Context;
import kl.j;
import ne.g0;
import z0.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f22444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f22445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f22446c;

    private e(pe.e eVar, pe.e eVar2, pe.e eVar3) {
        this.f22444a = eVar;
        this.f22445b = eVar2;
        this.f22446c = eVar3;
    }

    public static e a(pe.e eVar, pe.e eVar2, pe.e eVar3) {
        return new e(eVar, eVar2, eVar3);
    }

    public static h c(Context context, j jVar, g0 g0Var) {
        return (h) pe.d.d(b.InterfaceC0330b.f22439a.m(context, jVar, g0Var));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c((Context) this.f22444a.get(), (j) this.f22445b.get(), (g0) this.f22446c.get());
    }
}
