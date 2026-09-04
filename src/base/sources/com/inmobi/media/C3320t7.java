package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3320t7 implements InterfaceC3027ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3346u7 f27519a;

    public C3320t7(C3346u7 c3346u7) {
        this.f27519a = c3346u7;
    }

    @Override // com.inmobi.media.InterfaceC3027ho
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.s.h(visibleViews, "visibleViews");
        kotlin.jvm.internal.s.h(invisibleViews, "invisibleViews");
        int size = visibleViews.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = visibleViews.get(i10);
            i10++;
            View view = (View) obj;
            InterfaceC2898co interfaceC2898co = (InterfaceC2898co) this.f27519a.f27610i.get(view);
            if (interfaceC2898co != null) {
                Xh xh2 = (Xh) interfaceC2898co;
                kotlin.jvm.internal.s.h(view, "view");
                if (view instanceof GestureDetectorOnGestureListenerC3228pi) {
                    if (xh2.f26020a.hasWindowFocus()) {
                        xh2.f26020a.d(true);
                    } else {
                        xh2.f26020a.d(false);
                    }
                }
            }
        }
        int size2 = invisibleViews.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = invisibleViews.get(i11);
            i11++;
            View view2 = (View) obj2;
            InterfaceC2898co interfaceC2898co2 = (InterfaceC2898co) this.f27519a.f27610i.get(view2);
            if (interfaceC2898co2 != null) {
                Xh xh3 = (Xh) interfaceC2898co2;
                kotlin.jvm.internal.s.h(view2, "view");
                if (view2 instanceof GestureDetectorOnGestureListenerC3228pi) {
                    if (xh3.f26020a.hasWindowFocus()) {
                        xh3.f26020a.d(false);
                    } else {
                        xh3.f26020a.d(false);
                    }
                }
            }
        }
    }
}
