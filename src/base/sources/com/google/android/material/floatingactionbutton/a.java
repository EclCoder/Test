package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f20102a;

    a() {
    }

    public void a() {
        Animator animator = this.f20102a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f20102a = null;
    }

    public void c(Animator animator) {
        a();
        this.f20102a = animator;
    }
}
