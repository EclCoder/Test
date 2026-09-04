package com.bytedance.sdk.component.sk.hn.qor;

import android.content.Context;
import com.bytedance.sdk.component.sk.apu;
import com.bytedance.sdk.component.sk.bug;
import com.bytedance.sdk.component.sk.eum;
import com.bytedance.sdk.component.sk.oj;
import com.bytedance.sdk.component.sk.orl;
import com.bytedance.sdk.component.sk.uua;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements orl {
    private apu aq;
    private com.bytedance.sdk.component.sk.qor dkl;
    private com.bytedance.sdk.component.sk.hn dse;
    private uua gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ExecutorService f12986hn;
    private bug hnj;
    private eum ojm;
    private com.bytedance.sdk.component.sk.gjv qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private oj f12987sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f12988ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private apu aq;
        private com.bytedance.sdk.component.sk.qor dkl;
        private com.bytedance.sdk.component.sk.hn dse;
        private uua gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private ExecutorService f12989hn;
        private bug hnj;
        private eum ojm;
        private com.bytedance.sdk.component.sk.gjv qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private oj f12990sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private boolean f12991ta;

        public hnj hnj(com.bytedance.sdk.component.sk.hn hnVar) {
            this.dse = hnVar;
            return this;
        }

        public hnj hnj(boolean z10) {
            this.f12991ta = z10;
            return this;
        }

        public hnj hnj(eum eumVar) {
            this.ojm = eumVar;
            return this;
        }

        public hnj hnj(apu apuVar) {
            this.aq = apuVar;
            return this;
        }

        public hnj hnj(com.bytedance.sdk.component.sk.gjv gjvVar) {
            this.qor = gjvVar;
            return this;
        }

        public sk hnj() {
            return new sk(this);
        }
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public eum dkl() {
        return this.ojm;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public boolean dse() {
        return this.f12988ta;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public com.bytedance.sdk.component.sk.qor gjv() {
        return this.dkl;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public apu hn() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public ExecutorService hnj() {
        return this.f12986hn;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public com.bytedance.sdk.component.sk.gjv qor() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.component.sk.orl
    public com.bytedance.sdk.component.sk.hn sk() {
        return this.dse;
    }

    private sk(hnj hnjVar) {
        this.hnj = hnjVar.hnj;
        this.f12986hn = hnjVar.f12989hn;
        this.qor = hnjVar.qor;
        this.gjv = hnjVar.gjv;
        this.f12987sk = hnjVar.f12990sk;
        this.dkl = hnjVar.dkl;
        this.dse = hnjVar.dse;
        this.aq = hnjVar.aq;
        this.ojm = hnjVar.ojm;
        this.f12988ta = hnjVar.f12991ta;
    }

    public static sk hnj(Context context) {
        return new hnj().hnj();
    }
}
