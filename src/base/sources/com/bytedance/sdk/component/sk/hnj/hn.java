package com.bytedance.sdk.component.sk.hnj;

import com.bytedance.sdk.component.sk.mjg;
import com.bytedance.sdk.component.sk.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements sk {
    private mjg gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f12993hn;
    private String hnj;
    private boolean qor;

    public hn(String str, boolean z10, boolean z11, mjg mjgVar) {
        this.hnj = str;
        this.f12993hn = z10;
        this.qor = z11;
        this.gjv = mjgVar;
    }

    @Override // com.bytedance.sdk.component.sk.sk
    public boolean hn() {
        return this.f12993hn;
    }

    @Override // com.bytedance.sdk.component.sk.sk
    public String hnj() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.sk.sk
    public boolean qor() {
        return this.qor;
    }
}
