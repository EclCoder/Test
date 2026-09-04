package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu {
    private static int hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final LinkedHashMap<String, SoftReference<hnj>> f14628hn = new LinkedHashMap<String, SoftReference<hnj>>(hnj, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.apu.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<hnj>> entry) {
            hnj hnjVar;
            com.bytedance.sdk.component.ojm.dkl dklVar;
            if (size() <= apu.hnj) {
                return false;
            }
            SoftReference<hnj> value = entry.getValue();
            if (value == null || (hnjVar = value.get()) == null || (dklVar = hnjVar.hnj) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.vf.hnj(dklVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        Bundle f14629hn;
        com.bytedance.sdk.component.ojm.dkl hnj;

        hnj(com.bytedance.sdk.component.ojm.dkl dklVar, Bundle bundle) {
            this.hnj = dklVar;
            this.f14629hn = bundle;
        }
    }

    private static void hn() {
        hnj hnjVar;
        com.bytedance.sdk.component.ojm.dkl dklVar;
        synchronized (f14628hn) {
            while (true) {
                LinkedHashMap<String, SoftReference<hnj>> linkedHashMap = f14628hn;
                if (linkedHashMap.size() > hnj) {
                    SoftReference<hnj> softReferenceRemove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (softReferenceRemove != null && (hnjVar = softReferenceRemove.get()) != null && (dklVar = hnjVar.hnj) != null) {
                        com.bytedance.sdk.component.utils.vf.hnj(dklVar);
                    }
                }
            }
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            hnj = 0;
        } else {
            hnj = Math.max(0, asVar.dse());
        }
        hn();
    }

    public static void hnj(String str, com.bytedance.sdk.component.ojm.dkl dklVar, Bundle bundle) {
        if (hnj <= 0 || TextUtils.isEmpty(str) || dklVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<hnj>> linkedHashMap = f14628hn;
        synchronized (linkedHashMap) {
            try {
                hnj(dklVar.getWebView());
                hnj(dklVar, dklVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new hnj(dklVar, bundle)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.ojm.dkl hnj(Context context, String str) {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        if (hnj <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<hnj>> linkedHashMap = f14628hn;
        synchronized (linkedHashMap) {
            try {
                SoftReference<hnj> softReferenceRemove = linkedHashMap.remove(str);
                if (softReferenceRemove == null) {
                    return null;
                }
                hnj hnjVar = softReferenceRemove.get();
                if (hnjVar != null && (dklVar = hnjVar.hnj) != null) {
                    hnj(dklVar, context);
                    return hnjVar.hnj;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Bundle hnj(String str) {
        if (hnj <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<hnj>> linkedHashMap = f14628hn;
        synchronized (linkedHashMap) {
            try {
                SoftReference<hnj> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                hnj hnjVar = softReference.get();
                return hnjVar != null ? hnjVar.f14629hn : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void hnj(com.bytedance.sdk.component.ojm.dkl dklVar, Context context) {
        try {
            if (dklVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) dklVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) dklVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(dklVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void hnj(WebView webView) {
        if (webView != null && hnj > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
