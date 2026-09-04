package com.bytedance.sdk.component.hn.hnj;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ojm {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12880hn;
    private String hnj;

    private ojm(String str) {
        this.hnj = str;
    }

    public static ojm hnj(String str) {
        return new ojm(str);
    }

    public String hnj() {
        return this.hnj;
    }

    public Charset hnj(Charset charset) {
        try {
            String str = this.f12880hn;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
