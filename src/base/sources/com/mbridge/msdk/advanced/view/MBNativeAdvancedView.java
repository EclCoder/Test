package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBNativeAdvancedView extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f28304i = "MBAdvancedNativeView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNativeAdvancedWebview f28305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f28306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    MBAdChoice f28310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.advanced.signal.b f28311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f28312h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBNativeAdvancedView.f28304i, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.f28305a.getLocationOnScreen(iArr);
                    q0.b(MBNativeAdvancedView.f28304i, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBNativeAdvancedView.f28304i, th2.getMessage(), th2);
                }
                f.a().a((WebView) MBNativeAdvancedView.this.f28305a, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28305a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.f28305a, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.f28306b;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = v0.a(getContext(), 2.0f);
                layoutParams.topMargin = v0.a(getContext(), 2.0f);
                addView(this.f28306b, layoutParams);
            } else {
                bringChildToFront(this.f28306b);
            }
        }
        if (this.f28310f == null) {
            MBAdChoice mBAdChoice = new MBAdChoice(getContext());
            this.f28310f = mBAdChoice;
            mBAdChoice.setFeedbackDialogEventListener(new a());
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f28305a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28305a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.f28305a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f28305a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.f28311g);
            this.f28305a.post(new b());
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        q0.b(f28304i, "transInfoForMraid");
        try {
            int i14 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = "landscape";
            } else {
                str = i14 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fN = m0.n(c.n().d());
            float fM = m0.m(c.n().d());
            HashMap mapV = m0.v(c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f28304i, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f28306b;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f28309e = false;
        this.f28308d = false;
        this.f28307c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f28306b;
        if (view != null && view.getParent() != null) {
            removeView(this.f28306b);
        }
        MBAdChoice mBAdChoice = this.f28310f;
        if (mBAdChoice == null || mBAdChoice.getParent() == null) {
            return;
        }
        removeView(this.f28310f);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28305a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.f28305a.release();
            com.mbridge.msdk.advanced.signal.a.a(this.f28305a, "onSystemDestory", "");
        }
        if (this.f28312h != null) {
            this.f28312h = null;
        }
    }

    public com.mbridge.msdk.advanced.signal.b getAdvancedNativeSignalCommunicationImpl() {
        return this.f28311g;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f28305a;
    }

    public View getCloseView() {
        return this.f28306b;
    }

    public boolean isEndCardReady() {
        return this.f28309e;
    }

    public boolean isH5Ready() {
        return this.f28307c;
    }

    public boolean isVideoReady() {
        return this.f28308d;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f28309e = false;
        this.f28308d = false;
        this.f28307c = false;
    }

    public void setAdChoiceCampaign(CampaignEx campaignEx) {
        MBAdChoice mBAdChoice = this.f28310f;
        if (mBAdChoice != null) {
            mBAdChoice.setCampaign(campaignEx);
            if (this.f28310f.getParent() != null) {
                bringChildToFront(this.f28310f);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(c.n().d(), 6.0f), v0.a(c.n().d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f28310f, layoutParams);
        }
    }

    public void setAdvancedNativeSignalCommunicationImpl(com.mbridge.msdk.advanced.signal.b bVar) {
        this.f28311g = bVar;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f28305a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.f28305a = mBNativeAdvancedWebview;
        com.mbridge.msdk.advanced.signal.b bVar = this.f28311g;
        if (bVar != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setCloseView(View view) {
        this.f28306b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z10) {
        this.f28309e = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f28307c = z10;
    }

    public void setVideoReady(boolean z10) {
        this.f28308d = z10;
    }

    public void show() {
        b();
        clearResState();
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28312h = context;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f28304i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f28304i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f28304i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }
}
