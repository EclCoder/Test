package com.inmobi.media;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ti implements androidx.browser.customtabs.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R2 f25765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2 f25766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T2 f25767c;

    public Ti(R2 r10, S2 s10, T2 t10) {
        this.f25765a = r10;
        this.f25766b = s10;
        this.f25767c = t10;
    }

    @Override // androidx.browser.customtabs.j
    public final void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        try {
            this.f25766b.a(i10);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.j
    public final void onSessionEnded(boolean z10, Bundle bundle) {
        try {
            this.f25767c.a(z10);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.j
    public final void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        try {
            U2 u10 = this.f25765a.f25578a;
            if (u10.f25801h) {
                return;
            }
            u10.f25801h = true;
            C2840ai c2840ai = (C2840ai) u10.f25802i.get();
            if (c2840ai != null) {
                GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                c2840ai.a(Vh.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (Exception unused) {
        }
    }
}
