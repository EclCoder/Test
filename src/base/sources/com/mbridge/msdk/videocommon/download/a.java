package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.mbridge.msdk.setting.l H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private com.mbridge.msdk.setting.l J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35084c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f35088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f35089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f35090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f35092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f35093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35095n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f35097p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f35099r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f35102u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f35104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DownloadRequest f35105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35107z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35082a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35085d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f35086e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> f35087f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f35096o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35098q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35100s = 100;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35101t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35103v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new b();
    private OnProgressStateListener S = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0482a implements Runnable {
        RunnableC0482a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f35102u == null) {
                a.this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            try {
                try {
                    a.this.f35102u.a(a.this.f35094m);
                    if (!s0.a().a("r_d_v_b_l", true)) {
                        File file = new File(a.this.f35097p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                    a.this.f35086e = 0;
                } finally {
                    a.this.f35086e = 0;
                }
            } catch (Throwable unused) {
                q0.b("CampaignDownLoadTask", "del DB or file failed");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements OnProgressStateListener {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f35105x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
                a aVar = a.this;
                aVar.a(aVar.f35090i, eVar);
                a.this.f35096o = downloadProgress.getCurrent();
                a.this.f35093l = downloadProgress.getTotal();
                a.this.f35106y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f35100s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f35100s) {
                    q0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f35100s + " " + a.this.f35084c);
                    if (a.this.f35085d) {
                        return;
                    }
                    a.this.f35085d = true;
                    if (!a.this.f35107z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f35105x == null || a.this.C != 2 || a.this.f35107z) {
                        return;
                    }
                    a.this.f35105x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f35083b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            this.G = gVarD.H0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f30499u;
        this.E = com.mbridge.msdk.foundation.same.a.f30500v;
        this.F = com.mbridge.msdk.foundation.same.a.f30498t;
        this.f35099r = System.currentTimeMillis();
        this.f35092k = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f35090i = campaignEx;
        this.f35091j = str;
        this.f35083b = i10;
        if (campaignEx != null) {
            this.f35094m = campaignEx.getVideoUrlEncode();
        }
        this.f35104w = o0.d(this.f35094m);
        this.f35095n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f35097p = this.f35095n + this.f35104w;
        q0.c("CampaignDownLoadTask", this.f35090i.getAppName() + " videoLocalPath:" + this.f35097p + " videoUrl: " + this.f35090i.getVideoUrlEncode() + " " + this.f35100s);
        q();
    }

    private void q() {
        File file;
        File file2;
        try {
            if (TextUtils.isEmpty(this.f35094m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f35095n)) {
                file = null;
            } else {
                file = new File(this.f35095n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            z();
            a(this.f35094m);
        } catch (Exception e10) {
            q0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            v0.a(this.f35091j, this.f35090i, com.mbridge.msdk.foundation.same.a.f30502x);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void z() {
        if (this.f35102u == null) {
            this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.foundation.entity.m mVarB = this.f35102u.b(this.f35094m, "");
        if (mVarB != null) {
            this.f35096o = mVarB.c();
            if (this.f35086e != 2) {
                this.f35086e = mVarB.b();
            }
            if (this.f35086e == 1) {
                this.f35086e = 2;
            }
            this.f35093l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f35099r = mVarB.a();
            }
            if (this.f35086e == 5) {
                if (Objects.exists(new File(this.f35095n + this.f35104w), this.f35095n, this.f35104w)) {
                    this.f35097p = this.f35095n + this.f35104w;
                } else {
                    d();
                }
            } else if (this.f35086e != 0) {
                this.f35097p = this.f35095n + this.f35104w;
            }
        } else {
            this.f35102u.a(this.f35094m, this.f35099r);
        }
        try {
            long j10 = this.f35093l;
            if (j10 <= 0 || this.f35096o * 100 < j10 * ((long) c(this.f35090i))) {
                return;
            }
            if (c(this.f35090i) != 100 && this.f35086e != 5) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f35090i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void A() {
        if (this.Q) {
            return;
        }
        try {
            this.f35107z = true;
            if (this.C == 1) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
                return;
            }
            if (this.f35083b == 3) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f35083b);
                return;
            }
            q0.b("CampaignDownLoadTask", "resume()");
            this.O = false;
            this.P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f35094m, this.f35104w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(a(this.f35090i));
            DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, MBridgeConstans.API_REUQEST_CATEGORY_APP);
            this.f35105x = downloadRequestA;
            downloadRequestA.start();
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void B() {
        q0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f35094m)) {
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f35100s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f35105x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f35088g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35089h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void C() {
        q0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f35094m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f35088g;
                if (aVar != null) {
                    aVar.a(this.f35094m);
                    return;
                }
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f35083b == 3) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35088g;
                if (aVar2 != null) {
                    aVar2.a(this.f35094m);
                    return;
                }
                return;
            }
            if (this.f35100s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f35088g;
                if (aVar3 != null) {
                    aVar3.a(this.f35094m);
                    return;
                }
                return;
            }
            try {
                if (this.f35086e == 5 && Utils.getDownloadRate(this.f35093l, this.f35096o) >= this.f35100s) {
                    if (Objects.exists(new File(this.f35095n + this.f35104w), this.f35095n, this.f35104w)) {
                        this.f35097p = this.f35095n + this.f35104w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f35088g;
                        if (aVar4 != null) {
                            aVar4.a(this.f35094m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: " + e10.getMessage());
            }
            DownloadRequest downloadRequest = this.f35105x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f35088g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public int o() {
        return this.f35086e;
    }

    public String p() {
        return this.f35097p;
    }

    public boolean s() {
        return this.K;
    }

    public boolean t() {
        return this.f35103v;
    }

    public boolean u() {
        return this.L;
    }

    public boolean v() {
        return this.Q;
    }

    public boolean w() {
        return this.N;
    }

    public boolean x() {
        return this.M;
    }

    public void y() {
        if (this.f35087f != null) {
            this.f35087f = null;
        }
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public void d(boolean z10) {
        this.f35098q = z10;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public void g() {
        try {
            d();
            CampaignEx campaignEx = this.f35090i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f35090i);
                }
            }
        } catch (Exception unused) {
            q0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f35086e = 0;
        }
    }

    public CampaignEx h() {
        return this.f35090i;
    }

    public String i() {
        return this.f35094m;
    }

    public long j() {
        return this.f35093l;
    }

    public String k() {
        String message = "";
        if (this.f35083b == 3) {
            return "";
        }
        String str = this.f35095n + this.f35104w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f35095n, this.f35104w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f35097p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage());
            message = th2.getMessage();
        }
        if (this.f35086e == 5 && !TextUtils.isEmpty(message)) {
            d();
        }
        return message;
    }

    public String l() {
        if (this.Q) {
            try {
                File file = new File(this.f35097p);
                return (file.exists() && file.isFile()) ? this.f35097p : this.f35094m;
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f35094m;
            }
        }
        try {
            File file2 = new File(this.f35097p);
            if (Objects.exists(file2, this.f35095n, this.f35104w) && file2.isFile()) {
                return this.f35097p;
            }
        } catch (Exception e11) {
            q0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f35094m;
    }

    public long m() {
        return this.f35096o;
    }

    public long n() {
        return this.f35099r;
    }

    public void c(int i10) {
        this.f35083b = i10;
    }

    public void d(int i10) {
        q0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f35100s = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f35090i = campaignEx;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            q0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            q0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public void b(int i10) {
        this.f35084c = i10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35091j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35091j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35091j, false);
            }
            return this.I.w();
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    public void b(boolean z10) {
        this.f35103v = z10;
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f35088g;
        if (aVar != null) {
            aVar.a(str, this.f35094m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35089h;
        if (aVar2 != null) {
            aVar2.a(str, this.f35094m);
        }
        q0.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f35086e == 4 || this.f35086e == 2 || this.f35086e == 5) {
            return;
        }
        this.f35086e = 4;
        CampaignEx campaignEx = this.f35090i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f35090i.getRsIgnoreCheckRule().size() > 0 && this.f35090i.getRsIgnoreCheckRule().contains(0)) {
            q0.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f35096o, this.f35086e);
        }
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void a(int i10, int i11) {
        this.f35086e = i10;
        if (this.f35102u == null) {
            this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        this.f35102u.a(this.f35094m, i11, i10, this.f35093l);
    }

    public void c(String str) {
        r();
        a(2, str, "");
        this.f35086e = 4;
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f35089h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f35086e == 1) {
            q0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f35086e == 5 && Utils.getDownloadRate(this.f35093l, this.f35096o) >= this.f35100s) {
            q0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f35088g;
            if (aVar != null) {
                aVar.a(this.f35094m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35089h;
            if (aVar2 != null) {
                aVar2.a(this.f35094m);
            }
            try {
                File file = new File(this.f35097p);
                if (Objects.exists(file, this.f35095n, this.f35104w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f35090i, eVar);
            return;
        }
        if (this.f35083b == 3) {
            q0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f35090i, eVar2);
            return;
        }
        try {
            iC = c(this.f35090i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f35088g;
            if (aVar3 != null) {
                aVar3.a(this.f35094m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f35089h;
            if (aVar4 != null) {
                aVar4.a(this.f35094m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f35090i, str, this.f35104w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f35090i));
        downloadMessage.addExtra("resource_type", 4);
        this.f35105x = a(downloadMessage, this.R, this.S, "1");
    }

    private void d() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0482a());
    }

    private int b(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.J;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("CampaignDownLoadTask", e10.getMessage());
            return 100;
        }
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f35089h = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements OnDownloadStateListener {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                q0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f35096o + "    " + a.this.f35093l);
                if (a.this.f35102u == null) {
                    a.this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                }
                a.this.f35102u.a(a.this.f35094m, a.this.f35096o, 5, a.this.f35093l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        q0.b("CampaignDownLoadTask", th2.getMessage());
                        str = "";
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f35096o, true, str);
                a.this.a(1, true, "");
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f35105x == null || a.this.f35105x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f35105x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
            a aVar = a.this;
            aVar.a(aVar.f35090i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.r();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f35107z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f35086e = 1;
            if (a.this.f35102u == null) {
                a.this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            a.this.f35102u.a(a.this.f35090i, a.this.f35093l, a.this.f35097p, a.this.f35086e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f35095n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f35100s)).with("scenes", str).build();
    }

    public void a(long j10, boolean z10, String str) {
        q0.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f35096o + "  progressSize " + j10 + "  " + this.f35106y + "%   FileSize : " + this.f35093l + "  " + this.f35090i.getAppName());
        if (this.f35100s == 100 && this.f35083b != 3 && j10 != this.f35093l && !z10) {
            File file = new File(this.f35097p);
            q0.b("CampaignDownLoadTask", "progressSize = " + j10 + " fileSize = " + this.f35093l + " " + z10 + " absFileSize = " + (Objects.exists(file, this.f35095n, this.f35104w) ? file.length() : 0L));
            b("File size is not match witch download size.");
            return;
        }
        this.f35086e = 5;
        if (j10 == this.f35093l) {
            a(1, "", str);
        }
        this.f35082a = false;
        a(j10, this.f35086e);
    }

    public void a(com.mbridge.msdk.videocommon.download.c cVar) {
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f35087f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f35088g = aVar;
    }

    private void a(long j10, int i10) {
        long j11;
        this.f35096o = j10;
        int i11 = this.f35100s;
        if (100 * j10 >= ((long) i11) * this.f35093l && !this.f35101t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f35086e = 5;
                return;
            }
            this.f35101t = true;
            q0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f35088g;
                if (aVar != null) {
                    aVar.a(this.f35094m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35089h;
                if (aVar2 != null) {
                    aVar2.a(this.f35094m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f35088g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + strK, this.f35094m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f35089h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + strK, this.f35094m);
                }
            }
        }
        if (this.f35082a || j10 <= 0) {
            j11 = j10;
        } else {
            this.f35082a = true;
            if (this.f35102u == null) {
                this.f35102u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            j11 = j10;
            this.f35102u.a(this.f35094m, j11, this.f35086e, this.f35093l);
        }
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f35087f;
        if (copyOnWriteArrayList != null) {
            for (com.mbridge.msdk.videocommon.download.c cVar : copyOnWriteArrayList) {
                if (cVar != null) {
                    cVar.onProgress(j11, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f35092k, this.f35090i, i10, Long.toString(this.f35099r != 0 ? System.currentTimeMillis() - this.f35099r : 0L), this.f35093l, this.A);
        nVar.b(this.f35090i.getId());
        nVar.v(this.f35090i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f35090i.getRequestId());
        nVar.k(this.f35090i.getCurrentLocalRid());
        nVar.o(this.f35090i.getRequestIdNotice());
        nVar.u(this.f35091j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f35100s));
        nVar.b("url", this.f35090i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f35105x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f35105x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(nVar);
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f35105x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f35094m);
                eVar.a("resumed_breakpoint", this.f35105x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.f35093l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f35100s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f35090i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f35105x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f35105x.get("resumed_breakpoint", MBridgeConstans.API_REUQEST_CATEGORY_APP));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }
}
