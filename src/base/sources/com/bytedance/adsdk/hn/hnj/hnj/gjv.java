package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, orl, sk {
    private final List<qor> aq;
    private final String dkl;
    private com.bytedance.adsdk.hn.hnj.hn.jip dnm;
    private final boolean dse;
    private final Path gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final RectF f11996hn;
    private final Paint hnj;
    private final com.bytedance.adsdk.hn.ojm ojm;
    private final Matrix qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final RectF f11997sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private List<orl> f11998ta;

    public gjv(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.jip jipVar, com.bytedance.adsdk.hn.dse dseVar) {
        this(ojmVar, hnjVar, jipVar.hnj(), jipVar.qor(), hnj(ojmVar, dseVar, hnjVar, jipVar.hn()), hnj(jipVar.hn()));
    }

    private static List<qor> hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, List<com.bytedance.adsdk.hn.qor.hn.qor> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            qor qorVarHnj = list.get(i10).hnj(ojmVar, dseVar, hnjVar);
            if (qorVarHnj != null) {
                arrayList.add(qorVarHnj);
            }
        }
        return arrayList;
    }

    private boolean sk() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.aq.size(); i11++) {
            if ((this.aq.get(i11) instanceof sk) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        this.qor.reset();
        com.bytedance.adsdk.hn.hnj.hn.jip jipVar = this.dnm;
        if (jipVar != null) {
            this.qor.set(jipVar.gjv());
        }
        this.gjv.reset();
        if (this.dse) {
            return this.gjv;
        }
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            qor qorVar = this.aq.get(size);
            if (qorVar instanceof orl) {
                this.gjv.addPath(((orl) qorVar).gjv(), this.qor);
            }
        }
        return this.gjv;
    }

    List<orl> hn() {
        if (this.f11998ta == null) {
            this.f11998ta = new ArrayList();
            for (int i10 = 0; i10 < this.aq.size(); i10++) {
                qor qorVar = this.aq.get(i10);
                if (qorVar instanceof orl) {
                    this.f11998ta.add((orl) qorVar);
                }
            }
        }
        return this.f11998ta;
    }

    Matrix qor() {
        com.bytedance.adsdk.hn.hnj.hn.jip jipVar = this.dnm;
        if (jipVar != null) {
            return jipVar.gjv();
        }
        this.qor.reset();
        return this.qor;
    }

    gjv(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, String str, boolean z10, List<qor> list, com.bytedance.adsdk.hn.qor.hnj.bug bugVar) {
        this.hnj = new com.bytedance.adsdk.hn.hnj.hnj();
        this.f11996hn = new RectF();
        this.qor = new Matrix();
        this.gjv = new Path();
        this.f11997sk = new RectF();
        this.dkl = str;
        this.ojm = ojmVar;
        this.dse = z10;
        this.aq = list;
        if (bugVar != null) {
            com.bytedance.adsdk.hn.hnj.hn.jip jipVarTa = bugVar.ta();
            this.dnm = jipVarTa;
            jipVarTa.hnj(hnjVar);
            this.dnm.hnj(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            qor qorVar = list.get(size);
            if (qorVar instanceof ta) {
                arrayList.add((ta) qorVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ta) arrayList.get(size2)).hnj(list.listIterator(list.size()));
        }
    }

    static com.bytedance.adsdk.hn.qor.hnj.bug hnj(List<com.bytedance.adsdk.hn.qor.hn.qor> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.hn.qor.hn.qor qorVar = list.get(i10);
            if (qorVar instanceof com.bytedance.adsdk.hn.qor.hnj.bug) {
                return (com.bytedance.adsdk.hn.qor.hnj.bug) qorVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        this.ojm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.aq.size());
        arrayList.addAll(list);
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            qor qorVar = this.aq.get(size);
            qorVar.hnj(arrayList, this.aq.subList(0, size));
            arrayList.add(qorVar);
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(Canvas canvas, Matrix matrix, int i10) {
        if (this.dse) {
            return;
        }
        this.qor.set(matrix);
        com.bytedance.adsdk.hn.hnj.hn.jip jipVar = this.dnm;
        if (jipVar != null) {
            this.qor.preConcat(jipVar.gjv());
            i10 = (int) (((((this.dnm.hnj() == null ? 100 : this.dnm.hnj().dse().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.ojm.ojm() && sk() && i10 != 255;
        if (z10) {
            this.f11996hn.set(0.0f, 0.0f, 0.0f, 0.0f);
            hnj(this.f11996hn, this.qor, true);
            this.hnj.setAlpha(i10);
            com.bytedance.adsdk.hn.dkl.dkl.hnj(canvas, this.f11996hn, this.hnj);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            qor qorVar = this.aq.get(size);
            if (qorVar instanceof sk) {
                ((sk) qorVar).hnj(canvas, this.qor, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        this.qor.set(matrix);
        com.bytedance.adsdk.hn.hnj.hn.jip jipVar = this.dnm;
        if (jipVar != null) {
            this.qor.preConcat(jipVar.gjv());
        }
        this.f11997sk.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.aq.size() - 1; size >= 0; size--) {
            qor qorVar = this.aq.get(size);
            if (qorVar instanceof sk) {
                ((sk) qorVar).hnj(this.f11997sk, this.qor, z10);
                rectF.union(this.f11997sk);
            }
        }
    }
}
