package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj implements com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj, orl {
    private boolean dkl;
    private final com.bytedance.adsdk.hn.ojm gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f12011hn;
    private final boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.hnj.hn.orl f12012sk;
    private final Path hnj = new Path();
    private final hn dse = new hn();

    public oj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar, com.bytedance.adsdk.hn.qor.hn.uua uuaVar) {
        this.f12011hn = uuaVar.hnj();
        this.qor = uuaVar.qor();
        this.gjv = ojmVar;
        com.bytedance.adsdk.hn.hnj.hn.orl orlVarHnj = uuaVar.hn().hnj();
        this.f12012sk = orlVarHnj;
        hnjVar.hnj(orlVarHnj);
        orlVarHnj.hnj(this);
    }

    private void hn() {
        this.dkl = false;
        this.gjv.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        if (this.dkl) {
            return this.hnj;
        }
        this.hnj.reset();
        if (this.qor) {
            this.dkl = true;
            return this.hnj;
        }
        Path pathDse = this.f12012sk.dse();
        if (pathDse == null) {
            return this.hnj;
        }
        this.hnj.set(pathDse);
        this.hnj.setFillType(Path.FillType.EVEN_ODD);
        this.dse.hnj(this.hnj);
        this.dkl = true;
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.InterfaceC0162hnj
    public void hnj() {
        hn();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            qor qorVar = list.get(i10);
            if (qorVar instanceof eum) {
                eum eumVar = (eum) qorVar;
                if (eumVar.hn() == com.bytedance.adsdk.hn.qor.hn.xn.hnj.SIMULTANEOUSLY) {
                    this.dse.hnj(eumVar);
                    eumVar.hnj(this);
                } else if (!(qorVar instanceof xn)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((xn) qorVar);
                }
            } else if (!(qorVar instanceof xn)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((xn) qorVar);
            }
        }
        this.f12012sk.hnj((List<xn>) arrayList);
    }
}
