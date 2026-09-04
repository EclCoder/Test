package com.bytedance.sdk.component.sk.hn.qor.hnj.hn;

import com.bytedance.sdk.component.sk.oj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements oj {
    private com.bytedance.sdk.component.sk.hn.qor.hnj.qor<String, byte[]> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12961hn;
    private long hnj = 1048576;
    private int qor;

    public hn(int i10, int i11) {
        this.qor = i10;
        this.f12961hn = i11;
        this.gjv = new com.bytedance.sdk.component.sk.hn.qor.hnj.qor<>(i11);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hn(String str) {
        try {
            return this.gjv.hnj(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hnj(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.hnj) {
                    return false;
                }
                this.gjv.hnj(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public byte[] hnj(String str) {
        try {
            return this.gjv.hnj(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
