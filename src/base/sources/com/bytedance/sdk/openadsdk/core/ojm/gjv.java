package com.bytedance.sdk.openadsdk.core.ojm;

import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static int f14060hn;
    private static volatile gjv qor;
    private final List<sk> hnj = new ArrayList();

    public static gjv hnj() {
        if (qor == null) {
            synchronized (gjv.class) {
                try {
                    if (qor == null) {
                        qor = new gjv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qor;
    }

    public sk hn() {
        sk skVarRemove;
        if (qor() > 0 && (skVarRemove = this.hnj.remove(0)) != null) {
            return skVarRemove;
        }
        return null;
    }

    public int qor() {
        return this.hnj.size();
    }

    public void qor(sk skVar) {
        if (skVar == null || skVar.getWebView() == null) {
            return;
        }
        if (skVar.getParent() != null) {
            ((ViewGroup) skVar.getParent()).removeView(skVar);
        }
        try {
            skVar.removeAllViews();
            skVar.dse();
            skVar.setWebChromeClient(null);
            skVar.setWebViewClient(null);
            skVar.setDownloadListener(null);
            skVar.setDefaultTextEncodingName(C.UTF8_NAME);
            skVar.setAllowFileAccess(false);
            skVar.setJavaScriptEnabled(true);
            skVar.setCacheMode(-1);
            skVar.setDatabaseEnabled(true);
            skVar.setSupportZoom(false);
            skVar.getWebView().setLayerType(0, null);
            skVar.setBackgroundColor(0);
            skVar.getWebView().setHorizontalScrollBarEnabled(false);
            skVar.getWebView().setHorizontalScrollbarOverlay(false);
            skVar.getWebView().setVerticalScrollBarEnabled(false);
            skVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(skVar);
            skVar.mjg();
            skVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void hn(sk skVar) {
        if (skVar != null) {
            if (this.hnj.size() >= f14060hn) {
                skVar.jip();
            } else {
                if (this.hnj.contains(skVar)) {
                    return;
                }
                qor(skVar);
                this.hnj.add(skVar);
            }
        }
    }

    public void hnj(sk skVar) {
        if (skVar != null) {
            hn(skVar);
        }
    }
}
