package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e implements com.mbridge.msdk.foundation.same.image.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ImageView f34660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f34661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34662c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34663a;

        a(String str) {
            this.f34663a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (e.this.f34661b == null) {
                    q0.a("ImageLoaderListener", "campaign is null");
                    return;
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("2000044");
                nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                nVar.b(e.this.f34661b.getId());
                nVar.i(e.this.f34661b.getImageUrl());
                nVar.n(e.this.f34661b.getRequestId());
                nVar.o(e.this.f34661b.getRequestIdNotice());
                nVar.u(e.this.f34662c);
                nVar.m(this.f34663a);
                nVarA.a(nVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public e(ImageView imageView) {
        this.f34660a = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
        q0.b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                q0.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.f34660a == null || bitmap.isRecycled()) {
                    return;
                }
                this.f34660a.setImageBitmap(bitmap);
                this.f34660a.setVisibility(0);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f34660a = imageView;
        this.f34661b = campaignEx;
        this.f34662c = str;
    }
}
