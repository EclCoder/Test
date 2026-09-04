package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31308c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f31309a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31310b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0412a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f31311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f31313c;

        RunnableC0412a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f31311a = bVar;
            this.f31312b = str;
            this.f31313c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f31311a;
            if (bVar != null) {
                bVar.a(this.f31312b, this.f31313c, a.this.f31310b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f31315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f31316b;

        b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f31315a = bVar;
            this.f31316b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31315a != null) {
                this.f31316b.a(a.this.f31310b);
                this.f31315a.a(this.f31316b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f31318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31320c;

        c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f31318a = bVar;
            this.f31319b = str;
            this.f31320c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f31318a;
            if (bVar != null) {
                bVar.a(this.f31319b, this.f31320c, a.this.f31310b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f31322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f31323b;

        d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f31322a = bVar;
            this.f31323b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31322a != null) {
                this.f31323b.a(a.this.f31310b);
                this.f31322a.b(this.f31323b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f31308c, "postResourceFail unitId=" + bVar2);
        this.f31309a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f31310b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f31308c, "postCampaignSuccess unitId=" + str);
        this.f31309a.post(new RunnableC0412a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f31309a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f31308c, "postResourceSuccess unitId=" + str);
        this.f31309a.post(new c(bVar, str, i10));
    }
}
