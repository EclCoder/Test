package com.bytedance.sdk.component.hnj;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc {
    private final List<bug> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final WebView f12893hn;
    private final hnj hnj;
    private final ojm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private volatile boolean f12894sk;

    fc(ojm ojmVar) {
        ArrayList arrayList = new ArrayList();
        this.gjv = arrayList;
        this.f12894sk = false;
        this.qor = ojmVar;
        if (ojmVar.hnj != null) {
            hnj hnjVar = ojmVar.f12903hn;
            if (hnjVar == null) {
                this.hnj = new apu();
            } else {
                this.hnj = hnjVar;
            }
        } else {
            this.hnj = ojmVar.f12903hn;
        }
        this.hnj.qor(ojmVar);
        this.f12893hn = ojmVar.hnj;
        arrayList.add(ojmVar.ojm);
        xn.hnj(ojmVar.dse);
    }

    private void hn() {
        if (this.f12894sk) {
            aq.hnj(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static ojm hnj(WebView webView) {
        return new ojm(webView);
    }

    public fc hnj(String str, gjv<?, ?> gjvVar) {
        return hnj(str, (String) null, gjvVar);
    }

    public fc hnj(Set<String> set, oj<?, ?> ojVar) {
        return hnj(set, (String) null, ojVar);
    }

    public fc hnj(String str, String str2, gjv<?, ?> gjvVar) {
        hn();
        this.hnj.dse.hnj(str, gjvVar);
        return this;
    }

    public fc hnj(Set<String> set, String str, oj<?, ?> ojVar) {
        hn();
        this.hnj.dse.hnj(set, ojVar);
        return this;
    }

    public fc hnj(String str, qor.hn hnVar) {
        return hnj(str, (String) null, hnVar);
    }

    public fc hnj(String str, String str2, qor.hn hnVar) {
        hn();
        this.hnj.dse.hnj(str, hnVar);
        return this;
    }

    public void hnj() {
        if (this.f12894sk) {
            return;
        }
        this.hnj.hn();
        this.f12894sk = true;
        Iterator<bug> it = this.gjv.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
