package com.bytedance.sdk.component.hn.hnj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dnm implements Cloneable {
    public long dkl;
    public TimeUnit dse;
    public long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public long f12854hn;
    public List<aq> hnj;
    public TimeUnit qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public TimeUnit f12855sk;

    public dnm(hnj hnjVar) {
        this.f12854hn = hnjVar.f12856hn;
        this.gjv = hnjVar.gjv;
        this.dkl = hnjVar.dkl;
        List<aq> list = hnjVar.hnj;
        this.qor = hnjVar.qor;
        this.f12855sk = hnjVar.f12857sk;
        this.dse = hnjVar.dse;
        this.hnj = list;
    }

    public hnj hn() {
        return new hnj(this);
    }

    public abstract gjv hnj();

    public abstract hn hnj(bug bugVar);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class hnj {
        public long dkl;
        public TimeUnit dse;
        public long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public long f12856hn;
        public final List<aq> hnj;
        public TimeUnit qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public TimeUnit f12857sk;

        public hnj() {
            this.hnj = new ArrayList();
            this.f12856hn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.qor = timeUnit;
            this.gjv = 10000L;
            this.f12857sk = timeUnit;
            this.dkl = 10000L;
            this.dse = timeUnit;
        }

        public hnj hn(long j10, TimeUnit timeUnit) {
            this.gjv = j10;
            this.f12857sk = timeUnit;
            return this;
        }

        public hnj hnj(long j10, TimeUnit timeUnit) {
            this.f12856hn = j10;
            this.qor = timeUnit;
            return this;
        }

        public hnj qor(long j10, TimeUnit timeUnit) {
            this.dkl = j10;
            this.dse = timeUnit;
            return this;
        }

        public hnj hnj(aq aqVar) {
            this.hnj.add(aqVar);
            return this;
        }

        public dnm hnj() {
            return com.bytedance.sdk.component.hn.hnj.hnj.hnj.hnj(this);
        }

        public hnj(String str) {
            this.hnj = new ArrayList();
            this.f12856hn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.qor = timeUnit;
            this.gjv = 10000L;
            this.f12857sk = timeUnit;
            this.dkl = 10000L;
            this.dse = timeUnit;
        }

        public hnj(dnm dnmVar) {
            this.hnj = new ArrayList();
            this.f12856hn = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.qor = timeUnit;
            this.gjv = 10000L;
            this.f12857sk = timeUnit;
            this.dkl = 10000L;
            this.dse = timeUnit;
            this.f12856hn = dnmVar.f12854hn;
            this.qor = dnmVar.qor;
            this.gjv = dnmVar.gjv;
            this.f12857sk = dnmVar.f12855sk;
            this.dkl = dnmVar.dkl;
            this.dse = dnmVar.dse;
        }
    }
}
