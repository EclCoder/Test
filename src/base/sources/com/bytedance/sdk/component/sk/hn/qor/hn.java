package com.bytedance.sdk.component.sk.hn.qor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.sk.fc;
import com.bytedance.sdk.component.sk.oj;
import com.bytedance.sdk.component.sk.orl;
import com.bytedance.sdk.component.sk.ta;
import com.bytedance.sdk.component.utils.jip;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements fc {
    private volatile dkl hnj;

    private hn() {
    }

    private void hn(Context context, orl orlVar) {
        if (this.hnj != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (orlVar == null) {
            orlVar = sk.hnj(context);
        }
        this.hnj = new dkl(context, orlVar);
    }

    public static fc hnj(Context context, orl orlVar) {
        hn hnVar = new hn();
        hnVar.hn(context, orlVar);
        return hnVar;
    }

    @Override // com.bytedance.sdk.component.sk.fc
    public ta hnj(String str) {
        return new qor.hn(this.hnj).qor(str);
    }

    @Override // com.bytedance.sdk.component.sk.fc
    public InputStream hnj(String str, String str2) {
        byte[] bArrHnj;
        if (this.hnj != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = jip.hnj(str);
            }
            oj ojVarQor = this.hnj.qor();
            if (ojVarQor != null && (bArrHnj = ojVarQor.hnj(str2)) != null) {
                return new ByteArrayInputStream(bArrHnj);
            }
            Collection<com.bytedance.sdk.component.sk.qor> collectionGjv = this.hnj.gjv();
            if (collectionGjv != null) {
                Iterator<com.bytedance.sdk.component.sk.qor> it = collectionGjv.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamHnj = it.next().hnj(str2);
                    if (inputStreamHnj != null) {
                        return inputStreamHnj;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.sk.fc
    public boolean hnj(String str, String str2, String str3) {
        if (this.hnj == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = jip.hnj(str);
        }
        com.bytedance.sdk.component.sk.qor qorVarHnj = this.hnj.hnj(str3);
        if (qorVarHnj != null) {
            return qorVarHnj.hn(str2);
        }
        return false;
    }
}
