package com.bytedance.sdk.openadsdk.core.aq;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile boolean f13576hn;
    private static volatile hnj hnj;
    private static volatile long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Handler f13577sk;
    private final Queue<C0204hnj> gjv = new LinkedList();
    private final dnm dkl = oj.gjv();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aq.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0204hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final String f13578hn;
        private final long hnj;

        private C0204hnj(long j10, String str) {
            this.hnj = j10;
            this.f13578hn = str;
        }
    }

    private hnj() {
    }

    private synchronized boolean hn(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iGm = this.dkl.gm();
        long jPty = this.dkl.pty();
        if (this.gjv.size() <= 0 || this.gjv.size() < iGm) {
            this.gjv.offer(new C0204hnj(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.gjv.peek().hnj);
            if (jAbs <= jPty) {
                hn(jPty - jAbs);
                return true;
            }
            this.gjv.poll();
            this.gjv.offer(new C0204hnj(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String qor() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0204hnj c0204hnj : this.gjv) {
                if (map.containsKey(c0204hnj.f13578hn)) {
                    map.put(c0204hnj.f13578hn, Integer.valueOf(((Integer) map.get(c0204hnj.f13578hn)).intValue() + 1));
                } else {
                    map.put(c0204hnj.f13578hn, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public synchronized boolean hnj(String str) {
        try {
            if (hn(str)) {
                hnj(true);
                hnj(qor);
            } else {
                hnj(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13576hn;
    }

    private synchronized void hnj(long j10) {
        try {
            if (this.f13577sk == null) {
                this.f13577sk = new Handler(Looper.getMainLooper());
            }
            this.f13577sk.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aq.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hnj(false);
                }
            }, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean hn() {
        return f13576hn;
    }

    private synchronized void hn(long j10) {
        qor = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hnj(boolean z10) {
        f13576hn = z10;
    }
}
