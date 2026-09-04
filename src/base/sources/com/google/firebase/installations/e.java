package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f22208a;

    public e(TaskCompletionSource taskCompletionSource) {
        this.f22208a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(ee.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f22208a.trySetResult(dVar.d());
        return true;
    }
}
