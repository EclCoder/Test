package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f28878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f28879d;

    h(d dVar) {
        this.f28878c = dVar;
        this.f28876a = dVar.d();
        this.f28877b = dVar.h();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "Start download task.");
        this.f28879d = this.f28878c.c();
        if (this.f28878c.i() != 7) {
            this.f28878c.d(this.f28879d);
        }
        this.f28878c.b(0);
        com.mbridge.msdk.config.component.load.downloader.c cVarRun = g.a(this.f28878c, this.f28879d, l.c().b()).run();
        if (cVarRun.c()) {
            this.f28878c.e(this.f28879d);
        } else if (cVarRun.a() != null) {
            this.f28878c.a(this.f28879d, cVarRun.a());
        } else if (cVarRun.b()) {
            this.f28878c.b(this.f28879d);
        }
    }
}
