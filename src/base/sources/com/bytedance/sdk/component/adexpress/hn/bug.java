package com.bytedance.sdk.component.adexpress.hn;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug implements ta.hnj {
    private AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<ta> f12678hn;
    fc hnj;
    private ojm qor;

    public bug(List<ta> list, ojm ojmVar) {
        this.f12678hn = list;
        this.qor = ojmVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public boolean hn(ta taVar) {
        int iIndexOf = this.f12678hn.indexOf(taVar);
        return iIndexOf < this.f12678hn.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public void hnj() {
        this.qor.gjv();
        Iterator<ta> it = this.f12678hn.iterator();
        while (it.hasNext() && !it.next().hnj(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public boolean qor() {
        return this.gjv.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public fc hn() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public void hnj(ta taVar) {
        int iIndexOf = this.f12678hn.indexOf(taVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f12678hn.size()) {
                return;
            }
        } while (!this.f12678hn.get(iIndexOf).hnj(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public void hnj(fc fcVar) {
        this.hnj = fcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ta.hnj
    public void hnj(boolean z10) {
        this.gjv.getAndSet(z10);
    }
}
