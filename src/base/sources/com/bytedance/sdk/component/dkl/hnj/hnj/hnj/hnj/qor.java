package com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor {
    private static int qor = 20;
    private boolean aq;
    private final Context hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12816sk;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> f12815hn = new ArrayList();
    private final List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> gjv = new ArrayList();
    private boolean dkl = false;
    private volatile boolean dse = false;
    private final Runnable ojm = new Runnable() { // from class: com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (qor.this) {
                try {
                    qor.this.dse = false;
                    if (qor.this.f12815hn.isEmpty()) {
                        qor.this.dkl = false;
                        return;
                    }
                    if (qor.this.f12816sk) {
                        int size = qor.this.f12815hn.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            qor.this.gjv.add(qor.this.f12815hn.get(i10));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(qor.this.f12815hn);
                    }
                    qor.this.f12815hn.clear();
                    qor.this.dkl = false;
                    if (arrayList != null) {
                        qor.this.gjv(arrayList);
                        return;
                    }
                    qor qorVar = qor.this;
                    qorVar.gjv(qorVar.gjv);
                    qor.this.gjv.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public qor(Context context) {
        this.aq = true;
        this.hnj = context;
        try {
            com.bytedance.sdk.component.dkl.hnj.sk skVarFc = com.bytedance.sdk.component.dkl.hnj.dse.dkl().fc();
            if (skVarFc != null) {
                this.aq = skVarFc.orl();
                this.f12816sk = skVarFc.mjg();
                qor = skVarFc.fc();
            }
            apu.hnj("DBInsertMemRepo", "enableOpt:" + this.aq + ",BATCH_SIZE:" + qor, Boolean.valueOf(this.f12816sk));
        } catch (Throwable unused) {
        }
    }

    protected long dkl() {
        return 10000L;
    }

    public void gjv(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), list);
    }

    public abstract String hn();

    protected synchronized void qor(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> it = this.f12815hn.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.dkl.hnj.gjv.hnj next = it.next();
                        if (next != null) {
                            String strQor = next.qor();
                            if (!TextUtils.isEmpty(strQor) && list.contains(strQor)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    hn();
                    th2.getMessage();
                }
            }
        }
    }

    public Context sk() {
        return this.hnj;
    }

    private void hnj() {
        if (!this.dkl) {
            com.bytedance.sdk.component.dkl.hnj.dse.hnj.hnj().postDelayed(this.ojm, this.f12816sk ? dkl() : com.bytedance.sdk.component.dkl.hnj.dse.hnj.hn());
            this.dkl = true;
        }
        if (this.aq && this.f12815hn.size() >= qor && !this.dse) {
            com.bytedance.sdk.component.dkl.hnj.dse.hnj.hnj().removeCallbacks(this.ojm);
            com.bytedance.sdk.component.dkl.hnj.dse.hnj.hnj().post(this.ojm);
            this.dkl = true;
            this.dse = true;
        }
    }

    public synchronized void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (hnjVar.dkl() != null && !TextUtils.isEmpty(hnjVar.qor())) {
            this.f12815hn.add(hnjVar);
            hnj();
        }
    }
}
