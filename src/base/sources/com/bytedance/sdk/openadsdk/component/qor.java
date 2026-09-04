package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b6.a;
import b6.b;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.dkl.aq;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private aq apu;
    protected FrameLayout aq;
    private final com.bytedance.sdk.openadsdk.component.ojm.aq as = new com.bytedance.sdk.openadsdk.component.ojm.aq();
    protected final com.bytedance.sdk.openadsdk.component.aq.hnj bug;
    protected final int dkl;
    protected aq dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.component.aq.qor f30do;
    protected int dse;
    private float eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private PAGLogoView f13374fc;
    protected final FrameLayout gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final as f13375hn;
    protected final Activity hnj;
    private aq jip;
    private ImageView mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private uua f13376oj;
    protected View ojm;
    private RelativeLayout orl;
    protected final boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.hnj f13377sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.dkl.gjv f13378ta;
    private com.bytedance.sdk.openadsdk.core.dkl.gjv tgn;
    private aq tu;
    private ImageView uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private View f13379vf;
    private float wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private aq f13380xn;
    private jip xyo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn implements com.bytedance.sdk.openadsdk.utils.uua.hnj {
        private final WeakReference<qor> hnj;

        public hn(qor qorVar) {
            this.hnj = new WeakReference<>(qorVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.uua.hnj
        public void hnj() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.uua.hnj
        public void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
            qor qorVar;
            if (!hnVar.sk() || (qorVar = this.hnj.get()) == null) {
                return;
            }
            qorVar.hnj(hnVar);
            if (hnVar.hn() != null) {
                qorVar.hnj(hnVar.hnj());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj implements dkl.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final WeakReference<qor> f13381hn;
        WeakReference<Activity> hnj;

        hnj(Activity activity, qor qorVar) {
            this.hnj = new WeakReference<>(activity);
            this.f13381hn = new WeakReference<>(qorVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.dkl.qor
        public void hnj(Object obj) {
            qor qorVar;
            if (this.hnj.get() == null || this.hnj.get().isFinishing() || (qorVar = this.f13381hn.get()) == null) {
                return;
            }
            qorVar.hnj(obj);
        }
    }

    public qor(Activity activity, as asVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.hnj hnjVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar2) {
        this.hnj = activity;
        this.f13375hn = asVar;
        this.gjv = frameLayout;
        this.dse = i10;
        this.qor = z10;
        this.f13377sk = hnjVar;
        this.dkl = asVar.atw();
        this.bug = hnjVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private void aq() {
        boolean z10;
        this.as.hnj();
        this.jip.setText(this.f13375hn.cq());
        if (this.f13375hn.nyv()) {
            ojm();
            return;
        }
        if (this.qor) {
            hn(0);
            hnj(8);
            if (hnj(this.aq)) {
                this.f13377sk.qor();
            } else {
                this.f13377sk.gjv();
            }
            dkl.hnj(this.f13375hn, new hnj(this.hnj, this), 25);
        } else {
            hn(8);
            hnj(0);
            ta();
            this.f13377sk.qor();
        }
        boolean z11 = true;
        if (this.tu == null) {
            z10 = false;
        } else {
            if (!TextUtils.isEmpty(this.f13375hn.mw())) {
                this.tu.setText(this.f13375hn.mw());
            } else if (this.f13375hn.zyh() != null) {
                this.tu.setText(this.f13375hn.zyh().hn());
            } else {
                z10 = false;
            }
            z10 = true;
        }
        if (this.tgn != null) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.f13375hn.mn(), this.tgn, this.f13375hn);
        }
        jip jipVar = this.xyo;
        if (jipVar != null) {
            sq.hnj((TextView) null, jipVar, this.f13375hn);
            if (this.f13375hn.zyh() == null || this.f13375hn.zyh().gjv() < 0.0d) {
                this.xyo.setVisibility(8);
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        View view = this.f13379vf;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    private void ojm() {
        if (this.f13380xn != null) {
            if (this.f13375hn.zyh() != null && !TextUtils.isEmpty(this.f13375hn.zyh().hn())) {
                this.f13380xn.setText(this.f13375hn.zyh().hn());
            } else if (TextUtils.isEmpty(this.f13375hn.mw())) {
                this.f13380xn.setVisibility(8);
            } else {
                this.f13380xn.setText(this.f13375hn.mw());
            }
        }
        if (this.apu != null) {
            if (TextUtils.isEmpty(this.f13375hn.kby())) {
                this.apu.setVisibility(8);
            } else {
                this.apu.setText(this.f13375hn.kby());
            }
        }
        if (this.f13376oj != null && this.f13375hn.mn() != null && !TextUtils.isEmpty(this.f13375hn.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.f13375hn.mn().hnj(), this.f13375hn.mn().hn(), this.f13375hn.mn().qor(), this.f13376oj, this.f13375hn);
        }
        this.f13377sk.qor();
    }

    private void ta() {
        oj ojVar = this.f13375hn.lx().get(0);
        com.bytedance.sdk.openadsdk.utils.uua.hnj(new com.bytedance.sdk.openadsdk.apu.hnj(ojVar.hnj(), ojVar.dse()), ojVar.hn(), ojVar.qor(), new hn(this), com.bytedance.sdk.openadsdk.component.dse.hnj.hn(TextUtils.isEmpty(ojVar.dse()) ? com.bytedance.sdk.component.utils.sk.hnj(ojVar.hnj()) : ojVar.dse()).getParent(), 25);
    }

    protected void dkl() {
        View view = this.ojm;
        if (view == null || this.f13378ta == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.qor.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.hnj hnjVar = qor.this.f13377sk;
                if (hnjVar != null) {
                    hnjVar.hn(view2);
                }
            }
        });
        this.f13378ta.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.qor.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.hnj hnjVar = qor.this.f13377sk;
                if (hnjVar != null) {
                    hnjVar.hnj(view2);
                }
            }
        });
    }

    public com.bytedance.sdk.openadsdk.component.aq.qor dse() {
        return this.f30do;
    }

    public int gjv() {
        return -1;
    }

    public void hn() {
        Window window;
        if (this.f13375hn.ux()) {
            this.f13377sk.qor();
        } else {
            aq();
        }
        Activity activity = this.hnj;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public JSONObject hnj(JSONObject jSONObject) {
        return null;
    }

    public void qor() {
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar = this.f30do;
        if (qorVar != null) {
            qorVar.bug();
        }
    }

    public void hnj(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.ojm.qor gjvVar = new com.bytedance.sdk.openadsdk.component.ojm.gjv(this.hnj, this.f13375hn);
        int iIzk = this.f13375hn.izk();
        if (iIzk == 5) {
            gjvVar = new com.bytedance.sdk.openadsdk.component.ojm.dkl(this.hnj, this.f13375hn);
        } else if (iIzk == 4) {
            gjvVar = new com.bytedance.sdk.openadsdk.component.ojm.sk(this.hnj, this.f13375hn);
        }
        com.bytedance.sdk.openadsdk.component.ojm.qor qorVar = gjvVar;
        this.orl = qorVar;
        viewGroup.addView(qorVar);
        this.uua = qorVar.getBackImage();
        this.aq = qorVar.getVideoContainer();
        this.mjg = qorVar.getImageView();
        this.jip = qorVar.getClickButton();
        this.f13374fc = qorVar.getAdLogo();
        this.tu = qorVar.getAdTitleTextView();
        this.tgn = qorVar.getAdIconView();
        this.xyo = qorVar.getScoreBar();
        this.f13379vf = qorVar.getOverlayLayout();
        if (this.f13375hn.nyv()) {
            this.f13376oj = qorVar.getIconOnlyView();
            this.f13380xn = qorVar.getTitle();
            this.apu = qorVar.getContent();
        }
        if (qorVar.getDspAdChoice() != null) {
            qorVar.getDspAdChoice().hnj(14, this.f13375hn);
        }
        if (!this.f13375hn.ux()) {
            this.as.hnj(qorVar, this.f13375hn, this.wu, this.eum, this.qor);
        }
        this.ojm = qorVar.getTopDisLike();
        this.f13378ta = qorVar.getTopSkip();
        this.dnm = qorVar.getTopCountDown();
        if (qorVar instanceof com.bytedance.sdk.openadsdk.component.ojm.sk) {
            ((com.bytedance.sdk.openadsdk.component.ojm.sk) qorVar).setRenderListener(new com.bytedance.sdk.openadsdk.component.ojm.sk.hnj() { // from class: com.bytedance.sdk.openadsdk.component.qor.1
                @Override // com.bytedance.sdk.openadsdk.component.ojm.sk.hnj
                public void hnj(View view, int i10) {
                    qor.this.f13377sk.sk();
                }
            });
        }
    }

    private void hn(int i10) {
        sq.hnj((View) this.aq, i10);
    }

    public void sk() {
    }

    public void hnj() {
        this.f13374fc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.qor.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    qor qorVar = qor.this;
                    TTWebsiteActivity.hnj(qorVar.hnj, qorVar.f13375hn, "open_ad");
                } catch (Throwable th2) {
                    apu.qor("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        dkl();
        if (this.f13375hn.ux()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.hnj.hnj hnjVarHnj = com.bytedance.sdk.openadsdk.component.hnj.hn.hnj(this.f13375hn, this.hnj, this.bug);
        hnjVarHnj.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.qor.3
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                qor.this.f13377sk.sk();
            }
        });
        hnjVarHnj.hnj(this.f30do);
        if (this.f13375hn.ka() == 1) {
            this.orl.setOnClickListener(hnjVarHnj);
            this.orl.setOnTouchListener(hnjVarHnj);
        }
        this.jip.setOnClickListener(hnjVarHnj);
        this.jip.setOnTouchListener(hnjVarHnj);
    }

    protected boolean hnj(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.aq.qor qorVar = new com.bytedance.sdk.openadsdk.component.aq.qor(this.hnj);
        this.f30do = qorVar;
        return qorVar.hnj(frameLayout, this.f13377sk, this.f13375hn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.uua.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.oj.hnj().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            apu.qor("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
        if (this.mjg == null) {
            return;
        }
        if (hnVar.hn() != null) {
            this.mjg.setImageBitmap(hnVar.hn());
            return;
        }
        Drawable drawableGjv = hnVar.gjv();
        if (drawableGjv != null) {
            this.mjg.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawableGjv)) {
                b.a(drawableGjv).start();
            }
            this.mjg.setImageDrawable(drawableGjv);
            return;
        }
        if (this.f13375hn.lx() == null || this.f13375hn.lx().get(0) == null) {
            return;
        }
        Drawable drawableHnj = com.bytedance.sdk.openadsdk.utils.uua.hnj(hnVar.qor(), this.f13375hn.lx().get(0).hn());
        this.mjg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mjg.setImageDrawable(drawableHnj);
    }

    void hnj(int i10) {
        sq.hnj((View) this.mjg, i10);
    }

    public void hnj(float f10, float f11) {
        this.wu = f10;
        this.eum = f11;
    }

    public void hnj(int i10, boolean z10) {
        aq aqVar;
        if (this.f13378ta == null || (aqVar = this.dnm) == null) {
            return;
        }
        if (z10) {
            if (aqVar.getVisibility() != 8) {
                this.dnm.setVisibility(8);
            }
            if (this.f13378ta.getVisibility() != 0) {
                this.f13378ta.setVisibility(0);
                return;
            }
            return;
        }
        this.dnm.setText(i10 + "s");
        if (this.dnm.getVisibility() != 0) {
            this.dnm.setVisibility(0);
        }
    }
}
