package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.media.C3340u1;
import com.inmobi.media.C3366v1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        s.h(animationType, "animationType");
        int i10 = a.f24398a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            C3340u1 c3340u1 = new C3340u1(f10 / 2.0f, f11 / 2.0f);
            c3340u1.setDuration(500L);
            c3340u1.setFillAfter(false);
            c3340u1.setInterpolator(new AccelerateInterpolator());
            return c3340u1;
        }
        if (i10 != 3) {
            return null;
        }
        C3366v1 c3366v1 = new C3366v1(f10 / 2.0f, f11 / 2.0f);
        c3366v1.setDuration(500L);
        c3366v1.setFillAfter(false);
        c3366v1.setInterpolator(new AccelerateInterpolator());
        return c3366v1;
    }
}
