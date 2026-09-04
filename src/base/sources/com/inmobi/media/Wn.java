package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f25981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f25983c;

    public Wn(GestureDetectorOnGestureListenerC3228pi container) {
        kotlin.jvm.internal.s.h(container, "container");
        this.f25981a = container;
        this.f25983c = container.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public abstract View c();

    public abstract void d();
}
