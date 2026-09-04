package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f16309a;

    c(FrameLayout frameLayout) {
        this.f16309a = frameLayout;
    }

    public void a(e eVar) {
        this.f16309a.addView(eVar.a());
    }

    public FrameLayout b() {
        return this.f16309a;
    }

    public void c(ViewGroup.LayoutParams layoutParams) {
        this.f16309a.setLayoutParams(layoutParams);
    }
}
