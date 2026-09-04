package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f28817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28819c;

    public a a() {
        return this.f28817a;
    }

    public boolean b() {
        return this.f28818b;
    }

    public boolean c() {
        return this.f28819c;
    }

    public void a(a aVar) {
        this.f28817a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f28819c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f28818b = z10;
    }
}
