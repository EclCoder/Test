package com.bytedance.sdk.component.sk.hnj;

import com.bytedance.sdk.component.sk.dkl;
import com.bytedance.sdk.component.sk.dse;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor<T> implements dkl {
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12994hn;
    Map<String, String> hnj;
    private T qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private dse f12995sk;

    public qor(int i10, T t10, String str) {
        this.f12994hn = i10;
        this.qor = t10;
        this.gjv = str;
    }

    @Override // com.bytedance.sdk.component.sk.dkl
    public T hn() {
        return this.qor;
    }

    public void hnj(dse dseVar) {
        this.f12995sk = dseVar;
    }

    @Override // com.bytedance.sdk.component.sk.dkl
    public String qor() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.component.sk.dkl
    public int hnj() {
        return this.f12994hn;
    }

    public qor(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.hnj = map;
    }
}
