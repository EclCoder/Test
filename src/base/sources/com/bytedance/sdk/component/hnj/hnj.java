package com.bytedance.sdk.component.hnj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj {
    dkl dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected dnm f12896hn;
    protected Context hnj;
    protected dse qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected String f12897sk;
    protected Handler gjv = new Handler(Looper.getMainLooper());
    protected volatile boolean dkl = false;
    private final Map<String, dkl> aq = new HashMap();

    protected hnj() {
    }

    protected void hn() {
        this.dse.hnj();
        Iterator<dkl> it = this.aq.values().iterator();
        while (it.hasNext()) {
            it.next().hnj();
        }
        this.gjv.removeCallbacksAndMessages(null);
        this.dkl = true;
    }

    protected abstract void hn(ojm ojmVar);

    protected abstract Context hnj(ojm ojmVar);

    protected abstract String hnj();

    protected abstract void hnj(String str);

    protected void invokeMethod(final String str) {
        if (this.dkl) {
            return;
        }
        this.gjv.post(new Runnable() { // from class: com.bytedance.sdk.component.hnj.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                mjg mjgVarHnj;
                if (hnj.this.dkl) {
                    return;
                }
                try {
                    mjgVarHnj = hnj.this.hnj(new JSONObject(str));
                } catch (Exception unused) {
                    mjgVarHnj = null;
                }
                if (!mjg.hnj(mjgVarHnj)) {
                    hnj.this.hnj(mjgVarHnj);
                    return;
                }
                Objects.toString(mjgVarHnj);
                if (mjgVarHnj != null) {
                    hnj.this.hn(xn.hnj(new jip(mjgVarHnj.hnj, "Failed to parse invocation.")), mjgVarHnj);
                }
            }
        });
    }

    final void qor(ojm ojmVar) {
        this.hnj = hnj(ojmVar);
        this.qor = ojmVar.gjv;
        this.f12896hn = ojmVar.aq;
        this.dse = new dkl(ojmVar, this);
        this.f12897sk = ojmVar.f12905ta;
        hn(ojmVar);
    }

    protected void hnj(String str, mjg mjgVar) {
        hnj(str);
    }

    protected final void hnj(mjg mjgVar) {
        String strHnj;
        if (this.dkl || (strHnj = hnj()) == null) {
            return;
        }
        dkl dklVarHn = hn(mjgVar.dse);
        if (dklVarHn == null) {
            mjgVar.toString();
            if (this.f12896hn != null) {
                hnj();
            }
            hn(xn.hnj(new jip(-4, "Namespace " + mjgVar.dse + " unknown.")), mjgVar);
            return;
        }
        sk skVar = new sk();
        skVar.f12907hn = strHnj;
        skVar.hnj = this.hnj;
        skVar.qor = dklVarHn;
        try {
            dkl.hnj hnjVarHnj = dklVarHn.hnj(mjgVar, skVar);
            if (hnjVarHnj == null) {
                mjgVar.toString();
                if (this.f12896hn != null) {
                    hnj();
                }
                hn(xn.hnj(new jip(-2, "Function " + mjgVar.gjv + " is not registered.")), mjgVar);
                return;
            }
            if (hnjVarHnj.hnj) {
                hn(hnjVarHnj.f12892hn, mjgVar);
            }
            if (this.f12896hn != null) {
                hnj();
            }
        } catch (Exception e10) {
            mjgVar.toString();
            hn(xn.hnj(e10), mjgVar);
        }
    }

    final void hn(String str, mjg mjgVar) {
        JSONObject jSONObject;
        if (this.dkl || TextUtils.isEmpty(mjgVar.dkl)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            aq.hnj(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        hnj(orl.hnj().hnj("__msg_type", "callback").hnj("__callback_id", mjgVar.dkl).hnj("__params", jSONObject).hn(), mjgVar);
    }

    private dkl hn(String str) {
        if (!TextUtils.equals(str, this.f12897sk) && !TextUtils.isEmpty(str)) {
            return this.aq.get(str);
        }
        return this.dse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mjg hnj(JSONObject jSONObject) {
        String strOptString;
        if (this.dkl) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (hnj() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return mjg.hnj().hnj(string2).hn(string).qor(strOptString3).gjv(strOptString).sk(strOptString2).dkl(strOptString4).dse(jSONObject.optString("__iframe_url")).hnj();
        } catch (JSONException unused2) {
            return mjg.hnj(strOptString2, -1);
        }
    }
}
