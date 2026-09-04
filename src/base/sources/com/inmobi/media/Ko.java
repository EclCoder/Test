package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.Ko;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25148b;

    public Ko(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f25147a = new ArrayList();
        this.f25148b = new WeakReference(view);
        B5.f24500a.getClass();
        if (B5.w()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: yh.d2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return Ko.a(this.f57654a, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(Ko ko2, View view, WindowInsets windowInsets) {
        kotlin.jvm.internal.s.h(view, "<unused var>");
        kotlin.jvm.internal.s.h(windowInsets, "windowInsets");
        if (!ko2.f25147a.isEmpty()) {
            ArrayList arrayList = ko2.f25147a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Oo oo2 = (Oo) ((Jo) obj);
                oo2.getClass();
                kotlin.jvm.internal.s.h(windowInsets, "windowInsets");
                oo2.f25442a.a(windowInsets);
                oo2.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f25147a.clear();
        B5.f24500a.getClass();
        if (!B5.w() || (view = (View) this.f25148b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
