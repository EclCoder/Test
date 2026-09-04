package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bykv.vk.openvk.hnj.hnj.hnj.qor.b;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc {
    private c gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14461hn;
    private long hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private as f14462sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private int aq;
        private int bug;
        private int dnm;
        private boolean gjv;
        private b mjg;
        private int ojm;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private boolean f14464sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private int f14465ta;
        private long hnj = 0;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private long f14463hn = 0;
        private long qor = 0;
        private long dkl = 0;
        private boolean dse = false;
        private boolean orl = false;

        private void jip() {
            long j10 = this.qor;
            if (j10 > 0) {
                long j11 = this.hnj;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.hnj = j12;
                    if (j12 == 0) {
                        this.hnj = j10;
                    }
                }
            }
        }

        public int aq() {
            return this.f14465ta;
        }

        public boolean bug() {
            return this.dse;
        }

        public int dkl() {
            return this.ojm;
        }

        public boolean dnm() {
            return this.orl;
        }

        public int dse() {
            long j10 = this.qor;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.hnj * 100) / j10), 100);
        }

        public boolean fc() {
            return this.f14464sk;
        }

        public long gjv() {
            return this.qor;
        }

        public long hn() {
            return this.hnj;
        }

        public long hnj() {
            return this.dkl;
        }

        public boolean mjg() {
            return this.gjv;
        }

        public int ojm() {
            return this.dnm;
        }

        public b orl() {
            return this.mjg;
        }

        public long qor() {
            return this.f14463hn;
        }

        public int sk() {
            return this.aq;
        }

        public int ta() {
            return this.bug;
        }

        public void gjv(long j10) {
            this.qor = j10;
            jip();
        }

        public void hn(long j10) {
            this.hnj = j10;
            jip();
        }

        public void hnj(long j10) {
            this.dkl = j10;
        }

        public void qor(long j10) {
            this.f14463hn = j10;
        }

        public void hnj(int i10) {
            this.aq = i10;
        }

        public void qor(int i10) {
            this.f14465ta = i10;
        }

        public void gjv(int i10) {
            this.bug = i10;
        }

        public void hn(int i10) {
            this.ojm = i10;
        }

        public void hnj(boolean z10) {
            this.dse = z10;
        }

        public void qor(boolean z10) {
            this.f14464sk = z10;
        }

        public void hn(boolean z10) {
            this.gjv = z10;
        }

        public void hnj(b bVar) {
            this.mjg = bVar;
        }
    }

    public fc(long j10, String str, int i10, c cVar, as asVar) {
        this.hnj = j10;
        this.f14461hn = str;
        this.qor = i10;
        this.gjv = cVar;
        this.f14462sk = asVar;
    }

    public c gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f14461hn;
    }

    public long hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.qor;
    }

    public as sk() {
        return this.f14462sk;
    }
}
