package com.bytedance.sdk.openadsdk.core.orl.hnj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.orl.hn.qor;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn {
    public hnj dkl;
    protected double gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final Context f14124hn;
    public int hnj;
    protected int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public int f14125sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f14126hn;
        public int hnj;
        public boolean qor;
    }

    public hn(Context context, int i10, int i11) {
        this.qor = 0;
        this.gjv = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.gjv = ((double) i10) / ((double) i11);
        }
        float fAq = sq.aq(context);
        if (fAq != 0.0f && i10 > 0) {
            this.qor = (int) (i10 / fAq);
        }
        this.f14124hn = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.orl.hnj hnj(String str, File file, List<qor> list);

    protected void hnj(Exception exc, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            gjv.hnj().hnj("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String hnj(String str, List<qor> list) {
        int i10 = this.hnj;
        String strGjv = null;
        if (i10 >= 5) {
            return null;
        }
        this.hnj = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
            hnVarQor.qor(str);
            com.bytedance.sdk.component.dse.hn hnVarHnj = hnVarQor.hnj();
            strGjv = hnVarHnj.gjv();
            hnVarHnj.hnj();
            return strGjv;
        } catch (Exception e10) {
            hnj(e10, 0);
            if (!list.isEmpty()) {
                qor.hn((as) null, list, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strGjv;
        }
    }
}
