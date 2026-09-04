package com.bytedance.adsdk.hn.qor.qor;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.hn.hnj.hn.jip;
import com.bytedance.adsdk.hn.qor.hn.mjg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, com.bytedance.adsdk.hn.hnj.hnj.sk {
    private final String apu;
    private hnj as;
    private final Paint bug;
    BlurMaskFilter dkl;
    private final Paint dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private hnj f4do;
    private com.bytedance.adsdk.hn.hnj.hn.aq eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final RectF f12101fc;
    final jip gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final com.bytedance.adsdk.hn.ojm f12102hn;
    final Matrix hnj;
    private Paint hqh;
    private final RectF jip;
    private final Paint mjg;
    private final Matrix nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final RectF f12103oj;
    private final Paint orl;
    private float pty;
    final sk qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    float f12104sk;
    private final List<com.bytedance.adsdk.hn.hnj.hn.hnj<?, ?>> tgn;
    private List<hnj> tu;
    private final RectF uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f12106vf;
    private com.bytedance.adsdk.hn.hnj.hn.gjv wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final RectF f12107xn;
    private boolean xyo;
    private final Path dse = new Path();
    private final Matrix aq = new Matrix();
    private final Matrix ojm = new Matrix();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Paint f12105ta = new com.bytedance.adsdk.hn.hnj.hnj(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.qor.qor.hnj$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        static final /* synthetic */ int[] f12108hn;
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.adsdk.hn.qor.hn.aq.hnj.values().length];
            f12108hn = iArr;
            try {
                iArr[com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12108hn[com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12108hn[com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12108hn[com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[sk.hnj.values().length];
            hnj = iArr2;
            try {
                iArr2[sk.hnj.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[sk.hnj.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hnj[sk.hnj.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                hnj[sk.hnj.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                hnj[sk.hnj.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                hnj[sk.hnj.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                hnj[sk.hnj.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    hnj(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.dnm = new com.bytedance.adsdk.hn.hnj.hnj(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.bug = new com.bytedance.adsdk.hn.hnj.hnj(1, mode2);
        com.bytedance.adsdk.hn.hnj.hnj hnjVar = new com.bytedance.adsdk.hn.hnj.hnj(1);
        this.orl = hnjVar;
        this.mjg = new com.bytedance.adsdk.hn.hnj.hnj(PorterDuff.Mode.CLEAR);
        this.f12101fc = new RectF();
        this.jip = new RectF();
        this.uua = new RectF();
        this.f12103oj = new RectF();
        this.f12107xn = new RectF();
        this.hnj = new Matrix();
        this.tgn = new ArrayList();
        this.xyo = true;
        this.f12104sk = 0.0f;
        this.nyv = new Matrix();
        this.pty = 1.0f;
        this.f12102hn = ojmVar;
        this.qor = skVar;
        this.apu = skVar.dkl() + "#draw";
        if (skVar.bug() == sk.hn.INVERT) {
            hnjVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            hnjVar.setXfermode(new PorterDuffXfermode(mode));
        }
        jip jipVarTa = skVar.fc().ta();
        this.gjv = jipVarTa;
        jipVarTa.hnj((com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj) this);
        if (skVar.ta() != null && !skVar.ta().isEmpty()) {
            com.bytedance.adsdk.hn.hnj.hn.aq aqVar = new com.bytedance.adsdk.hn.hnj.hn.aq(skVar.ta());
            this.eum = aqVar;
            Iterator<com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path>> it = aqVar.hn().iterator();
            while (it.hasNext()) {
                it.next().hnj(this);
            }
            for (com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2 : this.eum.qor()) {
                hnj(hnjVar2);
                hnjVar2.hnj(this);
            }
        }
        bug();
    }

    private void bug() {
        if (this.qor.gjv().isEmpty()) {
            hn(true);
            return;
        }
        com.bytedance.adsdk.hn.hnj.hn.gjv gjvVar = new com.bytedance.adsdk.hn.hnj.hn.gjv(this.qor.gjv());
        this.wu = gjvVar;
        gjvVar.hnj();
        this.wu.hnj(new com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj() { // from class: com.bytedance.adsdk.hn.qor.qor.hnj.1
            @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
            public void hnj() {
                hnj hnjVar = hnj.this;
                hnjVar.hn(hnjVar.wu.ojm() == 1.0f);
            }
        });
        hn(this.wu.dse().floatValue() == 1.0f);
        hnj(this.wu);
    }

    private void fc() {
        if (this.tu != null) {
            return;
        }
        if (this.f4do == null) {
            this.tu = Collections.EMPTY_LIST;
            return;
        }
        this.tu = new ArrayList();
        for (hnj hnjVar = this.f4do; hnjVar != null; hnjVar = hnjVar.f4do) {
            this.tu.add(hnjVar);
        }
    }

    private boolean mjg() {
        if (this.eum.hn().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.eum.hnj().size(); i10++) {
            if (this.eum.hnj().get(i10).hnj() != com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void orl() {
        this.f12102hn.invalidateSelf();
    }

    public boolean aq() {
        return this.xyo;
    }

    public float dkl() {
        return this.pty;
    }

    public com.bytedance.adsdk.hn.sk.ta dnm() {
        return this.qor.m2do();
    }

    boolean dse() {
        com.bytedance.adsdk.hn.hnj.hn.aq aqVar = this.eum;
        return (aqVar == null || aqVar.hn().isEmpty()) ? false : true;
    }

    public Matrix gjv() {
        return this.nyv;
    }

    sk hn() {
        return this.qor;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<com.bytedance.adsdk.hn.hnj.hnj.qor> list, List<com.bytedance.adsdk.hn.hnj.hnj.qor> list2) {
    }

    public String ojm() {
        return this.qor.dkl();
    }

    public String sk() {
        sk skVar = this.qor;
        if (skVar != null) {
            return skVar.dse();
        }
        return null;
    }

    public com.bytedance.adsdk.hn.qor.hn.hnj ta() {
        return this.qor.as();
    }

    private void gjv(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar, com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2) {
        com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.dnm);
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        this.f12105ta.setAlpha((int) (hnjVar2.dse().intValue() * 2.55f));
        canvas.drawPath(this.dse, this.f12105ta);
        canvas.restore();
    }

    void hn(hnj hnjVar) {
        this.f4do = hnjVar;
    }

    boolean qor() {
        return this.as != null;
    }

    private void hn(RectF rectF, Matrix matrix) {
        if (qor() && this.qor.bug() != sk.hn.INVERT) {
            this.f12103oj.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.as.hnj(this.f12103oj, matrix, true);
            if (rectF.intersect(this.f12103oj)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    static hnj hnj(hn hnVar, sk skVar, com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, Context context) {
        switch (AnonymousClass2.hnj[skVar.dnm().ordinal()]) {
            case 1:
                return new dse(ojmVar, skVar, hnVar, dseVar);
            case 2:
                return new hn(ojmVar, skVar, dseVar.hn(skVar.dse()), dseVar, context);
            case 3:
                return new aq(ojmVar, skVar);
            case 4:
                if (hnj(ojmVar, skVar, "text:")) {
                    return new qor(ojmVar, skVar, context);
                }
                if (hnj(ojmVar, skVar, "videoview:")) {
                    return new ta(ojmVar, skVar, context);
                }
                return new gjv(ojmVar, skVar);
            case 5:
                return new dkl(ojmVar, skVar);
            case 6:
                return new ojm(ojmVar, skVar);
            default:
                Objects.toString(skVar.dnm());
                return null;
        }
    }

    private void qor(float f10) {
        this.f12102hn.tgn().qor().hnj(this.qor.dkl(), f10);
    }

    private void sk(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar, com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2) {
        com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.dnm);
        canvas.drawRect(this.f12101fc, this.f12105ta);
        this.bug.setAlpha((int) (hnjVar2.dse().intValue() * 2.55f));
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        canvas.drawPath(this.dse, this.bug);
        canvas.restore();
    }

    private void qor(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar, com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2) {
        com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.bug);
        canvas.drawRect(this.f12101fc, this.f12105ta);
        this.bug.setAlpha((int) (hnjVar2.dse().intValue() * 2.55f));
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        canvas.drawPath(this.dse, this.bug);
        canvas.restore();
    }

    public void hn(Canvas canvas, Matrix matrix, int i10) {
        hnj(i10);
    }

    private void hn(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar, com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2) {
        com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.f12105ta);
        canvas.drawRect(this.f12101fc, this.f12105ta);
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        this.f12105ta.setAlpha((int) (hnjVar2.dse().intValue() * 2.55f));
        canvas.drawPath(this.dse, this.bug);
        canvas.restore();
    }

    private static boolean hnj(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar, String str) {
        com.bytedance.adsdk.hn.ta taVarDkl;
        if (ojmVar == null || skVar == null || str == null || (taVarDkl = ojmVar.dkl(skVar.dse())) == null) {
            return false;
        }
        return str.equals(taVarDkl.ta());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(boolean z10) {
        if (z10 != this.xyo) {
            this.xyo = z10;
            orl();
        }
    }

    void hnj(boolean z10) {
        if (z10 && this.hqh == null) {
            this.hqh = new com.bytedance.adsdk.hn.hnj.hnj();
        }
        this.f12106vf = z10;
    }

    public BlurMaskFilter hn(float f10) {
        if (this.f12104sk == f10) {
            return this.dkl;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.dkl = blurMaskFilter;
        this.f12104sk = f10;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        orl();
    }

    void hnj(hnj hnjVar) {
        this.as = hnjVar;
    }

    public void hnj(com.bytedance.adsdk.hn.hnj.hn.hnj<?, ?> hnjVar) {
        if (hnjVar == null) {
            return;
        }
        this.tgn.add(hnjVar);
    }

    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        this.f12101fc.set(0.0f, 0.0f, 0.0f, 0.0f);
        fc();
        this.hnj.set(matrix);
        if (z10) {
            List<hnj> list = this.tu;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.hnj.preConcat(this.tu.get(size).gjv.gjv());
                }
            } else {
                hnj hnjVar = this.f4do;
                if (hnjVar != null) {
                    this.hnj.preConcat(hnjVar.gjv.gjv());
                }
            }
        }
        this.hnj.preConcat(this.gjv.gjv());
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numDse;
        com.bytedance.adsdk.hn.sk.hnj(this.apu);
        if (this.xyo && !this.qor.wu()) {
            fc();
            com.bytedance.adsdk.hn.sk.hnj("Layer#parentMatrix");
            this.nyv.set(matrix);
            this.aq.reset();
            this.aq.set(matrix);
            for (int size = this.tu.size() - 1; size >= 0; size--) {
                this.aq.preConcat(this.tu.get(size).gjv.gjv());
            }
            com.bytedance.adsdk.hn.sk.hn("Layer#parentMatrix");
            com.bytedance.adsdk.hn.hnj.hn.hnj<?, Integer> hnjVarHnj = this.gjv.hnj();
            int iIntValue = (int) ((((i10 / 255.0f) * ((hnjVarHnj == null || (numDse = hnjVarHnj.dse()) == null) ? 100 : numDse.intValue())) / 100.0f) * 255.0f);
            if (!qor() && !dse()) {
                this.aq.preConcat(this.gjv.gjv());
                com.bytedance.adsdk.hn.sk.hnj("Layer#drawLayer");
                hn(canvas, this.aq, iIntValue);
                com.bytedance.adsdk.hn.sk.hn("Layer#drawLayer");
                qor(com.bytedance.adsdk.hn.sk.hn(this.apu));
                return;
            }
            com.bytedance.adsdk.hn.sk.hnj("Layer#computeBounds");
            hnj(this.f12101fc, this.aq, false);
            hn(this.f12101fc, matrix);
            this.aq.preConcat(this.gjv.gjv());
            hnj(this.f12101fc, this.aq);
            this.jip.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.ojm);
            if (!this.ojm.isIdentity()) {
                Matrix matrix2 = this.ojm;
                matrix2.invert(matrix2);
                this.ojm.mapRect(this.jip);
            }
            if (!this.f12101fc.intersect(this.jip)) {
                this.f12101fc.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.hn.sk.hn("Layer#computeBounds");
            if (this.f12101fc.width() >= 1.0f && this.f12101fc.height() >= 1.0f) {
                com.bytedance.adsdk.hn.sk.hnj("Layer#saveLayer");
                this.f12105ta.setAlpha(255);
                com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.f12105ta);
                com.bytedance.adsdk.hn.sk.hn("Layer#saveLayer");
                hnj(canvas);
                com.bytedance.adsdk.hn.sk.hnj("Layer#drawLayer");
                hn(canvas, this.aq, iIntValue);
                com.bytedance.adsdk.hn.sk.hn("Layer#drawLayer");
                if (dse()) {
                    hnj(canvas, this.aq);
                }
                if (qor()) {
                    com.bytedance.adsdk.hn.sk.hnj("Layer#drawMatte");
                    com.bytedance.adsdk.hn.sk.hnj("Layer#saveLayer");
                    com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.orl, 19);
                    com.bytedance.adsdk.hn.sk.hn("Layer#saveLayer");
                    hnj(canvas);
                    this.as.hnj(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.hn.sk.hnj("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.hn.sk.hn("Layer#restoreLayer");
                    com.bytedance.adsdk.hn.sk.hn("Layer#drawMatte");
                }
                com.bytedance.adsdk.hn.sk.hnj("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.hn.sk.hn("Layer#restoreLayer");
            }
            if (this.f12106vf && (paint = this.hqh) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.hqh.setColor(-251901);
                this.hqh.setStrokeWidth(4.0f);
                canvas.drawRect(this.f12101fc, this.hqh);
                this.hqh.setStyle(Paint.Style.FILL);
                this.hqh.setColor(1357638635);
                canvas.drawRect(this.f12101fc, this.hqh);
            }
            qor(com.bytedance.adsdk.hn.sk.hn(this.apu));
            return;
        }
        com.bytedance.adsdk.hn.sk.hn(this.apu);
    }

    private void hnj(Canvas canvas) {
        com.bytedance.adsdk.hn.sk.hnj("Layer#clearLayer");
        RectF rectF = this.f12101fc;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.mjg);
        com.bytedance.adsdk.hn.sk.hn("Layer#clearLayer");
    }

    private void hnj(RectF rectF, Matrix matrix) {
        this.uua.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (dse()) {
            int size = this.eum.hnj().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.hn.qor.hn.aq aqVar = this.eum.hnj().get(i10);
                Path pathDse = this.eum.hn().get(i10).dse();
                if (pathDse != null) {
                    this.dse.set(pathDse);
                    this.dse.transform(matrix);
                    int i11 = AnonymousClass2.f12108hn[aqVar.hnj().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && aqVar.gjv()) {
                        return;
                    }
                    this.dse.computeBounds(this.f12107xn, false);
                    if (i10 == 0) {
                        this.uua.set(this.f12107xn);
                    } else {
                        RectF rectF2 = this.uua;
                        rectF2.set(Math.min(rectF2.left, this.f12107xn.left), Math.min(this.uua.top, this.f12107xn.top), Math.max(this.uua.right, this.f12107xn.right), Math.max(this.uua.bottom, this.f12107xn.bottom));
                    }
                }
            }
            if (rectF.intersect(this.uua)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    protected void hnj(int i10) {
        this.pty = ((this.gjv.hnj() != null ? this.gjv.hnj().dse().intValue() : 100) / 100.0f) * (i10 / 255.0f);
    }

    private void hnj(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.hn.sk.hnj("Layer#saveLayer");
        com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12101fc, this.dnm, 19);
        if (Build.VERSION.SDK_INT < 28) {
            hnj(canvas);
        }
        com.bytedance.adsdk.hn.sk.hn("Layer#saveLayer");
        for (int i10 = 0; i10 < this.eum.hnj().size(); i10++) {
            com.bytedance.adsdk.hn.qor.hn.aq aqVar = this.eum.hnj().get(i10);
            com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar = this.eum.hn().get(i10);
            com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2 = this.eum.qor().get(i10);
            int i11 = AnonymousClass2.f12108hn[aqVar.hnj().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f12105ta.setColor(-16777216);
                        this.f12105ta.setAlpha(255);
                        canvas.drawRect(this.f12101fc, this.f12105ta);
                    }
                    if (aqVar.gjv()) {
                        qor(canvas, matrix, hnjVar, hnjVar2);
                    } else {
                        hnj(canvas, matrix, hnjVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (aqVar.gjv()) {
                            hn(canvas, matrix, hnjVar, hnjVar2);
                        } else {
                            hnj(canvas, matrix, hnjVar, hnjVar2);
                        }
                    }
                } else if (aqVar.gjv()) {
                    sk(canvas, matrix, hnjVar, hnjVar2);
                } else {
                    gjv(canvas, matrix, hnjVar, hnjVar2);
                }
            } else if (mjg()) {
                this.f12105ta.setAlpha(255);
                canvas.drawRect(this.f12101fc, this.f12105ta);
            }
        }
        com.bytedance.adsdk.hn.sk.hnj("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.hn.sk.hn("Layer#restoreLayer");
    }

    private void hnj(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar, com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2) {
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        this.f12105ta.setAlpha((int) (hnjVar2.dse().intValue() * 2.55f));
        canvas.drawPath(this.dse, this.f12105ta);
    }

    private void hnj(Canvas canvas, Matrix matrix, com.bytedance.adsdk.hn.hnj.hn.hnj<mjg, Path> hnjVar) {
        this.dse.set(hnjVar.dse());
        this.dse.transform(matrix);
        canvas.drawPath(this.dse, this.bug);
    }

    void hnj(float f10) {
        this.gjv.hnj(f10);
        if (this.eum != null) {
            for (int i10 = 0; i10 < this.eum.hn().size(); i10++) {
                this.eum.hn().get(i10).hnj(f10);
            }
        }
        com.bytedance.adsdk.hn.hnj.hn.gjv gjvVar = this.wu;
        if (gjvVar != null) {
            gjvVar.hnj(f10);
        }
        hnj hnjVar = this.as;
        if (hnjVar != null) {
            hnjVar.hnj(f10);
        }
        for (int i11 = 0; i11 < this.tgn.size(); i11++) {
            this.tgn.get(i11).hnj(f10);
        }
    }
}
