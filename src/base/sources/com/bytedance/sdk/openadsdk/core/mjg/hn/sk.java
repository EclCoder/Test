package com.bytedance.sdk.openadsdk.core.mjg.hn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.apu;
import com.bytedance.sdk.openadsdk.core.widget.xn;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import v6.b;
import v6.c;
import v6.d;
import v6.e;
import x6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements d, a, xyo.hnj, com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj, apu.hn, xn.hnj {
    int apu;
    ImageView aq;
    int as;
    View bug;
    View dkl;
    ImageView dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    int f38do;
    View dse;
    boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    TextView f13821fc;
    private dkl.hnj fvt;
    c gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.qor.hnj f13822gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final int f13823hn;
    protected final int hnj;
    boolean hqh;
    TextView jip;
    TextView mjg;
    com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    int f13824oj;
    View ojm;
    com.bytedance.sdk.openadsdk.core.widget.hnj orl;
    private long orp;
    x6.c pty;
    ViewGroup qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    ImageView f13825sk;
    private final String sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    View f13826ta;
    Context tgn;
    as tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    boolean f13827ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.qor.hnj f13828ul;
    int uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    hnj f13829vf;
    boolean wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    int f13830xn;
    apu xyo;

    public sk(Context context, ViewGroup viewGroup, boolean z10, int i10, as asVar, x6.c cVar, boolean z11) {
        this.hnj = 228;
        this.f13823hn = 160;
        this.eum = true;
        this.hqh = true;
        this.f13827ua = true;
        this.sq = Build.MODEL;
        if (this instanceof gjv) {
            return;
        }
        this.tgn = oj.hnj().getApplicationContext();
        gjv(z11);
        this.qor = viewGroup;
        this.eum = z10;
        this.f38do = i10;
        this.pty = cVar;
        this.tu = asVar;
        gjv(8);
        hnj(context, this.qor);
        gjv();
        bug();
    }

    private boolean tu() {
        return as.sk(this.tu) && (!com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.tu.rq()) ? this.tu.zd() == null : this.tu.vk() == null) && this.tu.znr() == 1;
    }

    public void apu() {
        ImageView imageView = this.dnm;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar = this.orl;
        if (hnjVar != null) {
            hnjVar.setImageBitmap(null);
        }
    }

    public void aq() {
        sq.sk(this.dkl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.xn.hnj
    public boolean as() {
        apu apuVar = this.xyo;
        return apuVar != null && apuVar.hnj();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    void bug() {
        String str;
        int i10;
        String str2;
        int i11;
        com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar;
        com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar2;
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar;
        String str3 = this.hqh ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.tu.hhw()) {
            str2 = "rewarded_video";
            i11 = 7;
        } else {
            if (!this.tu.oq()) {
                if (this.tu.az()) {
                    str2 = "banner_ad";
                    i11 = 2;
                } else {
                    str = str3;
                    i10 = 1;
                }
                if (this.tu.rg() == 4) {
                    this.nyv = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.tgn, str);
                }
                com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.core.qor.hnj(this.tgn, this.tu, str, i10);
                this.f13822gm = hnjVar2;
                hnjVar2.hnj(this);
                this.f13822gm.hn(true);
                if (this.hqh) {
                    this.f13822gm.hnj(true);
                } else {
                    this.f13822gm.hnj(false);
                    this.f13822gm.qor(true);
                }
                this.f13822gm.hnj(this.pty);
                this.f13822gm.sk(true);
                this.f13822gm.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.1
                    @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
                    public void hnj(View view, int i12) {
                        if (sk.this.fvt != null) {
                            sk.this.fvt.hnj(view, i12);
                        }
                    }
                });
                qorVar = this.nyv;
                if (qorVar != null && (hnjVar = this.f13822gm) != null) {
                    hnjVar.hnj(qorVar);
                }
                if (tu()) {
                    com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.core.qor.hnj(this.tgn, this.tu, str, i10) { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.2
                        @Override // com.bytedance.sdk.openadsdk.core.qor.hnj
                        public boolean hn() {
                            apu apuVar = sk.this.xyo;
                            boolean zHnj = apuVar != null ? apuVar.hnj() : false;
                            sk.this.f13825sk.getVisibility();
                            return zHnj || sk.this.f13825sk.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.qor.hnj
                        public boolean qor() {
                            View view = sk.this.f13826ta;
                            if (view != null && view.getVisibility() == 0) {
                                return true;
                            }
                            View view2 = sk.this.bug;
                            if (view2 != null && view2.getVisibility() == 0) {
                                return true;
                            }
                            com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar4 = sk.this.orl;
                            if (hnjVar4 != null && hnjVar4.getVisibility() == 0) {
                                return true;
                            }
                            TextView textView = sk.this.mjg;
                            return textView != null && textView.getVisibility() == 0;
                        }
                    };
                    this.f13828ul = hnjVar3;
                    hnjVar3.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.3
                        @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
                        public void hnj(View view, int i12) {
                            if (sk.this.fvt != null) {
                                sk.this.fvt.hnj(view, i12);
                            }
                        }
                    });
                    this.f13828ul.hn(true);
                    this.f13828ul.hnj(this.hqh);
                    this.f13828ul.hnj(this.pty);
                    this.f13828ul.sk(true);
                    qorVar2 = this.nyv;
                    if (qorVar2 != null) {
                        this.f13828ul.hnj(qorVar2);
                    }
                    this.f13828ul.hnj(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i11 = 5;
        }
        str = str2;
        i10 = i11;
        if (this.tu.rg() == 4) {
            this.nyv = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.tgn, str);
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar4 = new com.bytedance.sdk.openadsdk.core.qor.hnj(this.tgn, this.tu, str, i10);
        this.f13822gm = hnjVar4;
        hnjVar4.hnj(this);
        this.f13822gm.hn(true);
        if (this.hqh) {
            this.f13822gm.hnj(true);
        } else {
            this.f13822gm.hnj(false);
            this.f13822gm.qor(true);
        }
        this.f13822gm.hnj(this.pty);
        this.f13822gm.sk(true);
        this.f13822gm.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.1
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i12) {
                if (sk.this.fvt != null) {
                    sk.this.fvt.hnj(view, i12);
                }
            }
        });
        qorVar = this.nyv;
        if (qorVar != null) {
            hnjVar.hnj(qorVar);
        }
        if (tu()) {
            com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar5 = new com.bytedance.sdk.openadsdk.core.qor.hnj(this.tgn, this.tu, str, i10) { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.2
                @Override // com.bytedance.sdk.openadsdk.core.qor.hnj
                public boolean hn() {
                    apu apuVar = sk.this.xyo;
                    boolean zHnj = apuVar != null ? apuVar.hnj() : false;
                    sk.this.f13825sk.getVisibility();
                    return zHnj || sk.this.f13825sk.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.qor.hnj
                public boolean qor() {
                    View view = sk.this.f13826ta;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = sk.this.bug;
                    if (view2 != null && view2.getVisibility() == 0) {
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar6 = sk.this.orl;
                    if (hnjVar6 != null && hnjVar6.getVisibility() == 0) {
                        return true;
                    }
                    TextView textView = sk.this.mjg;
                    return textView != null && textView.getVisibility() == 0;
                }
            };
            this.f13828ul = hnjVar5;
            hnjVar5.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.3
                @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
                public void hnj(View view, int i12) {
                    if (sk.this.fvt != null) {
                        sk.this.fvt.hnj(view, i12);
                    }
                }
            });
            this.f13828ul.hn(true);
            this.f13828ul.hnj(this.hqh);
            this.f13828ul.hnj(this.pty);
            this.f13828ul.sk(true);
            qorVar2 = this.nyv;
            if (qorVar2 != null) {
                this.f13828ul.hnj(qorVar2);
            }
            this.f13828ul.hnj(this);
        }
    }

    public void dkl() {
    }

    public void dnm() {
        hnj(true, false);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    boolean m28do() {
        return (this.f38do & 4) != 4 || this.eum;
    }

    public void dse() {
        as asVar;
        sq.dkl(this.dkl);
        sq.dkl(this.dse);
        if (this.aq != null && (asVar = this.tu) != null && asVar.pwt() != null && this.tu.pwt().J() != null) {
            sq.dkl(this.aq);
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.pwt().J(), this.tu.pwt().D(), this.tu.pwt().p(), this.aq, this.tu);
        }
        if (this.f13825sk.getVisibility() == 0) {
            sq.hnj((View) this.f13825sk, 8);
        }
    }

    public boolean eum() {
        return this.eum;
    }

    public void fc() {
        apu apuVar = this.xyo;
        if (apuVar != null) {
            apuVar.hnj(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj
    public long getVideoProgress() {
        if (this.orp <= 0) {
            as asVar = this.tu;
            if (asVar != null && asVar.pwt() != null) {
                this.orp = (long) (this.tu.pwt().e() * 1000.0d);
            }
            x6.c cVar = this.pty;
            if (cVar != null) {
                this.orp = cVar.ojm();
            }
        }
        return this.orp;
    }

    void gjv() {
        this.gjv.a(this);
        this.f13825sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (sk.this.jip()) {
                    TextView textView = sk.this.jip;
                    if (textView == null || textView.getVisibility() != 0) {
                        sk skVar = sk.this;
                        skVar.f13829vf.hnj(skVar, view);
                    }
                }
            }
        });
    }

    public void hn(ViewGroup viewGroup) {
    }

    public void hnj(int i10) {
    }

    boolean jip() {
        return this.f13829vf != null;
    }

    void mjg() {
        if (this.f13829vf == null || this.xyo != null) {
            return;
        }
        System.currentTimeMillis();
        apu apuVar = new apu();
        this.xyo = apuVar;
        apuVar.hnj(this.tgn, this.qor);
        this.xyo.hnj(this.f13829vf, this);
        System.currentTimeMillis();
    }

    public void oj() {
        sq.hnj((View) this.qor, 0);
        c cVar = this.gjv;
        if (cVar != null) {
            sq.hnj(cVar.getView(), 0);
        }
    }

    public void ojm() {
        gjv(8);
        if (m28do()) {
            this.gjv.setVisibility(8);
        }
        ImageView imageView = this.aq;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        gjv(8);
        sq.hnj(this.f13826ta, 8);
        sq.hnj((View) this.dnm, 8);
        sq.hnj(this.bug, 8);
        sq.hnj((View) this.orl, 8);
        sq.hnj((View) this.mjg, 8);
        sq.hnj((View) this.f13821fc, 8);
        apu apuVar = this.xyo;
        if (apuVar != null) {
            apuVar.hnj(true);
        }
    }

    public c orl() {
        return this.gjv;
    }

    public void qor(boolean z10) {
    }

    public void sk() {
    }

    public boolean ta() {
        return false;
    }

    public void uua() {
        sq.dkl(this.dkl);
        sq.dkl(this.dse);
        if (this.f13825sk.getVisibility() == 0) {
            sq.hnj((View) this.f13825sk, 8);
        }
    }

    public boolean wu() {
        return this.wu;
    }

    void xn() {
        try {
            sq.hnj(this.f13826ta, 8);
            sq.hnj((View) this.dnm, 8);
            sq.hnj(this.bug, 8);
            sq.hnj((View) this.orl, 8);
            sq.hnj((View) this.mjg, 8);
            sq.hnj((View) this.f13821fc, 8);
            sq.hnj((View) this.jip, 8);
        } catch (Exception unused) {
        }
    }

    private void dkl(int i10) {
        sq.hnj(this.bug, i10);
    }

    private int sk(int i10) {
        if (this.f13830xn <= 0 || this.apu <= 0) {
            return 0;
        }
        int iHn = sq.hn(this.tgn, 228.0f);
        int iHn2 = sq.hn(this.tgn, 160.0f);
        int i11 = (int) (this.apu * ((i10 * 1.0f) / this.f13830xn));
        if (i11 > iHn) {
            return iHn;
        }
        return i11 < iHn2 ? iHn2 : i11;
    }

    public void hn(boolean z10) {
    }

    public void hnj(long j10) {
    }

    public void qor(int i10) {
        sq.hnj((View) this.qor, 0);
        c cVar = this.gjv;
        if (cVar != null) {
            cVar.setVisibility(i10);
        }
    }

    public void gjv(boolean z10) {
        this.hqh = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = this.f13822gm;
            if (hnjVar != null) {
                hnjVar.hnj(true);
            }
            com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar2 = this.f13828ul;
            if (hnjVar2 != null) {
                hnjVar2.hnj(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar3 = this.f13822gm;
        if (hnjVar3 != null) {
            hnjVar3.hnj(false);
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar4 = this.f13828ul;
        if (hnjVar4 != null) {
            hnjVar4.hnj(false);
        }
    }

    public boolean hn(int i10) {
        return false;
    }

    public void hnj(long j10, long j11) {
    }

    public void hn(boolean z10, boolean z11) {
        ImageView imageView = this.f13825sk;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(dnm.hnj(this.tgn, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(dnm.hnj(this.tgn, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void hnj(Message message) {
    }

    public void hnj(View view, boolean z10) {
    }

    public void qor(int i10, int i11) {
        this.f13830xn = i10;
        this.apu = i11;
    }

    public void hnj(ViewGroup viewGroup) {
    }

    public void hn(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.qor.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.qor.setLayoutParams(layoutParams);
    }

    public void hnj(String str) {
    }

    public void qor(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.qor.getParent() == null) {
            viewGroup.addView(this.qor);
        }
        gjv(0);
    }

    public /* bridge */ /* synthetic */ void hnj(Object obj, WeakReference weakReference, boolean z10) {
        hnj((as) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // x6.a
    public View qor() {
        return this.qor;
    }

    @Override // x6.a
    public void hn() {
        sq.sk(this.dkl);
        sq.sk(this.dse);
        ImageView imageView = this.aq;
        if (imageView != null) {
            sq.sk(imageView);
        }
    }

    public void hnj(dkl.hnj hnjVar) {
        this.fvt = hnjVar;
    }

    public void gjv(int i10) {
        this.as = i10;
        sq.hnj((View) this.qor, i10);
    }

    public void hnj(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = this.f13822gm;
        if (hnjVar != null) {
            hnjVar.hnj(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar2 = this.f13828ul;
        if (hnjVar2 != null) {
            hnjVar2.hnj(pAGNativeAd);
        }
    }

    @Override // v6.d
    public void hn(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.gjv.getHolder()) {
            return;
        }
        this.wu = false;
        if (jip()) {
            this.f13829vf.hn(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, v6.c] */
    void hnj(Context context, View view) {
        ?? eVar;
        System.currentTimeMillis();
        as asVar = this.tu;
        if ((asVar == null || ((!asVar.qou() && !this.tu.az()) || com.bytedance.sdk.openadsdk.core.settings.dnm.hn().iwu())) && view != null) {
            view.setKeepScreenOn(true);
        }
        x6.c cVar = this.pty;
        if (cVar != null && cVar.fc()) {
            eVar = new b(this.tgn);
        } else {
            eVar = new e(this.tgn);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(eVar, 0, layoutParams);
        }
        sq.hnj((View) eVar, 8);
        this.gjv = eVar;
        this.f13825sk = (ImageView) view.findViewById(jip.tq);
        this.dkl = view.findViewById(jip.hw);
        this.dse = view.findViewById(jip.f14669mn);
        this.aq = (ImageView) view.findViewById(jip.f14674qi);
        this.ojm = view.findViewById(jip.f14677sg);
        System.currentTimeMillis();
    }

    @Override // v6.d
    public void hn(SurfaceTexture surfaceTexture) {
        x6.c cVar = this.pty;
        if (cVar != null) {
            cVar.hnj(surfaceTexture);
        }
    }

    public sk(Context context, ViewGroup viewGroup, boolean z10, int i10, as asVar, x6.c cVar) {
        this(context, viewGroup, z10, i10, asVar, cVar, true);
    }

    void hnj(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.ojm) == null || view2.getParent() == null || this.f13826ta != null) {
            return;
        }
        this.f13826ta = this.ojm;
        this.dnm = (ImageView) view.findViewById(jip.wxi);
        this.bug = view.findViewById(jip.f14676rg);
        this.orl = (com.bytedance.sdk.openadsdk.core.widget.hnj) view.findViewById(jip.xad);
        this.mjg = (TextView) view.findViewById(jip.f14654cm);
        this.f13821fc = (TextView) view.findViewById(jip.dzo);
        this.jip = (TextView) view.findViewById(jip.pnz);
    }

    public boolean hnj(int i10, com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar, boolean z10) {
        apu apuVar = this.xyo;
        return apuVar == null || apuVar.hnj(i10, aVar, z10);
    }

    public void hnj(x6.b bVar) {
        if (bVar instanceof hnj) {
            this.f13829vf = (hnj) bVar;
            mjg();
        }
    }

    public void hnj(int i10, int i11) {
        if (i10 == -1) {
            i10 = sq.qor(this.tgn);
        }
        if (i10 <= 0) {
            return;
        }
        this.uua = i10;
        if (!eum() && !ta() && (this.f38do & 8) != 8) {
            this.f13824oj = sk(i10);
        } else {
            this.f13824oj = i11;
        }
        hn(this.uua, this.f13824oj);
    }

    public void hnj() {
        hnj(false, this.eum);
        xn();
    }

    @Override // x6.a
    public void hnj(boolean z10) {
        this.f13827ua = z10;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    public void hnj(as asVar, WeakReference<Context> weakReference, boolean z10) {
        final as asVar2;
        String strBr;
        as asVar3;
        as asVar4;
        if (asVar == null) {
            return;
        }
        hnj(false, this.eum);
        hnj(this.qor, oj.hnj());
        View view = this.f13826ta;
        if (view != null) {
            sq.hnj(view, 0);
        }
        ImageView imageView = this.dnm;
        if (imageView != null) {
            sq.hnj((View) imageView, 0);
        }
        sq.hnj(this.bug, 0);
        if (this.dnm == null || (asVar4 = this.tu) == null || asVar4.pwt() == null || this.tu.pwt().J() == null) {
            asVar2 = asVar;
        } else {
            asVar2 = asVar;
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.pwt().J(), this.tu.pwt().D(), this.tu.pwt().p(), this.dnm, asVar2);
        }
        if (!TextUtils.isEmpty(asVar2.mw())) {
            strBr = asVar2.mw();
        } else if (!TextUtils.isEmpty(asVar2.kby())) {
            strBr = asVar2.kby();
        } else if (!TextUtils.isEmpty(asVar2.br())) {
            strBr = asVar2.br();
        } else {
            strBr = "";
        }
        if (this.orl != null && (asVar3 = this.tu) != null && asVar3.mn() != null && this.tu.mn().hnj() != null) {
            sq.hnj((View) this.orl, 0);
            sq.hnj((View) this.mjg, 4);
            as asVar5 = this.tu;
            if (asVar5 != null && asVar5.qs()) {
                com.bytedance.sdk.openadsdk.ta.gjv.hnj(this.tu.mn()).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar2, this.tu.mn().hnj(), new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.5
                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                        Object objHn = dnmVar.hn();
                        if (objHn != null) {
                            if (objHn instanceof Bitmap) {
                                com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar = sk.this.orl;
                                if (hnjVar != null) {
                                    hnjVar.setImageBitmap((Bitmap) objHn);
                                }
                            } else if ((objHn instanceof Drawable) && sk.this.orl != null) {
                                if (Build.VERSION.SDK_INT >= 28 && b6.a.a(objHn)) {
                                    b6.b.a(objHn).start();
                                }
                                sk.this.orl.setImageDrawable((Drawable) objHn);
                            }
                            com.bytedance.sdk.openadsdk.gjv.qor.hn(sk.this.tu, sk.this.tu != null ? orp.qor(asVar2.iz()) : null, "load_vast_icon_success", (JSONObject) null);
                        }
                    }

                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(int i10, String str, Throwable th2) {
                        sk.this.hnj(i10, str, asVar2);
                    }
                }));
                if (this.tu.mzt() != null && this.tu.mzt().hn() != null) {
                    this.tu.mzt().hn().hn(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.mn(), this.orl, asVar2);
            }
            as asVar6 = this.tu;
            if (asVar6 != null && asVar6.qs()) {
                try {
                    this.orl.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            as asVar7 = this.tu;
            if (asVar7 != null && asVar7.mzt() != null && this.tu.mzt().hn() != null) {
                final com.bytedance.sdk.openadsdk.core.orl.hn hnVarHn = this.tu.mzt().hn();
                com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar = this.orl;
                if (hnjVar != null) {
                    hnjVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.orl.hn hnVar;
                            com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar2 = sk.this.orl;
                            if (hnjVar2 == null || !hnjVar2.isShown() || (hnVar = hnVarHn) == null) {
                                return;
                            }
                            hnVar.hn(sk.this.getVideoProgress());
                        }
                    });
                }
            }
            if (tu()) {
                this.orl.setOnClickListener(this.f13828ul);
                this.orl.setOnTouchListener(this.f13828ul);
            } else {
                this.orl.setOnClickListener(this.f13822gm);
                this.orl.setOnTouchListener(this.f13822gm);
            }
        } else if (!TextUtils.isEmpty(strBr)) {
            sq.hnj((View) this.orl, 4);
            sq.hnj((View) this.mjg, 0);
            TextView textView = this.mjg;
            if (textView != null) {
                textView.setText(strBr.substring(0, 1));
                if (tu()) {
                    this.mjg.setOnClickListener(this.f13828ul);
                    this.mjg.setOnTouchListener(this.f13828ul);
                } else {
                    this.mjg.setOnClickListener(this.f13822gm);
                    this.mjg.setOnTouchListener(this.f13822gm);
                }
            }
        }
        if (this.f13821fc != null && !TextUtils.isEmpty(strBr)) {
            this.f13821fc.setText(strBr);
            this.f13821fc.setTag(570425345, "VAST_TITLE");
        }
        sq.hnj((View) this.f13821fc, 0);
        sq.hnj((View) this.jip, 0);
        String strCq = asVar2.cq();
        if (TextUtils.isEmpty(strCq)) {
            int iRg = asVar2.rg();
            if (iRg == 2 || iRg == 3) {
                strCq = wu.hnj(this.tgn, "tt_video_mobile_go_detail");
            } else if (iRg == 4) {
                strCq = wu.hnj(this.tgn, "tt_video_download_apk");
            } else if (iRg == 5) {
                strCq = wu.hnj(this.tgn, "tt_video_dial_phone");
            } else if (iRg != 8) {
                strCq = wu.hnj(this.tgn, "tt_video_mobile_go_detail");
            } else {
                strCq = wu.hnj(this.tgn, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.jip;
        if (textView2 != null) {
            textView2.setText(strCq);
            this.jip.setOnClickListener(this.f13822gm);
            this.jip.setOnTouchListener(this.f13822gm);
        }
        if (this.f13827ua) {
            return;
        }
        dkl(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final int i10, final String str, final as asVar) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.sk.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("description", i10 + ":" + str);
                    jSONObject.put("url", sk.this.tu.mn().hnj());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(sk.this.tu, sk.this.tu != null ? orp.qor(asVar.iz()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // v6.d
    public void hnj(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.gjv.getHolder()) {
            return;
        }
        this.wu = true;
        if (jip()) {
            this.f13829vf.hnj(this, surfaceHolder);
        }
    }

    @Override // v6.d
    public void hnj(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder != this.gjv.getHolder()) {
            return;
        }
        jip();
    }

    @Override // v6.d
    public void hnj(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.wu = true;
        if (jip()) {
            this.f13829vf.hnj(this, surfaceTexture);
        }
    }

    @Override // v6.d
    public boolean hnj(SurfaceTexture surfaceTexture) {
        this.wu = false;
        if (!jip()) {
            return true;
        }
        this.f13829vf.hn(this, surfaceTexture);
        return true;
    }

    public void hnj(boolean z10, boolean z11, boolean z12) {
        sq.hnj((View) this.f13825sk, (!z10 || this.dkl.getVisibility() == 0) ? 8 : 0);
    }

    public void hnj(boolean z10, boolean z11) {
        sq.hnj((View) this.f13825sk, 8);
    }

    @Override // x6.a
    public void hnj(Drawable drawable) {
        ViewGroup viewGroup = this.qor;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
