package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class M8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25253c;

    public M8(N8 impressionTracker) {
        kotlin.jvm.internal.s.h(impressionTracker, "impressionTracker");
        this.f25251a = M8.class.getSimpleName();
        this.f25252b = new ArrayList();
        this.f25253c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String TAG = this.f25251a;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        N8 n10 = (N8) this.f25253c.get();
        if (n10 != null) {
            for (Map.Entry entry : n10.f25325b.entrySet()) {
                View view = (View) entry.getKey();
                L8 l10 = (L8) entry.getValue();
                String TAG2 = this.f25251a;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                Objects.toString(l10);
                if (SystemClock.uptimeMillis() - l10.f25195d >= l10.f25194c) {
                    String TAG3 = this.f25251a;
                    kotlin.jvm.internal.s.g(TAG3, "TAG");
                    C3294s7 c3294s7 = n10.f25331h;
                    c3294s7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3228pi) {
                        InterfaceC3322t9 interfaceC3322t9 = c3294s7.f27442a.f27607f;
                        if (interfaceC3322t9 != null) {
                            ((C3348u9) interfaceC3322t9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC3228pi) view).u();
                    }
                    this.f25252b.add(view);
                }
            }
            ArrayList arrayList = this.f25252b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n10.a((View) obj);
            }
            this.f25252b.clear();
            if (n10.f25325b.isEmpty() || n10.f25328e.hasMessages(0)) {
                return;
            }
            n10.f25328e.postDelayed(n10.f25329f, n10.f25330g);
        }
    }
}
