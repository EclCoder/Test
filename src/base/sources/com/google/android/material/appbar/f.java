package com.google.android.material.appbar;

import android.view.View;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f19327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19332f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19333g = true;

    public f(View view) {
        this.f19327a = view;
    }

    void a() {
        View view = this.f19327a;
        q0.Y(view, this.f19330d - (view.getTop() - this.f19328b));
        View view2 = this.f19327a;
        q0.X(view2, this.f19331e - (view2.getLeft() - this.f19329c));
    }

    public int b() {
        return this.f19328b;
    }

    public int c() {
        return this.f19330d;
    }

    void d() {
        this.f19328b = this.f19327a.getTop();
        this.f19329c = this.f19327a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f19333g || this.f19331e == i10) {
            return false;
        }
        this.f19331e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f19332f || this.f19330d == i10) {
            return false;
        }
        this.f19330d = i10;
        a();
        return true;
    }
}
