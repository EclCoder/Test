package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f32839v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f32840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f32841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f32843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f32844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f32845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f32846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f32847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f32848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f32849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f32850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f32851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Handler f32853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f32855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f32856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f32857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f32858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View.OnClickListener f32859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View.OnClickListener f32860u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements j {
        a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f32842c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32862a;

        b(boolean z10) {
            this.f32862a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f32862a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f32845f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements com.mbridge.msdk.foundation.same.image.c {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f32847h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements com.mbridge.msdk.foundation.same.image.c {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f32846g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f32851l != null) {
                if (BaseSplashPopView.this.f32852m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f32851l.setText(String.valueOf(BaseSplashPopView.this.f32852m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f32853n.postDelayed(baseSplashPopView.f32857r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f32852m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f32853n.removeCallbacks(baseSplashPopView2.f32857r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f32844e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f32840a, baseSplashPopView3.f32841b), 5);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f32844e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f32840a, baseSplashPopView.f32841b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f32842c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f32844e != null) {
                baseSplashPopView.b(baseSplashPopView.f32843d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f32852m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f32844e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f32840a, baseSplashPopView.f32841b), 4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f32873d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f32870a = str;
            this.f32871b = str2;
            this.f32872c = i10;
            this.f32873d = campaignEx;
        }

        public CampaignEx a() {
            return this.f32873d;
        }

        public String b() {
            return this.f32870a;
        }

        public String c() {
            return this.f32871b;
        }

        public int d() {
            return this.f32872c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f32842c = 1;
        this.f32852m = -1;
        this.f32853n = new Handler();
        this.f32854o = false;
        this.f32856q = new a();
        this.f32857r = new e();
        this.f32858s = new f();
        this.f32859t = new g();
        this.f32860u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f32841b = iVar.c();
        this.f32840a = iVar.b();
        this.f32842c = iVar.d();
        this.f32843d = iVar.a();
        this.f32844e = dVar;
        a();
    }

    static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f32852m;
        baseSplashPopView.f32852m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f32839v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32844e != null) {
            postDelayed(this.f32858s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f32854o = true;
        if (this.f32851l != null) {
            this.f32853n.removeCallbacks(this.f32857r);
        }
    }

    public void reStartCountDown() {
        if (this.f32854o) {
            this.f32854o = false;
            int i10 = this.f32852m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f32851l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f32853n.postDelayed(this.f32857r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f32853n.removeCallbacks(this.f32858s);
            this.f32853n.removeCallbacks(this.f32857r);
            this.f32857r = null;
            detachAllViewsFromParent();
            this.f32843d = null;
            this.f32844e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f32841b = iVar.c();
        this.f32840a = iVar.b();
        this.f32842c = iVar.d();
        this.f32843d = iVar.a();
        this.f32844e = dVar;
        a();
    }

    public void startCountDown() {
        this.f32853n.removeCallbacks(this.f32857r);
        CampaignEx campaignEx = this.f32843d;
        if (campaignEx == null || this.f32842c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f32852m = flbSkipTime;
        TextView textView = this.f32851l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f32853n.postDelayed(this.f32857r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f32848i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f32845f.getId());
        this.f32848i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            q0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f32848i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f32848i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f32845f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f32845f.setId(generateViewId());
        this.f32845f.setLayoutParams(layoutParams2);
        this.f32845f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f32843d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f32843d.getIconUrl(), true);
        }
        this.f32851l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f32851l.setId(generateViewId());
        this.f32851l.setTextSize(10.0f);
        this.f32851l.setTextColor(-1);
        this.f32851l.setGravity(17);
        this.f32851l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f32851l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f32851l.setLayoutParams(layoutParams3);
        this.f32851l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f32851l);
        addView(this.f32845f);
        CampaignEx campaignEx2 = this.f32843d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f32843d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f32843d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f32859t);
        this.f32851l.setOnClickListener(this.f32860u);
    }

    private void d() {
        this.f32847h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f32847h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f32847h.setId(generateViewId());
        this.f32847h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f32843d.getImageUrl());
        this.f32846g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f32846g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f32846g.setId(generateViewId());
        this.f32846g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f32843d.getImageUrl());
        this.f32845f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f32847h.getId());
        layoutParams3.topMargin = 20;
        this.f32845f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f32845f.setId(generateViewId());
        this.f32845f.setLayoutParams(layoutParams3);
        a(this.f32843d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f32845f.getId());
        layoutParams4.addRule(6, this.f32845f.getId());
        layoutParams4.addRule(8, this.f32845f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f32849j = textView;
        textView.setId(generateViewId());
        this.f32849j.setGravity(16);
        this.f32849j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f32849j.setTextSize(12.0f);
        this.f32849j.setTextColor(-16777216);
        TextView textView2 = this.f32849j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f32849j.setMarqueeRepeatLimit(-1);
        this.f32849j.setSelected(true);
        this.f32849j.setSingleLine(true);
        this.f32849j.setText(this.f32843d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f32850k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f32849j.getId());
        layoutParams5.addRule(3, this.f32849j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f32850k.setGravity(16);
        this.f32850k.setLayoutParams(layoutParams5);
        this.f32850k.setTextSize(8.0f);
        this.f32850k.setTextColor(-10066330);
        this.f32850k.setEllipsize(truncateAt);
        this.f32850k.setMarqueeRepeatLimit(-1);
        this.f32850k.setSelected(true);
        this.f32850k.setSingleLine(true);
        this.f32850k.setText(this.f32843d.getAppDesc());
        relativeLayout.addView(this.f32849j);
        relativeLayout.addView(this.f32850k);
        addView(this.f32847h);
        addView(this.f32846g);
        addView(this.f32845f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f32843d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f32843d.getBidToken(), eVar, this.f32843d, this.f32841b).t(), this.f32843d.getLocalAllowTrackClick());
        setOnClickListener(this.f32859t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f32845f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f32845f.setId(generateViewId());
        this.f32845f.setLayoutParams(layoutParams);
        this.f32845f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f32845f.setPadding(iA, iA, iA, iA);
        a(this.f32843d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f32845f.getId());
        layoutParams2.addRule(6, this.f32845f.getId());
        layoutParams2.addRule(8, this.f32845f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f32849j = textView;
        textView.setId(generateViewId());
        this.f32849j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f32849j.setGravity(16);
        this.f32849j.setTextSize(12.0f);
        this.f32849j.setSelected(true);
        TextView textView2 = this.f32849j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f32849j.setMarqueeRepeatLimit(-1);
        this.f32849j.setSingleLine(true);
        this.f32849j.setTextColor(-16777216);
        this.f32849j.setText(this.f32843d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f32850k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f32849j.getId());
        layoutParams3.addRule(3, this.f32849j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f32850k.setGravity(16);
        this.f32850k.setLayoutParams(layoutParams3);
        this.f32850k.setTextSize(8.0f);
        this.f32850k.setTextColor(-10066330);
        this.f32850k.setEllipsize(truncateAt);
        this.f32850k.setMarqueeRepeatLimit(-1);
        this.f32850k.setSelected(true);
        this.f32850k.setSingleLine(true);
        this.f32850k.setText(this.f32843d.getAppDesc());
        relativeLayout.addView(this.f32849j);
        relativeLayout.addView(this.f32850k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f32845f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f32843d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f32843d.getBidToken(), eVar, this.f32843d, this.f32841b).t(), this.f32843d.getLocalAllowTrackClick());
        setOnClickListener(this.f32859t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f32845f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f32845f.setId(generateViewId());
        this.f32845f.setLayoutParams(layoutParams);
        this.f32845f.setPadding(iA, iA, iA, iA);
        this.f32845f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f32843d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f32849j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f32845f.getId());
        layoutParams2.addRule(6, this.f32845f.getId());
        layoutParams2.addRule(8, this.f32845f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f32849j.setLayoutParams(layoutParams2);
        this.f32849j.setGravity(16);
        this.f32849j.setTextSize(10.0f);
        this.f32849j.setSelected(true);
        this.f32849j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f32849j.setMarqueeRepeatLimit(-1);
        this.f32849j.setSingleLine(true);
        this.f32849j.setTextColor(-16777216);
        this.f32849j.setText(this.f32843d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f32845f);
        addView(this.f32849j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f32843d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f32843d.getBidToken(), eVar, this.f32843d, this.f32841b).t(), this.f32843d.getLocalAllowTrackClick());
        setOnClickListener(this.f32859t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f32851l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f32851l.setLayoutParams(layoutParams);
            this.f32851l.setText("");
            this.f32851l.setSelected(true);
            this.f32851l.setBackgroundResource(getResources().getIdentifier(KPtaxpyICj.zpesQaDnxwdES, "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    private void a() {
        if (this.f32843d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f32842c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new b(z10));
    }

    protected void a(CampaignEx campaignEx) {
        if (this.f32855p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32841b);
            this.f32855p = aVar;
            aVar.a(this.f32856q);
        }
        campaignEx.setCampaignUnitId(this.f32841b);
        this.f32855p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f32844e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f32840a, this.f32841b));
            this.f32844e.a(new MBridgeIds(this.f32840a, this.f32841b), 6);
        }
    }

    protected void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f32841b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f32842c = 1;
        this.f32852m = -1;
        this.f32853n = new Handler();
        this.f32854o = false;
        this.f32856q = new a();
        this.f32857r = new e();
        this.f32858s = new f();
        this.f32859t = new g();
        this.f32860u = new h();
        this.f32842c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32842c = 1;
        this.f32852m = -1;
        this.f32853n = new Handler();
        this.f32854o = false;
        this.f32856q = new a();
        this.f32857r = new e();
        this.f32858s = new f();
        this.f32859t = new g();
        this.f32860u = new h();
        this.f32842c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32842c = 1;
        this.f32852m = -1;
        this.f32853n = new Handler();
        this.f32854o = false;
        this.f32856q = new a();
        this.f32857r = new e();
        this.f32858s = new f();
        this.f32859t = new g();
        this.f32860u = new h();
        this.f32842c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f32842c = 1;
        this.f32852m = -1;
        this.f32853n = new Handler();
        this.f32854o = false;
        this.f32856q = new a();
        this.f32857r = new e();
        this.f32858s = new f();
        this.f32859t = new g();
        this.f32860u = new h();
        this.f32842c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
