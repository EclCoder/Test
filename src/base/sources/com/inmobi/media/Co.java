package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Co extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(Context context) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f24630a = true;
        super.destroy();
    }
}
