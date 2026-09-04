package com.bytedance.adsdk.hn.qor.qor;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.hn.apu;
import com.bytedance.adsdk.hn.hnj.hn.fc;
import com.bytedance.adsdk.hn.qor.hn.jip;
import com.bytedance.adsdk.hn.qor.hnj.dnm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.adsdk.hn.qor.qor.hnj {
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> apu;
    private final RectF aq;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> as;
    private final Map<com.bytedance.adsdk.hn.qor.gjv, List<com.bytedance.adsdk.hn.hnj.hnj.gjv>> bug;
    private final Paint dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> f5do;
    private final StringBuilder dse;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final fc f12109fc;
    private final com.bytedance.adsdk.hn.ojm jip;
    private final List<hnj> mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> f12110oj;
    private final Matrix ojm;
    private final LongSparseArray<String> orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Paint f12111ta;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> tgn;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> tu;
    private final com.bytedance.adsdk.hn.dse uua;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> f12112xn;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Typeface, Typeface> xyo;

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.qor.qor.ojm$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.adsdk.hn.qor.hn.hnj.values().length];
            hnj = iArr;
            try {
                iArr[com.bytedance.adsdk.hn.qor.hn.hnj.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.hnj.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.hnj.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private float f12113hn;
        private String hnj;

        private hnj() {
            this.hnj = "";
            this.f12113hn = 0.0f;
        }

        void hnj(String str, float f10) {
            this.hnj = str;
            this.f12113hn = f10;
        }
    }

    ojm(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar) {
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar2;
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVar;
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVar2;
        super(ojmVar, skVar);
        this.dse = new StringBuilder(2);
        this.aq = new RectF();
        this.ojm = new Matrix();
        int i10 = 1;
        this.f12111ta = new Paint(i10) { // from class: com.bytedance.adsdk.hn.qor.qor.ojm.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.dnm = new Paint(i10) { // from class: com.bytedance.adsdk.hn.qor.qor.ojm.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.bug = new HashMap();
        this.orl = new LongSparseArray<>();
        this.mjg = new ArrayList();
        this.jip = ojmVar;
        this.uua = skVar.hnj();
        fc fcVarHnj = skVar.xn().hnj();
        this.f12109fc = fcVarHnj;
        fcVarHnj.hnj(this);
        hnj(fcVarHnj);
        dnm dnmVarApu = skVar.apu();
        if (dnmVarApu != null && (hnjVar2 = dnmVarApu.hnj) != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj = hnjVar2.hnj();
            this.f12110oj = hnjVarHnj;
            hnjVarHnj.hnj(this);
            hnj(this.f12110oj);
        }
        if (dnmVarApu != null && (hnjVar = dnmVarApu.f12094hn) != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVarHnj2 = hnjVar.hnj();
            this.apu = hnjVarHnj2;
            hnjVarHnj2.hnj(this);
            hnj(this.apu);
        }
        if (dnmVarApu != null && (hnVar2 = dnmVarApu.qor) != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj3 = hnVar2.hnj();
            this.wu = hnjVarHnj3;
            hnjVarHnj3.hnj(this);
            hnj(this.wu);
        }
        if (dnmVarApu == null || (hnVar = dnmVarApu.gjv) == null) {
            return;
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj4 = hnVar.hnj();
        this.f5do = hnjVarHnj4;
        hnjVarHnj4.hnj(this);
        hnj(this.f5do);
    }

    private boolean qor(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        super.hn(canvas, matrix, i10);
        com.bytedance.adsdk.hn.qor.hn hnVarDse = this.f12109fc.dse();
        com.bytedance.adsdk.hn.qor.qor qorVar = this.uua.fc().get(hnVarDse.f12048hn);
        if (qorVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        hnj(hnVarDse, matrix);
        if (this.jip.tu()) {
            hnj(hnVarDse, matrix, qorVar, canvas);
        } else {
            hnj(hnVarDse, qorVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        super.hnj(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.uua.gjv().width(), this.uua.gjv().height());
    }

    private void hnj(com.bytedance.adsdk.hn.qor.hn hnVar, Matrix matrix) {
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar = this.f12112xn;
        if (hnjVar != null) {
            this.f12111ta.setColor(hnjVar.dse().intValue());
        } else {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar2 = this.f12110oj;
            if (hnjVar2 != null) {
                this.f12111ta.setColor(hnjVar2.dse().intValue());
            } else {
                this.f12111ta.setColor(hnVar.aq);
            }
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar3 = this.eum;
        if (hnjVar3 != null) {
            this.dnm.setColor(hnjVar3.dse().intValue());
        } else {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Integer, Integer> hnjVar4 = this.apu;
            if (hnjVar4 != null) {
                this.dnm.setColor(hnjVar4.dse().intValue());
            } else {
                this.dnm.setColor(hnVar.ojm);
            }
        }
        int iIntValue = ((this.gjv.hnj() == null ? 100 : this.gjv.hnj().dse().intValue()) * 255) / 100;
        this.f12111ta.setAlpha(iIntValue);
        this.dnm.setAlpha(iIntValue);
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar5 = this.as;
        if (hnjVar5 != null) {
            this.dnm.setStrokeWidth(hnjVar5.dse().floatValue());
            return;
        }
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar6 = this.wu;
        if (hnjVar6 != null) {
            this.dnm.setStrokeWidth(hnjVar6.dse().floatValue());
        } else {
            this.dnm.setStrokeWidth(hnVar.f12050ta * com.bytedance.adsdk.hn.dkl.dkl.hnj());
        }
    }

    private hnj hn(int i10) {
        for (int size = this.mjg.size(); size < i10; size++) {
            this.mjg.add(new hnj());
        }
        return this.mjg.get(i10 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[LOOP:1: B:21:0x0069->B:23:0x006f, LOOP_END] */
    private void hnj(com.bytedance.adsdk.hn.qor.hn hnVar, Matrix matrix, com.bytedance.adsdk.hn.qor.qor qorVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f10;
        int i10;
        int i11;
        PointF pointF;
        float f11;
        List<hnj> listHnj;
        int i12;
        ojm ojmVar = this;
        com.bytedance.adsdk.hn.qor.hn hnVar2 = hnVar;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar = ojmVar.tgn;
        if (hnjVar != null) {
            fFloatValue = hnjVar.dse().floatValue();
        } else {
            fFloatValue = hnVar2.qor;
        }
        float f12 = fFloatValue / 100.0f;
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj(matrix);
        List<String> listHnj2 = ojmVar.hnj(hnVar2.hnj);
        int size = listHnj2.size();
        float f13 = hnVar2.f12049sk / 10.0f;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar2 = ojmVar.tu;
        if (hnjVar2 != null) {
            fFloatValue2 = hnjVar2.dse().floatValue();
        } else {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar3 = ojmVar.f5do;
            if (hnjVar3 != null) {
                fFloatValue2 = hnjVar3.dse().floatValue();
            }
            f10 = f13;
            i10 = -1;
            i11 = 0;
            while (i11 < size) {
                String str = listHnj2.get(i11);
                pointF = hnVar2.orl;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                listHnj = ojmVar.hnj(str, f11, qorVar, f12, f10, true);
                i12 = 0;
                while (i12 < listHnj.size()) {
                    hnj hnjVar4 = listHnj.get(i12);
                    i10++;
                    canvas.save();
                    ojmVar.hnj(canvas, hnVar2, i10, hnjVar4.f12113hn);
                    float f14 = f12;
                    com.bytedance.adsdk.hn.qor.hn hnVar3 = hnVar2;
                    float f15 = f10;
                    ojmVar.hnj(hnjVar4.hnj, hnVar3, qorVar, canvas, fHnj, f14, f15);
                    f12 = f14;
                    canvas.restore();
                    i12++;
                    ojmVar = this;
                    f10 = f15;
                    hnVar2 = hnVar;
                }
                i11++;
                ojmVar = this;
                f10 = f10;
                hnVar2 = hnVar;
            }
        }
        f13 += fFloatValue2;
        f10 = f13;
        i10 = -1;
        i11 = 0;
        while (i11 < size) {
            String str2 = listHnj2.get(i11);
            pointF = hnVar2.orl;
            if (pointF == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF.x;
            }
            listHnj = ojmVar.hnj(str2, f11, qorVar, f12, f10, true);
            i12 = 0;
            while (i12 < listHnj.size()) {
                hnj hnjVar5 = listHnj.get(i12);
                i10++;
                canvas.save();
                ojmVar.hnj(canvas, hnVar2, i10, hnjVar5.f12113hn);
                float f16 = f12;
                com.bytedance.adsdk.hn.qor.hn hnVar4 = hnVar2;
                float f17 = f10;
                ojmVar.hnj(hnjVar5.hnj, hnVar4, qorVar, canvas, fHnj, f16, f17);
                f12 = f16;
                canvas.restore();
                i12++;
                ojmVar = this;
                f10 = f17;
                hnVar2 = hnVar;
            }
            i11++;
            ojmVar = this;
            f10 = f10;
            hnVar2 = hnVar;
        }
    }

    private void hnj(String str, com.bytedance.adsdk.hn.qor.hn hnVar, com.bytedance.adsdk.hn.qor.qor qorVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.hn.qor.gjv gjvVar = this.uua.mjg().get(com.bytedance.adsdk.hn.qor.gjv.hnj(str.charAt(i10), qorVar.hnj(), qorVar.qor()));
            if (gjvVar != null) {
                hnj(gjvVar, f11, hnVar, canvas);
                canvas.translate((((float) gjvVar.hn()) * f11 * com.bytedance.adsdk.hn.dkl.dkl.hnj()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[LOOP:1: B:27:0x00a8->B:29:0x00ae, LOOP_END] */
    private void hnj(com.bytedance.adsdk.hn.qor.hn hnVar, com.bytedance.adsdk.hn.qor.qor qorVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fHnj;
        List<String> listHnj;
        int size;
        int i10;
        int i11;
        PointF pointF;
        float f10;
        List<hnj> listHnj2;
        int i12;
        Typeface typefaceHnj = hnj(qorVar);
        if (typefaceHnj != null) {
            String strHn = hnVar.hnj;
            apu apuVarM1do = this.jip.m1do();
            if (apuVarM1do != null) {
                strHn = apuVarM1do.hn(ojm(), strHn);
            }
            this.f12111ta.setTypeface(typefaceHnj);
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar = this.tgn;
            if (hnjVar != null) {
                fFloatValue = hnjVar.dse().floatValue();
            } else {
                fFloatValue = hnVar.qor;
            }
            this.f12111ta.setTextSize(com.bytedance.adsdk.hn.dkl.dkl.hnj() * fFloatValue);
            this.dnm.setTypeface(this.f12111ta.getTypeface());
            this.dnm.setTextSize(this.f12111ta.getTextSize());
            float f11 = hnVar.f12049sk / 10.0f;
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar2 = this.tu;
            if (hnjVar2 != null) {
                fFloatValue2 = hnjVar2.dse().floatValue();
            } else {
                com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVar3 = this.f5do;
                if (hnjVar3 != null) {
                    fFloatValue2 = hnjVar3.dse().floatValue();
                }
                fHnj = ((f11 * com.bytedance.adsdk.hn.dkl.dkl.hnj()) * fFloatValue) / 100.0f;
                listHnj = hnj(strHn);
                size = listHnj.size();
                i10 = 0;
                i11 = -1;
                while (i10 < size) {
                    String str = listHnj.get(i10);
                    pointF = hnVar.orl;
                    if (pointF == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF.x;
                    }
                    com.bytedance.adsdk.hn.qor.qor qorVar2 = qorVar;
                    listHnj2 = hnj(str, f10, qorVar2, 0.0f, fHnj, false);
                    for (i12 = 0; i12 < listHnj2.size(); i12++) {
                        hnj hnjVar4 = listHnj2.get(i12);
                        i11++;
                        canvas.save();
                        hnj(canvas, hnVar, i11, hnjVar4.f12113hn);
                        hnj(hnjVar4.hnj, hnVar, canvas, fHnj);
                        canvas.restore();
                    }
                    i10++;
                    qorVar = qorVar2;
                }
            }
            f11 += fFloatValue2;
            fHnj = ((f11 * com.bytedance.adsdk.hn.dkl.dkl.hnj()) * fFloatValue) / 100.0f;
            listHnj = hnj(strHn);
            size = listHnj.size();
            i10 = 0;
            i11 = -1;
            while (i10 < size) {
                String str2 = listHnj.get(i10);
                pointF = hnVar.orl;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                com.bytedance.adsdk.hn.qor.qor qorVar3 = qorVar;
                listHnj2 = hnj(str2, f10, qorVar3, 0.0f, fHnj, false);
                while (i12 < listHnj2.size()) {
                    hnj hnjVar5 = listHnj2.get(i12);
                    i11++;
                    canvas.save();
                    hnj(canvas, hnVar, i11, hnjVar5.f12113hn);
                    hnj(hnjVar5.hnj, hnVar, canvas, fHnj);
                    canvas.restore();
                }
                i10++;
                qorVar = qorVar3;
            }
        }
    }

    private void hnj(Canvas canvas, com.bytedance.adsdk.hn.qor.hn hnVar, int i10, float f10) {
        PointF pointF = hnVar.bug;
        PointF pointF2 = hnVar.orl;
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
        float f11 = (i10 * hnVar.dkl * fHnj) + (pointF == null ? 0.0f : (hnVar.dkl * 0.6f * fHnj) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.hnj[hnVar.gjv.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
    }

    private Typeface hnj(com.bytedance.adsdk.hn.qor.qor qorVar) {
        Typeface typefaceDse;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Typeface, Typeface> hnjVar = this.xyo;
        if (hnjVar != null && (typefaceDse = hnjVar.dse()) != null) {
            return typefaceDse;
        }
        Typeface typefaceHnj = this.jip.hnj(qorVar);
        return typefaceHnj != null ? typefaceHnj : qorVar.gjv();
    }

    private List<String> hnj(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void hnj(String str, com.bytedance.adsdk.hn.qor.hn hnVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strHnj = hnj(str, length);
            length += strHnj.length();
            hnj(strHnj, hnVar, canvas);
            canvas.translate(this.f12111ta.measureText(strHnj) + f10, 0.0f);
        }
    }

    private List<hnj> hnj(String str, float f10, com.bytedance.adsdk.hn.qor.qor qorVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.hn.qor.gjv gjvVar = this.uua.mjg().get(com.bytedance.adsdk.hn.qor.gjv.hnj(cCharAt, qorVar.hnj(), qorVar.qor()));
                if (gjvVar != null) {
                    fMeasureText = ((float) gjvVar.hn()) * f11 * com.bytedance.adsdk.hn.dkl.dkl.hnj();
                }
            } else {
                fMeasureText = this.f12111ta.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                hnj hnjVarHn = hn(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    hnjVarHn.hnj(strTrim, (f13 - f16) - ((strTrim.length() - strSubstring.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    hnjVarHn.hnj(strTrim2, ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            hn(i10).hnj(str.substring(i11), f13);
        }
        return this.mjg.subList(0, i10);
    }

    private void hnj(com.bytedance.adsdk.hn.qor.gjv gjvVar, float f10, com.bytedance.adsdk.hn.qor.hn hnVar, Canvas canvas) {
        List<com.bytedance.adsdk.hn.hnj.hnj.gjv> listHnj = hnj(gjvVar);
        for (int i10 = 0; i10 < listHnj.size(); i10++) {
            Path pathGjv = listHnj.get(i10).gjv();
            pathGjv.computeBounds(this.aq, false);
            this.ojm.reset();
            this.ojm.preTranslate(0.0f, (-hnVar.dse) * com.bytedance.adsdk.hn.dkl.dkl.hnj());
            this.ojm.preScale(f10, f10);
            pathGjv.transform(this.ojm);
            if (hnVar.dnm) {
                hnj(pathGjv, this.f12111ta, canvas);
                hnj(pathGjv, this.dnm, canvas);
            } else {
                hnj(pathGjv, this.dnm, canvas);
                hnj(pathGjv, this.f12111ta, canvas);
            }
        }
    }

    private void hnj(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void hnj(String str, com.bytedance.adsdk.hn.qor.hn hnVar, Canvas canvas) {
        if (hnVar.dnm) {
            hnj(str, this.f12111ta, canvas);
            hnj(str, this.dnm, canvas);
        } else {
            hnj(str, this.dnm, canvas);
            hnj(str, this.f12111ta, canvas);
        }
    }

    private void hnj(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.hn.hnj.hnj.gjv> hnj(com.bytedance.adsdk.hn.qor.gjv gjvVar) {
        if (this.bug.containsKey(gjvVar)) {
            return this.bug.get(gjvVar);
        }
        List<jip> listHnj = gjvVar.hnj();
        int size = listHnj.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.hn.hnj.hnj.gjv(this.jip, this, listHnj.get(i10), this.uua));
        }
        this.bug.put(gjvVar, arrayList);
        return arrayList;
    }

    private String hnj(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!qor(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.orl.indexOfKey(j10) >= 0) {
            return this.orl.get(j10);
        }
        this.dse.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.dse.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.dse.toString();
        this.orl.put(j10, string);
        return string;
    }
}
