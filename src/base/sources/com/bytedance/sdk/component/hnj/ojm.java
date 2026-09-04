package com.bytedance.sdk.component.hnj;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    dnm aq;
    boolean dkl;
    boolean dse;
    dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    hnj f12903hn;
    WebView hnj;
    bug ojm;
    boolean orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    Context f12904sk;
    String qor = "IESJSBridge";

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    String f12905ta = "host";
    final Set<String> dnm = new LinkedHashSet();
    final Set<String> bug = new LinkedHashSet();

    ojm(WebView webView) {
        this.hnj = webView;
    }

    public ojm hn(boolean z10) {
        this.dse = z10;
        return this;
    }

    public ojm hnj(hnj hnjVar) {
        this.f12903hn = hnjVar;
        return this;
    }

    private void hn() {
        if ((this.hnj == null && !this.orl && this.f12903hn == null) || ((TextUtils.isEmpty(this.qor) && this.hnj != null) || this.gjv == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public ojm hnj(String str) {
        this.qor = str;
        return this;
    }

    public ojm hnj(ta taVar) {
        this.gjv = dse.hnj(taVar);
        return this;
    }

    public ojm hnj(boolean z10) {
        this.dkl = z10;
        return this;
    }

    public fc hnj() {
        hn();
        return new fc(this);
    }

    ojm() {
    }
}
