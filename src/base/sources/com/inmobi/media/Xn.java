package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3435xi;
import com.inmobi.media.Xn;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xn extends Wn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f26046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(GestureDetectorOnGestureListenerC3228pi mRenderView) {
        super(mRenderView);
        kotlin.jvm.internal.s.h(mRenderView, "mRenderView");
        this.f26046d = mRenderView;
    }

    @Override // com.inmobi.media.Wn
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.f26046d.getWebViewFactory().b(new Function1() { // from class: yh.o6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Xn.a(view, (C3435xi) obj);
            }
        });
    }

    @Override // com.inmobi.media.Wn
    public final View c() {
        this.f25982b = new WeakReference(this.f26046d);
        return this.f26046d;
    }

    public static final fl.g0 b(View view, C3435xi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.getViewableAd().a(view);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.Wn
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.s.h(context, "context");
    }

    public static final fl.g0 a(View view, C3435xi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return fl.g0.f38750a;
    }

    public final void c(final View view) {
        this.f26046d.getWebViewFactory().b(new Function1() { // from class: yh.n6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Xn.b(view, (C3435xi) obj);
            }
        });
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.s.h(childView, "childView");
        kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f26046d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.f26046d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        b(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView) {
        kotlin.jvm.internal.s.h(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f26046d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.f26046d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
        c(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
    }
}
