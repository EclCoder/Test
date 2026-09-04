package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.component.d;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static int f34016n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static int f34017o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f34018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f34019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f34020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f34021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f34022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LayoutInflater f34023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f34024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f34025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f34026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f34027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Rect f34028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f34029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f34030m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    protected JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f30486h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34026i));
                jSONObject2.put(a.f30487i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34027j));
                jSONObject2.put(a.f30491m, i10);
                try {
                    this.f34024g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(a.f30489k, this.f34024g);
                jSONObject2.put(a.f30490l, v0.d(getContext()));
                return jSONObject2;
            } catch (JSONException e11) {
                e = e11;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return i0.a(this.f34018a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return i0.a(this.f34018a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return i0.a(this.f34018a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f34018a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f34019b;
    }

    public String getInstanceId() {
        return this.f34021d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f34028k;
    }

    public String getUnitId() {
        return this.f34020c;
    }

    public int getViewHeight() {
        return this.f34030m;
    }

    public int getViewWidth() {
        return this.f34029l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f34018a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f34024g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34026i = motionEvent.getRawX();
        this.f34027j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f34024g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f34019b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f34021d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f34029l = i10;
        this.f34030m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f34028k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f34022e = cVar;
    }

    public void setUnitId(String str) {
        this.f34020c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34021d = "";
        this.f34024g = 1;
        this.f34025h = false;
        this.f34018a = context;
        this.f34023f = LayoutInflater.from(context);
        init(context);
    }

    protected static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34016n);
            jSONObject.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            d.c().a(webView, e10.getMessage());
            q0.a(TAG, e10.getMessage());
        }
    }

    protected void b() {
    }
}
