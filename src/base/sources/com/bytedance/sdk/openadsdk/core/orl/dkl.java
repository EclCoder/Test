package com.bytedance.sdk.openadsdk.core.orl;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import q6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private dse f14092hn;
    final Set<Pair<View, FriendlyObstructionPurpose>> hnj = new HashSet();

    private dkl() {
        sk.hnj(oj.hnj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        dse dseVar = this.f14092hn;
        if (dseVar != null) {
            try {
                dseVar.qor();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl() {
        if (this.f14092hn != null) {
            try {
                hnj((View) null, (FriendlyObstructionPurpose) null);
                this.f14092hn.hn();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dse() {
        dse dseVar = this.f14092hn;
        if (dseVar != null) {
            try {
                dseVar.gjv();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler sk() {
        return com.bytedance.sdk.component.utils.ojm.hn();
    }

    public void gjv() {
        if (a.a()) {
            aq();
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.7
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.aq();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(WebView webView) {
        try {
            if (this.f14092hn == null) {
                this.f14092hn = aq.hnj(webView);
            }
        } catch (Throwable th2) {
            apu.qor("createWebViewSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            sk.hnj(map);
        }
    }

    public void qor() {
        if (a.a()) {
            dse();
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.6
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.dse();
                }
            });
        }
    }

    public static dkl hnj() {
        return new dkl();
    }

    public void hn() {
        if (a.a()) {
            dkl();
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.4
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.dkl();
                }
            });
        }
    }

    public void hnj(final WebView webView) {
        if (webView == null || this.f14092hn != null) {
            return;
        }
        if (a.a()) {
            hn(webView);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.1
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(boolean z10, float f10) {
        if (this.f14092hn != null) {
            try {
                hnj((View) null, (FriendlyObstructionPurpose) null);
                this.f14092hn.hnj(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void hnj(final View view, final as asVar) {
        if (this.f14092hn != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = asVar.fvx();
        final Set<ta> setHn = gjvVarFvx != null ? gjvVarFvx.hn() : null;
        if (view == null || setHn == null) {
            return;
        }
        if (a.a()) {
            hnj(view, setHn, asVar);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.3
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hnj(view, (Set<ta>) setHn, asVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        dse dseVar = this.f14092hn;
        try {
            if (dseVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.hnj.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                dseVar.hnj(view, friendlyObstructionPurpose);
            }
            if (this.hnj.size() > 0) {
                dseVar.hnj(this.hnj);
                this.hnj.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(View view, Set<ta> set, as asVar) {
        try {
            if (this.f14092hn == null) {
                this.f14092hn = aq.hnj(view, set);
                if (asVar.qs()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, asVar.sk(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th2) {
            apu.qor("createVideoSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            sk.hnj(map);
        }
    }

    public void hn(long j10, boolean z10) {
        dse dseVar = this.f14092hn;
        if (dseVar != null) {
            try {
                dseVar.hnj(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(boolean z10) {
        dse dseVar = this.f14092hn;
        if (dseVar != null) {
            try {
                dseVar.hnj(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int i10) {
        dse dseVar = this.f14092hn;
        if (dseVar != null) {
            try {
                dseVar.hn(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public void hnj(final boolean z10, final float f10) {
        if (a.a()) {
            hn(z10, f10);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.5
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(z10, f10);
                }
            });
        }
    }

    public void hnj(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (a.a()) {
            hn(view, friendlyObstructionPurpose);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.8
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void hnj(final long j10, final boolean z10) {
        if (a.a()) {
            hn(j10, z10);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.9
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(j10, z10);
                }
            });
        }
    }

    public void hnj(final boolean z10) {
        if (a.a()) {
            hn(z10);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.10
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(z10);
                }
            });
        }
    }

    public void hnj(final int i10) {
        if (a.a()) {
            hn(i10);
        } else {
            sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.orl.dkl.2
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.hn(i10);
                }
            });
        }
    }
}
