package com.bytedance.sdk.component.adexpress.sk;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.hnj.apu;
import com.bytedance.sdk.component.ojm.dkl;
import com.bytedance.sdk.component.utils.vf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static int aq = 10;
    private static int dkl = 10;
    private static volatile sk ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static final byte[] f12735sk = new byte[0];
    private final AtomicBoolean dse = new AtomicBoolean(false);
    private List<dkl> hnj = new ArrayList();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<dkl> f12736hn = new ArrayList();
    private Map<Integer, qor> qor = new HashMap();
    private Map<Integer, gjv> gjv = new HashMap();

    private sk() {
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        if (qorVarQor != null) {
            dkl = qorVarQor.ta();
            aq = qorVarQor.dnm();
        }
    }

    private void dkl(dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        if (vf.hn(dklVar.getScene())) {
            vf.hnj(dklVar);
            return;
        }
        if (this.hnj.size() >= dkl) {
            try {
                Context context = dklVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                dklVar.jip();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.hnj.contains(dklVar)) {
            return;
        }
        try {
            Context context2 = dklVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                dklVar.setRecycler(true);
                this.hnj.add(dklVar);
                qor();
            }
        } catch (Throwable th3) {
            qor();
            th3.getMessage();
        }
    }

    public static sk hnj() {
        if (ojm == null) {
            synchronized (sk.class) {
                try {
                    if (ojm == null) {
                        ojm = new sk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ojm;
    }

    public boolean gjv(dkl dklVar) {
        if (dklVar == null) {
            return false;
        }
        try {
            Context context = dklVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            dklVar.jip();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void hn(dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        vf.hn(dklVar);
        dklVar.b_("SDK_INJECT_GLOBAL");
        sk(dklVar);
        hnj(dklVar);
    }

    public void qor(dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        vf.hn(dklVar);
        dklVar.b_("SDK_INJECT_GLOBAL");
        sk(dklVar);
        dkl(dklVar);
    }

    public void sk(dkl dklVar) {
        WebView webView;
        if (dklVar == null || (webView = dklVar.getWebView()) == null) {
            return;
        }
        qor qorVar = this.qor.get(Integer.valueOf(webView.hashCode()));
        if (qorVar != null) {
            qorVar.hnj(null);
        }
        dklVar.b_("SDK_INJECT_GLOBAL");
    }

    public dkl hn(Context context, String str) {
        dkl.qor qorVar = dkl.qor.ADS;
        if (vf.hn(qorVar)) {
            if (!com.bytedance.sdk.component.adexpress.gjv.sk.hnj(str) || vf.hnj(qorVar) > 1) {
                return vf.hnj(context, null, 0, qorVar);
            }
            return null;
        }
        if (qor() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.gjv.sk.hnj(str) && qor() <= 1) {
            qor();
            return null;
        }
        dkl dklVarRemove = this.hnj.remove(0);
        if (dklVarRemove == null) {
            return null;
        }
        try {
            Context context2 = dklVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                dklVarRemove.setRecycler(false);
                qor();
            }
            return dklVarRemove;
        } catch (Throwable unused) {
            qor();
            return null;
        }
    }

    public int qor() {
        return this.hnj.size();
    }

    public int gjv() {
        return this.f12736hn.size();
    }

    public dkl hnj(Context context, String str) {
        dkl.qor qorVar = dkl.qor.ADS_V3;
        if (vf.hn(qorVar)) {
            if (!com.bytedance.sdk.component.adexpress.gjv.sk.hnj(str) || vf.hnj(qorVar) > 1) {
                return vf.hnj(context, null, 0, qorVar);
            }
            return null;
        }
        if (gjv() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.gjv.sk.hnj(str) && gjv() <= 1) {
            gjv();
            return null;
        }
        dkl dklVarRemove = this.f12736hn.remove(0);
        if (dklVarRemove == null) {
            return null;
        }
        try {
            Context context2 = dklVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                dklVarRemove.setRecycler(false);
                gjv();
            }
            return dklVarRemove;
        } catch (Throwable unused) {
            gjv();
            return null;
        }
    }

    public void hn() {
        for (dkl dklVar : this.hnj) {
            if (dklVar != null) {
                try {
                    Context context = dklVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    dklVar.jip();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.hnj.clear();
        for (dkl dklVar2 : this.f12736hn) {
            if (dklVar2 != null) {
                try {
                    Context context2 = dklVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    dklVar2.jip();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.f12736hn.clear();
    }

    public void hnj(dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        if (vf.hn(dklVar.getScene())) {
            vf.hnj(dklVar);
            return;
        }
        if (this.f12736hn.size() >= aq) {
            try {
                Context context = dklVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                dklVar.jip();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.f12736hn.contains(dklVar)) {
            return;
        }
        try {
            Context context2 = dklVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                dklVar.setRecycler(true);
                this.f12736hn.add(dklVar);
                gjv();
            }
        } catch (Throwable th3) {
            gjv();
            th3.getMessage();
        }
    }

    public void hn(int i10) {
        synchronized (f12735sk) {
            aq = i10;
        }
    }

    public void hnj(dkl dklVar, hn hnVar) {
        WebView webView;
        if (dklVar == null || hnVar == null || (webView = dklVar.getWebView()) == null) {
            return;
        }
        qor qorVar = this.qor.get(Integer.valueOf(webView.hashCode()));
        if (qorVar != null) {
            qorVar.hnj(hnVar);
        } else {
            qorVar = new qor(hnVar);
            this.qor.put(Integer.valueOf(webView.hashCode()), qorVar);
        }
        dklVar.hnj(qorVar, "SDK_INJECT_GLOBAL");
    }

    public void hnj(WebView webView, apu apuVar, String str) {
        if (webView == null || apuVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        gjv gjvVar = this.gjv.get(Integer.valueOf(webView.hashCode()));
        if (gjvVar != null) {
            gjvVar.hnj(apuVar);
        } else {
            gjvVar = new gjv(apuVar);
            this.gjv.put(Integer.valueOf(webView.hashCode()), gjvVar);
        }
        webView.addJavascriptInterface(gjvVar, str);
    }

    public void hnj(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        gjv gjvVar = this.gjv.get(Integer.valueOf(webView.hashCode()));
        if (gjvVar != null) {
            gjvVar.hnj(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void hnj(int i10) {
        synchronized (f12735sk) {
            dkl = i10;
        }
    }
}
