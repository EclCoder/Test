package com.bytedance.sdk.openadsdk.uua;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static int gjv = 2;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f14725hn = 0;
    public static int hnj = -1;
    public static int qor = 1;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public static int f14726sk = 3;
    private int dkl = hnj;
    private long dse = 0;
    private long aq = 0;
    private final List<qor> ojm = new ArrayList();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f14727ta = 0;

    public void gjv(long j10) {
        int i10 = this.dkl;
        if (i10 == hnj || i10 != gjv) {
            return;
        }
        this.dkl = qor;
        this.ojm.add(new qor(this.f14727ta, j10));
        this.f14727ta = 0L;
    }

    public void hn(long j10) {
        int i10;
        int i11 = this.dkl;
        if (i11 == hnj || i11 == (i10 = f14726sk)) {
            return;
        }
        this.dkl = i10;
        this.aq = j10;
    }

    public void hnj(long j10) {
        this.dkl = f14725hn;
        this.dse = j10;
    }

    public void qor(long j10) {
        int i10;
        int i11 = this.dkl;
        if (i11 == hnj || i11 == (i10 = gjv) || i11 == f14726sk) {
            return;
        }
        this.dkl = i10;
        this.f14727ta = j10;
    }

    public long hnj(long j10, long j11) {
        long j12;
        long j13;
        long jHn;
        long j14 = this.aq;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (qor qorVar : this.ojm) {
            if (qorVar.hn() > j10) {
                if (j10 < qorVar.hnj()) {
                    j13 = i10;
                    jHn = qorVar.hn() - qorVar.hnj();
                } else {
                    j13 = i10;
                    jHn = qorVar.hn() - j10;
                }
                i10 = (int) (j13 + jHn);
            }
        }
        long j15 = this.dse;
        if (j15 < j10) {
            long j16 = this.f14727ta;
            if (j16 == 0) {
                j16 = this.aq;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - ((long) i10);
        }
        long j17 = this.f14727ta;
        if (j17 == 0) {
            j17 = this.aq;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - ((long) i10);
        return j12 - ((long) i10);
    }

    public int hnj() {
        return this.dkl;
    }
}
