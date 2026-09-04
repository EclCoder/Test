package com.mbridge.msdk.config.component.load.downloader.core;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f28882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f28884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f28885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f28886e;

    private k(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f28885d = dVar;
        this.f28884c = bVar;
        this.f28882a = cVar;
        this.f28883b = str;
        this.f28886e = bVar2;
    }

    static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f28884c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        File file = new File(this.f28886e.h());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f28885d.a(0L);
            cVar.b(false);
            return cVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        long jK = this.f28884c.k();
        if (jK > 0 && jC != jK) {
            a(cVar, file);
            return cVar;
        }
        this.f28885d.b(jK);
        this.f28885d.a(jK != 0 ? jC : this.f28884c.g());
        cVar.b(a(jC));
        return cVar;
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.c cVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f28885d.b(this.f28884c.k());
        this.f28885d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f28884c.f(), file.getAbsolutePath(), this.f28884c.d(), this.f28884c.n(), jLastModified, this.f28884c.k(), this.f28884c.g(), this.f28884c.e(), this.f28884c.c(), this.f28884c.j(), this.f28884c.h(), this.f28884c.b(), this.f28884c.a()), this.f28886e.h());
        cVar.b(a(length));
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f28884c.k(), j10) >= this.f28886e.e();
    }
}
