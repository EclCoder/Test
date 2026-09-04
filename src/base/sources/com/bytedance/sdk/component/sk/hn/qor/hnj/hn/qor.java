package com.bytedance.sdk.component.sk.hn.qor.hnj.hn;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.sk.uua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements uua {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.component.sk.hn.qor.hnj.hnj f12963hn;
    private final uua hnj;

    public qor(uua uuaVar) {
        this(uuaVar, null);
    }

    public qor(uua uuaVar, com.bytedance.sdk.component.sk.hn.qor.hnj.hnj hnjVar) {
        this.hnj = uuaVar;
        this.f12963hn = hnjVar;
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hn(String str) {
        return this.hnj.hn(str);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hnj(String str, Bitmap bitmap) {
        return this.hnj.hnj(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public Bitmap hnj(String str) {
        return this.hnj.hnj(str);
    }
}
