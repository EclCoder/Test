package androidx.activity;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final void a(View view, j0 onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.s.h(view, "<this>");
        kotlin.jvm.internal.s.h(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(k0.f593b, onBackPressedDispatcherOwner);
    }
}
