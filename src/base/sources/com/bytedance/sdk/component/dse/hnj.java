package com.bytedance.sdk.component.dse;

import android.os.Bundle;
import com.bytedance.sdk.component.dse.hn.gjv;
import com.bytedance.sdk.component.dse.qor.qor;
import com.bytedance.sdk.component.hn.hnj.aq;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.hnj.hnj.sk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static hn f12837hn;
    private static sk hnj;
    private dnm qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        boolean hnj();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.dse.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0188hnj {
        private Bundle dkl;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private Set<String> f12839sk;
        final List<aq> gjv = new ArrayList();
        int hnj = 10000;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12838hn = 10000;
        int qor = 10000;

        public C0188hnj hnj(boolean z10) {
            return this;
        }

        public C0188hnj qor(long j10, TimeUnit timeUnit) {
            this.qor = hnj("timeout", j10, timeUnit);
            return this;
        }

        public C0188hnj hn(long j10, TimeUnit timeUnit) {
            this.f12838hn = hnj("timeout", j10, timeUnit);
            return this;
        }

        public C0188hnj hnj(long j10, TimeUnit timeUnit) {
            this.hnj = hnj("timeout", j10, timeUnit);
            return this;
        }

        public C0188hnj hnj(aq aqVar) {
            this.gjv.add(aqVar);
            return this;
        }

        private static int hnj(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(str + " too small.");
            }
            throw new NullPointerException("unit == null");
        }

        public hnj hnj() {
            return new hnj(this);
        }
    }

    public static boolean dkl() {
        hn hnVar = f12837hn;
        if (hnVar == null) {
            return false;
        }
        return hnVar.hnj();
    }

    public static void hnj() {
        qor.hnj(qor.hnj.DEBUG);
    }

    public static boolean sk() {
        sk skVar = hnj;
        if (skVar == null) {
            return false;
        }
        return skVar.hnj();
    }

    public dnm dse() {
        return this.qor;
    }

    public com.bytedance.sdk.component.dse.hn.hnj gjv() {
        return new com.bytedance.sdk.component.dse.hn.hnj(this.qor);
    }

    public gjv hn() {
        return new gjv(this.qor);
    }

    public com.bytedance.sdk.component.dse.hn.hn qor() {
        return new com.bytedance.sdk.component.dse.hn.hn(this.qor);
    }

    private hnj(C0188hnj c0188hnj) {
        dnm.hnj hnjVar = new dnm.hnj();
        long j10 = c0188hnj.hnj;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dnm.hnj hnjVarHn = hnjVar.hnj(j10, timeUnit).qor(c0188hnj.qor, timeUnit).hn(c0188hnj.f12838hn, timeUnit);
        List<aq> list = c0188hnj.gjv;
        if (list != null && list.size() > 0) {
            Iterator<aq> it = c0188hnj.gjv.iterator();
            while (it.hasNext()) {
                hnjVarHn.hnj(it.next());
            }
        }
        if (c0188hnj.dkl != null) {
            Bundle unused = c0188hnj.dkl;
        }
        Set unused2 = c0188hnj.f12839sk;
        this.qor = hnjVarHn.hnj();
    }

    public static void hnj(sk skVar) {
        hnj = skVar;
    }

    public static void hnj(hn hnVar) {
        f12837hn = hnVar;
    }
}
