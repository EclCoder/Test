package com.bytedance.sdk.openadsdk.gjv;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    private final WebView aq;
    private int dkl;
    private int dse;
    private final as hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final boolean f14383sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f14384ta;
    private String ojm = "landingpage";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Map<Integer, Long> f14382hn = new HashMap();
    private final List<Integer> qor = new ArrayList();
    private final Map<Integer, String> gjv = new HashMap();

    public ojm(as asVar, WebView webView, boolean z10) {
        this.hnj = asVar;
        this.aq = webView;
        this.f14383sk = z10;
    }

    public void hn(String str) {
        String str2 = this.gjv.get(Integer.valueOf(this.dkl));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.dkl;
        if (i10 > 0) {
            qor.hnj(this.hnj, this.ojm, i10, str3, str, 1);
        }
    }

    public void hnj(String str, int i10) {
        if (this.f14383sk) {
            i10++;
        }
        if (hnj(true)) {
            qor.hnj(this.hnj, this.ojm, this.dkl, str, i10);
            this.gjv.put(Integer.valueOf(this.dkl), str);
            this.f14384ta = SystemClock.elapsedRealtime();
        }
    }

    public void qor(String str) {
        this.ojm = str;
    }

    private void hn(boolean z10) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.aq.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z10) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.dkl = currentIndex + 1;
                    if (this.f14383sk) {
                        this.dkl = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.dse = currentIndex2 + 1;
                if (this.f14383sk) {
                    this.dse = currentIndex2 + 2;
                }
            }
        } catch (Throwable th2) {
            apu.qor("ArbitrageLandingLog", th2.toString());
        }
    }

    public void hnj(String str) {
        if (hnj(false)) {
            qor.hnj(this.hnj, this.ojm, this.dkl, str, SystemClock.elapsedRealtime() - this.f14384ta);
        }
    }

    public void hnj(WebView webView, String str) {
        as asVar = this.hnj;
        if (asVar == null || !com.bytedance.sdk.component.ojm.hn.hnj(asVar.tu().qor(), str)) {
            return;
        }
        String str2 = this.gjv.get(Integer.valueOf(this.dkl));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        qor.hnj(this.hnj, this.ojm, this.dkl, str2, str, 2);
    }

    private boolean hnj(boolean z10) {
        int i10 = z10 ? this.dkl : this.dse;
        hn(z10);
        int i11 = z10 ? this.dkl : this.dse;
        return i11 > 0 && i11 != i10;
    }
}
