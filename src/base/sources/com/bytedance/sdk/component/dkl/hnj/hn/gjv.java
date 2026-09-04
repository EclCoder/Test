package com.bytedance.sdk.component.dkl.hnj.hn;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.sk;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private final PriorityBlockingQueue<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> bug;
    private final Comparator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> dnm;
    private volatile com.bytedance.sdk.component.dkl.hnj.hn.hn.qor ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private volatile Handler f12771ta;
    public static final gjv hnj = new gjv();
    public static final com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj gjv = new com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public static final AtomicLong f12769sk = new AtomicLong(0);
    public static final AtomicLong dkl = new AtomicLong(0);
    public static final long dse = System.currentTimeMillis();
    public static long aq = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public volatile boolean f12770hn = false;
    public volatile boolean qor = false;

    private gjv() {
        Comparator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> comparator = new Comparator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>() { // from class: com.bytedance.sdk.component.dkl.hnj.hn.gjv.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar2) {
                return gjv.this.hnj(hnjVar, hnjVar2);
            }
        };
        this.dnm = comparator;
        this.bug = new PriorityBlockingQueue<>(8, comparator);
    }

    public boolean gjv() {
        try {
            if (this.ojm != null || com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
                return false;
            }
            synchronized (this) {
                if (this.ojm != null) {
                    return false;
                }
                this.ojm = new com.bytedance.sdk.component.dkl.hnj.hn.hn.qor(this.bug);
                this.ojm.start();
                return true;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public void hn() {
        gjv();
        sk();
    }

    public void qor() {
        if (this.ojm == null || !this.ojm.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.ojm != null && this.ojm.isAlive()) {
                    if (this.f12771ta != null) {
                        this.f12771ta.removeCallbacksAndMessages(null);
                    }
                    this.ojm.hnj(false);
                    this.ojm.quitSafely();
                    this.ojm = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void sk() {
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(gjv.ua(), 1);
        final com.bytedance.sdk.component.dkl.hnj.hn.hn.qor qorVar = this.ojm;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (qorVar != null) {
                qorVar.qor(2);
                return;
            }
            return;
        }
        sk skVarFc = dse.dkl().fc();
        if (skVarFc != null) {
            Executor executorGjv = skVarFc.gjv();
            if (executorGjv == null) {
                executorGjv = skVarFc.sk();
            }
            if (executorGjv != null) {
                executorGjv.execute(new com.bytedance.sdk.component.dkl.hnj.sk.sk("flush") { // from class: com.bytedance.sdk.component.dkl.hnj.hn.gjv.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.dkl.hnj.hn.hn.qor qorVar2 = qorVar;
                        if (qorVar2 != null) {
                            qorVar2.qor(2);
                        }
                    }
                });
            }
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj() {
        return this.bug;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar2) {
        long jHnj;
        long jHn;
        long jHn2;
        long jHnj2;
        if (hnjVar == null) {
            return hnjVar2 == null ? 0 : -1;
        }
        if (hnjVar2 == null) {
            return 1;
        }
        if (hnjVar.sk() == hnjVar2.sk()) {
            if (hnjVar.hnj() != null) {
                jHnj = hnjVar.hnj().hnj();
                jHn = hnjVar.hnj().hn();
            } else {
                jHnj = 0;
                jHn = 0;
            }
            if (hnjVar2.hnj() != null) {
                jHnj2 = hnjVar2.hnj().hnj();
                jHn2 = hnjVar2.hnj().hn();
            } else {
                jHn2 = 0;
                jHnj2 = 0;
            }
            if (jHnj == 0 || jHnj2 == 0) {
                return 0;
            }
            long j10 = jHnj - jHnj2;
            if (Math.abs(j10) > 2147483647L) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jHn == 0 || jHn2 == 0) {
                return 0;
            }
            return (int) (jHn - jHn2);
        }
        return hnjVar.sk() - hnjVar2.sk();
    }

    public void hnj(Handler handler) {
        this.f12771ta = handler;
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        gjv();
        sk skVarFc = dse.dkl().fc();
        com.bytedance.sdk.component.dkl.hnj.hn.hn.qor qorVar = this.ojm;
        if (qorVar != null) {
            hnj(skVarFc, hnjVar);
            qorVar.hnj(hnjVar, hnjVar.sk() == 4);
        }
    }

    private void hnj(final sk skVar, com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        if (skVar != null) {
            try {
                if (skVar.dse()) {
                    final long jHn = (hnjVar == null || hnjVar.hnj() == null) ? 0L : hnjVar.hnj().hn();
                    if (jHn == 1) {
                        aq = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongLhi = gjv.lhi();
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(atomicLongLhi, 1);
                    if (atomicLongLhi.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorGjv = skVar.gjv();
                                if (executorGjv == null) {
                                    executorGjv = skVar.sk();
                                }
                                if (executorGjv != null) {
                                    executorGjv.execute(new com.bytedance.sdk.component.dkl.hnj.sk.sk("report") { // from class: com.bytedance.sdk.component.dkl.hnj.hn.gjv.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            gjv.this.hnj(skVar, jHn);
                                        }
                                    });
                                }
                            } else {
                                hnj(skVar, jHn);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(sk skVar, long j10) {
        com.bytedance.sdk.component.dkl.hnj.hn.hn.qor qorVar = this.ojm;
        if (skVar == null || qorVar == null) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar = gjv;
        qorVar.hnj(skVar.hnj(hnjVar.hn(j10)), true);
        hnjVar.dzo();
    }
}
