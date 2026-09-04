package com.bytedance.adsdk.ugeno.yoga.hn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.yoga.dkl;
import com.bytedance.adsdk.ugeno.yoga.gjv;
import com.bytedance.adsdk.ugeno.yoga.mjg;
import com.bytedance.adsdk.ugeno.yoga.orl;
import com.bytedance.adsdk.ugeno.yoga.sk;
import com.bytedance.adsdk.ugeno.yoga.ta;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.hn.hnj<qor> {
    private mjg dlk;
    private sk iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.hnj f12430lf;
    private ta pwt;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private dkl f12431vk;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.hnj f12432yo;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0176hnj extends com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj {

        /* JADX INFO: renamed from: cm, reason: collision with root package name */
        private boolean f12435cm;
        private boolean dzo;

        /* JADX INFO: renamed from: ff, reason: collision with root package name */
        private boolean f12436ff;
        public int fvt;

        /* JADX INFO: renamed from: gm, reason: collision with root package name */
        public int f12437gm;
        public int hqh;
        private boolean jbd;
        public float nyv;
        public float orp;
        public int pty;
        private boolean sq;
        public int tgn;

        /* JADX INFO: renamed from: ua, reason: collision with root package name */
        public int f12438ua;

        /* JADX INFO: renamed from: ul, reason: collision with root package name */
        public int f12439ul;

        /* JADX INFO: renamed from: vf, reason: collision with root package name */
        public float f12440vf;
        private boolean xad;
        public float xyo;

        public C0176hnj(com.bytedance.adsdk.ugeno.hn.hnj hnjVar) {
            super(hnjVar);
            this.tgn = 1;
            this.xyo = 0.0f;
            this.f12440vf = 1.0f;
            this.hqh = com.bytedance.adsdk.ugeno.yoga.hnj.AUTO.hnj();
            this.nyv = -1.0f;
            this.pty = orl.RELATIVE.hnj();
        }

        private void gjv() {
            com.bytedance.adsdk.ugeno.hn.hnj hnjVar = this.tu;
            if (hnjVar instanceof hnj) {
                if (((hnj) hnjVar).zt() == sk.ROW && this.tu.fvt() == -2 && this.hnj == -1.0f && !this.tu.dzo()) {
                    this.hnj = -2.0f;
                    this.f12440vf = 1.0f;
                    this.xyo = 1.0f;
                    this.sq = true;
                    this.nyv = -1.0f;
                }
                if (((hnj) this.tu).zt() == sk.COLUMN && this.tu.orp() == -2 && this.f12268hn == -1.0f && !this.tu.dzo()) {
                    this.f12268hn = -2.0f;
                    this.f12440vf = 1.0f;
                    this.xyo = 1.0f;
                    this.sq = true;
                    this.nyv = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
        public qor.hnj hnj() {
            gjv();
            qor.hnj hnjVar = new qor.hnj((int) this.hnj, (int) this.f12268hn);
            hnjVar.bug((int) (this.apu ? this.dkl : this.f12270sk));
            hnjVar.mjg((int) (this.eum ? this.dse : this.f12270sk));
            hnjVar.dnm((int) (this.wu ? this.aq : this.f12270sk));
            hnjVar.orl((int) (this.as ? this.ojm : this.f12270sk));
            hnjVar.hnj(this.tgn);
            hnjVar.sk(this.hqh);
            hnjVar.hn(this.xyo);
            hnjVar.qor(this.f12440vf);
            hnjVar.jip(this.qor);
            hnjVar.uua(this.gjv);
            if (this.sq) {
                hnjVar.gjv(this.nyv);
            }
            hnjVar.dkl(this.pty);
            if (this.jbd) {
                hnjVar.dse(this.f12437gm);
            }
            if (this.f12436ff) {
                hnjVar.ojm(this.f12439ul);
            }
            if (this.xad) {
                hnjVar.aq(this.f12438ua);
            }
            if (this.f12435cm) {
                hnjVar.ta(this.fvt);
            }
            if (this.dzo && qor()) {
                float f10 = this.orp;
                if (f10 > 0.0f) {
                    hnjVar.fc(f10);
                    hnjVar.qor(0.0f);
                    hnjVar.hn(0.0f);
                }
            }
            return hnjVar;
        }

        public boolean qor() {
            float f10 = this.hnj;
            if (f10 == -1.0f && this.f12268hn == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.f12268hn == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        public String toString() {
            return "LayoutParams{mOrder=" + this.tgn + ", mFlexGrow=" + this.xyo + ", mFlexShrink=" + this.f12440vf + ", mAlignSelf=" + this.hqh + ", mFlexBasis=" + this.nyv + ", mPosition=" + this.pty + ", mTop=" + this.f12437gm + ", mBottom=" + this.f12439ul + ", mLeft=" + this.f12438ua + ", mRight=" + this.fvt + '}';
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        public void hnj(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.hnj(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.sq = true;
                    float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                    this.nyv = fHnj;
                    this.nyv = aq.hnj(context, fHnj);
                    break;
                case "bottom":
                    this.f12436ff = true;
                    this.f12439ul = (int) aq.hnj(context, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0));
                    break;
                case "top":
                    this.jbd = true;
                    this.f12437gm = (int) aq.hnj(context, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0));
                    break;
                case "left":
                    this.xad = true;
                    this.f12438ua = (int) aq.hnj(context, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0));
                    break;
                case "order":
                    this.tgn = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1);
                    break;
                case "ratio":
                    this.dzo = true;
                    this.orp = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                    break;
                case "right":
                    this.f12435cm = true;
                    this.fvt = (int) aq.hnj(context, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0));
                    break;
                case "position":
                    this.pty = orl.hnj(str2).hnj();
                    break;
                case "flexShrink":
                    this.f12440vf = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.xyo = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.hqh = com.bytedance.adsdk.ugeno.yoga.hnj.hnj(str2).hnj();
                    break;
            }
        }
    }

    public hnj(Context context) {
        super(context);
        this.iwu = sk.ROW;
        this.dlk = mjg.NO_WRAP;
        this.f12431vk = dkl.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.hnj hnjVar = com.bytedance.adsdk.ugeno.yoga.hnj.STRETCH;
        this.f12430lf = hnjVar;
        this.f12432yo = hnjVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected void vf() {
        ImageView.ScaleType scaleType;
        if (this.xad) {
            com.bytedance.adsdk.ugeno.sk.hnj().hn().hnj(this.ojm, this.sq, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.yoga.hn.hnj.1
                @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
                public void hnj(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw != null) {
                            com.bytedance.adsdk.ugeno.core.dkl unused = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw;
                            String unused2 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).sq;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw != null) {
                        com.bytedance.adsdk.ugeno.core.dkl unused3 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw;
                        String unused4 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).sq;
                    }
                    final Bitmap bitmapHnj = aq.hnj(((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12280hn, bitmap, (int) ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12277ff);
                    if (bitmapHnj != null) {
                        aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.hn.hnj.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                hnj.this.hnj(new BitmapDrawable(bitmapHnj));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.ojm.gjv.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.gjv.hnj(this.f12280hn);
        com.bytedance.adsdk.ugeno.sk.hnj().hn().hnj(this.ojm, this.sq, hnjVar, this.f12293sk.getWidth(), this.f12293sk.getHeight(), new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.yoga.hn.hnj.2
            @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
            public void hnj(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw != null) {
                        com.bytedance.adsdk.ugeno.core.dkl unused = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw;
                        String unused2 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).sq;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw != null) {
                    com.bytedance.adsdk.ugeno.core.dkl unused3 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).xw;
                    String unused4 = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).sq;
                }
            }
        });
        if (!this.f12274cm || (scaleType = this.jbd) == ImageView.ScaleType.FIT_XY) {
            hnjVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            hnjVar.setScaleType(scaleType);
        }
        hnjVar.setCornerRadius(this.dzo);
        qor.hnj hnjVar2 = new qor.hnj(-1, -1);
        hnjVar2.dkl(orl.ABSOLUTE.hnj());
        hnjVar2.dse(0.0f);
        hnjVar2.aq(0.0f);
        T t10 = this.f12293sk;
        if (t10 instanceof qor) {
            ((qor) t10).addView(hnjVar, 0, hnjVar2);
            hnj(hnjVar);
        }
    }

    public sk zt() {
        return this.iwu;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public C0176hnj ta() {
        return new C0176hnj(this);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        this.pwt.hnj(this.iwu);
        this.pwt.hnj(this.dlk);
        this.pwt.hnj(this.f12431vk);
        this.pwt.hnj(this.f12430lf);
        this.pwt.qor(this.f12432yo);
        this.pwt.hnj(true);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected void mjg() {
        if (this.pty) {
            this.pwt.hn(gjv.ALL, this.tgn);
        }
        if (this.f12278gm) {
            this.pwt.hn(gjv.LEFT, this.xyo);
        }
        if (this.f12300ul) {
            this.pwt.hn(gjv.RIGHT, this.f12301vf);
        }
        if (this.f12299ua) {
            this.pwt.hn(gjv.TOP, this.hqh);
        }
        if (this.fvt) {
            this.pwt.hn(gjv.BOTTOM, this.nyv);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public qor hnj() {
        qor qorVar = new qor(this.f12280hn);
        qorVar.hnj(this);
        this.pwt = qorVar.getYogaNode();
        return qorVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected void hnj(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.ojm.gjv.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.gjv.hnj(this.f12280hn);
        hnjVar.setImageDrawable(drawable);
        if (this.f12274cm && (scaleType = this.jbd) != ImageView.ScaleType.FIT_XY) {
            hnjVar.setScaleType(scaleType);
        } else {
            hnjVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        hnjVar.setCornerRadius(this.dzo);
        qor.hnj hnjVar2 = new qor.hnj(-1, -1);
        hnjVar2.dkl(orl.ABSOLUTE.hnj());
        hnjVar2.dse(0.0f);
        hnjVar2.aq(0.0f);
        T t10 = this.f12293sk;
        if (t10 instanceof qor) {
            ((qor) t10).addView(hnjVar, 0, hnjVar2);
            hnj(hnjVar);
        }
    }

    private void hnj(final com.bytedance.adsdk.ugeno.ojm.gjv.hnj hnjVar) {
        this.f12293sk.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.hn.hnj.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ta taVarHnj;
                if (((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk == null || (taVarHnj = ((qor) ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk).hnj(hnjVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk.getWidth();
                taVarHnj.gjv(width);
                int height = ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk.getHeight();
                taVarHnj.dkl(height);
                hnjVar.setCornerRadius(((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).dzo);
                ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.hn.qor) hnj.this).f12293sk.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        super.hnj(qorVar);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, ViewGroup.LayoutParams layoutParams) {
        if (qorVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.add(qorVar);
        View viewDnm = qorVar.dnm();
        if (viewDnm != null) {
            ((qor) this.f12293sk).addView(viewDnm, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.f12430lf = com.bytedance.adsdk.ugeno.yoga.hnj.hnj(str2);
                break;
            case "flexDirection":
                this.iwu = sk.hnj(str2);
                break;
            case "alignContent":
                this.f12432yo = com.bytedance.adsdk.ugeno.yoga.hnj.hnj(str2);
                break;
            case "flexWrap":
                this.dlk = mjg.hnj(str2);
                break;
            case "justifyContent":
                this.f12431vk = dkl.hnj(str2);
                break;
        }
    }
}
