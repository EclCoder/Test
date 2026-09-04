package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ei, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2943ei implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26501b;

    public C2943ei(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Context context) {
        this.f26500a = gestureDetectorOnGestureListenerC3228pi;
        this.f26501b = context;
    }

    @Override // com.inmobi.media.Ta
    public final void a() {
        this.f26500a.getListener().a();
    }

    @Override // com.inmobi.media.Ta
    public final void b(String str, String str2, String str3) {
        this.f26500a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ta
    public final void a(String str, String message, String str2) {
        kotlin.jvm.internal.s.h(message, "message");
        this.f26500a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Ta
    public final void a(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        intent.putExtra("creativeId", this.f26500a.getCreativeId());
        intent.putExtra("impressionId", this.f26500a.getImpressionId());
        intent.putExtra("placementId", this.f26500a.getPlacementId());
        intent.putExtra("isImmersive", this.f26500a.X0);
        SparseArray sparseArray = InMobiAdActivity.f24404t;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26500a;
        InMobiAdActivity.f24405u = gestureDetectorOnGestureListenerC3228pi;
        if (gestureDetectorOnGestureListenerC3228pi.getPlacementType() == 0) {
            Context context = Xi.f26021a;
            Activity context2 = this.f26500a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.f26501b;
            }
            kotlin.jvm.internal.s.h(context2, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
            return;
        }
        intent.putExtra("supportBrowserLoader", true);
        Context context3 = Xi.f26021a;
        Context context4 = this.f26500a.getContainerContext();
        kotlin.jvm.internal.s.h(context4, "context");
        kotlin.jvm.internal.s.h(intent, "intent");
        if (!(context4 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context4.startActivity(intent);
    }

    @Override // com.inmobi.media.Ta
    public final void a(String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26500a;
        if (gestureDetectorOnGestureListenerC3228pi.f27223e) {
            return;
        }
        gestureDetectorOnGestureListenerC3228pi.b(trackerName, macros);
    }
}
