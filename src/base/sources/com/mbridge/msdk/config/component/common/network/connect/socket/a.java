package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f28665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f28666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f28667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f28668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f28669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f28670f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f28665a = aVar;
        this.f28666b = aVar2;
        this.f28667c = aVar3;
        this.f28670f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f28665a, this.f28666b, this.f28667c);
        this.f28669e = bVar;
        bVar.c(str);
        this.f28669e.a(this.f28668d);
        c.a().a(this.f28669e, this.f28670f);
        return this.f28666b;
    }

    public void a() {
        b bVar = this.f28669e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f28668d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f28666b.a(str);
        this.f28666b.c(i10);
        this.f28666b.a(i11);
        this.f28666b.b(0);
        return this.f28666b;
    }
}
