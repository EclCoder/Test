package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f35145c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f35147e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f35150h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f35153k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35155m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f35158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35159q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f35143a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35144b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35146d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f35148f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f35149g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f35151i = 3600;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35154l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.mbridge.msdk.setting.l f35156n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    com.mbridge.msdk.setting.l f35157o = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c {
        a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f35144b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f35144b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f35155m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f35159q = zB;
            if (zB) {
                this.f35152j = str;
                this.f35155m = i10;
                this.f35158p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f35158p = null;
            this.f35159q = false;
        }
        this.f35150h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f35143a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f35152j = str;
        this.f35155m = i10;
        a(this.f35143a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f35159q || (kVar = this.f35158p) == null) ? this.f35149g : kVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    public void d() {
        int iG;
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.j();
            return;
        }
        b();
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f35149g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.f35149g)) {
                        this.f35144b = true;
                    }
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f35149g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && !value.t()) {
                                    if (this.f35155m == 95) {
                                        this.f35144b = true;
                                    }
                                    int iO = value.o();
                                    CampaignEx campaignExH = value.h();
                                    if (campaignExH != null && iO == 0) {
                                        iO = com.mbridge.msdk.videocommon.download.b.getInstance().b(campaignExH.getId(), campaignExH.getVideoUrlEncode());
                                    }
                                    int i10 = iO;
                                    value.a(new b(campaignExH));
                                    int iB = b(campaignExH);
                                    if (this.f35155m == 1) {
                                        if (this.f35156n == null) {
                                            this.f35156n = com.mbridge.msdk.setting.l.i(this.f35152j);
                                        }
                                        iB = a(campaignExH);
                                    }
                                    int i11 = iB;
                                    value.d(i11);
                                    int i12 = this.f35155m;
                                    if (i12 == 94 || i12 == 287 || i12 == 95) {
                                        if (this.f35153k == null) {
                                            this.f35153k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j, this.f35155m == 287);
                                        }
                                        com.mbridge.msdk.videocommon.setting.c cVar = this.f35153k;
                                        iG = cVar != null ? cVar.g() : 0;
                                    } else {
                                        if (i12 != 298) {
                                            iG = 0;
                                        } else {
                                            if (this.f35157o == null) {
                                                this.f35157o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                                            }
                                            com.mbridge.msdk.setting.l lVar = this.f35157o;
                                            if (lVar != null) {
                                                iG = lVar.i();
                                            } else {
                                                iG = 0;
                                            }
                                        }
                                        if (this.f35155m == 1) {
                                            if (this.f35156n == null) {
                                                this.f35156n = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                                            }
                                            com.mbridge.msdk.setting.l lVar2 = this.f35156n;
                                            if (lVar2 != null) {
                                                iG = lVar2.i();
                                            }
                                        }
                                    }
                                    value.b(iG);
                                    int videoCtnType = campaignExH != null ? campaignExH.getVideoCtnType() : 1;
                                    value.e(videoCtnType);
                                    q0.b("UnitCacheCtroller", "ready_rate : " + i11 + " cd_rate : " + iG + " videoCtnType : " + videoCtnType);
                                    if (a(value, b(campaignExH))) {
                                        String videoUrlEncode = campaignExH != null ? campaignExH.getVideoUrlEncode() : "";
                                        com.mbridge.msdk.videocommon.listener.a aVar = this.f35145c;
                                        if (aVar != null) {
                                            int i13 = this.f35155m;
                                            if (i13 == 297 || i13 == 298) {
                                                try {
                                                    aVar.a(videoUrlEncode);
                                                } catch (Exception e10) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("UnitCacheCtroller", e10.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                        ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f35147e;
                                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                            String requestId = campaignExH != null ? campaignExH.getRequestId() : "";
                                            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f35147e.get(requestId + "_" + campaignExH.getSecondRequestIndex());
                                            if (aVar2 != null) {
                                                try {
                                                    aVar2.a(videoUrlEncode);
                                                } catch (Exception e11) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("UnitCacheCtroller", e11.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i10 != 1 && (i10 != 5 || !a(value, i11))) {
                                        if (i10 == 4) {
                                            continue;
                                        } else {
                                            if (m0.s(this.f35150h) != 9 && this.f35154l == 2) {
                                                return;
                                            }
                                            if (i10 == 2 || this.f35144b) {
                                                value.a(this.f35148f);
                                                if (a(value, i11)) {
                                                    int i14 = this.f35155m;
                                                    if (i14 == 94 || i14 == 287) {
                                                        value.B();
                                                    }
                                                } else {
                                                    int i15 = this.f35155m;
                                                    if (i15 == 1 || i15 == 95 || i15 == 298) {
                                                        this.f35144b = false;
                                                    }
                                                    value.B();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void e() {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f35149g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f35149g) {
                            if (map != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.o() == 1) {
                                        value.c("playing and stop download");
                                        value.g();
                                        this.f35149g.remove(map);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th3.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f35143a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f35143a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f35143a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f35143a);
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f35157o == null) {
                    this.f35157o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                }
                return this.f35157o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f35153k == null) {
                this.f35153k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j, false);
            }
            return this.f35153k.w();
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.a(aVar);
        } else {
            this.f35145c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35161a;

        b(CampaignEx campaignEx) {
            this.f35161a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f35145c != null) {
                l.this.f35145c.a(str);
            }
            if (l.this.f35147e == null || l.this.f35147e.size() <= 0 || this.f35161a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f35147e.get(this.f35161a.getRequestId() + "_" + this.f35161a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f35147e.remove(this.f35161a.getRequestId() + "_" + this.f35161a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f35145c != null) {
                l.this.f35145c.a(str, str2);
            }
            CampaignEx campaignEx = this.f35161a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f35161a.getRsIgnoreCheckRule().size() <= 0 || !this.f35161a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.f35147e == null || l.this.f35147e.size() <= 0 || this.f35161a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f35147e.get(this.f35161a.getRequestId() + "_" + this.f35161a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.f35147e.remove(this.f35161a.getRequestId() + "_" + this.f35161a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            q0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f35147e == null) {
            this.f35147e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f35147e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f35149g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f35149g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f35149g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.n() > this.f35151i * 1000 && value.o() == 1) {
                                    value.c("download timeout");
                                    value.c(this.f35154l);
                                    value.g();
                                    this.f35149g.remove(map);
                                    i10--;
                                }
                                if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                    value.g();
                                    this.f35149g.remove(map);
                                    i10--;
                                }
                            }
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    private void a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        com.mbridge.msdk.videocommon.setting.a aVarC;
        com.mbridge.msdk.videocommon.setting.c cVar;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.f35146d = list.get(0).getCurrentLocalRid();
        }
        a();
        b();
        int i10 = this.f35155m;
        if (i10 == 1) {
            try {
                if (!TextUtils.isEmpty(this.f35152j)) {
                    com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                    this.f35156n = lVarE;
                    if (lVarE == null) {
                        this.f35156n = com.mbridge.msdk.setting.l.i(this.f35152j);
                    }
                    com.mbridge.msdk.setting.l lVar = this.f35156n;
                    if (lVar != null) {
                        this.f35151i = lVar.p();
                        this.f35154l = this.f35156n.q();
                    }
                }
            } catch (Exception unused) {
                q0.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        } else if (i10 == 287) {
            try {
                aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
                if (aVarC == null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a();
                }
                if (aVarC != null) {
                    this.f35151i = aVarC.c();
                }
                if (!TextUtils.isEmpty(this.f35152j)) {
                    this.f35153k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                }
                cVar = this.f35153k;
                if (cVar != null) {
                    this.f35154l = cVar.l();
                }
            } catch (Exception unused2) {
                q0.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else if (i10 == 298) {
            com.mbridge.msdk.setting.l lVarA = com.mbridge.msdk.setting.h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
            this.f35157o = lVarA;
            if (lVarA == null) {
                this.f35157o = com.mbridge.msdk.setting.h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
            }
            com.mbridge.msdk.setting.l lVar2 = this.f35157o;
            if (lVar2 != null) {
                this.f35151i = lVar2.p();
                this.f35154l = this.f35157o.q();
            }
        } else if (i10 == 94) {
            aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                this.f35151i = aVarC.c();
            }
            if (!TextUtils.isEmpty(this.f35152j)) {
                this.f35153k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
            }
            cVar = this.f35153k;
            if (cVar != null) {
                this.f35154l = cVar.l();
            }
        } else if (i10 == 95) {
            try {
                if (!TextUtils.isEmpty(this.f35152j)) {
                    com.mbridge.msdk.setting.l lVarE2 = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35152j);
                    if (lVarE2 == null) {
                        lVarE2 = com.mbridge.msdk.setting.l.j(this.f35152j);
                    }
                    if (lVarE2 != null) {
                        this.f35151i = lVarE2.p();
                        this.f35154l = lVarE2.q();
                    }
                }
            } catch (Exception unused3) {
                q0.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            CampaignEx campaignEx = list.get(i11);
            if (campaignEx != null) {
                int i12 = this.f35155m;
                String str = (i12 != 94 && i12 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.f35149g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (i13 < this.f35149g.size()) {
                                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f35149g.get(i13);
                                    if (map != null && map.containsKey(str)) {
                                        com.mbridge.msdk.videocommon.download.a aVar = map.get(str);
                                        if (aVar != null) {
                                            aVar.e(campaignEx);
                                            aVar.c(this.f35154l);
                                            aVar.b(false);
                                            map.remove(str);
                                            map.put(str, aVar);
                                            this.f35149g.set(i13, map);
                                        }
                                        e(campaignEx);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f35150h, campaignEx, this.f35152j, this.f35154l);
                                    aVar2.c(this.f35154l);
                                    aVar2.a(this.f35155m);
                                    HashMap map2 = new HashMap();
                                    map2.put(str, aVar2);
                                    this.f35149g.add(map2);
                                    break;
                                }
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("UnitCacheCtroller", th2.getMessage());
                                }
                            }
                        }
                        try {
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f35143a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f35143a.clear();
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f35155m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f35159q = zB;
            if (zB) {
                this.f35152j = str;
                this.f35155m = i10;
                this.f35158p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f35158p = null;
            this.f35159q = false;
        }
        this.f35150h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f35143a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f35152j = str;
        this.f35155m = i10;
        a(this.f35143a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b7 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cf A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e6 A[Catch: all -> 0x020c, Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:135:0x0212  */
    /* JADX WARN: Code duplicated, block: B:140:0x021f A[Catch: all -> 0x020c, Exception -> 0x020f, TRY_LEAVE, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x022a A[Catch: all -> 0x020c, Exception -> 0x020f, TRY_ENTER, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:155:0x024d A[Catch: all -> 0x020c, Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0253 A[PHI: r2 r11 r12
      0x0253: PHI (r2v25 boolean) = (r2v26 boolean), (r2v32 boolean) binds: [B:76:0x013d, B:156:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r11v16 java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>) = 
      (r11v17 java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>)
      (r11v22 java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>)
     binds: [B:76:0x013d, B:156:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r12v6 int) = (r12v2 int), (r12v7 int) binds: [B:76:0x013d, B:156:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0258 A[Catch: all -> 0x020c, Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x025c A[Catch: all -> 0x020c, Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x027e A[Catch: all -> 0x020c, Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:153:0x0248, B:124:0x01dc, B:126:0x01e6, B:136:0x0213, B:138:0x0219, B:140:0x021f, B:144:0x022a, B:152:0x0240, B:155:0x024d, B:158:0x0258, B:160:0x025c, B:162:0x0266, B:164:0x026c, B:168:0x0274, B:171:0x027e, B:173:0x0288, B:175:0x028e, B:183:0x02b9), top: B:193:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01fe A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x023e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0171 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183 A[Catch: all -> 0x0033, Exception -> 0x00e4, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x0019, B:15:0x0025, B:17:0x0031, B:32:0x0079, B:33:0x007e, B:35:0x0086, B:36:0x0096, B:38:0x009c, B:40:0x00aa, B:45:0x00ba, B:46:0x00c4, B:48:0x00ca, B:57:0x00f0, B:60:0x00f8, B:63:0x00ff, B:65:0x010f, B:66:0x0117, B:94:0x0171, B:96:0x0183, B:98:0x018d, B:102:0x0194, B:104:0x019a, B:106:0x01a7, B:108:0x01af, B:110:0x01b1, B:112:0x01b7, B:114:0x01bd, B:116:0x01bf, B:119:0x01c2, B:121:0x01cf, B:70:0x0125, B:72:0x012b, B:74:0x0135, B:77:0x0141, B:79:0x0147, B:81:0x014d, B:82:0x0151, B:84:0x0157, B:86:0x015d, B:88:0x015f, B:90:0x0169, B:92:0x016f, B:23:0x003d, B:25:0x0049, B:31:0x005f, B:29:0x0053), top: B:194:0x0019 }] */
    public com.mbridge.msdk.videocommon.download.a b(int i10, boolean z10) throws Throwable {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        com.mbridge.msdk.videocommon.download.a aVar;
        List<CampaignEx> listB;
        boolean z11;
        char c10;
        boolean zIsEmpty;
        int iO;
        int i11;
        long jN;
        int i12;
        k kVar;
        i10 = i10;
        z10 = z10;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            return kVar.i();
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList2 = this.f35149g;
        com.mbridge.msdk.videocommon.download.a aVar2 = null;
        if (copyOnWriteArrayList2 == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList2) {
            try {
                try {
                    try {
                        int i13 = this.f35155m;
                        char c11 = 287;
                        int i14 = 94;
                        boolean z12 = true;
                        try {
                            if (i13 != 94 && i13 != 287) {
                                listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.f35152j, 1);
                                if (listB == null) {
                                    return null;
                                }
                            } else {
                                listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f35152j, 1, z10);
                                if ((listB == null || listB.size() == 0) && (i10 == 94 || i10 == 287)) {
                                    listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.f35152j, 1, z10);
                                }
                                if (listB != null) {
                                    q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = " + listB.size());
                                } else {
                                    q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
                                    return null;
                                }
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i15 = 0;
                            while (i15 < this.f35149g.size()) {
                                Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f35149g.get(i15);
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value == null || value.h() == null) {
                                        aVar = aVar2;
                                        z11 = z12;
                                        c10 = c11;
                                        z12 = z11;
                                        c11 = c10;
                                        aVar2 = aVar;
                                        i14 = i14;
                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                    } else {
                                        aVar = aVar2;
                                        try {
                                            CampaignEx campaignExH = value.h();
                                            Iterator<CampaignEx> it2 = listB.iterator();
                                            boolean z13 = false;
                                            while (it2.hasNext()) {
                                                if (campaignExH.getId().equals(it2.next().getId())) {
                                                    z13 = true;
                                                }
                                            }
                                            if (z13 && ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign()))) {
                                                String str = campaignExH.getendcard_url();
                                                String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                                String strJ = "";
                                                if (campaignExH.getRewardTemplateMode() != null) {
                                                    strJ = campaignExH.getRewardTemplateMode().j();
                                                }
                                                String str2 = strJ;
                                                CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                                if (this.f35155m == i14 || i10 == 287) {
                                                    if (TextUtils.isEmpty(str2) || str2.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(this.f35155m, campaignExH, str2)) {
                                                        if (b(str, campaignExH)) {
                                                            if (value.t()) {
                                                                value.y();
                                                            } else {
                                                                if (a1.a(videoUrlEncode)) {
                                                                    if (a(rewardTemplateMode)) {
                                                                        return value;
                                                                    }
                                                                } else if (a(value, b(campaignExH)) && a(rewardTemplateMode)) {
                                                                    return value;
                                                                }
                                                                zIsEmpty = TextUtils.isEmpty(value.k());
                                                                iO = value.o();
                                                                if (this.f35155m != 298) {
                                                                }
                                                                if (iO == 5) {
                                                                    if (value.t()) {
                                                                        value.y();
                                                                        this.f35149g.remove(map);
                                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                    } else if (!zIsEmpty) {
                                                                        value.a(0, 0);
                                                                        if (this.f35155m == 95) {
                                                                            return value;
                                                                        }
                                                                    } else {
                                                                        if (!a(str, campaignExH)) {
                                                                        }
                                                                        return aVar;
                                                                    }
                                                                } else {
                                                                    if (!s0.a().a("u_n_c_e_d", true)) {
                                                                        jN = value.n();
                                                                        if (value.o() == 1) {
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                            if (jCurrentTimeMillis - jN > this.f35151i * 1000) {
                                                                                value.c("download timeout");
                                                                                value.g();
                                                                                this.f35149g.remove(map);
                                                                                i15--;
                                                                                i12 = this.f35155m;
                                                                                if (i12 != 1) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        }
                                                                        if (this.f35155m == 95) {
                                                                            if (value.t()) {
                                                                                value.y();
                                                                                this.f35149g.remove(map);
                                                                            } else {
                                                                                return value;
                                                                            }
                                                                        } else {
                                                                            if (!s0.a().a("u_n_c_e_d", true)) {
                                                                            }
                                                                            z11 = true;
                                                                            if (iO == 1) {
                                                                                if (value.t()) {
                                                                                    i14 = 94;
                                                                                    c10 = 287;
                                                                                } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                                    return value;
                                                                                }
                                                                                z12 = z11;
                                                                                c11 = c10;
                                                                                aVar2 = aVar;
                                                                                i14 = i14;
                                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                            }
                                                                            i11 = this.f35155m;
                                                                            i14 = 94;
                                                                            c10 = 287;
                                                                            if (i11 != 94) {
                                                                                return value;
                                                                            }
                                                                            return value;
                                                                            z12 = z11;
                                                                            c11 = c10;
                                                                            aVar2 = aVar;
                                                                            i14 = i14;
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        }
                                                                    } else {
                                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        if (this.f35155m == 95) {
                                                                            if (value.t()) {
                                                                                value.y();
                                                                                this.f35149g.remove(map);
                                                                            } else {
                                                                                return value;
                                                                            }
                                                                        } else {
                                                                            if (!s0.a().a("u_n_c_e_d", true)) {
                                                                            }
                                                                            z11 = true;
                                                                            if (iO == 1) {
                                                                                if (value.t()) {
                                                                                    i14 = 94;
                                                                                    c10 = 287;
                                                                                } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                                    return value;
                                                                                }
                                                                                z12 = z11;
                                                                                c11 = c10;
                                                                                aVar2 = aVar;
                                                                                i14 = i14;
                                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                            }
                                                                            i11 = this.f35155m;
                                                                            i14 = 94;
                                                                            c10 = 287;
                                                                            if (i11 != 94) {
                                                                                return value;
                                                                            }
                                                                            return value;
                                                                            z12 = z11;
                                                                            c11 = c10;
                                                                            aVar2 = aVar;
                                                                            i14 = i14;
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        }
                                                                    }
                                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                    aVar2 = aVar;
                                                                    c11 = 287;
                                                                    i14 = 94;
                                                                    z12 = true;
                                                                }
                                                                i15--;
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                aVar2 = aVar;
                                                                c11 = 287;
                                                                i14 = 94;
                                                                z12 = true;
                                                            }
                                                        } else {
                                                            zIsEmpty = TextUtils.isEmpty(value.k());
                                                            iO = value.o();
                                                            if (this.f35155m != 298 && a(value, b(campaignExH))) {
                                                                return value;
                                                            }
                                                            if (iO == 5) {
                                                                if (value.t()) {
                                                                    value.y();
                                                                    this.f35149g.remove(map);
                                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                } else if (!zIsEmpty) {
                                                                    value.a(0, 0);
                                                                    if (this.f35155m == 95) {
                                                                        return value;
                                                                    }
                                                                } else {
                                                                    if (!a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                        return value;
                                                                    }
                                                                    return aVar;
                                                                }
                                                            } else {
                                                                if (!s0.a().a("u_n_c_e_d", true)) {
                                                                    jN = value.n();
                                                                    if (value.o() == 1) {
                                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        if (jCurrentTimeMillis - jN > this.f35151i * 1000) {
                                                                            value.c("download timeout");
                                                                            value.g();
                                                                            this.f35149g.remove(map);
                                                                            i15--;
                                                                            i12 = this.f35155m;
                                                                            if (i12 != 1 || i12 == 94) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                    }
                                                                    if (this.f35155m == 95) {
                                                                        if (value.t()) {
                                                                            value.y();
                                                                            this.f35149g.remove(map);
                                                                        } else {
                                                                            return value;
                                                                        }
                                                                    } else {
                                                                        if (!s0.a().a("u_n_c_e_d", true) || (iO != 4 && iO != 2)) {
                                                                            z11 = true;
                                                                            if (iO == 1) {
                                                                                if (value.t()) {
                                                                                    i14 = 94;
                                                                                    c10 = 287;
                                                                                } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                                    return value;
                                                                                }
                                                                                z12 = z11;
                                                                                c11 = c10;
                                                                                aVar2 = aVar;
                                                                                i14 = i14;
                                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                            }
                                                                            i11 = this.f35155m;
                                                                            i14 = 94;
                                                                            c10 = 287;
                                                                            if ((i11 != 94 || i11 == 287) && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                                return value;
                                                                            }
                                                                            z12 = z11;
                                                                            c11 = c10;
                                                                            aVar2 = aVar;
                                                                            i14 = i14;
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        }
                                                                        this.f35149g.remove(map);
                                                                        value.g();
                                                                    }
                                                                } else {
                                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                    if (this.f35155m == 95) {
                                                                        if (value.t()) {
                                                                            value.y();
                                                                            this.f35149g.remove(map);
                                                                        } else {
                                                                            return value;
                                                                        }
                                                                    } else {
                                                                        if (!s0.a().a("u_n_c_e_d", true)) {
                                                                        }
                                                                        z11 = true;
                                                                        if (iO == 1) {
                                                                            if (value.t()) {
                                                                                i14 = 94;
                                                                                c10 = 287;
                                                                            } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                                return value;
                                                                            }
                                                                            z12 = z11;
                                                                            c11 = c10;
                                                                            aVar2 = aVar;
                                                                            i14 = i14;
                                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                        }
                                                                        i11 = this.f35155m;
                                                                        i14 = 94;
                                                                        c10 = 287;
                                                                        if (i11 != 94) {
                                                                            return value;
                                                                        }
                                                                        return value;
                                                                        z12 = z11;
                                                                        c11 = c10;
                                                                        aVar2 = aVar;
                                                                        i14 = i14;
                                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                    }
                                                                }
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                aVar2 = aVar;
                                                                c11 = 287;
                                                                i14 = 94;
                                                                z12 = true;
                                                            }
                                                            i15--;
                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            aVar2 = aVar;
                                                            c11 = 287;
                                                            i14 = 94;
                                                            z12 = true;
                                                        }
                                                    }
                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                    z11 = true;
                                                    i14 = 94;
                                                    c10 = 287;
                                                    z12 = z11;
                                                    c11 = c10;
                                                    aVar2 = aVar;
                                                    i14 = i14;
                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                } else {
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (this.f35155m != 298) {
                                                    }
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f35149g.remove(map);
                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                        } else if (!zIsEmpty) {
                                                            value.a(0, 0);
                                                            if (this.f35155m == 95) {
                                                                return value;
                                                            }
                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            z11 = true;
                                                            i14 = 94;
                                                            c10 = 287;
                                                            z12 = z11;
                                                            c11 = c10;
                                                            aVar2 = aVar;
                                                            i14 = i14;
                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                        } else {
                                                            if (!a(str, campaignExH)) {
                                                            }
                                                            return aVar;
                                                        }
                                                    } else {
                                                        if (!s0.a().a("u_n_c_e_d", true)) {
                                                            jN = value.n();
                                                            if (value.o() == 1) {
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                if (jCurrentTimeMillis - jN > this.f35151i * 1000) {
                                                                    value.c("download timeout");
                                                                    value.g();
                                                                    this.f35149g.remove(map);
                                                                    i15--;
                                                                    i12 = this.f35155m;
                                                                    if (i12 != 1) {
                                                                    }
                                                                }
                                                            } else {
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            }
                                                            if (this.f35155m == 95) {
                                                                if (value.t()) {
                                                                    value.y();
                                                                    this.f35149g.remove(map);
                                                                } else {
                                                                    return value;
                                                                }
                                                            } else {
                                                                if (!s0.a().a("u_n_c_e_d", true)) {
                                                                }
                                                                z11 = true;
                                                                if (iO == 1) {
                                                                    if (value.t()) {
                                                                        i14 = 94;
                                                                        c10 = 287;
                                                                    } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    z12 = z11;
                                                                    c11 = c10;
                                                                    aVar2 = aVar;
                                                                    i14 = i14;
                                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                }
                                                                i11 = this.f35155m;
                                                                i14 = 94;
                                                                c10 = 287;
                                                                if (i11 != 94) {
                                                                    return value;
                                                                }
                                                                return value;
                                                                z12 = z11;
                                                                c11 = c10;
                                                                aVar2 = aVar;
                                                                i14 = i14;
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            }
                                                        } else {
                                                            copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            if (this.f35155m == 95) {
                                                                if (value.t()) {
                                                                    value.y();
                                                                    this.f35149g.remove(map);
                                                                } else {
                                                                    return value;
                                                                }
                                                            } else {
                                                                if (!s0.a().a("u_n_c_e_d", true)) {
                                                                }
                                                                z11 = true;
                                                                if (iO == 1) {
                                                                    if (value.t()) {
                                                                        i14 = 94;
                                                                        c10 = 287;
                                                                    } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    z12 = z11;
                                                                    c11 = c10;
                                                                    aVar2 = aVar;
                                                                    i14 = i14;
                                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                                }
                                                                i11 = this.f35155m;
                                                                i14 = 94;
                                                                c10 = 287;
                                                                if (i11 != 94) {
                                                                    return value;
                                                                }
                                                                return value;
                                                                z12 = z11;
                                                                c11 = c10;
                                                                aVar2 = aVar;
                                                                i14 = i14;
                                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                            }
                                                        }
                                                        copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                        aVar2 = aVar;
                                                        c11 = 287;
                                                        i14 = 94;
                                                        z12 = true;
                                                    }
                                                    i15--;
                                                    copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                                    aVar2 = aVar;
                                                    c11 = 287;
                                                    i14 = 94;
                                                    z12 = true;
                                                }
                                            } else {
                                                z11 = true;
                                                c10 = c11;
                                                z12 = z11;
                                                c11 = c10;
                                                aVar2 = aVar;
                                                i14 = i14;
                                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            copyOnWriteArrayList = copyOnWriteArrayList2;
                                            e.printStackTrace();
                                            return aVar;
                                        }
                                    }
                                }
                                i15++;
                                i10 = i10;
                                z10 = z10;
                                i14 = i14;
                                copyOnWriteArrayList2 = copyOnWriteArrayList2;
                            }
                            copyOnWriteArrayList = copyOnWriteArrayList2;
                            aVar = aVar2;
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    aVar = aVar2;
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private boolean d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f35149g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f35149g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f35149g.get(i10);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.h() != null && value.t()) {
                                    value.y();
                                    this.f35149g.remove(map);
                                    i10--;
                                }
                            }
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:128:0x020f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0228 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0232 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0236 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0255 A[PHI: r16
      0x0255: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:134:0x0226, B:139:0x0234, B:147:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0259  */
    /* JADX WARN: Code duplicated, block: B:156:0x026d A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0187 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x018d A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x019c A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    public List<com.mbridge.msdk.videocommon.download.a> a(String str, int i10, boolean z10, List<CampaignEx> list, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        long j10;
        String str2;
        String str3;
        boolean zIsEmpty;
        int iO;
        int i11;
        int i12;
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            return kVar.a(list, z11);
        }
        ArrayList arrayList = new ArrayList();
        String str4 = "";
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f35149g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i13 = 0;
                        while (i13 < this.f35149g.size()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f35149g.get(i13);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                try {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.h() != null) {
                                        CampaignEx campaignExH = value.h();
                                        boolean z12 = false;
                                        for (CampaignEx campaignEx : list) {
                                            if (campaignExH != null && campaignEx != null && !TextUtils.isEmpty(campaignExH.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && campaignExH.getId().equals(campaignEx.getId()) && campaignExH.getRequestId().equals(campaignEx.getRequestId())) {
                                                if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                    campaignExH.setNLRid(campaignEx.getNLRid());
                                                }
                                                z12 = true;
                                            }
                                        }
                                        if (!z12) {
                                            str4 = "campaign is not available";
                                            j10 = jCurrentTimeMillis;
                                        } else if ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign())) {
                                            String str5 = campaignExH.getendcard_url();
                                            String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                            String strJ = "";
                                            if (campaignExH.getRewardTemplateMode() != null) {
                                                strJ = campaignExH.getRewardTemplateMode().j();
                                            }
                                            String str6 = strJ;
                                            String str7 = str4;
                                            try {
                                                CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                                j10 = jCurrentTimeMillis;
                                                if (i10 == 94 || i10 == 287) {
                                                    if (!TextUtils.isEmpty(str6) && !str6.contains(CampaignEx.KEY_IS_CMPT_ENTRY) && !a(i10, campaignExH, str6)) {
                                                        str3 = "template is null or download is not ready";
                                                    } else {
                                                        if (b(str5, campaignExH)) {
                                                            if (value.t()) {
                                                                value.y();
                                                                str3 = "task is displayed";
                                                            } else {
                                                                if (a1.a(videoUrlEncode)) {
                                                                    if (a(rewardTemplateMode)) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str2 = "image list is downloading or fail";
                                                                    }
                                                                } else if (a(value, b(campaignExH), z11) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str2 = "video and image list is downloading or fail";
                                                                }
                                                                str4 = str7;
                                                            }
                                                        } else {
                                                            str2 = "endcard is downloading or fail";
                                                        }
                                                        str7 = str2;
                                                        zIsEmpty = TextUtils.isEmpty(value.k());
                                                        iO = value.o();
                                                        if (iO == 5) {
                                                            if (value.t()) {
                                                                value.y();
                                                                this.f35149g.remove(map);
                                                                i13--;
                                                                str3 = "task is displayed";
                                                            } else {
                                                                if (!zIsEmpty) {
                                                                    value.a(0, 0);
                                                                    if (i10 == 95) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str3 = "resource path is not effective";
                                                                    }
                                                                } else {
                                                                    if (a(str5, campaignExH) || !a(rewardTemplateMode)) {
                                                                        return null;
                                                                    }
                                                                    arrayList.add(value);
                                                                }
                                                                str4 = str7;
                                                            }
                                                        } else {
                                                            i11 = i13;
                                                            if (s0.a().a("u_n_c_e_d", true)) {
                                                                i12 = 1;
                                                                i13 = i11;
                                                            } else {
                                                                long jN = value.n();
                                                                if (value.o() == 1 || j10 - jN <= this.f35151i * 1000) {
                                                                    i13 = i11;
                                                                } else {
                                                                    value.c("download timeout");
                                                                    value.g();
                                                                    this.f35149g.remove(map);
                                                                    i13 = i11 - 1;
                                                                    if (i10 == 1 || i10 == 94) {
                                                                        str4 = "video download time over dlct";
                                                                    } else {
                                                                        str7 = "video download time over dlct";
                                                                    }
                                                                }
                                                                if (iO != 4 || iO == 2) {
                                                                    this.f35149g.remove(map);
                                                                    value.g();
                                                                    i13--;
                                                                    str3 = "video download stop or pause";
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            if (iO == i12) {
                                                                if (i10 == 94 && i10 != 287) {
                                                                    str4 = str7;
                                                                } else if (!a(value, b(campaignExH), z11) && a(str5, campaignExH) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                    str4 = str7;
                                                                } else {
                                                                    str3 = "video or endcard or image list is downloading or fail";
                                                                }
                                                            } else if (value.t()) {
                                                                str3 = "video was displayed";
                                                            } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (!a(value, b(campaignExH), z11) && a(str5, campaignExH) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str7 = "video or endcard or image list is downloading or fail";
                                                                    if (i10 == 94) {
                                                                    }
                                                                    if (!a(value, b(campaignExH), z11)) {
                                                                    }
                                                                    str3 = "video or endcard or image list is downloading or fail";
                                                                }
                                                                str4 = str7;
                                                            } else {
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                        }
                                                    }
                                                    str4 = str3;
                                                } else {
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f35149g.remove(map);
                                                            i13--;
                                                            str3 = "task is displayed";
                                                        } else {
                                                            if (!zIsEmpty) {
                                                                value.a(0, 0);
                                                                if (i10 == 95) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str3 = "resource path is not effective";
                                                                }
                                                            } else {
                                                                if (a(str5, campaignExH)) {
                                                                }
                                                                return null;
                                                            }
                                                            str4 = str7;
                                                        }
                                                        str4 = str3;
                                                    } else {
                                                        i11 = i13;
                                                        if (s0.a().a("u_n_c_e_d", true)) {
                                                            long jN2 = value.n();
                                                            if (value.o() == 1) {
                                                                i13 = i11;
                                                                if (iO != 4) {
                                                                }
                                                                this.f35149g.remove(map);
                                                                value.g();
                                                                i13--;
                                                                str3 = "video download stop or pause";
                                                                str4 = str3;
                                                            } else {
                                                                i13 = i11;
                                                                if (iO != 4) {
                                                                }
                                                                this.f35149g.remove(map);
                                                                value.g();
                                                                i13--;
                                                                str3 = "video download stop or pause";
                                                                str4 = str3;
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            i13 = i11;
                                                        }
                                                        if (iO == i12) {
                                                            if (value.t()) {
                                                                str3 = "video was displayed";
                                                            } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str7 = "video or endcard or image list is downloading or fail";
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            } else {
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                            str4 = str3;
                                                        } else {
                                                            if (i10 == 94) {
                                                            }
                                                            if (!a(value, b(campaignExH), z11)) {
                                                            }
                                                            str3 = "video or endcard or image list is downloading or fail";
                                                            str4 = str3;
                                                        }
                                                    }
                                                }
                                                jCurrentTimeMillis = j10;
                                            } catch (Exception e10) {
                                                e = e10;
                                                str4 = str7;
                                                e.printStackTrace();
                                                if (arrayList.size() == 0) {
                                                    eVar.a("is_ready_fail_reason", str4);
                                                }
                                                return arrayList;
                                            }
                                        } else {
                                            list = list;
                                        }
                                        jCurrentTimeMillis = j10;
                                    } else {
                                        j10 = jCurrentTimeMillis;
                                        str4 = "task or task's campaign is NULL";
                                        i13 = i13;
                                        jCurrentTimeMillis = j10;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            i13++;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }
        try {
            if (arrayList.size() == 0 && eVar != null) {
                eVar.a("is_ready_fail_reason", str4);
            }
        } catch (Throwable th3) {
            q0.b("UnitCacheCtroller", th3.getMessage());
        }
        return arrayList;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f35149g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f35149g) != null && copyOnWriteArrayList.size() > 0) {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f35149g) {
                            if (map != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f35149g.remove(map);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.f35154l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j10 > 0 && jM * 100 >= j10 * ((long) i10)) {
            if (i10 != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExH = aVar.h();
        if (campaignExH != null) {
            if (campaignExH.getRsIgnoreCheckRule() != null && campaignExH.getRsIgnoreCheckRule().size() > 0 && campaignExH.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExH.getIsTimeoutCheckVideoStatus() == 1 && campaignExH.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExH.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                    campaignExH.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f35159q && (kVar = this.f35158p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f35149g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f35149g) {
                        if (map != null && map.containsKey(str)) {
                            return map.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.f35156n;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("UnitCacheCtroller", e10.getMessage());
            return 100;
        }
    }
}
