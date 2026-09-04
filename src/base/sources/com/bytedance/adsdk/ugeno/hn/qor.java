package com.bytedance.adsdk.ugeno.hn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.aq;
import com.bytedance.adsdk.ugeno.core.dnm;
import com.bytedance.adsdk.ugeno.core.dse;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.hn.sk;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.adsdk.ugeno.core.mjg;
import com.bytedance.adsdk.ugeno.core.oj;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.core.ta;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.gjv.ojm;
import com.bytedance.adsdk.ugeno.hnj.dkl;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o4.Wz.OGoz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qor<T extends View> implements View.OnTouchListener, fc.hn, fc.hnj, gjv {

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    protected boolean f12273af;
    protected aq aip;
    protected float apu;
    protected dse.hnj aq;
    protected boolean as;
    protected ojm bgg;
    private boolean bqc;
    private oj br;
    protected String bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    protected boolean f12274cm;
    private boolean cq;
    private boolean cvc;
    protected hnj<ViewGroup> dkl;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    protected float f12275dl;
    private boolean dlk;
    protected String dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected boolean f10do;
    protected hnj<ViewGroup> dse;
    protected ViewGroup.LayoutParams dy;
    protected float dzo;
    protected boolean eta;
    private boolean ett;
    protected float eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected float f12276fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    protected float f12277ff;
    protected float fr;
    protected boolean fvt;
    protected float fzb;
    protected JSONObject gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    protected boolean f12278gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    protected boolean f12279gn;
    protected dkl hkr;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected Context f12280hn;
    private boolean hnj;
    protected float hqh;
    private String hw;
    protected com.bytedance.adsdk.ugeno.hnj.hnj idl;
    private boolean iwu;
    protected float izk;
    protected ImageView.ScaleType jbd;
    protected float jip;
    protected fc jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    protected float f12281jo;
    private float jpm;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    protected boolean f12282ka;
    private boolean kby;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    protected Map<Integer, orl> f12283ko;
    protected float krm;
    private boolean ldn;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private boolean f12284lf;
    protected String lhi;
    protected float lko;
    protected float lu;

    @Deprecated
    private sk lx;
    protected float meb;
    protected float mjg;
    protected int mkl;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.hn.dkl f12285mn;
    private boolean mw;
    protected float nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected float f12286oj;
    protected dnm ojm;
    protected float orl;
    protected int orp;
    private boolean pdc;
    protected float pnz;
    protected boolean pty;
    protected float pv;
    private boolean pwt;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    protected int f12287qb;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.hnj f12288qi;
    protected JSONObject qor;
    private com.bytedance.adsdk.ugeno.gjv.hnj.hnj qri;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    protected jip f12289rd;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private boolean f12290rg;
    protected boolean rmr;
    protected float rq;
    private long rx;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private boolean f12291sg;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.hn.gjv.hnj f12292sh;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected T f12293sk;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private ta f12294sl;

    /* JADX INFO: renamed from: sp, reason: collision with root package name */
    private boolean f12295sp;
    protected String sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected boolean f12296ta;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private boolean f12297tb;
    protected float tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    protected float f12298th;
    protected float tll;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.hn.hn tq;
    protected boolean tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    protected boolean f12299ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    protected boolean f12300ul;
    protected float uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    protected float f12301vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    protected float f12302vh;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private boolean f12303vk;
    protected boolean wu;
    private GradientDrawable wxi;
    protected boolean xad;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private String f12304xd;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.hn.qor f12305xe;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected float f12306xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    protected float f12307xo;
    protected com.bytedance.adsdk.ugeno.core.dkl xw;
    protected float xyo;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private boolean f12308yl;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private boolean f12309yo;

    /* JADX INFO: renamed from: zd, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.dse.hnj.C0167hnj f12310zd;
    protected float znr;
    protected boolean zt;
    private JSONObject zyh;

    public qor(Context context) {
        this(context, null);
    }

    @Deprecated
    private void gjv() {
        com.bytedance.adsdk.ugeno.core.hn.gjv gjvVarGjv;
        this.f12293sk.setVisibility(this.f12287qb);
        float f10 = this.f12302vh;
        if (f10 != 0.0f) {
            this.f12293sk.setRotation(f10);
        }
        dse.hnj hnjVar = this.aq;
        if (hnjVar != null && TextUtils.isEmpty(hnjVar.hn())) {
            this.f12293sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.hn.qor.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    qor qorVar = qor.this;
                    if (qorVar.aip != null) {
                        boolean unused = qorVar.cvc;
                    }
                }
            });
        } else if (hn(1) && !this.f12297tb) {
            this.f12293sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.hn.qor.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    qor qorVar = qor.this;
                    if (qorVar.jle == null || !qorVar.cvc) {
                        return;
                    }
                    qor qorVar2 = qor.this;
                    fc fcVar = qorVar2.jle;
                    orl orlVar = qorVar2.f12283ko.get(1);
                    qor qorVar3 = qor.this;
                    fcVar.hnj(orlVar, qorVar3, qorVar3);
                }
            });
        }
        if (this.jle != null && hn(4)) {
            if (hn(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + ul());
                this.kby = true;
                this.lx = new sk(this.f12280hn, this.f12283ko.get(4), this.f12283ko.get(1), this.kby, eta());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + ul());
                this.lx = new sk(this.f12280hn, this.f12283ko.get(4), this.kby, eta());
            }
        }
        if (this.jle != null && hn(1) && this.f12297tb) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.f12297tb + ", view.id: " + ul());
            this.f12305xe = new com.bytedance.adsdk.ugeno.core.hn.qor(this.f12280hn, this.f12283ko.get(1));
        }
        ojm();
        if (this.jle != null && hn(3) && (gjvVarGjv = com.bytedance.adsdk.ugeno.sk.hnj().gjv()) != null) {
            this.f12292sh = gjvVarGjv.hnj(this.f12280hn, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.hn.qor.3
            };
        }
        if (this.jle != null && hn(9)) {
            com.bytedance.adsdk.ugeno.core.hn.dkl dklVar = new com.bytedance.adsdk.ugeno.core.hn.dkl(this.f12280hn, this.f12283ko.get(9), this);
            this.f12285mn = dklVar;
            dklVar.hnj(this.jle);
        }
        if (hn(10)) {
            com.bytedance.adsdk.ugeno.core.hn.hn hnVar = new com.bytedance.adsdk.ugeno.core.hn.hn(this.f12280hn, this.f12283ko.get(10), this);
            this.tq = hnVar;
            hnVar.hnj(this.jle);
        }
    }

    private void ka() {
        float f10 = this.rmr ? this.pnz : this.dzo;
        float f11 = this.eta ? this.f12307xo : this.dzo;
        float f12 = this.zt ? this.pv : this.dzo;
        float f13 = this.f12282ka ? this.lu : this.dzo;
        this.wxi.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void ojm() {
        orl orlVar;
        if (this.jle == null || !hn(18) || (orlVar = this.f12283ko.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectQor = orlVar.qor();
        if (jSONObjectQor != null) {
            try {
                jSONObjectQor.put("rotateZ", com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectQor.optString("rotateZ"), this.gjv));
            } catch (JSONException unused) {
            }
        }
        this.jle.hnj(orlVar, this, this);
    }

    private void ta() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dnm);
        this.f12293sk.setContentDescription(sb2);
    }

    private void zt() {
        if (TextUtils.equals("dashed", this.lhi)) {
            GradientDrawable gradientDrawable = this.wxi;
            float f10 = this.izk;
            gradientDrawable.setStroke((int) f10, this.mkl, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.lhi)) {
                this.wxi.setStroke((int) this.izk, this.mkl);
                return;
            }
            GradientDrawable gradientDrawable2 = this.wxi;
            float f11 = this.izk;
            gradientDrawable2.setStroke((int) f11, this.mkl, f11 / 2.0f, f11);
        }
    }

    public float apu() {
        return this.krm;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void aq() {
        ta taVar = this.f12294sl;
        if (taVar != null) {
            taVar.hn();
        }
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
        if (hnjVar != null) {
            hnjVar.qor();
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            dklVar.qor();
        }
    }

    public float as() {
        return this.dzo;
    }

    public JSONObject bug() {
        return this.gjv;
    }

    protected void cm() {
    }

    public qor<T> dkl(String str) {
        return hn(str);
    }

    public T dnm() {
        return this.f12293sk;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public fc m3do() {
        return this.jle;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void dse() {
        com.bytedance.adsdk.ugeno.core.hnj hnjVar = this.f12288qi;
        if (hnjVar != null) {
            ta taVar = new ta(this.f12293sk, hnjVar);
            this.f12294sl = taVar;
            taVar.hnj();
        }
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar2 = this.idl;
        if (hnjVar2 != null) {
            hnjVar2.hnj();
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            dklVar.hn();
        }
        ojm ojmVar = this.bgg;
        if (ojmVar != null) {
            ojmVar.sk();
        }
        if (this.tq != null && hn(10)) {
            this.tq.hnj();
        }
        if (this.f12285mn != null && hn(9)) {
            this.f12285mn.hnj();
        }
        sk skVar = this.lx;
        if (skVar != null) {
            skVar.hnj();
        }
        this.rx = System.currentTimeMillis();
    }

    public boolean dzo() {
        return this.fr > 0.0f;
    }

    public boolean eta() {
        return this.f12308yl;
    }

    public float eum() {
        return this.f12302vh;
    }

    public float fc() {
        return this.f12298th;
    }

    public com.bytedance.adsdk.ugeno.gjv.hnj.hnj ff() {
        return this.qri;
    }

    public int fvt() {
        return (int) this.orl;
    }

    public hnj gm() {
        return this.dkl;
    }

    public void hn(JSONObject jSONObject) {
        this.gjv = jSONObject;
        orl();
    }

    public T hnj() {
        return null;
    }

    public ViewGroup.LayoutParams hqh() {
        return this.dy;
    }

    public int jbd() {
        return this.orp;
    }

    public float jip() {
        return this.f12281jo;
    }

    public float lu() {
        T t10 = this.f12293sk;
        if (t10 instanceof com.bytedance.adsdk.ugeno.hnj.dse) {
            return ((com.bytedance.adsdk.ugeno.hnj.dse) t10).getRubIn();
        }
        return 0.0f;
    }

    protected void mjg() {
        this.f12293sk.setPadding((int) (this.f12278gm ? this.xyo : this.tgn), (int) (this.f12299ua ? this.hqh : this.tgn), (int) (this.f12300ul ? this.f12301vf : this.tgn), (int) (this.fvt ? this.nyv : this.tgn));
    }

    public dse.hnj nyv() {
        return this.aq;
    }

    public float oj() {
        return this.rq;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        sk skVar;
        fc fcVar;
        com.bytedance.adsdk.ugeno.core.hn.qor qorVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            xad();
        } else if (action == 1 || action == 3) {
            cm();
        }
        jip jipVar = this.f12289rd;
        if (jipVar != null) {
            jipVar.hnj(this, motionEvent);
        }
        if (hn(17) && motionEvent.getAction() == 0) {
            this.jle.hnj(this.f12283ko.get(17), this, this);
        }
        if (hn(1) && this.f12297tb && (fcVar = this.jle) != null && (qorVar = this.f12305xe) != null) {
            return qorVar.hnj(fcVar, this, motionEvent);
        }
        fc fcVar2 = this.jle;
        if (fcVar2 != null && (skVar = this.lx) != null) {
            return skVar.hnj(fcVar2, this, motionEvent, eta());
        }
        ojm ojmVar = this.bgg;
        if (ojmVar != null) {
            return ojmVar.hnj(motionEvent);
        }
        return false;
    }

    public void orl() {
        this.f12308yl = this.gjv.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.f12308yl);
    }

    public int orp() {
        return (int) this.mjg;
    }

    public float pnz() {
        T t10 = this.f12293sk;
        if (t10 instanceof com.bytedance.adsdk.ugeno.hnj.dse) {
            return ((com.bytedance.adsdk.ugeno.hnj.dse) t10).getRipple();
        }
        return 0.0f;
    }

    public boolean pty() {
        return this.f12296ta;
    }

    public float pv() {
        T t10 = this.f12293sk;
        if (t10 instanceof com.bytedance.adsdk.ugeno.hnj.dse) {
            return ((com.bytedance.adsdk.ugeno.hnj.dse) t10).getShine();
        }
        return 0.0f;
    }

    public boolean rmr() {
        return this.f12290rg;
    }

    public qor<T> sk(String str) {
        return hnj(str);
    }

    public boolean sq() {
        return this.f12279gn;
    }

    public JSONObject tgn() {
        return this.qor;
    }

    public long tu() {
        return this.rx;
    }

    public String ua() {
        return this.bug;
    }

    public String ul() {
        return this.dnm;
    }

    public float uua() {
        return this.znr;
    }

    protected void vf() {
        com.bytedance.adsdk.ugeno.sk.hnj().hn().hnj(this.ojm, this.sq, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.hn.qor.4
            @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
            public void hnj(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                qor qorVar = qor.this;
                if (!qorVar.xad) {
                    com.bytedance.adsdk.ugeno.dse.aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.hn.qor.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            qor.this.hnj(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapHnj = com.bytedance.adsdk.ugeno.dse.aq.hnj(qorVar.f12280hn, bitmap, (int) qorVar.f12277ff);
                if (bitmapHnj != null) {
                    com.bytedance.adsdk.ugeno.dse.aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.hn.qor.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            qor.this.hnj(new BitmapDrawable(bitmapHnj));
                        }
                    });
                }
            }
        });
    }

    public float wu() {
        return this.f12275dl;
    }

    protected void xad() {
    }

    public float xn() {
        return this.meb;
    }

    public float xo() {
        T t10 = this.f12293sk;
        if (t10 instanceof com.bytedance.adsdk.ugeno.hnj.dse) {
            return ((com.bytedance.adsdk.ugeno.hnj.dse) t10).getStretch();
        }
        return 0.0f;
    }

    protected void xyo() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapHnj;
        if (TextUtils.isEmpty(this.sq)) {
            if (this.f12273af) {
                hnj(this.f12310zd);
                return;
            } else {
                this.wxi.setColor(this.orp);
                gjv(this.orp);
                return;
            }
        }
        if (!this.sq.startsWith("local://")) {
            vf();
            return;
        }
        String strReplace = this.sq.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.xad ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f12280hn.getResources().openRawResource(com.bytedance.adsdk.ugeno.dse.gjv.hn(this.f12280hn, strReplace)), null, options);
            if (!this.xad || (bitmapHnj = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, bitmapDecodeStream, (int) this.f12277ff)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f12280hn.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.f12280hn.getResources(), bitmapHnj);
            }
            hnj(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public qor(Context context, hnj<ViewGroup> hnjVar) {
        this.orl = -2.0f;
        this.mjg = -2.0f;
        this.lhi = "solid";
        this.f12287qb = 0;
        this.f12279gn = true;
        this.tll = 0.0f;
        this.f12298th = 0.0f;
        this.f12281jo = 0.0f;
        this.fzb = 1.0f;
        this.znr = 1.0f;
        this.rq = 1.0f;
        this.lko = 0.0f;
        this.meb = 0.0f;
        this.krm = 0.0f;
        this.f12302vh = 0.0f;
        this.f12275dl = 1.0f;
        this.f12291sg = true;
        this.cvc = true;
        this.pdc = false;
        this.ldn = false;
        this.f12308yl = false;
        this.jpm = 12.0f;
        this.f12280hn = context;
        this.dkl = hnjVar;
        this.f12283ko = new HashMap();
        this.wxi = new GradientDrawable();
        this.f12293sk = (T) hnj();
    }

    private void qor() {
        if (this.hnj) {
            this.f12293sk.setTranslationX(this.f12298th);
        }
        if (this.iwu) {
            this.f12293sk.setTranslationY(this.f12281jo);
        }
        if (this.dlk) {
            this.f12293sk.setScaleX(this.znr);
        }
        if (this.f12303vk) {
            this.f12293sk.setScaleY(this.rq);
        }
        if (this.f12284lf) {
            this.f12293sk.setRotation(this.lko);
        }
        if (this.f12309yo) {
            this.f12293sk.setRotationX(this.meb);
        }
        if (this.pwt) {
            this.f12293sk.setRotationY(-this.krm);
        }
        if (this.mw) {
            this.f12293sk.setAlpha(this.f12275dl);
        }
        float f10 = this.f12302vh;
        if (f10 != 0.0f) {
            this.f12293sk.setRotation(f10);
        }
        if (this.f12284lf || this.f12309yo || this.pwt) {
            this.f12293sk.setCameraDistance(10000.0f);
        }
    }

    public com.bytedance.adsdk.ugeno.hnj.hnj bug(String str) {
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
        if (hnjVar != null && TextUtils.equals(str, hnjVar.sk())) {
            return this.idl;
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            return dklVar.hnj(str);
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void dkl() {
        if (this.br == null || this.f12295sp) {
            return;
        }
        this.f12295sp = true;
    }

    public List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> dnm(String str) {
        ojm ojmVar;
        if (TextUtils.isEmpty(str) || (ojmVar = this.bgg) == null) {
            return null;
        }
        return ojmVar.hnj(str);
    }

    public void hnj(JSONObject jSONObject) {
        this.gjv = jSONObject;
        orl();
        JSONObject jSONObject2 = this.qor;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        hnj.C0169hnj c0169hnjTa = this.dkl != null ? this.dkl.ta() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(this.qor.optString(next), jSONObject);
            hnj(next, strHnj);
            if (c0169hnjTa != null) {
                c0169hnjTa.hnj(this.f12280hn, next, strHnj);
            }
        }
        if (c0169hnjTa != null) {
            hnj(c0169hnjTa.hnj());
        }
        if (this.zyh == null || this.gjv == null) {
            return;
        }
        try {
            if (!pty()) {
                this.gjv.put("i18n", this.zyh);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.zyh);
            this.gjv.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void sk() {
        if (this.br == null || this.cq) {
            return;
        }
        this.cq = true;
    }

    private ImageView.ScaleType orl(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.jbd = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.jbd = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.jbd = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.jbd = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.jbd;
    }

    public void hn() {
        xyo();
        mjg();
        qor(this.f12287qb);
        qor();
        gjv();
        ojm ojmVar = this.bgg;
        if (ojmVar != null) {
            ojmVar.hnj();
            this.bgg.hn();
            this.bgg.qor();
        }
        this.f12293sk.setOnTouchListener(this);
        ta();
        ViewGroup viewGroup = (ViewGroup) this.f12293sk.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f12291sg);
        }
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
        if (hnjVar != null) {
            hnjVar.gjv();
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            dklVar.hnj();
        }
        ojm ojmVar2 = this.bgg;
        if (ojmVar2 != null) {
            ojmVar2.gjv();
        }
        if (this.jle == null || !hn(22)) {
            return;
        }
        this.jle.hnj(this.f12283ko.get(22), this, this);
    }

    public void ta(String str) {
        this.bug = str;
    }

    public void dkl(int i10) {
        if (pty()) {
            T t10 = this.f12293sk;
            if (t10 instanceof hn) {
                ((hn) t10).hn(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof hn) {
                ((hn) viewParent).hn(this.f12293sk, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12293sk.getLayoutParams();
        layoutParams.height = i10;
        this.f12293sk.setLayoutParams(layoutParams);
    }

    public void sk(int i10) {
        if (pty()) {
            T t10 = this.f12293sk;
            if (t10 instanceof hn) {
                ((hn) t10).hnj(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof hn) {
                ((hn) viewParent).hnj(this.f12293sk, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12293sk.getLayoutParams();
        layoutParams.width = i10;
        this.f12293sk.setLayoutParams(layoutParams);
    }

    private boolean mjg(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    public qor<T> aq(String str) {
        return gjv(str);
    }

    public void ojm(String str) {
        this.dnm = str;
    }

    public qor<T> dse(String str) {
        return qor(str);
    }

    public void hnj(oj ojVar) {
        this.br = ojVar;
    }

    public void hnj(jip jipVar) {
        this.f12289rd = jipVar;
    }

    public void hnj(fc fcVar) {
        this.jle = fcVar;
    }

    public void qor(int i10) {
        ViewParent viewParent = (ViewGroup) this.f12293sk.getParent();
        if (viewParent instanceof hn) {
            ((hn) viewParent).qor(this.f12293sk, i10);
        } else {
            this.f12293sk.setVisibility(i10);
        }
    }

    protected void hnj(com.bytedance.adsdk.ugeno.dse.hnj.C0167hnj c0167hnj) {
        if (c0167hnj == null) {
            return;
        }
        this.wxi.setShape(0);
        this.wxi.setOrientation(c0167hnj.hnj);
        if (Build.VERSION.SDK_INT >= 29) {
            this.wxi.setColors(c0167hnj.f12238hn, c0167hnj.qor);
        } else {
            this.wxi.setColors(c0167hnj.f12238hn);
        }
        ka();
        zt();
        this.f12293sk.setBackground(this.wxi);
    }

    public boolean hn(int i10) {
        Map<Integer, orl> map = this.f12283ko;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    protected qor<T> hn(String str) {
        if (TextUtils.isEmpty(this.bug) || !TextUtils.equals(this.bug, str)) {
            return null;
        }
        return this;
    }

    public void qor(JSONObject jSONObject) {
        this.qor = jSONObject;
    }

    protected void hn(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.f12283ko == null) {
            return;
        }
        try {
            int iHnj = mjg.hnj(str).hnj();
            orl orlVar = new orl();
            orlVar.hnj(iHnj);
            orlVar.hnj(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iHnj == 3) {
                try {
                    this.jpm = Float.parseFloat(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("shakeAmplitude"), this.gjv));
                } catch (NumberFormatException unused) {
                    this.jpm = 12.0f;
                }
            }
            if (!(this.jle instanceof com.bytedance.adsdk.ugeno.core.hnj.hn)) {
                hnj(iHnj, jSONObject, orlVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    protected qor<T> qor(String str) {
        if (!TextUtils.isEmpty(this.bug) && TextUtils.equals(this.bug, str) && this.f12287qb == 0) {
            return this;
        }
        return null;
    }

    protected void hnj(Drawable drawable) {
        this.f12293sk.setBackground(drawable);
    }

    protected void gjv(int i10) {
        this.wxi.setShape(0);
        this.wxi.setColor(i10);
        ka();
        zt();
        this.f12293sk.setBackground(this.wxi);
    }

    public void hnj(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.f12293sk;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.dy = layoutParams;
    }

    public void hnj(boolean z10, boolean z11) {
        if (this.f12293sk != null) {
            hnj(this.dy);
            if (z10) {
                sk((int) this.orl);
            }
            if (z11) {
                dkl((int) this.mjg);
            }
        }
    }

    protected qor<T> gjv(String str) {
        if (bug(str) != null) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void hn(Canvas canvas) {
        if (this instanceof hnj) {
            com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
            if (hnjVar != null) {
                hnjVar.hn(canvas);
            }
            dkl dklVar = this.hkr;
            if (dklVar != null) {
                dklVar.hn(canvas);
            }
        }
    }

    public void hnj(dse.hnj hnjVar) {
        this.aq = hnjVar;
    }

    protected qor<T> hnj(String str) {
        if (TextUtils.isEmpty(this.dnm) || !TextUtils.equals(this.dnm, str)) {
            return null;
        }
        return this;
    }

    public void hnj(boolean z10) {
        this.f12296ta = z10;
    }

    public void hnj(hnj hnjVar) {
        this.dkl = hnjVar;
    }

    public void hnj(dnm dnmVar) {
        this.ojm = dnmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void hn(int i10, int i11, int i12, int i13) {
        ta taVar = this.f12294sl;
        if (taVar != null) {
            taVar.hnj(i10, i11);
        }
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
        if (hnjVar != null) {
            hnjVar.hnj(i10, i11);
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            dklVar.hnj(i10, i11);
        }
    }

    public void hnj(aq aqVar) {
        this.aip = aqVar;
    }

    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b10 = 0;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    b10 = 1;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 2;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 3;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b10 = 4;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    b10 = 5;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b10 = 6;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b10 = 7;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b10 = 8;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b10 = 9;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b10 = 10;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    b10 = 11;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b10 = 12;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 13;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b10 = 14;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b10 = 15;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b10 = 16;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b10 = 17;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b10 = 18;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b10 = 19;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b10 = 20;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 21;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 22;
                }
                break;
            case -806339567:
                if (str.equals(Lykgign.dfbVlpfINraXQ)) {
                    b10 = 23;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b10 = 24;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b10 = 25;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    b10 = 26;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b10 = 27;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b10 = 28;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = 29;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b10 = 30;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b10 = 31;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    b10 = 32;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b10 = 33;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    b10 = 34;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 35;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 36;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b10 = 37;
                }
                break;
            case 314070383:
                if (str.equals(OGoz.yKaj)) {
                    b10 = 38;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b10 = 39;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b10 = 40;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b10 = 41;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b10 = 42;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b10 = 43;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b10 = 44;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b10 = 45;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b10 = 46;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b10 = 47;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b10 = 48;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b10 = 49;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 50;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b10 = 51;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b10 = 52;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b10 = 53;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b10 = 54;
                }
                break;
            case 1287124693:
                if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    b10 = 55;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b10 = 56;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b10 = 57;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 58;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 59;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = 60;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = 61;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b10 = 62;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b10 = 63;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b10 = 64;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b10 = 65;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b10 = 66;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b10 = 67;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.cvc = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 39:
            case 48:
            case 51:
            case 54:
            case DEPRECATED_API_USED_VALUE:
            case 64:
                hn(str, str2);
                break;
            case 2:
                this.hnj = true;
                this.f12298th = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case 3:
                this.iwu = true;
                this.f12281jo = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case 4:
                this.xyo = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.f12278gm = true;
                break;
            case 5:
                this.apu = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 11:
            case 55:
                if (com.bytedance.adsdk.ugeno.dse.hnj.qor(str2)) {
                    this.f12273af = true;
                    this.f12310zd = com.bytedance.adsdk.ugeno.dse.hnj.hn(str2);
                } else {
                    this.orp = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2, 0);
                    this.f12273af = false;
                }
                break;
            case 12:
                this.bgg = ojm.hnj(this, str2);
                break;
            case 13:
                this.mw = true;
                this.f12275dl = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case 14:
                this.pnz = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.rmr = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.mjg = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.mjg = -2.0f;
                } else {
                    this.mjg = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                }
                this.ldn = true;
                break;
            case 16:
                this.f12276fc = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                break;
            case 17:
                this.f12286oj = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.f10do = true;
                break;
            case 19:
            case AD_VISIBILITY_VALUE:
                this.sq = str2;
                break;
            case 20:
                this.f12284lf = true;
                this.lko = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 21:
                this.dlk = true;
                this.znr = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 22:
                this.f12303vk = true;
                this.rq = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 23:
                this.tgn = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.pty = true;
                break;
            case 24:
                this.f12304xd = str2;
                break;
            case 25:
                this.f12306xn = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.tu = true;
                break;
            case 26:
                this.eum = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 27:
                this.dnm = str2;
                break;
            case 28:
                this.zyh = com.bytedance.adsdk.ugeno.dse.hn.hnj(str2, (JSONObject) null);
                break;
            case 29:
                this.bug = str2;
                break;
            case 30:
                float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                this.f12277ff = fHnj;
                if (fHnj > 0.0f) {
                    this.xad = true;
                }
                break;
            case 31:
                this.hqh = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.f12299ua = true;
                break;
            case 32:
                this.hw = str2;
                break;
            case 34:
                this.fr = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 35:
                this.dlk = true;
                this.f12303vk = true;
                float[] fArrQor = com.bytedance.adsdk.ugeno.hnj.gjv.qor(str2);
                this.znr = fArrQor[0];
                this.rq = fArrQor[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.orl = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.orl = -2.0f;
                } else {
                    this.orl = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                }
                this.pdc = true;
                break;
            case 37:
                this.nyv = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.fvt = true;
                break;
            case 38:
                List<com.bytedance.adsdk.ugeno.hnj.qor> listHnj = com.bytedance.adsdk.ugeno.hnj.gjv.hnj(str2, this.gjv);
                if (listHnj != null && !listHnj.isEmpty()) {
                    this.hkr = new dkl(this.f12280hn, this, listHnj);
                    break;
                }
                break;
            case 40:
                this.f12307xo = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.eta = true;
                break;
            case 41:
                this.f12291sg = mjg(str2);
                break;
            case 42:
                this.pv = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.zt = true;
                break;
            case 43:
                this.lu = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.f12282ka = true;
                break;
            case 44:
                this.f12301vf = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.f12300ul = true;
                break;
            case SDK_INIT_API_VALUE:
                this.mkl = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case AD_START_EVENT_VALUE:
                this.lhi = str2;
                break;
            case AD_CLICK_EVENT_VALUE:
                this.izk = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                break;
            case 49:
                this.uua = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.as = true;
                break;
            case 50:
                this.hnj = true;
                this.iwu = true;
                float[] fArrQor2 = com.bytedance.adsdk.ugeno.hnj.gjv.qor(str2);
                this.f12298th = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, fArrQor2[0]);
                this.f12281jo = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, fArrQor2[1]);
                break;
            case 52:
                try {
                    this.idl = new com.bytedance.adsdk.ugeno.hnj.hnj(this.f12280hn, this, com.bytedance.adsdk.ugeno.hnj.gjv.hnj(new JSONObject(str2), this.gjv));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 53:
                this.f12288qi = com.bytedance.adsdk.ugeno.core.hnj.hnj(str2, this);
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                this.f12274cm = true;
                this.jbd = orl(str2);
                break;
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                this.dzo = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                break;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                this.f12309yo = true;
                this.meb = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 60:
                this.pwt = true;
                this.krm = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                this.f12302vh = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                this.f12290rg = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case 65:
                if (TextUtils.equals("visible", str2)) {
                    this.f12287qb = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.f12287qb = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.f12287qb = 8;
                }
                this.f12293sk.setVisibility(this.f12287qb);
                break;
            case BLACK_SCREEN_IS_DETECTED_VALUE:
                this.jip = com.bytedance.adsdk.ugeno.dse.aq.hnj(this.f12280hn, str2);
                this.wu = true;
                break;
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
                this.f12279gn = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public qor hn(qor qorVar) {
        return (qorVar.gm() == null && (qorVar instanceof hnj)) ? qorVar : hn(qorVar.gm());
    }

    @Deprecated
    protected void hnj(int i10, JSONObject jSONObject, orl orlVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            orl orlVar2 = new orl();
            orlVar2.hnj(jSONObjectOptJSONObject);
            orlVar2.hnj(this);
            orlVar.hnj(orlVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            orl orlVar3 = new orl();
            orlVar3.hnj(jSONObjectOptJSONObject2);
            orlVar3.hnj(this);
            orlVar.hn(orlVar3);
        }
        orlVar.hnj(jSONObject);
        this.f12283ko.put(Integer.valueOf(i10), orlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public int[] hnj(int i10, int i11) {
        if (this.fr > 0.0f) {
            if (this.pdc) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.fr;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.ldn) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.fr;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.br != null && !this.bqc) {
            this.bqc = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void hnj(int i10, int i11, int i12, int i13) {
        if (this.br == null || this.ett) {
            return;
        }
        this.ett = true;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void hnj(Canvas canvas, IAnimation iAnimation) {
        ta taVar = this.f12294sl;
        if (taVar != null) {
            taVar.hnj(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.gjv
    public void hnj(Canvas canvas) {
        if (this instanceof hnj) {
            return;
        }
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVar = this.idl;
        if (hnjVar != null) {
            hnjVar.hnj(canvas);
        }
        dkl dklVar = this.hkr;
        if (dklVar != null) {
            dklVar.hnj(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc.hn
    public void hnj(orl orlVar) {
        hnj<ViewGroup> hnjVar;
        qor<T> qorVarSk;
        if (orlVar == null || orlVar.qor() == null || !TextUtils.equals(orlVar.qor().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = orlVar.qor().optString("nodeId");
        qor(8);
        this.dse = (hnj) hn(this);
        if (TextUtils.isEmpty(strOptString) || (hnjVar = this.dse) == null || (qorVarSk = hnjVar.sk(strOptString)) == null) {
            return;
        }
        qorVarSk.qor(8);
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.hnj.hnj hnjVar) {
        this.qri = hnjVar;
    }

    public void hnj(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.gjv.gjv.qor> listDnm = dnm(str);
        if (listDnm == null || listDnm.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar : listDnm) {
            qorVar.hnj(this.bgg);
            qorVar.hnj(objArr);
        }
    }

    public void hnj(com.bytedance.adsdk.ugeno.core.sk skVar) {
        ojm ojmVar = this.bgg;
        if (ojmVar != null) {
            ojmVar.hnj(skVar);
        }
    }

    public void hnj(com.bytedance.adsdk.ugeno.core.dkl dklVar) {
        this.xw = dklVar;
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.orl orlVar) {
        ojm ojmVar = this.bgg;
        if (ojmVar != null) {
            ojmVar.hnj(orlVar);
        }
    }
}
