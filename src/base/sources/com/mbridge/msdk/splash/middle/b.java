package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f32716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f32717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBridgeIds f32720e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f32717b = cVar;
        this.f32720e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f32718c = mBridgeIds.getUnitId();
        }
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f32716a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f32719d = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f32717b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f32716a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f32720e, i10);
            this.f32716a.isSupportZoomOut(this.f32720e, campaignEx.getFlb() == 1);
        }
        this.f32717b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f32718c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f32717b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f32717b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f32716a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f32720e, str, i10);
        }
        this.f32717b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f32718c, !TextUtils.isEmpty(this.f32719d), bVar != null ? bVar.d() : null);
    }
}
