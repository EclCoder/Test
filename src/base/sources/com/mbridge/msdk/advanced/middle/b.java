package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f28230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f28231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f28232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28234e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f28231b = cVar;
        this.f28232c = mBridgeIds;
        this.f28233d = mBridgeIds.getUnitId();
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f28230a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f28234e = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f28231b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f28230a;
        if (nativeAdvancedAdListener != null && this.f28231b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f28232c);
        }
        this.f28231b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f28233d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f28231b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f28231b;
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
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f28230a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f28232c, str);
        }
        this.f28231b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f28233d, !TextUtils.isEmpty(this.f28234e), bVar != null ? bVar.d() : null);
    }
}
