package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f34094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ViewGroup f34095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RelativeLayout f34096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f34097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RoundImageView f34098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f34099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f34100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f34101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView f34102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f34103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f34104z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeBTNativeEC.this.D = true;
            if (MBridgeBTNativeEC.this.H != null) {
                MBridgeBTNativeEC.this.H.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.C) {
                MBridgeBTNativeEC.this.a(1, view.getContext());
                MBridgeBTNativeEC.this.a(view.getX(), view.getY());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.K != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", MBridgeBTNativeEC.this.f34021d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", MBridgeBTNativeEC.this.I);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    q0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                } catch (JSONException e10) {
                    q0.a(BTBaseView.TAG, e10.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends com.mbridge.msdk.widget.a {
        d() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeBTNativeEC.this.a(0, view.getContext());
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends com.mbridge.msdk.widget.a {
        e() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends com.mbridge.msdk.widget.a {
        f() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f34018a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iC = c();
        if (i0.a(iC)) {
            this.f34025h = b(iC);
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new a();
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.f34025h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f34021d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.I);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                q0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e10) {
                q0.a(BTBaseView.TAG, e10.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f34021d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.I);
                jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject4);
                q0.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e11) {
                q0.a(BTBaseView.TAG, e11.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        this.f34024g = i10;
        if (i10 == 2) {
            removeView(this.f34094p);
            b(this.f34095q);
        } else {
            removeView(this.f34095q);
            b(this.f34094p);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            CampaignEx campaignEx = this.f34019b;
            if (campaignEx == null || !this.f34025h) {
                return;
            }
            if (campaignEx.getCbd() > -2) {
                this.E = this.f34019b.getCbd();
            } else {
                com.mbridge.msdk.videocommon.setting.c cVar = this.f34022e;
                if (cVar != null) {
                    this.E = cVar.i();
                }
            }
            com.mbridge.msdk.foundation.same.image.b.a(this.f34018a.getApplicationContext()).a(this.f34019b.getImageUrl(), new com.mbridge.msdk.video.module.listener.impl.e(this.f34098t, this.f34019b, this.I));
            com.mbridge.msdk.foundation.same.image.b.a(this.f34018a.getApplicationContext()).a(this.f34019b.getIconUrl(), new j(this.f34099u, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            this.f34103y.setText(this.f34019b.getAppName());
            this.f34104z.setText(this.f34019b.getAppDesc());
            this.A.setText(this.f34019b.getNumberRating() + ")");
            this.B.removeAllViews();
            if (com.mbridge.msdk.util.b.a()) {
                setChinaCTAData(this.f34019b);
            }
            double rating = this.f34019b.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            this.B.initScore(rating);
            try {
                Bitmap bitmapA = a(this.f34098t.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.f34097s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.f34097s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f34019b.getendcard_url()) && this.f34019b.getendcard_url().contains("alecfc=1")) {
                this.C = true;
            }
            if (!TextUtils.isEmpty(this.f34019b.getendcard_url()) && this.f34019b.getendcard_url().contains("wlgo=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f34100v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            } else {
                this.f34100v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            }
            if (!this.G) {
                this.f34100v.setVisibility(4);
                this.f34102x.setVisibility(4);
            }
            v0.a(2, this.f34101w, this.f34019b, this.f34018a, true, null);
            if (this.D) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    private void b(View view) {
        if (view == null) {
            init(this.f34018a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        a(view);
        b();
    }

    private int c() {
        return findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Context context) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f30488j, a(i10));
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (JSONException e11) {
                e = e11;
                jSONObject = null;
            }
            if (this.J != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    doChinaJumpClick(context, this.J);
                }
                this.J.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f34023f.inflate(i10, (ViewGroup) null);
            this.f34095q = viewGroup;
            addView(viewGroup);
            return a(this.f34095q);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f34023f.inflate(i10, (ViewGroup) null);
        this.f34094p = viewGroup2;
        addView(viewGroup2);
        return a(this.f34094p);
    }

    private boolean a(View view) {
        try {
            this.f34096r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f34097s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f34098t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f34099u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f34100v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f34101w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f34103y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f34104z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f34102x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f34097s, this.f34098t, this.f34099u, this.f34103y, this.f34104z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    protected void b() {
        if (this.f34025h) {
            this.f34096r.setOnClickListener(new b());
            this.H.setOnClickListener(new c());
            this.ctaView.setOnClickListener(new d());
            this.f34099u.setOnClickListener(new e());
            this.f34098t.setOnClickListener(new f());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f10, float f11) {
        if (this.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f34016n);
                jSONObject.put("id", this.f34021d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f10));
                jSONObject2.put("y", String.valueOf(f11));
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a(this.K, "onClicked", this.f34021d);
            }
        }
    }
}
