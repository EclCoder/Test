package com.bytedance.sdk.component.sk.hn.qor;

import com.bytedance.sdk.component.sk.dnm;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv<T> implements dnm {
    private boolean aq;
    private int dkl;
    private int dnm;
    private Map<String, String> dse;
    private T gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12951hn;
    private String hnj;
    private boolean ojm;
    private T qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12952sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.component.sk.dse f12953ta;

    @Override // com.bytedance.sdk.component.sk.dnm
    public boolean dkl() {
        return this.ojm;
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public int dse() {
        return this.dnm;
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public Map<String, String> gjv() {
        return this.dse;
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public T hn() {
        return this.qor;
    }

    public gjv hnj(qor qorVar, T t10) {
        this.qor = t10;
        this.hnj = qorVar.aq();
        this.f12951hn = qorVar.hnj();
        this.f12952sk = qorVar.hn();
        this.dkl = qorVar.qor();
        this.ojm = qorVar.bug();
        this.f12953ta = qorVar.mjg();
        this.dnm = qorVar.fc();
        return this;
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public T qor() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public boolean sk() {
        return this.aq;
    }

    public gjv hnj(qor qorVar, T t10, Map<String, String> map, boolean z10) {
        this.dse = map;
        this.aq = z10;
        return hnj(qorVar, t10);
    }

    @Override // com.bytedance.sdk.component.sk.dnm
    public String hnj() {
        return this.f12951hn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.sk.dnm
    public void hnj(Object obj) {
        this.gjv = this.qor;
        this.qor = obj;
    }
}
