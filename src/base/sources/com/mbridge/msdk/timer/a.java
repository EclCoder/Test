package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f33689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f33690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f33693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f33694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f33695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f33696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f33697k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class HandlerC0461a extends Handler {
        HandlerC0461a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f33688b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f33687a);
                        sendMessageDelayed(obtainMessage(1), a.this.f33687a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f33699a;

        b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f33699a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f33697k.sendMessage(a.this.f33697k.obtainMessage(2));
            this.f33699a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f33697k.sendMessage(a.this.f33697k.obtainMessage(2));
            this.f33699a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f33701a = new a(null);
    }

    /* synthetic */ a(HandlerC0461a handlerC0461a) {
        this();
    }

    private a() {
        this.f33688b = false;
        this.f33689c = new LinkedList<>();
        this.f33690d = new LinkedList<>();
        this.f33691e = 0;
        this.f33692f = 0;
        this.f33697k = new HandlerC0461a();
    }

    private void b() {
        if (this.f33696j == null) {
            this.f33696j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f33695i == null) {
            this.f33695i = l.a(this.f33696j);
        }
        List<i> listA = this.f33695i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f33690d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f33695i.a(94);
        if (listA2 != null) {
            this.f33689c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f33693g == null) {
            this.f33693g = e.a(this.f33696j);
        }
        if (this.f33694h == null) {
            this.f33694h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f33689c;
            if (linkedList != null && linkedList.size() > 0 && this.f33691e < this.f33689c.size()) {
                i iVar = this.f33689c.get(this.f33691e);
                this.f33691e++;
                if (a(iVar)) {
                    a(iVar.d(), iVar.g(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f33690d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f33692f >= this.f33690d.size()) {
                return;
            }
            i iVar2 = this.f33690d.get(this.f33692f);
            this.f33692f++;
            if (a(iVar2)) {
                c(iVar2.d(), iVar2.g());
            }
        } catch (Throwable th2) {
            q0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    public static a a() {
        return c.f33701a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f33689c;
        if (linkedList == null || linkedList.size() <= 0 || this.f33691e == 0 || this.f33689c.size() <= this.f33691e) {
            LinkedList<i> linkedList2 = this.f33690d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f33692f == 0 || this.f33690d.size() == this.f33692f) {
                this.f33692f = 0;
                this.f33691e = 0;
                Handler handler = this.f33697k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            String strG = iVar.g();
            try {
                if (this.f33693g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f33694h;
                int iA = this.f33693g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f33697k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
            q0.b("LoopTimer", th.getMessage(), th);
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f33687a = j10;
        this.f33688b = false;
        Handler handler = this.f33697k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f33687a);
    }

    public void b(String str, String str2) {
        if (this.f33689c.contains(str2)) {
            return;
        }
        this.f33689c.add(new i(str, str2, 94));
        l lVar = this.f33695i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f33695i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f33690d.contains(str2)) {
            return;
        }
        this.f33690d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f33695i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f33689c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f33689c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f33690d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f33690d.remove(str);
            }
        }
        b(str);
    }
}
