package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.d;
import com.mbridge.msdk.config.component.load.downloader.e;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.model.a f28796l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f28792h = "LoadCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f28793i = "1000001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f28794j = "1000002";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final String f28795k = "1000003";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f28797m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f28798n = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void b(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void d(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c("file_path"), bVar.h());
            map.put(c.c("md5"), bVar.i());
            try {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.f28796l.f());
                if (bVarE != null && bVarE.b().contains("zip") && bVar.d() >= 100) {
                    if (TextUtils.isEmpty(bVarE.d())) {
                        map.put(c.c("file_path"), bVarE.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.f(bVar.h(), com.mbridge.msdk.config.component.common.file.a.d(LoadCpt.this.f28796l.f(), LoadCpt.this.f28796l.b()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put(c.c("file_path"), com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.f28796l.f(), LoadCpt.this.f28796l.b()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", (Map<String, Object>) map));
                if (bVar.j()) {
                    return;
                }
                LoadCpt.this.a("912006", (HashMap<String, Object>) null);
            } catch (Exception e10) {
                LoadCpt.this.a("912005", "1000002", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c("code"), "1000002");
            map.put(c.c("reason"), aVar.a().getMessage());
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.j()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f28797m) {
                return;
            }
            loadCpt.f28797m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(currentDownloadRate));
            map.put(c.c("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void c(b bVar) {
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b bVarB = com.mbridge.msdk.config.component.common.file.a.b(this.f28796l.f(), this.f28796l.b());
            if (bVarB == null) {
                return;
            }
            try {
                new URL(this.f28796l.f());
                int iD = (int) (this.f28796l.d() * 100.0f);
                com.mbridge.msdk.config.component.load.model.a aVar = this.f28796l;
                b bVar = new b(aVar, aVar.f(), this.f28796l.b(), bVarB.a(), iD);
                bVar.a(this.f28796l.a());
                e.a().a(bVar).b(this.f28796l.h()).a(this.f28796l.h()).c(this.f28796l.h()).a(2).withHttpRetryCounter(this.f28796l.g()).a(this.f28798n).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).build().m();
            } catch (Exception e10) {
                q0.b("LoadCpt", e10.getMessage());
                a("912005", "1000002", "Illegal Uri");
            }
        } catch (Throwable th2) {
            q0.b("LoadCpt", th2.getMessage());
            HashMap map = new HashMap();
            map.put(c.c("code"), "");
            map.put(c.c("reason"), th2.getMessage());
            a(a("912005", (Map<String, Object>) map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f28523f = "912001";
        this.f28796l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.f28796l.c())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.f28796l.c().equals(c.c("310"))) {
            j();
        }
        if (this.f28796l.c().equals(c.c("311"))) {
            i();
        }
        a("912007", (HashMap<String, Object>) null);
    }

    public void h() {
        try {
            if (e.a().b()) {
                return;
            }
            e.a().a(new d.b().a(this.f28796l.e()).a());
        } catch (Throwable th2) {
            q0.b("LoadCpt", th2.getMessage());
        }
    }

    public void i() {
        if (this.f28796l != null) {
            String strB = e.a().b(this.f28796l.f());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            e.a().a(strB);
        }
    }

    public void j() {
        if (this.f28796l != null) {
            g();
        }
    }
}
