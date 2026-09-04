package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class K8 implements InterfaceC3027ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N8 f25106a;

    public K8(N8 n10) {
        this.f25106a = n10;
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
            L8 l10 = (L8) this.f25106a.f25324a.get(view);
            if (l10 == null) {
                this.f25106a.a(view);
            } else {
                L8 l11 = (L8) this.f25106a.f25325b.get(view);
                if (!kotlin.jvm.internal.s.c(l10.f25192a, l11 != null ? l11.f25192a : null)) {
                    l10.f25195d = SystemClock.uptimeMillis();
                    this.f25106a.f25325b.put(view, l10);
                }
            }
        }
        int size2 = invisibleViews.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = invisibleViews.get(i11);
            i11++;
            this.f25106a.f25325b.remove((View) obj2);
        }
        N8 n10 = this.f25106a;
        if (n10.f25328e.hasMessages(0)) {
            return;
        }
        n10.f25328e.postDelayed(n10.f25329f, n10.f25330g);
    }
}
