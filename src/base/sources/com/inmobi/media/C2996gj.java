package com.inmobi.media;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.inmobi.media.gj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2996gj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3022hj f26627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebView f26630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2996gj(C3022hj c3022hj, long j10, String str, WebView webView, kl.f fVar) {
        super(2, fVar);
        this.f26627b = c3022hj;
        this.f26628c = j10;
        this.f26629d = str;
        this.f26630e = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2996gj(this.f26627b, this.f26628c, this.f26629d, this.f26630e, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2996gj) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        WebView webView;
        Object objF = ll.b.f();
        int i10 = this.f26626a;
        if (i10 == 0) {
            fl.s.b(obj);
            long j10 = this.f26627b.f26687a;
            this.f26626a = 1;
            if (em.y0.a(j10, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        boolean z11 = false;
        boolean z12 = this.f26628c == this.f26627b.f26691e;
        String str = this.f26629d;
        if (str == null) {
            z10 = false;
        } else {
            WebView webView2 = this.f26630e;
            if (kotlin.jvm.internal.s.c(str, webView2 != null ? webView2.getUrl() : null)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        int iOrdinal = this.f26627b.f26693g.ordinal();
        if (iOrdinal == 1 ? !this.f26627b.f26694h : iOrdinal == 3) {
            z11 = true;
        }
        if (z12 && z10 && !this.f26627b.f26692f && z11 && (webView = this.f26630e) != null && webView.isAttachedToWindow()) {
            this.f26627b.a("PAGE_COMMIT_VISIBLE", this.f26629d);
        }
        return fl.g0.f38750a;
    }
}
