package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f28391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CampaignEx f28392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppletsModel f28393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f28394d;

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f28391a = nativeTrackingListener;
        this.f28392b = campaignEx;
        this.f28393c = appletsModel;
        this.f28394d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f28392b;
        if (campaignEx == null || this.f28393c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f28391a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f28393c.setUserClick(false);
            this.f28393c.setRequestingFinish();
            this.f28392b.setClickURL(str2);
            a aVar = this.f28394d;
            if (aVar != null) {
                try {
                    aVar.a(this.f28392b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f28392b;
        if (campaignEx == null || this.f28393c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f28391a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f28393c.setUserClick(false);
            this.f28393c.setRequestingFinish();
            this.f28392b.setDeepLinkUrl(str);
            a aVar = this.f28394d;
            if (aVar != null) {
                try {
                    aVar.a(this.f28392b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestStart() {
    }
}
