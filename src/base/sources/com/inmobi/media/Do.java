package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Do;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Re f24674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3109l3 f24675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tl.a f24677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Co f24678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f24679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f24680g;

    public Do(Re mNetworkRequest, C3109l3 mWebViewClient, long j10, tl.a aVar) {
        kotlin.jvm.internal.s.h(mNetworkRequest, "mNetworkRequest");
        kotlin.jvm.internal.s.h(mWebViewClient, "mWebViewClient");
        this.f24674a = mNetworkRequest;
        this.f24675b = mWebViewClient;
        this.f24676c = j10;
        this.f24677d = aVar;
        this.f24679f = new Handler(Looper.getMainLooper());
    }

    public static final void a(Do r10) {
        kotlin.jvm.internal.s.g("Do", "TAG");
        String str = r10.f24674a.f25640a;
        r10.a();
        tl.a aVar = r10.f24677d;
        if (aVar != null) {
            aVar.invoke();
        }
        r10.f24677d = null;
    }

    public final void b() {
        try {
            Context context = Xi.f26021a;
            if (context != null) {
                Co co2 = new Co(context);
                co2.setWebViewClient(this.f24675b);
                co2.getSettings().setJavaScriptEnabled(true);
                co2.getSettings().setCacheMode(2);
                this.f24678e = co2;
            }
            Co co3 = this.f24678e;
            if (co3 != null) {
                Re re2 = this.f24674a;
                String strA = AbstractC2837af.a(re2.f25640a, re2.f25643d);
                Map<String, String> mapH = this.f24674a.f25641b;
                if (mapH == null) {
                    mapH = gl.l0.h();
                }
                co3.loadUrl(strA, mapH);
            }
            if (this.f24676c > 0) {
                Runnable runnable = new Runnable() { // from class: yh.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Do.a(this.f57679a);
                    }
                };
                this.f24679f.postDelayed(runnable, this.f24676c);
                this.f24680g = runnable;
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Do", "TAG");
            e10.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.f24680g;
        if (runnable != null) {
            this.f24679f.removeCallbacks(runnable);
        }
        this.f24680g = null;
        try {
            fl.r.a aVar = fl.r.f38769b;
            Co co2 = this.f24678e;
            if (co2 != null && !co2.f24630a) {
                co2.stopLoading();
                co2.removeAllViews();
                co2.destroy();
            }
            fl.r.b(fl.g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            fl.r.b(fl.s.a(th2));
        }
        this.f24678e = null;
    }
}
