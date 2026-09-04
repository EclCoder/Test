package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f34699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f34700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f34701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34702w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34703a;

        a(Object obj) {
            this.f34703a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f34703a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f34698s = false;
        this.f34699t = 0;
        this.f34702w = -1;
        if (this.f34668a) {
            this.f34700u = campaignEx.getAdvImpList();
        }
        this.f34699t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:18:0x0024, B:21:0x002f, B:23:0x003e, B:25:0x0049, B:24:0x0046, B:26:0x005a, B:82:0x0167, B:27:0x0062, B:29:0x0075, B:31:0x0079, B:33:0x007f, B:35:0x0084, B:37:0x0088, B:40:0x0099, B:42:0x009d, B:43:0x00a1, B:45:0x00bd, B:46:0x00c6, B:48:0x00ca, B:53:0x00d2, B:54:0x00d6, B:55:0x00ee, B:58:0x00f4, B:60:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0117, B:68:0x011b, B:69:0x012b, B:71:0x012f, B:72:0x0139, B:74:0x0143, B:76:0x0147, B:77:0x014d, B:79:0x0151, B:81:0x0155), top: B:86:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0151 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:18:0x0024, B:21:0x002f, B:23:0x003e, B:25:0x0049, B:24:0x0046, B:26:0x005a, B:82:0x0167, B:27:0x0062, B:29:0x0075, B:31:0x0079, B:33:0x007f, B:35:0x0084, B:37:0x0088, B:40:0x0099, B:42:0x009d, B:43:0x00a1, B:45:0x00bd, B:46:0x00c6, B:48:0x00ca, B:53:0x00d2, B:54:0x00d6, B:55:0x00ee, B:58:0x00f4, B:60:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0117, B:68:0x011b, B:69:0x012b, B:71:0x012f, B:72:0x0139, B:74:0x0143, B:76:0x0147, B:77:0x014d, B:79:0x0151, B:81:0x0155), top: B:86:0x0004 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        int i11;
        CampaignEx campaignEx;
        try {
            if (i10 != 2) {
                int videoLength = 0;
                if (i10 != 20) {
                    if (i10 != 130) {
                        if (i10 == 6) {
                            if (this.f34668a && !this.f34695p) {
                                this.f34695p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
                            }
                        } else if (i10 != 7) {
                            if (i10 == 15) {
                                j();
                                h();
                                i();
                                if (s0.a().a("i_l_s_t_r_i", false) && !this.f34696q) {
                                    this.f34696q = true;
                                    MBridgeVideoView.u uVar = this.f34701v;
                                    if (uVar != null) {
                                        uVar.a();
                                    }
                                }
                                if (obj == null || !(obj instanceof MBridgeVideoView.v)) {
                                    i11 = 0;
                                } else {
                                    int i12 = ((MBridgeVideoView.v) obj).f34636a;
                                    videoLength = ((MBridgeVideoView.v) obj).f34637b;
                                    i11 = i12;
                                }
                                if (videoLength == 0 && (campaignEx = this.f34669b) != null) {
                                    videoLength = campaignEx.getVideoLength();
                                }
                                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b, i11, videoLength, this.f34677j);
                                com.mbridge.msdk.video.module.report.b.a(this.f34669b, this.f34700u, this.f34674g, i11);
                                if (!this.f34697r) {
                                    this.f34697r = true;
                                    com.mbridge.msdk.video.module.report.b.a(this.f34669b, this.f34674g);
                                }
                                if (!this.f34698s) {
                                    int i13 = this.f34699t;
                                    if (i13 != 0) {
                                        videoLength = i13;
                                    }
                                    if (i11 >= videoLength) {
                                        this.f34698s = true;
                                        i10 = 17;
                                    }
                                }
                                q0.b("NotifyListener", "onPlayProgress:" + i11);
                                this.f34702w = i11;
                            } else if (i10 != 16) {
                                switch (i10) {
                                    case 11:
                                        a();
                                        l();
                                        break;
                                    case 12:
                                        a aVar = new a(obj);
                                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
                                        } else {
                                            aVar.run();
                                        }
                                        l();
                                        c();
                                        b();
                                        e();
                                        a();
                                        break;
                                    case 13:
                                        c();
                                        b();
                                        break;
                                }
                            } else if (this.f34668a) {
                                this.f34695p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
                            }
                        } else if (this.f34668a && obj != null && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == 2) {
                                if (!this.f34694o) {
                                    this.f34694o = true;
                                    com.mbridge.msdk.video.module.report.b.e(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
                                }
                            } else if (iIntValue == 1 && !this.f34693n) {
                                this.f34693n = true;
                                com.mbridge.msdk.video.module.report.b.f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f34699t = ((Integer) obj).intValue();
                    }
                } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                    this.f34701v = (MBridgeVideoView.u) obj;
                }
            } else if (this.f34668a) {
                this.f34695p = true;
                l();
                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34669b);
            }
            this.f34676i.a(i10, obj);
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }
}
