package com.bytedance.sdk.component.dse.hn;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dkl;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.dse;
import com.bytedance.sdk.component.hn.hnj.fc;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor {
    private Map<String, String> bug;
    private boolean dnm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.component.hn.hnj.hnj f12829ta;
    public static final com.bytedance.sdk.component.hn.hnj.hnj hnj = new com.bytedance.sdk.component.hn.hnj.hnj.C0192hnj().hnj().hn();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final com.bytedance.sdk.component.hn.hnj.hnj f12828hn = new com.bytedance.sdk.component.hn.hnj.hnj.C0192hnj().hn();

    public hn(dnm dnmVar) {
        super(dnmVar);
        this.f12829ta = hnj;
        this.dnm = false;
        this.bug = new HashMap();
    }

    public void hnj(boolean z10) {
        this.dnm = z10;
    }

    public void hnj(final com.bytedance.sdk.component.dse.hnj.hnj hnjVar) {
        try {
            bug.hnj hnjVar2 = new bug.hnj();
            if (this.dnm) {
                hnjVar2.hn(this.aq);
            } else {
                dse.hnj hnjVar3 = new dse.hnj();
                Uri uri = Uri.parse(this.aq);
                hnjVar3.hnj(uri.getScheme());
                hnjVar3.hn(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    hnjVar3.qor(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.bug.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.bug.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        hnjVar3.hnj(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                hnjVar2.hnj(hnjVar3.hn());
            }
            hn(hnjVar2);
            hnj(hnjVar2);
            hnjVar2.hnj(this.f12829ta);
            hnjVar2.hnj((Object) gjv());
            if (!TextUtils.isEmpty(this.f12835sk)) {
                hnjVar2.hnj(this.f12835sk);
            }
            int i10 = this.dkl;
            if (i10 > 0) {
                hnjVar2.hnj(i10);
            }
            this.qor.hnj(hnjVar2.hnj().hn()).hnj(new com.bytedance.sdk.component.hn.hnj.qor() { // from class: com.bytedance.sdk.component.dse.hn.hn.1
                @Override // com.bytedance.sdk.component.hn.hnj.qor
                public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, IOException iOException) {
                    com.bytedance.sdk.component.dse.hnj.hnj hnjVar4 = hnjVar;
                    if (hnjVar4 != null) {
                        hnjVar4.hnj(hn.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.hn.hnj.qor
                public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, mjg mjgVar) {
                    String strHn;
                    if (hnjVar != null) {
                        HashMap map = new HashMap();
                        if (mjgVar != null) {
                            hn.this.hnj(mjgVar.ojm());
                            dkl dklVarDse = mjgVar.dse();
                            if (dklVarDse != null) {
                                for (int i11 = 0; i11 < dklVarDse.hnj(); i11++) {
                                    map.put(dklVarDse.hnj(i11), dklVarDse.hn(i11));
                                }
                            }
                            fc fcVarDkl = mjgVar.dkl();
                            if (fcVarDkl == null) {
                                strHn = "";
                            } else {
                                strHn = fcVarDkl.hn();
                            }
                            hnjVar.hnj(hn.this, new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), map, strHn, mjgVar.hn(), mjgVar.hnj()));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (hnjVar != null) {
                hnjVar.hnj(this, new IOException(th2.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.dse.hn hnj() {
        try {
            bug.hnj hnjVar = new bug.hnj();
            if (this.dnm) {
                hnjVar.hn(this.aq);
            } else {
                dse.hnj hnjVar2 = new dse.hnj();
                Uri uri = Uri.parse(this.aq);
                hnjVar2.hnj(uri.getScheme());
                hnjVar2.hn(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    hnjVar2.qor(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.bug.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.bug.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        hnjVar2.hnj(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                hnjVar.hnj(hnjVar2.hn());
            }
            hn(hnjVar);
            hnj(hnjVar);
            hnjVar.hnj(this.f12829ta);
            hnjVar.hnj((Object) gjv());
            mjg mjgVarHn = this.qor.hnj(hnjVar.hnj().hn()).hn();
            if (mjgVarHn == null) {
                return null;
            }
            hnj(mjgVarHn.ojm());
            HashMap map = new HashMap();
            dkl dklVarDse = mjgVarHn.dse();
            if (dklVarDse != null) {
                for (int i10 = 0; i10 < dklVarDse.hnj(); i10++) {
                    map.put(dklVarDse.hnj(i10), dklVarDse.hn(i10));
                }
            }
            fc fcVarDkl = mjgVarHn.dkl();
            return new com.bytedance.sdk.component.dse.hn(mjgVarHn.gjv(), mjgVarHn.qor(), mjgVarHn.sk(), map, fcVarDkl != null ? fcVarDkl.hn() : "", mjgVarHn.hn(), mjgVarHn.hnj());
        } catch (Throwable unused) {
            return null;
        }
    }
}
