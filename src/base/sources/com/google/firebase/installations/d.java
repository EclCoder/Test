package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f22206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f22207b;

    public d(h hVar, TaskCompletionSource taskCompletionSource) {
        this.f22206a = hVar;
        this.f22207b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f22207b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(ee.d dVar) {
        if (!dVar.k() || this.f22206a.f(dVar)) {
            return false;
        }
        this.f22207b.setResult(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
