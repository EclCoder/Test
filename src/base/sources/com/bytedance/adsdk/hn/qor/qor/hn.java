package com.bytedance.adsdk.hn.qor.qor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {
    private final List<hnj> aq;
    private boolean bug;
    private final Paint dnm;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> dse;
    private final RectF ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final RectF f12100ta;

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.qor.qor.hn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[sk.hn.values().length];
            hnj = iArr;
            try {
                iArr[sk.hn.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[sk.hn.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public hn(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar, List<sk> list, com.bytedance.adsdk.hn.dse dseVar, Context context) {
        int i10;
        hnj hnjVar;
        sk.hn hnVarBug;
        int i11;
        super(ojmVar, skVar);
        this.aq = new ArrayList();
        this.ojm = new RectF();
        this.f12100ta = new RectF();
        this.dnm = new Paint();
        this.bug = true;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarEum = skVar.eum();
        if (hnVarEum != null) {
            com.bytedance.adsdk.hn.hnj.hn.hnj<Float, Float> hnjVarHnj = hnVarEum.hnj();
            this.dse = hnjVarHnj;
            hnj(hnjVarHnj);
            this.dse.hnj(this);
        } else {
            this.dse = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(dseVar.orl().size());
        int size = list.size() - 1;
        hnj hnjVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            sk skVar2 = list.get(size);
            hnj hnjVarHnj2 = hnj.hnj(this, skVar2, ojmVar, dseVar, context);
            if (hnjVarHnj2 != null) {
                longSparseArray.put(hnjVarHnj2.hn().sk(), hnjVarHnj2);
                if (hnjVar2 != null) {
                    hnjVar2.hnj(hnjVarHnj2);
                    hnjVar2 = null;
                } else {
                    this.aq.add(0, hnjVarHnj2);
                    if (skVar2 != null && (hnVarBug = skVar2.bug()) != null && ((i11 = AnonymousClass1.hnj[hnVarBug.ordinal()]) == 1 || i11 == 2)) {
                        hnjVar2 = hnjVarHnj2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            hnj hnjVar3 = (hnj) longSparseArray.get(longSparseArray.keyAt(i10));
            if (hnjVar3 != null && (hnjVar = (hnj) longSparseArray.get(hnjVar3.hn().orl())) != null) {
                hnjVar3.hn(hnjVar);
            }
        }
    }

    public List<hnj> bug() {
        return this.aq;
    }

    public void hn(boolean z10) {
        this.bug = z10;
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hnj(boolean z10) {
        super.hnj(z10);
        Iterator<hnj> it = this.aq.iterator();
        while (it.hasNext()) {
            it.next().hnj(z10);
        }
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        super.hn(canvas, matrix, i10);
        com.bytedance.adsdk.hn.sk.hnj("CompositionLayer#draw");
        this.f12100ta.set(0.0f, 0.0f, this.qor.aq(), this.qor.ojm());
        matrix.mapRect(this.f12100ta);
        boolean z10 = this.f12102hn.ojm() && this.aq.size() > 1 && i10 != 255;
        if (z10) {
            this.dnm.setAlpha(i10);
            com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f12100ta, this.dnm);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            if (((this.bug || !"__container".equals(this.qor.dkl())) && !this.f12100ta.isEmpty()) ? canvas.clipRect(this.f12100ta) : true) {
                this.aq.get(size).hnj(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.hn.sk.hn("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        super.hnj(rectF, matrix, z10);
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            this.ojm.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.aq.get(size).hnj(this.ojm, this.hnj, true);
            rectF.union(this.ojm);
        }
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hnj(float f10) {
        super.hnj(f10);
        if (this.dse != null) {
            f10 = ((this.dse.dse().floatValue() * this.qor.hnj().bug()) - this.qor.hnj().dkl()) / (this.f12102hn.tgn().uua() + 0.01f);
        }
        if (this.dse == null) {
            f10 -= this.qor.qor();
        }
        if (this.qor.hn() != 0.0f && !"__container".equals(this.qor.dkl())) {
            f10 /= this.qor.hn();
        }
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            this.aq.get(size).hnj(f10);
        }
    }
}
