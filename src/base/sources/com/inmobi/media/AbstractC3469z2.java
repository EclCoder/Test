package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import com.inmobi.media.AbstractC3469z2;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3469z2 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl.k f27969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3469z2(Context context) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        this.f27969a = fl.l.b(new tl.a() { // from class: yh.id
            @Override // tl.a
            public final Object invoke() {
                return AbstractC3469z2.a(this.f57782a);
            }
        });
    }

    public static final C2885cb a(AbstractC3469z2 abstractC3469z2) {
        return abstractC3469z2.d();
    }

    public abstract C2885cb d();

    public final C2885cb getLandingPageHandler() {
        return (C2885cb) this.f27969a.getValue();
    }
}
