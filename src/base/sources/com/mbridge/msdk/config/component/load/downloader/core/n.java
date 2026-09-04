package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f28893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f28894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f28895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f28896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f28897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f28898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f28899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f28900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f28901i;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f28894b = dVar;
        this.f28896d = bVar;
        this.f28893a = cVar;
        this.f28895c = bVar2;
    }

    private boolean a(int i10) {
        return i10 == 206;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01c1  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        String str = jyeoXJ.memueurPmOm;
        this.f28897e = new com.mbridge.msdk.config.component.load.downloader.c();
        if (this.f28894b.i() == 5) {
            this.f28897e.a(true);
            return this.f28897e;
        }
        long jK = this.f28894b.k();
        long jF = this.f28894b.f();
        String strH = this.f28895c.h();
        if (jF != 0 && jK == jF) {
            if (TextUtils.isEmpty(strH)) {
                this.f28897e.b(false);
            } else if (new File(this.f28895c.h()).exists()) {
                this.f28897e.b(true);
                return this.f28897e;
            }
        }
        String strF = this.f28895c.f();
        long j10 = this.f28894b.j();
        long jB = this.f28894b.b();
        long jG = this.f28894b.g();
        long jL = this.f28894b.l();
        String str2 = String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(jF));
        try {
            v.b bVarS = l.c().d().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            com.mbridge.msdk.thrid.okhttp.d dVarA = bVarS.b(jB, timeUnit).a(new MBridgeHostnameVerifier(strF)).d(jG, timeUnit).e(jL, timeUnit).a(Math.max(0L, j10), timeUnit).b(true).a().a(new y.a().b(strF).a(new com.mbridge.msdk.thrid.okhttp.c.a().b().a()).a("Connection", "close").a(Command.HTTP_HEADER_RANGE, str2).a(str).a(str, Command.DEFAULT_USER_AGENT).a());
            try {
                try {
                    a0 a0VarD = dVarA.d();
                    if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD) && !com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD.d())) {
                        int iK = a0VarD.k();
                        if (a0VarD.n()) {
                            this.f28897e = a(strH, strF, a0VarD, iK);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28898f);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28899g);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28900h);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            return this.f28897e;
                        }
                        this.f28897e.a(new IOException("responseCode " + iK));
                        com.mbridge.msdk.config.component.load.downloader.c cVar = this.f28897e;
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28898f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28899g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28900h);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        return cVar;
                    }
                    this.f28897e.a(new IOException("response is null"));
                    com.mbridge.msdk.config.component.load.downloader.c cVar2 = this.f28897e;
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28898f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28899g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28900h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                    return cVar2;
                } catch (Exception e10) {
                    a(e10);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28898f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28899g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28900h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                }
            } catch (Throwable th2) {
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28898f);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28899g);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28900h);
                if (!dVarA.h()) {
                    dVarA.cancel();
                }
                throw th2;
            }
        } catch (Exception e11) {
            a(e11);
            this.f28897e.b(false);
            return this.f28897e;
        }
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2, a0 a0Var, int i10) {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        if (!a(i10)) {
            this.f28894b.a(0L);
            this.f28894b.b(0L);
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = this.f28896d;
            if (bVar != null) {
                bVar.a(0);
                this.f28896d.c(0L);
                this.f28896d.b(0L);
            }
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f28895c.h()));
        }
        b0 b0VarD = a0Var.d();
        this.f28900h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            cVar.a(new IOException("response body is null"));
            this.f28894b.b(0L);
            this.f28894b.a(0L);
            return cVar;
        }
        long jK = this.f28900h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f28901i = strA;
        this.f28894b.a(strA);
        if (jK <= 0) {
            cVar.a(new IOException("response content length is null"));
            return cVar;
        }
        if (this.f28894b.k() == 0) {
            this.f28894b.b(jK);
        }
        InputStream inputStreamD = this.f28900h.d();
        this.f28898f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            cVar.a(new IOException("response inputStream is null"));
            return cVar;
        }
        this.f28895c.a(this.f28894b.k());
        this.f28894b.c(this.f28895c);
        return a(str, str2);
    }

    private void a(Exception exc) {
        this.f28897e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2) throws IOException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        this.f28895c.b(System.currentTimeMillis());
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.f28899g = aVarB;
        aVarB.seek(this.f28894b.f());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f28898f.read(bArr);
            if (i10 == -1) {
                break;
            }
            this.f28899g.write(bArr, 0, i10);
            d dVar = this.f28894b;
            dVar.a(dVar.f() + ((long) i10));
            this.f28899g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f28894b.k(), this.f28894b.f());
            this.f28895c.a(iA);
            a(this.f28894b, this.f28895c, this.f28894b.f(), this.f28894b.k(), iA);
            if (this.f28895c.e() != 100 && iA >= this.f28895c.e()) {
                break;
            }
            if (this.f28894b.i() == 5) {
                cVar.a(true);
                break;
            }
        }
        try {
            if (this.f28894b.i() != 5 && this.f28894b.k() == this.f28894b.f()) {
                this.f28895c.b(com.mbridge.msdk.config.component.common.file.a.c(this.f28895c.h()));
            }
        } catch (Throwable th2) {
            q0.b(IDownloadTask.TAG, th2.getMessage(), th2);
        }
        if (!cVar.b()) {
            cVar.b(true);
        }
        return cVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.i() != 5) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}
