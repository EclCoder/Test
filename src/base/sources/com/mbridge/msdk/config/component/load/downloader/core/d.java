package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f28824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f28827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f28828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f28829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.f f28830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f28831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28832j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f28836n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f28838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f28839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f28840r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f28833k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f28837o = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28841a;

        a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f28841a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28830h != null) {
                    d.this.f28830h.a(this.f28841a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f28844b;

        b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f28843a = bVar;
            this.f28844b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28833k >= d.this.f28832j) {
                    d.this.b(4);
                    if (d.this.f28830h != null) {
                        d.this.f28830h.a(this.f28843a, this.f28844b);
                    }
                    d.this.a();
                    return;
                }
                d.this.b(7);
                d.this.f28833k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f28847b;

        c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f28846a = bVar;
            this.f28847b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28830h != null) {
                    d.this.f28830h.a(this.f28846a, this.f28847b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0376d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28849a;

        RunnableC0376d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f28849a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28830h != null) {
                    d.this.f28830h.c(this.f28849a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28851a;

        e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f28851a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28830h != null) {
                    d.this.f28830h.b(this.f28851a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f28853a;

        f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f28853a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f28827e != null && !d.this.f28827e.isEmpty()) {
                    String str = (String) d.this.f28827e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f28853a.a("responseHeaders", str);
                    }
                }
                if (d.this.f28830h != null) {
                    d.this.f28830h.d(this.f28853a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    d(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        this.f28829g = eVar.f28860f;
        this.f28825c = eVar.f28857c;
        this.f28831i = eVar.f28861g;
        this.f28823a = eVar.f28855a;
        this.f28838p = eVar.f28864j;
        this.f28824b = eVar.f28856b;
        this.f28840r = eVar.f28865k;
        this.f28830h = eVar.f28858d;
        this.f28832j = eVar.f28862h;
        this.f28836n = eVar.f28863i;
        this.f28827e = eVar.f28859e;
    }

    public long f() {
        return this.f28826d;
    }

    public long g() {
        return this.f28831i;
    }

    public int h() {
        return this.f28834l;
    }

    public int i() {
        return this.f28835m;
    }

    public long j() {
        return this.f28836n;
    }

    public long k() {
        return this.f28837o;
    }

    public long l() {
        return this.f28840r;
    }

    public void m() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public long b() {
        return this.f28823a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b c() {
        return this.f28824b;
    }

    public int d() {
        return this.f28825c;
    }

    public String e() {
        com.mbridge.msdk.config.component.load.downloader.b bVar = this.f28824b;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(int i10) {
        this.f28835m = i10;
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f28835m != 5) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f28839q, 0, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f28835m != 5) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0376d(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f28839q, 2, "", bVar.b(), bVar.a()));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f28835m = 5;
        Future future = this.f28828f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void b(long j10) {
        this.f28837o = j10;
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f28835m != 5) {
            b(1);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), System.currentTimeMillis(), System.currentTimeMillis(), k(), f(), bVar.d(), this.f28839q, 1, bVar.i(), bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void a(long j10) {
        this.f28826d = j10;
    }

    public void a(int i10) {
        this.f28834l = i10;
    }

    public void a(String str) {
        this.f28839q = str;
    }

    public void a(Future future) {
        this.f28828f = future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f28830h = null;
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f28835m != 5) {
            b(4);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
            q0.b("DownloadRequest", aVar.a().getMessage());
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), 0L, 0L, k(), f(), bVar.d(), this.f28839q, 4, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
        if (this.f28835m != 5) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }
}
