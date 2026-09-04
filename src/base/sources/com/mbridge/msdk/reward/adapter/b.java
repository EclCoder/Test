package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f31968g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f31969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f31974f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f31975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f31976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f31978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f31981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f31982h;

        a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f31975a = copyOnWriteArrayList;
            this.f31976b = context;
            this.f31977c = str;
            this.f31978d = i10;
            this.f31979e = str2;
            this.f31980f = str3;
            this.f31981g = str4;
            this.f31982h = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:117:0x02df  */
        /* JADX WARN: Code duplicated, block: B:123:0x02f5  */
        /* JADX WARN: Code duplicated, block: B:124:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:127:0x030e  */
        /* JADX WARN: Code duplicated, block: B:147:0x0382  */
        /* JADX WARN: Code duplicated, block: B:178:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:188:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:194:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:196:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x019d  */
        /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
        @Override // java.lang.Runnable
        public void run() {
            CharSequence charSequence;
            String str;
            CampaignEx.c cVar;
            String str2;
            String str3;
            boolean zIsDynamicView;
            String iconUrl;
            String imageUrl;
            CampaignEx campaignEx;
            String strH;
            List<CampaignEx.c.a> listD;
            List<String> list;
            int i10;
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2;
            int i11;
            String str4 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList = this.f31975a;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f31975a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f31976b, this.f31977c, this.f31975a, this.f31978d, new k(b.this.f31969a, this.f31979e, this.f31977c, this.f31980f, this.f31981g));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f31977c);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
            Iterator it = this.f31975a.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it.next();
                if (campaignEx2 != null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31977c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f31979e);
                        bundle.putString("request_id", this.f31980f);
                        bundle.putString("key", this.f31977c + str4 + this.f31980f + str4 + campaignEx2.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        b.this.f31969a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String strJ = rewardTemplateMode.j();
                        int iK = rewardTemplateMode.k();
                        if (campaignEx2.isDynamicView() && v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, strJ)) {
                            b.this.a(1, campaignEx2, iK + "", strJ);
                        } else if (!TextUtils.isEmpty(strJ) && !strJ.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = b.this.a(campaignEx2, 2);
                            if (strJ.contains(".zip")) {
                                try {
                                    H5DownLoadManager h5DownLoadManager = H5DownLoadManager.getInstance();
                                    try {
                                        Context context = this.f31976b;
                                        String str5 = this.f31979e;
                                        try {
                                            String str6 = this.f31977c;
                                            try {
                                                String str7 = this.f31980f;
                                                m mVar = b.this.f31969a;
                                                charSequence = ".zip";
                                                try {
                                                    n nVar = this.f31982h;
                                                    CopyOnWriteArrayList copyOnWriteArrayList2 = this.f31975a;
                                                    cVar = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                    try {
                                                        h5DownLoadManager.downloadH5Res(cVarA, strJ, new l(context, str5, str6, str7, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList2));
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    cVar = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                cVar = rewardTemplateMode;
                                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                str = "";
                                                str4 = str4;
                                                it = it;
                                                charSequence = ".zip";
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            charSequence = ".zip";
                                            str = "";
                                            cVar = rewardTemplateMode;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            str3 = campaignEx2.getendcard_url();
                                            zIsDynamicView = campaignEx2.isDynamicView();
                                            boolean zL = v0.l(str3);
                                            if (!TextUtils.isEmpty(str3)) {
                                                if (zIsDynamicView) {
                                                    b.this.a(this.f31976b, this.f31979e, this.f31977c, this.f31980f, campaignEx2, str3, this.f31982h, (CopyOnWriteArrayList<CampaignEx>) this.f31975a);
                                                } else if (v0.c(str2, str3)) {
                                                    try {
                                                        i11 = Integer.parseInt(c1.a(str3, "ecid"));
                                                    } catch (Throwable th2) {
                                                        q0.b("RewardCampaignsResourceManager", th2.getMessage());
                                                        i11 = 404;
                                                    }
                                                    b.this.a(2, campaignEx2, i11 + str, str3);
                                                }
                                            }
                                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                                H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                                            }
                                            iconUrl = campaignEx2.getIconUrl();
                                            if (!TextUtils.isEmpty(iconUrl)) {
                                                try {
                                                    com.mbridge.msdk.foundation.same.image.b bVarA = com.mbridge.msdk.foundation.same.image.b.a(this.f31976b);
                                                    try {
                                                        j jVar = new j(b.this.f31969a, 0, this.f31979e, this.f31977c, this.f31980f, campaignEx2);
                                                        campaignEx2 = campaignEx2;
                                                        bVarA.a(iconUrl, jVar);
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        campaignEx2 = campaignEx2;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e16) {
                                                    e = e16;
                                                }
                                            }
                                            imageUrl = campaignEx2.getImageUrl();
                                            if (!TextUtils.isEmpty(imageUrl)) {
                                                try {
                                                    campaignEx = campaignEx2;
                                                    try {
                                                        campaignEx2 = campaignEx;
                                                        com.mbridge.msdk.foundation.same.image.b.a(this.f31976b).a(imageUrl, new j(b.this.f31969a, 0, this.f31979e, this.f31977c, this.f31980f, campaignEx));
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        campaignEx2 = campaignEx;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e18) {
                                                    e = e18;
                                                }
                                            }
                                            if (cVar != null) {
                                                strH = cVar.h();
                                                if (!TextUtils.isEmpty(strH)) {
                                                    if (campaignEx2.getAabEntity() != null) {
                                                        i10 = campaignEx2.getAabEntity().h3c;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                                                    cVar2.f(i10);
                                                    if (strH.contains(charSequence)) {
                                                        q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new l(this.f31976b, this.f31979e, this.f31977c, this.f31980f, campaignEx2, Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE, b.this.f31969a, this.f31982h, this.f31975a));
                                                        } catch (Exception e19) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardCampaignsResourceManager", e19.getLocalizedMessage());
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new i(Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE, this.f31979e, this.f31977c, this.f31980f, campaignEx2, this.f31982h, b.this.f31969a, this.f31975a));
                                                        } catch (Exception e20) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardCampaignsResourceManager", e20.getLocalizedMessage());
                                                            }
                                                        }
                                                    }
                                                }
                                                listD = cVar.d();
                                                if (listD != null) {
                                                    while (r2.hasNext()) {
                                                        if (aVar == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            it = it;
                                            str4 = str4;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                        str = "";
                                        charSequence = ".zip";
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    charSequence = ".zip";
                                    str = "";
                                }
                            } else {
                                str4 = str4;
                                it = it;
                                charSequence = ".zip";
                                str = "";
                                cVar = rewardTemplateMode;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                q0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVarA, strJ, new i(859, this.f31979e, this.f31977c, this.f31980f, campaignEx2, this.f31982h, b.this.f31969a, this.f31975a));
                                } catch (Exception e23) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e23.getLocalizedMessage());
                                    }
                                }
                            }
                        }
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        cVar = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    } else {
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        cVar = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    }
                    str3 = campaignEx2.getendcard_url();
                    zIsDynamicView = campaignEx2.isDynamicView();
                    boolean zL2 = v0.l(str3);
                    if (!TextUtils.isEmpty(str3)) {
                        if (zIsDynamicView || zL2) {
                            b.this.a(this.f31976b, this.f31979e, this.f31977c, this.f31980f, campaignEx2, str3, this.f31982h, (CopyOnWriteArrayList<CampaignEx>) this.f31975a);
                        } else if (v0.c(str2, str3)) {
                            i11 = Integer.parseInt(c1.a(str3, "ecid"));
                            b.this.a(2, campaignEx2, i11 + str, str3);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                        com.mbridge.msdk.foundation.same.image.b bVarA2 = com.mbridge.msdk.foundation.same.image.b.a(this.f31976b);
                        j jVar2 = new j(b.this.f31969a, 0, this.f31979e, this.f31977c, this.f31980f, campaignEx2);
                        campaignEx2 = campaignEx2;
                        bVarA2.a(iconUrl, jVar2);
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        campaignEx = campaignEx2;
                        campaignEx2 = campaignEx;
                        com.mbridge.msdk.foundation.same.image.b.a(this.f31976b).a(imageUrl, new j(b.this.f31969a, 0, this.f31979e, this.f31977c, this.f31980f, campaignEx));
                    }
                    if (cVar != null) {
                        strH = cVar.h();
                        if (!TextUtils.isEmpty(strH) && !campaignEx2.isDynamicView()) {
                            if (campaignEx2.getAabEntity() != null) {
                                i10 = campaignEx2.getAabEntity().h3c;
                            } else {
                                i10 = 0;
                            }
                            cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                            cVar2.f(i10);
                            if (strH.contains(charSequence)) {
                                q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new l(this.f31976b, this.f31979e, this.f31977c, this.f31980f, campaignEx2, Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE, b.this.f31969a, this.f31982h, this.f31975a));
                            } else {
                                H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new i(Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE, this.f31979e, this.f31977c, this.f31980f, campaignEx2, this.f31982h, b.this.f31969a, this.f31975a));
                            }
                        }
                        listD = cVar.d();
                        if (listD != null && listD.size() > 0) {
                            for (CampaignEx.c.a aVar : listD) {
                                if (aVar == null && (list = aVar.f30300a) != null && list.size() > 0) {
                                    for (String str8 : aVar.f30300a) {
                                        if (!TextUtils.isEmpty(str8)) {
                                            try {
                                                CampaignEx campaignEx3 = campaignEx2;
                                                try {
                                                    campaignEx2 = campaignEx3;
                                                    com.mbridge.msdk.foundation.same.image.b.a(this.f31976b).a(str8, new j(b.this.f31969a, 1, this.f31979e, this.f31977c, this.f31980f, campaignEx3));
                                                } catch (Exception e24) {
                                                    e = e24;
                                                    campaignEx2 = campaignEx3;
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                    }
                                                }
                                            } catch (Exception e25) {
                                                e = e25;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it = it;
                    str4 = str4;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f31991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f31992f;

        c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f31987a = str;
            this.f31988b = str2;
            this.f31989c = str3;
            this.f31990d = campaignEx;
            this.f31991e = nVar;
            this.f31992f = context;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            String str3;
            String str4;
            boolean z10;
            Exception exc;
            String str5;
            char c10;
            String str6 = "";
            String str7 = PglCryptUtils.KEY_MESSAGE;
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = Sdk$SDKError.b.AD_IS_PLAYING_VALUE;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                try {
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                    bundle.putString("request_id", this.f31989c);
                    bundle.putString("url", str2);
                    bundle.putString("key", this.f31987a + "_" + this.f31989c + "_" + this.f31990d.getSecondRequestIndex());
                    bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                    messageObtain.setData(bundle);
                    b.this.f31969a.sendMessage(messageObtain);
                    if (this.f31991e != null) {
                        try {
                            c10 = 28037;
                            try {
                                this.f31991e.a(str2, this.f31989c, b.b(880005, new MBridgeIds(this.f31988b, this.f31987a, this.f31989c), "", null, null));
                            } catch (Exception e10) {
                                e = e10;
                                try {
                                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                                } catch (Exception e11) {
                                    str3 = "RewardCampaignsResourceManager";
                                    str6 = "";
                                    str7 = PglCryptUtils.KEY_MESSAGE;
                                    z10 = false;
                                    exc = e11;
                                    str4 = "_";
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                                    Message messageObtain2 = Message.obtain();
                                    messageObtain2.what = 105;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                                    bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                                    bundle2.putString("request_id", this.f31989c);
                                    bundle2.putString("key", this.f31987a + str4 + this.f31989c + str4 + this.f31990d.getSecondRequestIndex());
                                    bundle2.putString("url", str2);
                                    bundle2.putString(str7, exc.getMessage());
                                    messageObtain2.setData(bundle2);
                                    b.this.f31969a.sendMessage(messageObtain2);
                                    if (this.f31991e != null) {
                                        try {
                                            this.f31991e.a(str2, this.f31989c, b.b(880005, new MBridgeIds(this.f31988b, this.f31987a, this.f31989c), str6, exc, null));
                                        } catch (Exception e12) {
                                            str5 = str3;
                                            q0.b(str5, e12.getMessage());
                                            q0.b(str5, exc.getLocalizedMessage());
                                        }
                                    }
                                    str5 = str3;
                                    q0.b(str5, exc.getLocalizedMessage());
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            c10 = 28037;
                        }
                    } else {
                        c10 = 28037;
                    }
                    try {
                        try {
                            try {
                                str4 = "_";
                                str3 = "RewardCampaignsResourceManager";
                                z10 = false;
                                try {
                                    b.this.a(this.f31992f, 3, this.f31990d, str2, str, this.f31987a, "");
                                } catch (Exception e14) {
                                    e = e14;
                                    exc = e;
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                                    Message messageObtain3 = Message.obtain();
                                    messageObtain3.what = 105;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                                    bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                                    bundle3.putString("request_id", this.f31989c);
                                    bundle3.putString("key", this.f31987a + str4 + this.f31989c + str4 + this.f31990d.getSecondRequestIndex());
                                    bundle3.putString("url", str2);
                                    bundle3.putString(str7, exc.getMessage());
                                    messageObtain3.setData(bundle3);
                                    b.this.f31969a.sendMessage(messageObtain3);
                                    if (this.f31991e != null) {
                                        this.f31991e.a(str2, this.f31989c, b.b(880005, new MBridgeIds(this.f31988b, this.f31987a, this.f31989c), str6, exc, null));
                                    }
                                    str5 = str3;
                                    q0.b(str5, exc.getLocalizedMessage());
                                }
                            } catch (Exception e15) {
                                e = e15;
                                str3 = "RewardCampaignsResourceManager";
                                str4 = "_";
                                z10 = false;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str3 = "RewardCampaignsResourceManager";
                            z10 = false;
                            str4 = "_";
                        }
                    } catch (Exception e17) {
                        e = e17;
                        str3 = "RewardCampaignsResourceManager";
                        z10 = false;
                        str4 = "_";
                        exc = e;
                        ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                        Message messageObtain4 = Message.obtain();
                        messageObtain4.what = 105;
                        Bundle bundle4 = new Bundle();
                        bundle4.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                        bundle4.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                        bundle4.putString("request_id", this.f31989c);
                        bundle4.putString("key", this.f31987a + str4 + this.f31989c + str4 + this.f31990d.getSecondRequestIndex());
                        bundle4.putString("url", str2);
                        bundle4.putString(str7, exc.getMessage());
                        messageObtain4.setData(bundle4);
                        b.this.f31969a.sendMessage(messageObtain4);
                        if (this.f31991e != null) {
                            this.f31991e.a(str2, this.f31989c, b.b(880005, new MBridgeIds(this.f31988b, this.f31987a, this.f31989c), str6, exc, null));
                        }
                        str5 = str3;
                        q0.b(str5, exc.getLocalizedMessage());
                    }
                } catch (Exception e18) {
                    e = e18;
                    str3 = "RewardCampaignsResourceManager";
                }
            } catch (Exception e19) {
                e = e19;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                z10 = false;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                bundle.putString("request_id", this.f31989c);
                bundle.putString("key", this.f31987a + "_" + this.f31989c + "_" + this.f31990d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f31969a.sendMessage(messageObtain);
                n nVar = this.f31991e;
                if (nVar != null) {
                    nVar.a(this.f31988b, this.f31987a, this.f31989c, str);
                }
                if (z10) {
                    return;
                }
                b.this.a(this.f31992f, 1, this.f31990d, str, "", this.f31987a, str2);
            } catch (Exception e10) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = Sdk$SDKError.b.AD_IS_PLAYING_VALUE;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f31987a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f31988b);
                bundle2.putString("request_id", this.f31989c);
                bundle2.putString("key", this.f31987a + "_" + this.f31989c + "_" + this.f31990d.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                b.this.f31969a.sendMessage(messageObtain2);
                if (this.f31991e != null) {
                    try {
                        this.f31991e.a(str, this.f31989c, b.b(880005, new MBridgeIds(this.f31988b, this.f31987a, this.f31989c), "", e10, null));
                    } catch (Exception e11) {
                        q0.b("RewardCampaignsResourceManager", e11.getMessage());
                    }
                }
                b.this.a(this.f31992f, 3, this.f31990d, str, e10.getLocalizedMessage(), this.f31987a, str2);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f31995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f32000g;

        d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f31994a = campaignEx;
            this.f31995b = context;
            this.f31996c = i10;
            this.f31997d = str;
            this.f31998e = str2;
            this.f31999f = str3;
            this.f32000g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31994a == null || this.f31995b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f31995b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f31996c);
                CampaignEx campaignEx = this.f31994a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f31994a.getRequestId());
                    nVar.k(this.f31994a.getCurrentLocalRid());
                    nVar.o(this.f31994a.getRequestIdNotice());
                }
                nVar.b("url", this.f31997d);
                nVar.t(this.f31997d);
                nVar.m(this.f31998e);
                nVar.u(this.f31999f);
                if (!TextUtils.isEmpty(this.f32000g)) {
                    nVar.q(this.f32000g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f31994a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f32003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f32005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f32007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f32008g;

        e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f32002a = z10;
            this.f32003b = windVaneWebView;
            this.f32004c = campaignEx;
            this.f32005d = copyOnWriteArrayList;
            this.f32006e = str;
            this.f32007f = cVar;
            this.f32008g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f32002a, this.f32003b, this.f32004c.getRewardTemplateMode().j(), 0, this.f32004c, (CopyOnWriteArrayList<CampaignEx>) this.f32005d, H5DownLoadManager.getInstance().getH5ResAddress(this.f32004c.getRewardTemplateMode().j()), this.f32006e, this.f32007f, this.f32008g, b.this.f31970b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f32010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f32011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f32014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f32015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f32017h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f32018i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f32010a = z10;
            this.f32011b = z11;
            this.f32012c = i10;
            this.f32013d = i11;
            this.f32014e = str;
            this.f32015f = str2;
            this.f32016g = i12;
            this.f32017h = copyOnWriteArrayList;
            this.f32018i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f32042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f32043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f32044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n f32045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f32046h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f32047i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f32039a = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f32048j = System.currentTimeMillis();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f32049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f32050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f32052d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f32053e;

            a(int i10, long j10, String str, String str2, String str3) {
                this.f32049a = i10;
                this.f32050b = j10;
                this.f32051c = str;
                this.f32052d = str2;
                this.f32053e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f32044f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f32049a, this.f32050b + "", this.f32051c, i.this.f32044f.getId(), i.this.f32042d, this.f32052d, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    nVar.n(i.this.f32044f.getRequestId());
                    nVar.k(i.this.f32044f.getCurrentLocalRid());
                    nVar.o(i.this.f32044f.getRequestIdNotice());
                    nVar.b(i.this.f32044f.getId());
                    nVar.a(i.this.f32044f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f32051c);
                    if (i.this.f32044f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f32044f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f32053e)) {
                        nVar.q(this.f32053e);
                    }
                    b.b(nVar, i.this.f32044f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f32042d, i.this.f32044f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f32040b = i10;
            this.f32041c = str;
            this.f32042d = str2;
            this.f32043e = str3;
            this.f32044f = campaignEx;
            this.f32045g = nVar;
            this.f32046h = handler;
            this.f32047i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f32040b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle.putString("request_id", this.f32043e);
                bundle.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.f32046h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle2.putString("request_id", this.f32043e);
                bundle2.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.f32046h.sendMessage(messageObtain2);
                if (this.f32039a) {
                    a(3, System.currentTimeMillis() - this.f32048j, str, "url download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = Sdk$SDKError.b.AD_IS_PLAYING_VALUE;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle3.putString("request_id", this.f32043e);
                bundle3.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain3.setData(bundle3);
                this.f32046h.sendMessage(messageObtain3);
                if (this.f32045g != null) {
                    try {
                        this.f32045g.a(str, this.f32043e, b.b(880006, new MBridgeIds(this.f32041c, this.f32042d, this.f32043e), str2, null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f32040b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle.putString("request_id", this.f32043e);
                bundle.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f32046h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle2.putString("request_id", this.f32043e);
                bundle2.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f32046h.sendMessage(messageObtain2);
                if (this.f32039a) {
                    a(1, System.currentTimeMillis() - this.f32048j, str, "", str2);
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32042d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f32041c);
                bundle3.putString("request_id", this.f32043e);
                bundle3.putString("key", this.f32042d + "_" + this.f32043e + "_" + this.f32044f.getSecondRequestIndex());
                messageObtain3.setData(bundle3);
                this.f32046h.sendMessage(messageObtain3);
                n nVar = this.f32045g;
                if (nVar != null) {
                    nVar.a(this.f32041c, this.f32042d, this.f32043e, str);
                }
            }
        }

        public void a(boolean z10) {
            this.f32039a = z10;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f32055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f32060f;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32061a;

            a(String str) {
                this.f32061a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f32060f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f32060f.getId());
                        nVar.i(j.this.f32060f.getImageUrl());
                        nVar.n(j.this.f32060f.getRequestId());
                        nVar.k(j.this.f32060f.getCurrentLocalRid());
                        nVar.o(j.this.f32060f.getRequestIdNotice());
                        nVar.u(j.this.f32057c);
                        nVar.m(this.f32061a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f32055a = handler;
            this.f32056b = i10;
            this.f32058d = str;
            this.f32057c = str2;
            this.f32059e = str3;
            this.f32060f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f32056b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32057c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32058d);
            bundle.putString("request_id", this.f32059e);
            bundle.putString("key", this.f32057c + "_" + this.f32059e + "_" + this.f32060f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f32055a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f32056b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32057c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32058d);
            bundle.putString("request_id", this.f32059e);
            bundle.putString("key", this.f32057c + "_" + this.f32059e + "_" + this.f32060f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f32055a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f32069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f32073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f32075h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f32076i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f32077j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f32068a = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f32078k = System.currentTimeMillis();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f32079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32080b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32081c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f32082d;

            a(int i10, String str, String str2, String str3) {
                this.f32079a = i10;
                this.f32080b = str;
                this.f32081c = str2;
                this.f32082d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f32073f == null || l.this.f32069b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f32069b != null) {
                        nVar.c(m0.s(l.this.f32069b.getApplicationContext()));
                    }
                    nVar.d(this.f32079a);
                    if (l.this.f32073f != null) {
                        nVar.b(l.this.f32073f.getId());
                        nVar.n(l.this.f32073f.getRequestId());
                        nVar.k(l.this.f32073f.getCurrentLocalRid());
                        nVar.o(l.this.f32073f.getRequestIdNotice());
                    }
                    nVar.t(this.f32080b);
                    nVar.m(this.f32081c);
                    nVar.u(l.this.f32070c);
                    if (!TextUtils.isEmpty(this.f32082d)) {
                        nVar.q(this.f32082d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f32080b);
                    b.b(nVar, l.this.f32073f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f32073f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        class RunnableC0429b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f32084a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f32085b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32086c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f32087d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f32088e;

            RunnableC0429b(int i10, long j10, String str, String str2, String str3) {
                this.f32084a = i10;
                this.f32085b = j10;
                this.f32086c = str;
                this.f32087d = str2;
                this.f32088e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f32073f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f32084a, this.f32085b + "", this.f32086c, l.this.f32073f.getId(), l.this.f32070c, this.f32087d, "1");
                    nVar.n(l.this.f32073f.getRequestId());
                    nVar.k(l.this.f32073f.getCurrentLocalRid());
                    nVar.o(l.this.f32073f.getRequestIdNotice());
                    nVar.b(l.this.f32073f.getId());
                    nVar.a(l.this.f32073f.getAdSpaceT());
                    nVar.q(this.f32088e);
                    nVar.b("scenes", "1");
                    if (l.this.f32073f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f32073f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f32086c);
                    nVar.e(3);
                    b.b(nVar, l.this.f32073f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f32070c, l.this.f32073f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f32069b = context;
            this.f32071d = str;
            this.f32070c = str2;
            this.f32072e = str3;
            this.f32073f = campaignEx;
            this.f32074g = i10;
            this.f32075h = handler;
            this.f32076i = nVar;
            this.f32077j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f32078k;
            int i10 = this.f32074g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
                bundle.putString("request_id", this.f32072e);
                bundle.putString("key", this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.f32075h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
                bundle2.putString("request_id", this.f32072e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.f32075h.sendMessage(messageObtain2);
                if (this.f32068a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = Sdk$SDKError.b.AD_IS_LOADING_VALUE;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
                bundle3.putString("request_id", this.f32072e);
                bundle3.putString("url", str2);
                bundle3.putString("key", this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain3.setData(bundle3);
                this.f32075h.sendMessage(messageObtain3);
                if (this.f32076i != null) {
                    try {
                        this.f32076i.a(str2, this.f32072e, b.b(880006, new MBridgeIds(this.f32071d, this.f32070c, this.f32072e), "", null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
                a(3, str2, str, "");
            }
        }

        public void a(boolean z10) {
            this.f32068a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f32078k;
            int i10 = this.f32074g;
            String str3 = trPLwhKZgZ.BFDmIDtuiPfxAQI;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 103;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
                        bundle.putString("request_id", this.f32072e);
                        bundle.putString(str3, this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        this.f32075h.sendMessage(messageObtain);
                        n nVar = this.f32076i;
                        if (nVar != null) {
                            nVar.a(this.f32071d, this.f32070c, this.f32072e, str);
                        }
                        if (!z10) {
                            a(1, str, "", str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
                bundle2.putString("request_id", this.f32072e);
                bundle2.putString(str3, this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f32075h.sendMessage(messageObtain2);
                if (this.f32068a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32070c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f32071d);
            bundle3.putString("request_id", this.f32072e);
            bundle3.putString(str3, this.f32070c + "_" + this.f32072e + "_" + this.f32073f.getSecondRequestIndex());
            bundle3.putString("url", str);
            messageObtain3.setData(bundle3);
            this.f32075h.sendMessage(messageObtain3);
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0429b(i10, j10, str, str2, str3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f32090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f32091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f32092c;

        public m(Looper looper) {
            super(looper);
            this.f32091b = new ConcurrentHashMap<>();
            this.f32092c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.f32091b.put(str, hVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zA;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String string4 = data.getString("key");
            f fVar = (f) b.f31968g.get(string4);
            h hVar = this.f32091b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f32092c.get(string4);
            int i10 = message.what;
            switch (i10) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i10) {
                        case 200:
                        case 201:
                        case AD_IS_LOADING_VALUE:
                        case AD_IS_PLAYING_VALUE:
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString(PglCryptUtils.KEY_MESSAGE);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                int iC = b.c(message.what);
                                String str = "resource download failed " + b.d(message.what) + " " + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.f32017h;
                                try {
                                    CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.f32017h.get(0);
                                    if (!fVar.f32010a || fVar.f32018i == null) {
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f32014e, fVar.f32011b, fVar.f32013d, fVar.f32010a, fVar.f32012c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f32017h);
                                        } else {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                int i11 = message.what;
                                                if (i11 != 200) {
                                                    if (i11 != 201) {
                                                        if (i11 != 203) {
                                                            if (i11 == 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                            }
                                            hVar.a(fVar.f32017h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        }
                                        this.f32091b.remove(string4);
                                        b.f31968g.remove(string4);
                                        this.f32092c.remove(string4);
                                        break;
                                    } else if (fVar.f32012c == 1) {
                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                            int i12 = message.what;
                                            if (i12 == 200) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                                break;
                                            } else if (i12 == 201) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                }
                                                break;
                                            } else if (i12 == 203) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                }
                                                break;
                                            } else if (i12 == 205) {
                                                if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.f32017h;
                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                        CampaignEx campaignEx2 = fVar.f32017h.get(0);
                                                        if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        hVar.a(fVar.f32017h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        this.f32091b.remove(string4);
                                        b.f31968g.remove(string4);
                                        this.f32092c.remove(string4);
                                    } else {
                                        String string6 = data.getString("url");
                                        int i13 = message.what;
                                        if (i13 == 200) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i14 = 0; i14 < fVar.f32018i.size(); i14++) {
                                                    if (fVar.f32018i.get(i14).getVideoUrlEncode().equals(string6)) {
                                                        fVar.f32018i.remove(i14);
                                                    }
                                                }
                                                b.f31968g.remove(string4);
                                                b.f31968g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 201) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i15 = 0; i15 < fVar.f32018i.size(); i15++) {
                                                    CampaignEx campaignEx3 = fVar.f32018i.get(i15);
                                                    if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().h().equals(string6)) {
                                                        fVar.f32018i.remove(i15);
                                                    }
                                                    if (!TextUtils.isEmpty(campaignEx3.getendcard_url()) && campaignEx3.getendcard_url().equals(string6)) {
                                                        fVar.f32018i.remove(i15);
                                                    }
                                                }
                                                b.f31968g.remove(string4);
                                                b.f31968g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 203) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i16 = 0; i16 < fVar.f32018i.size(); i16++) {
                                                    CampaignEx campaignEx4 = fVar.f32018i.get(i16);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().j().equals(string6)) {
                                                        fVar.f32018i.remove(i16);
                                                    }
                                                }
                                                b.f31968g.remove(string4);
                                                b.f31968g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 205) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                            } else {
                                                fVar.f32018i.clear();
                                                b.f31968g.remove(string4);
                                                b.f31968g.put(string4, fVar);
                                            }
                                            break;
                                        }
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f32014e, fVar.f32011b, fVar.f32013d, fVar.f32010a, fVar.f32012c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f32017h);
                                            this.f32091b.remove(string4);
                                            b.f31968g.remove(string4);
                                            this.f32092c.remove(string4);
                                        } else if (fVar.f32018i.size() == 0) {
                                            hVar.a(fVar.f32017h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                            this.f32091b.remove(string4);
                                            b.f31968g.remove(string4);
                                            this.f32092c.remove(string4);
                                        }
                                    }
                                } catch (Exception e10) {
                                    hVar.a(fVar.f32017h, b.b(iC, new MBridgeIds(string, string2, string3), str, e10, null));
                                    return;
                                }
                                break;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f32014e, fVar.f32011b, fVar.f32013d, fVar.f32010a, fVar.f32012c, copyOnWriteArrayList);
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
                zA = false;
            }
            if (zA) {
                hVar.a(string, string2, string3, fVar.f32017h);
                this.f32091b.remove(string4);
                b.f31968g.remove(string4);
                this.f32092c.remove(string4);
            }
        }

        public void a(Context context) {
            this.f32090a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f32092c.put(str, copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface o {
        void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0480a c0480a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0480a c0480a);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f32093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f32094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f32096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f32098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f32099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f32100h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f32101i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f32102j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0480a f32103k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final CampaignEx f32104l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f32105m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f32106n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f32107o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f32108p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f32109q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Runnable f32110r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f32111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0480a f32112b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32113c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f32114d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f32115e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f32116f;

            a(o oVar, com.mbridge.msdk.videocommon.a.C0480a c0480a, String str, String str2, String str3, String str4) {
                this.f32111a = oVar;
                this.f32112b = c0480a;
                this.f32113c = str;
                this.f32114d = str2;
                this.f32115e = str3;
                this.f32116f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0480a c0480a;
                if (this.f32111a != null && (c0480a = this.f32112b) != null) {
                    c0480a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32113c + "_" + this.f32114d + "_" + this.f32115e, true);
                    o oVar = this.f32111a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f32113c);
                    sb2.append("_");
                    sb2.append(this.f32115e);
                    oVar.a(sb2.toString(), this.f32116f, this.f32113c, this.f32114d, this.f32115e, this.f32112b);
                }
                com.mbridge.msdk.videocommon.a.C0480a c0480a2 = this.f32112b;
                if (c0480a2 == null || (windVaneWebViewB = c0480a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0430b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f32118a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0480a f32119b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32120c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f32121d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f32122e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f32123f;

            RunnableC0430b(o oVar, com.mbridge.msdk.videocommon.a.C0480a c0480a, String str, String str2, String str3, String str4) {
                this.f32118a = oVar;
                this.f32119b = c0480a;
                this.f32120c = str;
                this.f32121d = str2;
                this.f32122e = str3;
                this.f32123f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0480a c0480a;
                if (this.f32118a != null && (c0480a = this.f32119b) != null) {
                    c0480a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32120c + "_" + this.f32121d + "_" + this.f32122e, true);
                    o oVar = this.f32118a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f32120c);
                    sb2.append("_");
                    sb2.append(this.f32122e);
                    oVar.a(sb2.toString(), this.f32123f, this.f32120c, this.f32121d, this.f32122e, this.f32119b);
                }
                com.mbridge.msdk.videocommon.a.C0480a c0480a2 = this.f32119b;
                if (c0480a2 == null || (windVaneWebViewB = c0480a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0480a c0480a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f32093a = handler;
            this.f32094b = runnable;
            this.f32095c = z10;
            this.f32096d = z11;
            this.f32097e = str;
            this.f32098f = oVar;
            this.f32099g = windVaneWebView;
            this.f32100h = str2;
            this.f32101i = str4;
            this.f32102j = str3;
            this.f32103k = c0480a;
            this.f32104l = campaignEx;
            this.f32105m = copyOnWriteArrayList;
            this.f32106n = j10;
            a aVar = new a(oVar, c0480a, str4, str, str2, str3);
            this.f32110r = aVar;
            this.f32109q = new RunnableC0430b(oVar, c0480a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f32093a;
            if (handler2 != null && (runnable2 = this.f32109q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f32093a;
            if (handler3 != null && (runnable = this.f32110r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f32104l, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f32108p) {
                return;
            }
            String str = this.f32101i + "_" + this.f32100h;
            if (i10 == 1) {
                Runnable runnable3 = this.f32094b;
                if (runnable3 != null && (handler = this.f32093a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32101i + "_" + this.f32097e + "_" + this.f32100h, true);
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32103k;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                if (this.f32095c) {
                    if (this.f32096d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f32104l.getRequestIdNotice(), this.f32103k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f32104l.getRequestIdNotice(), this.f32103k);
                    }
                } else if (this.f32096d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f32104l.getRequestIdNotice(), this.f32103k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f32104l.getRequestIdNotice(), this.f32103k);
                }
                o oVar = this.f32098f;
                if (oVar != null) {
                    oVar.a(str, this.f32102j, this.f32101i, this.f32097e, this.f32100h, this.f32103k);
                }
            } else if (this.f32098f != null) {
                this.f32098f.a(str, this.f32097e, this.f32100h, this.f32103k, b.b(880009, new MBridgeIds(this.f32102j, this.f32101i, this.f32097e), "readyState:" + i10, null, this.f32104l));
            }
            this.f32108p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f32093a;
            if (handler2 != null && (runnable2 = this.f32110r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f32107o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f32093a;
                if (handler3 != null && (runnable = this.f32109q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f32101i + "_" + this.f32100h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32101i + "_" + this.f32097e + "_" + this.f32100h, true);
                Runnable runnable3 = this.f32094b;
                if (runnable3 != null && (handler = this.f32093a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32103k;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                if (this.f32095c) {
                    if (this.f32104l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f32104l.getRequestIdNotice(), this.f32103k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f32104l.getRequestIdNotice(), this.f32103k);
                    }
                } else if (this.f32104l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f32104l.getRequestIdNotice(), this.f32103k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f32104l.getRequestIdNotice(), this.f32103k);
                }
                o oVar = this.f32098f;
                if (oVar != null) {
                    oVar.a(str2, this.f32102j, this.f32101i, this.f32097e, this.f32100h, this.f32103k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f32107o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32101i + "_" + this.f32097e + "_" + this.f32100h, false);
            Handler handler = this.f32093a;
            if (handler != null) {
                if (this.f32109q != null) {
                    handler.removeCallbacks(this.f32110r);
                }
                Runnable runnable = this.f32109q;
                if (runnable != null) {
                    this.f32093a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f32101i + "_" + this.f32100h;
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32103k;
                if (c0480a != null) {
                    c0480a.a(false);
                }
                if (this.f32098f != null) {
                    this.f32098f.a(str3, this.f32097e, str2, this.f32103k, b.b(880009, new MBridgeIds(this.f32102j, this.f32101i, this.f32097e), i10 + "#" + str, null, this.f32104l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32101i + "_" + this.f32097e + "_" + this.f32100h, false);
            Handler handler = this.f32093a;
            if (handler != null) {
                if (this.f32109q != null) {
                    handler.removeCallbacks(this.f32110r);
                }
                Runnable runnable = this.f32109q;
                if (runnable != null) {
                    this.f32093a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f32101i + "_" + this.f32100h;
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32103k;
                if (c0480a != null) {
                    c0480a.a(false);
                }
                if (this.f32098f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f32102j, this.f32101i, this.f32097e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f32098f.a(str, this.f32097e, this.f32100h, this.f32103k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f32104l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f32126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f32127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f32128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f32129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0480a f32130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CampaignEx f32131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f32132h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f32133i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f32134j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f32135k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, com.mbridge.msdk.videocommon.a.C0480a c0480a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f32126b = z10;
            this.f32127c = windVaneWebView;
            this.f32128d = str2;
            this.f32129e = str3;
            this.f32130f = c0480a;
            this.f32131g = campaignEx;
            this.f32125a = str;
            this.f32132h = z11;
            this.f32133i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f32131g, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f32135k) {
                return;
            }
            if (this.f32127c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f32125a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32127c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f32129e + "_" + this.f32131g.getId() + "_" + this.f32131g.getRequestId() + "_" + this.f32128d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32129e + "_" + this.f32133i + "_" + this.f32128d, true);
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32130f;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                if (this.f32126b) {
                    if (this.f32131g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f32130f, false, this.f32132h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f32130f, false, this.f32132h);
                    }
                } else if (this.f32131g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f32130f, false, this.f32132h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f32130f, false, this.f32132h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32129e + "_" + this.f32133i + "_" + this.f32128d, false);
                com.mbridge.msdk.videocommon.a.C0480a c0480a2 = this.f32130f;
                if (c0480a2 != null) {
                    c0480a2.a(false);
                }
            }
            this.f32135k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.f32134j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f32127c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f32125a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32127c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32129e + "_" + this.f32133i + "_" + this.f32128d, true);
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32130f;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                String str2 = this.f32129e + "_" + this.f32131g.getId() + "_" + this.f32131g.getRequestId() + "_" + this.f32128d;
                if (this.f32126b) {
                    if (this.f32131g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f32131g.getRequestIdNotice(), this.f32130f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f32130f, false, this.f32132h);
                    }
                } else if (this.f32131g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f32131g.getRequestIdNotice(), this.f32130f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f32130f, false, this.f32132h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f32134j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32129e + "_" + this.f32133i + "_" + this.f32128d, false);
            com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32130f;
            if (c0480a != null) {
                c0480a.a(false);
            }
            if (this.f32127c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f32125a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f32127c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f32136a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i10) {
        if (i10 == 200) {
            return MimeTypes.BASE_TYPE_VIDEO;
        }
        if (i10 == 201) {
            return "zip/html";
        }
        if (i10 != 203) {
            return i10 != 205 ? "unknown" : "tpl";
        }
        return "temp";
    }

    private b() {
        this.f31971c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f31972d = "down_type";
        this.f31973e = "h3c";
        this.f31974f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f31968g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f31969a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f32136a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f32063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f32066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f32067e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f32063a = handler;
            this.f32065c = str;
            this.f32064b = str2;
            this.f32066d = str3;
            this.f32067e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32064b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32065c);
            bundle.putString("request_id", this.f32066d);
            bundle.putString("key", this.f32067e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f32063a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f32064b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f32065c);
            bundle.putString("request_id", this.f32066d);
            bundle.putString("url", str2);
            bundle.putString("key", this.f32067e);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f32063a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f31968g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f31969a.a(str4, hVar);
        this.f31969a.a(context);
        this.f31969a.a(str4, copyOnWriteArrayList2);
        this.f31969a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0428b implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31985b;

        C0428b(int i10, CampaignEx campaignEx) {
            this.f31984a = i10;
            this.f31985b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f31984a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f31985b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f31985b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f31985b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f31984a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f31985b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f31985b);
            nVar.o(this.f31985b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f31985b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0428b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f31969a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f31969a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f32019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f32020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f32022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f32023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f32024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f32026h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f32027i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.a.C0480a f32028j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CampaignEx f32029k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f32030l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f32031m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f32032n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f32033o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f32034p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f32035q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f32036r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f32037s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f32038t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0480a c0480a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f32019a = handler;
            this.f32020b = runnable;
            this.f32021c = z11;
            this.f32022d = z12;
            this.f32023e = i10;
            this.f32024f = str;
            this.f32026h = str2;
            this.f32025g = str3;
            this.f32027i = str4;
            this.f32028j = c0480a;
            this.f32029k = campaignEx;
            this.f32030l = copyOnWriteArrayList;
            this.f32031m = cVar;
            this.f32032n = oVar;
            this.f32033o = z13;
            this.f32037s = z10;
            this.f32038t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f32029k, eVar);
            } catch (Throwable th2) {
                q0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f32035q) {
                return;
            }
            String str = this.f32025g + "_" + this.f32024f;
            if (i10 == 1) {
                if (this.f32033o) {
                    com.mbridge.msdk.videocommon.a.d(this.f32025g + "_" + this.f32027i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f32025g + "_" + this.f32027i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f32025g + "_" + this.f32027i + "_" + this.f32024f, this.f32028j, true, this.f32033o);
                Handler handler = this.f32019a;
                if (handler != null && (runnable = this.f32020b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32025g + "_" + this.f32027i + "_" + this.f32024f, true);
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32028j;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                o oVar = this.f32032n;
                if (oVar != null) {
                    oVar.a(str, this.f32026h, this.f32025g, this.f32027i, this.f32024f, this.f32028j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32025g + "_" + this.f32027i + "_" + this.f32024f, false);
                com.mbridge.msdk.videocommon.a.C0480a c0480a2 = this.f32028j;
                if (c0480a2 != null) {
                    c0480a2.a(false);
                }
                if (this.f32032n != null) {
                    this.f32032n.a(str, this.f32027i, this.f32024f, this.f32028j, b.b(880008, new MBridgeIds(this.f32026h, this.f32025g, this.f32027i), "readyState:" + i10, null, this.f32029k));
                }
            }
            this.f32035q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f32034p) {
                return;
            }
            String str2 = this.f32025g + "_" + this.f32024f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32025g + "_" + this.f32027i + "_" + this.f32024f, true);
                Handler handler = this.f32019a;
                if (handler != null && (runnable = this.f32020b) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32028j;
                if (c0480a != null) {
                    c0480a.a(true);
                }
                o oVar = this.f32032n;
                if (oVar != null) {
                    oVar.a(str2, this.f32026h, this.f32025g, this.f32027i, this.f32024f, this.f32028j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f32034p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f32025g + "_" + this.f32027i + "_" + this.f32024f, false);
            if (this.f32032n != null) {
                String str3 = this.f32025g + "_" + this.f32024f;
                com.mbridge.msdk.videocommon.a.C0480a c0480a = this.f32028j;
                if (c0480a != null) {
                    c0480a.a(false);
                }
                this.f32032n.a(str3, this.f32027i, this.f32024f, this.f32028j, b.b(880008, new MBridgeIds(this.f32026h, this.f32025g, this.f32027i), "onReceivedError： " + i10 + "  " + str, null, this.f32029k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f32025g, this.f32027i);
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f32037s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f32036r == 0 ? 3 : 6);
                        this.f32036r++;
                    }
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f31969a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f31969a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (cVarB == null) {
                        cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0187 A[Catch: all -> 0x0034, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0192 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            String str10 = str9 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (v0.i(str)) {
                    if (oVar != null) {
                        try {
                            oVar.a(str10, str3, str9, str5, str, null);
                        } catch (Exception e10) {
                            e = e10;
                            str8 = str10;
                        }
                    }
                    return;
                }
                str8 = str10;
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 2);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                    com.mbridge.msdk.videocommon.a.C0480a c0480a = new com.mbridge.msdk.videocommon.a.C0480a();
                    try {
                        try {
                            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                            if (campaignEx != null) {
                                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                            }
                            windVaneWebView2.setTempTypeForMetrics(2);
                            try {
                                c0480a.a(windVaneWebView2);
                                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                                } else {
                                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                                }
                                com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                                kVar2.g(i10);
                                kVar2.setUnitId(str9);
                                kVar2.setRewardUnitSetting(cVar);
                                kVar2.d(z10);
                                str7 = str5;
                                try {
                                    windVaneWebView2.setWebViewListener(new p(handler, null, z11, z12, str7, oVar, windVaneWebView, str, str3, str9, c0480a, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                    windVaneWebView2.setObject(kVar2);
                                    windVaneWebView2.loadUrl(str2);
                                    windVaneWebView2.setRid(str7);
                                } catch (Exception e11) {
                                    e = e11;
                                    str9 = str9;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                    }
                                    if (oVar != null) {
                                        oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str7 = str5;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (Exception unused) {
                        if (oVar != null) {
                            c0480a.a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str9);
                            sb2.append("_");
                            sb2.append(str);
                            oVar.a(sb2.toString(), str3, str9, str5, str, c0480a);
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        if (oVar != null) {
                            c0480a.a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str9);
                            sb3.append("_");
                            sb3.append(str);
                            oVar.a(sb3.toString(), str3, str9, str5, str, c0480a);
                            return;
                        }
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                str7 = str5;
            } catch (Exception e15) {
                e = e15;
                str7 = str5;
                str8 = str10;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
            if (oVar != null) {
                oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
            }
        }
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            this.f31970b = z13;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f31970b = z13;
            if (v0.i(str5)) {
                if (oVar != null) {
                    oVar.a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                com.mbridge.msdk.videocommon.a.C0480a c0480a = new com.mbridge.msdk.videocommon.a.C0480a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                c0480a.a(windVaneWebView);
                String strB = com.mbridge.msdk.video.bt.component.d.c().b();
                String strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
                c0480a.a(strB2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str9);
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i11, campaignEx2);
                                }
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                } else {
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                }
                kVar.g(i10);
                kVar.setUnitId(str7);
                kVar.c(strB2);
                kVar.d(strB);
                kVar.c(true);
                kVar.setRewardUnitSetting(cVar);
                kVar.d(z10);
                com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                try {
                    str9 = str4;
                    str8 = str;
                    try {
                        windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0480a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                        windVaneWebView.setObject(kVar2);
                        windVaneWebView.loadUrl(str6);
                        windVaneWebView.setRid(str8);
                        MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTRootLayout.setInstanceId(strB);
                        mBridgeBTRootLayout.setUnitId(str9);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strB2);
                        mBridgeBTLayout.setUnitId(str9);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        AbstractMap abstractMapB = com.mbridge.msdk.video.bt.component.d.c().b(str9, str8);
                        abstractMapB.put(strB2, mBridgeBTLayout);
                        abstractMapB.put(strB, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e10) {
                        e = e10;
                        if (oVar != null) {
                            oVar.a(str10, str8, str5, null, b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e12) {
                e = e12;
                str8 = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0480a c0480a = new com.mbridge.msdk.videocommon.a.C0480a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0480a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                requestId = requestId2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0480a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
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
            q0.b("RewardCampaignsResourceManager", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}
