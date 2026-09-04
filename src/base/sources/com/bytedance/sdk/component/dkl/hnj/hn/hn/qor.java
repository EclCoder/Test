package com.bytedance.sdk.component.dkl.hnj.hn.hn;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.hnj.gjv;
import com.bytedance.sdk.component.dkl.hnj.sk;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends HandlerThread implements Handler.Callback {
    private static int uua = 10;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private static int f12777xn = 200;
    private final int apu;
    private volatile long aq;
    private final AtomicInteger bug;
    private volatile int dkl;
    private final long dnm;
    private volatile long dse;
    private final int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final AtomicInteger f12778fc;
    private com.bytedance.sdk.component.dkl.hnj.hn.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile boolean f12779hn;
    protected gjv hnj;
    private final AtomicInteger jip;
    private final List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f12780oj;
    private final AtomicInteger ojm;
    private volatile Handler orl;
    private final Object qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final PriorityBlockingQueue<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> f12781sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final long f12782ta;
    private final int wu;

    public qor(PriorityBlockingQueue<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> priorityBlockingQueue) {
        super("csj_log");
        this.f12779hn = true;
        this.qor = new Object();
        this.dse = 0L;
        this.aq = 0L;
        this.ojm = new AtomicInteger(0);
        this.f12782ta = 5000L;
        this.dnm = 5000000000L;
        this.bug = new AtomicInteger(0);
        this.mjg = new ArrayList();
        this.f12778fc = new AtomicInteger(0);
        this.jip = new AtomicInteger(0);
        this.f12780oj = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.apu = 1;
        this.eum = 2;
        this.wu = 3;
        this.f12781sk = priorityBlockingQueue;
        this.hnj = new com.bytedance.sdk.component.dkl.hnj.hnj.hn();
        if (com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
            return;
        }
        long jBug = dse.dkl().fc().bug();
        if (jBug > 0) {
            this.f12780oj = jBug;
        }
    }

    private boolean aq() {
        if (com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.f12770hn) {
            return this.dkl == 4 || this.dkl == 7 || this.dkl == 6 || this.dkl == 5 || this.dkl == 2;
        }
        return false;
    }

    private void dkl() {
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.wu(), 1);
        hnj(false);
        com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.qor();
    }

    private void dse() {
        if (this.f12781sk.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVarPoll = this.f12781sk.poll();
                if (!(hnjVarPoll instanceof com.bytedance.sdk.component.dkl.hnj.gjv.hn) && hnjVarPoll != null) {
                    hnj(hnjVarPoll);
                }
            }
        }
    }

    private void gjv() {
        if (!isAlive()) {
            com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.gjv();
        } else {
            if (hnj()) {
                return;
            }
            qor(6);
        }
    }

    private void ojm() {
        try {
            if (this.f12781sk.size() == 0 && this.orl.hasMessages(11) && hnj()) {
                hnj(false);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void qor() {
        gjv();
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.fvt(), 1);
        qor(1);
    }

    private void sk() {
        while (hnj()) {
            try {
                com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv;
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.aq(), 1);
                com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVarPoll = this.f12781sk.poll(this.f12780oj, TimeUnit.MILLISECONDS);
                int size = this.f12781sk.size();
                if (hnjVarPoll instanceof com.bytedance.sdk.component.dkl.hnj.gjv.hn) {
                    hnj(hnjVarPoll, size);
                } else if (hnjVarPoll == null) {
                    int iIncrementAndGet = this.ojm.incrementAndGet();
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.cm(), 1);
                    if (gjv(iIncrementAndGet)) {
                        dkl();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.dkl = 1;
                        hn((com.bytedance.sdk.component.dkl.hnj.gjv.hnj) null);
                    }
                } else {
                    hnj(hnjVarPoll);
                    hn(hnjVarPoll);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.sq(), 1);
            }
        }
    }

    private void ta() {
        if (this.orl.hasMessages(11)) {
            ojm();
        } else {
            sk(1);
        }
        com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv;
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.hn(), 1);
        if (this.dkl != 2) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.dse(), 1);
        synchronized (this.qor) {
            try {
                try {
                    long jNanoTime = System.nanoTime();
                    this.qor.wait(5000L);
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                    if (!gjvVar.f12770hn) {
                        boolean z10 = gjvVar.qor;
                    }
                    if (jNanoTime2 < 5000000000L && 5000000000L - jNanoTime2 >= 50000000) {
                        if (!gjvVar.f12770hn && !gjvVar.qor) {
                            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.orp(), 1);
                            qor(2);
                            return;
                        }
                        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.dnm(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.ta(), 1);
                } catch (InterruptedException e10) {
                    e10.getMessage();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.ojm(), 1);
                hn();
                hnj(true);
                sk();
            } else {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 11) {
                        ArrayList arrayList = new ArrayList(this.mjg);
                        this.mjg.clear();
                        hnj((List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>) arrayList, false, "timeout_dispatch");
                        ta();
                    }
                    return true;
                }
                qor();
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.orl = new Handler(getLooper(), this);
        com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.hnj(this.orl);
        this.orl.sendEmptyMessage(1);
    }

    public static void hn(int i10) {
        f12777xn = i10;
    }

    private void hn() {
        long jJip = dse.dkl().jip();
        if (jJip <= 0) {
            return;
        }
        this.hnj.hnj(Integer.MAX_VALUE, jJip);
    }

    public static void hnj(int i10) {
        uua = i10;
    }

    public void qor(int i10) {
        try {
            boolean zHnj = hnj(i10, com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.f12770hn);
            if (i10 != 6 && !zHnj) {
                return;
            }
            com.bytedance.sdk.component.dkl.hnj.gjv.hn hnVar = new com.bytedance.sdk.component.dkl.hnj.gjv.hn();
            hnVar.hnj(i10);
            this.f12781sk.add(hnVar);
            sk(3);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean gjv(int i10) {
        if (i10 < 4 || this.bug.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
        return (gjvVar.f12770hn || gjvVar.qor) ? false : true;
    }

    private void hn(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj;
        if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.hn() && dse.dkl().hnj()) {
            return;
        }
        int i10 = 0;
        if (aq()) {
            com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(this.dkl);
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.bug(), 1);
            if (this.f12781sk.size() != 0) {
                return;
            }
            if (!this.orl.hasMessages(2)) {
                com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.f12770hn = false;
                this.aq = 0L;
                this.dse = 0L;
                this.f12778fc.set(0);
                this.jip.set(0);
            } else {
                hnj(false);
                return;
            }
        }
        do {
            boolean zHnj = hnj(this.dkl, com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj.f12770hn);
            com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(zHnj, this.dkl, hnjVar);
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.orl(), 1);
            if (zHnj && (listHnj = this.hnj.hnj(this.dkl, -1, null)) != null) {
                listHnj.size();
                hnj(listHnj);
            } else {
                ojm();
            }
            i10++;
            if (!zHnj) {
                return;
            }
        } while (i10 <= 6);
    }

    public void hnj(boolean z10) {
        this.f12779hn = z10;
    }

    public boolean hnj() {
        return this.f12779hn;
    }

    public boolean hnj(int i10, boolean z10) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || !skVarFc.hnj(dse.dkl().sk())) {
            return false;
        }
        return this.hnj.hnj(i10, z10);
    }

    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, boolean z10) {
        if (hnjVar == null) {
            return;
        }
        hnjVar.gjv();
        if (z10) {
            if (this.orl != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(hnjVar);
                hnj((List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.f12781sk.add(hnjVar);
        sk(2);
    }

    private void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        this.ojm.set(0);
        if (i10 == 0) {
            this.dkl = ((com.bytedance.sdk.component.dkl.hnj.gjv.hn) hnjVar).ta();
            if (this.dkl != 6) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.xad(), 1);
                hn(hnjVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.gjv.hn hnVar = (com.bytedance.sdk.component.dkl.hnj.gjv.hn) hnjVar;
        if (hnVar.ta() == 1) {
            this.dkl = 1;
            hn(hnjVar);
        } else if (hnVar.ta() == 2) {
            dse();
            this.dkl = 2;
            hn(hnjVar);
        }
    }

    private void sk(int i10) {
        if (!hnj()) {
            if (this.orl == null) {
                return;
            }
            com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv;
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.qor(), 1);
            if (this.orl.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.dkl(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.gjv(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar.sk(), 1);
            }
            this.orl.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.hnj(), 1);
    }

    private void hn(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        this.mjg.addAll(list);
        this.mjg.size();
        sk skVarFc = dse.dkl().fc();
        if (skVarFc != null && skVarFc.dnm() != null) {
            uua = skVarFc.dnm().hn();
        }
        if (this.mjg.size() >= uua) {
            if (this.orl.hasMessages(11)) {
                this.orl.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.mjg);
            this.mjg.clear();
            hnj((List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>) arrayList, false, "max_size_dispatch");
            ta();
            return;
        }
        if (this.f12781sk.size() == 0) {
            hnj(false);
            if (this.orl.hasMessages(11)) {
                this.orl.removeMessages(11);
            }
            if (this.orl.hasMessages(1)) {
                this.orl.removeMessages(1);
            }
            long jHnj = f12777xn;
            if (skVarFc != null && skVarFc.dnm() != null) {
                jHnj = skVarFc.dnm().hnj();
            }
            this.orl.sendEmptyMessageDelayed(11, jHnj);
            return;
        }
        this.mjg.size();
    }

    private void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar) {
        this.ojm.set(0);
        com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
        if (gjvVar.f12770hn) {
            this.dkl = 5;
        } else if (gjvVar.qor) {
            this.dkl = 7;
        } else {
            this.dkl = 4;
        }
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.rmr(), 1);
        this.hnj.hnj(hnjVar, this.dkl);
        com.bytedance.sdk.component.dkl.hnj.qor.hnj.dse(hnjVar);
    }

    private void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, String str) {
        hnj(str);
        hnj(list, false, str);
        ta();
    }

    private void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(list, this.f12781sk.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.dkl.hnj.qor.hnj.qor()) {
                com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(0);
                if (hnjVar != null) {
                    if (hnjVar.sk() == 1) {
                        hnj(list, "highPriority");
                        return;
                    }
                    if (hnjVar.gjv() == 0 && hnjVar.sk() == 2) {
                        if (hnjVar.hn() == 3) {
                            hnj(list, "version_v3");
                            return;
                        } else {
                            hn(list);
                            return;
                        }
                    }
                    if (hnjVar.gjv() == 1) {
                        hnj(list, "stats");
                        return;
                    } else if (hnjVar.gjv() == 3) {
                        hnj(list, "adType_v3");
                        return;
                    } else {
                        if (hnjVar.gjv() == 2) {
                            hnj(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            hnj(list, "batchRead");
            return;
        }
        ojm();
    }

    private void hn(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, final boolean z10, final long j10) {
        this.bug.incrementAndGet();
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.gn(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.dkl.hnj.gjv.hnj next = it.next();
                int iOjm = next == null ? 0 : next.ojm();
                if (map.get(Integer.valueOf(iOjm)) == null) {
                    map.put(Integer.valueOf(iOjm), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iOjm))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && dse.dkl().hn() != null && dse.dkl().hn().get(num) != null) {
                    dse.dkl().hn().get(num).hnj(list, new com.bytedance.sdk.component.dkl.hnj.hn.hn() { // from class: com.bytedance.sdk.component.dkl.hnj.hn.hn.qor.3
                        @Override // com.bytedance.sdk.component.dkl.hnj.hn.hn
                        public void hnj(List<hnj> list2) {
                            try {
                                qor.this.bug.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    hnj hnjVar = list2.get(i10);
                                    if (hnjVar != null) {
                                        qor.this.hnj(z10, hnjVar.hnj(), hnjVar.hn(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.gjv.hnj(list, new com.bytedance.sdk.component.dkl.hnj.hn.hn() { // from class: com.bytedance.sdk.component.dkl.hnj.hn.hn.qor.2
                        @Override // com.bytedance.sdk.component.dkl.hnj.hn.hn
                        public void hnj(List<hnj> list2) {
                            try {
                                qor.this.bug.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    hnj hnjVar = list2.get(i10);
                                    if (hnjVar != null) {
                                        qor.this.hnj(z10, hnjVar.hnj(), hnjVar.hn(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.sq(), 1);
            this.bug.decrementAndGet();
        }
    }

    private void hnj(String str) {
        if (this.orl.hasMessages(11)) {
            this.orl.removeMessages(11);
        }
        if (this.mjg.size() != 0) {
            ArrayList arrayList = new ArrayList(this.mjg);
            this.mjg.clear();
            hnj((List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>) arrayList, false, "before_".concat(String.valueOf(str)));
            ta();
            arrayList.size();
        }
    }

    private void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, boolean z10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(list, this.dkl, str);
        com.bytedance.sdk.component.dkl.hnj.hn.qor qorVarDse = dse.dkl().dse();
        this.gjv = qorVarDse;
        if (qorVarDse != null) {
            hn(list, z10, jCurrentTimeMillis);
        } else {
            hnj(list, z10, jCurrentTimeMillis);
        }
    }

    private void hnj(final List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, final boolean z10, final long j10) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc != null) {
            Executor executorSk = skVarFc.sk();
            if (list.get(0).sk() == 1) {
                executorSk = skVarFc.gjv();
            }
            if (executorSk == null) {
                return;
            }
            this.bug.incrementAndGet();
            executorSk.execute(new com.bytedance.sdk.component.dkl.hnj.sk.sk("csj_log_upload") { // from class: com.bytedance.sdk.component.dkl.hnj.hn.hn.qor.1
                @Override // java.lang.Runnable
                public void run() {
                    qor qorVar = qor.this;
                    qorVar.hnj((List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj>) list, z10, j10, qorVar.dkl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, boolean z10, long j10, int i10) {
        qor qorVar;
        Throwable th2;
        hn hnVarHnj;
        try {
            com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(0);
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.gn(), 1);
            try {
                if (hnjVar.gjv() == 0) {
                    hnVarHnj = dse.gjv().hnj(list);
                    hnj(hnVarHnj, list);
                    if (hnVarHnj != null) {
                        com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(list, hnVarHnj.gjv);
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next().dkl());
                        }
                        jSONObject.put("stats_list", jSONArray);
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    hnVarHnj = dse.gjv().hnj(jSONObject);
                }
                hn hnVar = hnVarHnj;
                this.bug.decrementAndGet();
                qorVar = this;
                try {
                    qorVar.hnj(z10, hnVar, list, j10);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    th2.getMessage();
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.sq(), 1);
                    qorVar.bug.decrementAndGet();
                }
            } catch (Throwable th4) {
                th2 = th4;
                qorVar = this;
                th2.getMessage();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.sq(), 1);
                qorVar.bug.decrementAndGet();
            }
        } catch (Throwable th5) {
            th = th5;
            qorVar = this;
        }
    }

    private void hnj(hn hnVar, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (hnVar == null || !hnVar.hnj) {
            return;
        }
        List<Object> listHnj = com.bytedance.sdk.component.dkl.hnj.hn.hnj();
        if (list == null || listHnj == null || listHnj.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : list) {
            if (hnjVar.sk() == 1) {
                com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(hnjVar);
                com.bytedance.sdk.component.dkl.hnj.qor.hnj.sk(hnjVar);
                Iterator<Object> it = listHnj.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10, hn hnVar, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, long j10) {
        if (z10 || hnVar == null) {
            return;
        }
        int i10 = hnVar.f12774hn;
        int i11 = -2;
        if (hnVar.f12775sk) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (hnVar.hnj || ((i10 < 500 || i10 >= 509) && i10 <= 513 && i10 != 404)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.bug.get();
        }
        hnj(i11, list, j10);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: all -> 0x0040, DONT_GENERATE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0040, DONT_GENERATE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    private void hnj(int i10, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, long j10) {
        com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar;
        synchronized (this.qor) {
            if (list != null) {
                try {
                    if (this.orl != null) {
                        com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(i10, list, j10);
                        this.hnj.hnj(i10, list);
                        dse.dkl().fc();
                        if (i10 == -2) {
                            com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar2 = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                            gjvVar2.f12770hn = false;
                            gjvVar2.qor = true;
                            if (this.orl.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.aq < MBInterstitialActivity.WEB_LOAD_TIME) {
                                return;
                            }
                            this.aq = System.currentTimeMillis();
                            if (this.orl.hasMessages(2)) {
                                this.orl.removeMessages(2);
                            }
                            hnj(3, MBInterstitialActivity.WEB_LOAD_TIME);
                        } else if (i10 == -1) {
                            gjvVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                            if (!gjvVar.f12770hn || gjvVar.qor) {
                                gjvVar.f12770hn = false;
                                gjvVar.qor = false;
                                if (this.orl.hasMessages(2)) {
                                    this.orl.removeMessages(2);
                                }
                                if (this.orl.hasMessages(3)) {
                                    this.orl.removeMessages(3);
                                }
                                this.aq = 0L;
                                this.dse = 0L;
                                this.f12778fc.set(0);
                                this.jip.set(0);
                                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.jbd(), 1);
                                qor(2);
                            }
                        } else if (i10 == 0) {
                            com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar3 = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                            gjvVar3.f12770hn = false;
                            gjvVar3.qor = true;
                            if (this.orl.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.aq < MBInterstitialActivity.WEB_LOAD_TIME) {
                                return;
                            }
                            this.aq = System.currentTimeMillis();
                            if (this.orl.hasMessages(2)) {
                                this.orl.removeMessages(2);
                            }
                            hnj(3, MBInterstitialActivity.WEB_LOAD_TIME);
                        } else if (i10 == 200) {
                            gjvVar = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                            if (!gjvVar.f12770hn) {
                                gjvVar.f12770hn = false;
                                gjvVar.qor = false;
                                if (this.orl.hasMessages(2)) {
                                    this.orl.removeMessages(2);
                                }
                                if (this.orl.hasMessages(3)) {
                                    this.orl.removeMessages(3);
                                }
                                this.aq = 0L;
                                this.dse = 0L;
                                this.f12778fc.set(0);
                                this.jip.set(0);
                                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.jbd(), 1);
                                qor(2);
                            } else {
                                gjvVar.f12770hn = false;
                                gjvVar.qor = false;
                                if (this.orl.hasMessages(2)) {
                                    this.orl.removeMessages(2);
                                }
                                if (this.orl.hasMessages(3)) {
                                    this.orl.removeMessages(3);
                                }
                                this.aq = 0L;
                                this.dse = 0L;
                                this.f12778fc.set(0);
                                this.jip.set(0);
                                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.jbd(), 1);
                                qor(2);
                            }
                        } else if (i10 == 509) {
                            com.bytedance.sdk.component.dkl.hnj.hn.gjv gjvVar4 = com.bytedance.sdk.component.dkl.hnj.hn.gjv.hnj;
                            gjvVar4.f12770hn = true;
                            gjvVar4.qor = false;
                            if (this.orl.hasMessages(2)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.dse < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                                return;
                            }
                            this.dse = System.currentTimeMillis();
                            if (this.orl.hasMessages(3)) {
                                this.orl.removeMessages(3);
                            }
                            hnj(2, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                        }
                        if (this.dkl == 2) {
                            this.qor.notify();
                        }
                        this.f12781sk.size();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void hnj(int i10, long j10) {
        if (this.orl == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        if (i10 == 2) {
            this.orl.sendMessageDelayed(messageObtain, ((long) (((this.f12778fc.incrementAndGet() - 1) % 4) + 1)) * j10);
        } else if (i10 == 3) {
            this.orl.sendMessageDelayed(messageObtain, ((long) (((this.jip.incrementAndGet() - 1) % 4) + 1)) * j10);
        }
    }
}
