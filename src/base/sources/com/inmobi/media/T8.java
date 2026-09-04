package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class T8 extends OrientationEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zl.k[] f25738d = {kotlin.jvm.internal.l0.e(new kotlin.jvm.internal.w(T8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f25739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f25740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S8 f25741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T8(InMobiAdActivity activity) {
        super(activity);
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f25739a = activity;
        this.f25740b = new HashSet();
        kotlin.properties.a aVar = kotlin.properties.a.f43614a;
        this.f25741c = new S8(Mf.a(N5.g()), this);
    }

    public final void a(Nf orientationProperties) {
        kotlin.jvm.internal.s.h(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f25349a) {
                this.f25739a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.f25350b;
            if (kotlin.jvm.internal.s.c(str, "landscape")) {
                this.f25739a.setRequestedOrientation(6);
            } else if (kotlin.jvm.internal.s.c(str, "portrait")) {
                this.f25739a.setRequestedOrientation(7);
            } else {
                this.f25739a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f25739a.getResources().getConfiguration().orientation;
        byte bG = N5.g();
        int i11 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i11 = 2;
        }
        if (i10 == i11) {
            this.f25741c.setValue(this, f25738d[0], Mf.a(N5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f25740b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
