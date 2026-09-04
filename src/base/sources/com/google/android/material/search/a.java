package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f20939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f20940e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f20936a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f20937b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f20938c = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20941f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Animator f20942g = null;

    a() {
    }

    void a(boolean z10) {
        this.f20941f = z10;
    }

    void b(SearchBar searchBar) {
        Animator animator = this.f20939d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f20940e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
