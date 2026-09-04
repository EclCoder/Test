package com.bytedance.sdk.openadsdk.apu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.hn.hnj.aq;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.gjv;
import com.bytedance.sdk.component.hn.hnj.hnj.hnj.sk;
import com.bytedance.sdk.component.hn.hnj.hnj.hnj.ta;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.openadsdk.apu.hnj.qor;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static volatile hn hnj;
    private final Map<String, JSONObject> gjv = new HashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.component.dse.hnj f13240hn;
    private qor qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class hnj implements aq {
        public hnj() {
        }

        @Override // com.bytedance.sdk.component.hn.hnj.aq
        public mjg hnj(aq.hnj hnjVar) {
            JSONObject jSONObjectHnj;
            bug bugVarHnj = hnjVar.hnj();
            if (bugVarHnj.gjv() != null && !bugVarHnj.gjv().gjv().isEmpty()) {
                List<String> listGjv = bugVarHnj.gjv().gjv();
                StringBuilder sb2 = new StringBuilder();
                for (String str : listGjv) {
                    sb2.append("/");
                    sb2.append(str);
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string)) {
                    if (string.equals("/monitor/collect/c/session")) {
                        return hnjVar.hnj(bugVarHnj);
                    }
                    if (string.equals("/api/ad/union/sdk/register_status/") || string.equals("/api/ad/union/sdk/compliance_status/")) {
                        return hnjVar.hnj(bugVarHnj);
                    }
                }
            }
            bug.hnj hnjVarDnm = bugVarHnj.dnm();
            String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strHn) && (jSONObjectHnj = hn.this.hnj(strHn)) != null) {
                hnjVarDnm.hn("transfer-param", jSONObjectHnj.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectHnj.optInt("cypher") == 4) {
                    hnjVarDnm.hn("cypher", "4");
                } else {
                    hnjVarDnm.hn("cypher", "3");
                }
            }
            try {
                hnjVarDnm.hn("x-pangle-target-idc", dnm.hn().mw());
            } catch (Throwable unused) {
            }
            return hnjVar.hnj(hnjVarDnm.hn());
        }
    }

    private hn(Context context) {
        int iHnj = hnj();
        com.bytedance.sdk.component.dse.hnj.C0188hnj c0188hnj = new com.bytedance.sdk.component.dse.hnj.C0188hnj();
        long j10 = iHnj;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.dse.hnj hnjVarHnj = c0188hnj.hnj(j10, timeUnit).hn(j10, timeUnit).qor(j10, timeUnit).hnj(new hnj()).hnj(true).hnj();
        this.f13240hn = hnjVarHnj;
        com.bytedance.sdk.component.hn.hnj.hnj.hnj.hnj.hnj(new ta() { // from class: com.bytedance.sdk.openadsdk.apu.hn.1
            @Override // com.bytedance.sdk.component.hn.hnj.hnj.hnj.ta
            public boolean hn() {
                return dnm.hn().krm();
            }

            @Override // com.bytedance.sdk.component.hn.hnj.hnj.hnj.ta
            public ExecutorService hnj() {
                if (dnm.hn().krm()) {
                    return ua.dnm();
                }
                return null;
            }
        });
        com.bytedance.sdk.component.dse.hnj.hnj(new sk() { // from class: com.bytedance.sdk.openadsdk.apu.hn.2
            @Override // com.bytedance.sdk.component.hn.hnj.hnj.hnj.sk
            public boolean hnj() {
                return com.bytedance.sdk.openadsdk.as.sk.hnj("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.dse.hnj.hnj(new com.bytedance.sdk.component.dse.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.apu.hn.3
            @Override // com.bytedance.sdk.component.dse.hnj.hn
            public boolean hnj() {
                return com.bytedance.sdk.openadsdk.utils.hn.hnj();
            }
        });
        gjv gjvVarHnj = hnjVarHnj.dse().hnj();
        if (gjvVarHnj != null) {
            gjvVarHnj.hnj(32);
        }
    }

    public static hn hn() {
        if (hnj == null) {
            synchronized (hn.class) {
                try {
                    if (hnj == null) {
                        hnj = new hn(oj.hnj());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private void sk() {
        if (this.qor == null) {
            this.qor = new qor();
        }
    }

    public qor gjv() {
        sk();
        return this.qor;
    }

    public com.bytedance.sdk.component.dse.hnj qor() {
        return this.f13240hn;
    }

    public int hnj() {
        try {
            return com.bytedance.sdk.openadsdk.as.sk.hnj("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hnj(String str) {
        JSONObject jSONObject = this.gjv.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new tu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.gjv.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public void hnj(String str, int i10, int i11, ImageView imageView, as asVar) {
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(str).hnj(i10).hn(i11).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(asVar, str, imageView));
    }

    public void hnj(int i10, final ImageView imageView, final as asVar) {
        if (asVar == null || !TextUtils.isEmpty(asVar.eum())) {
            com.bytedance.sdk.openadsdk.ta.gjv.hnj(asVar.eum()).hnj(i10).hn(i10).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(asVar, asVar.eum(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apu.hn.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strWu = asVar.wu();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strWu));
                            try {
                                com.bytedance.sdk.component.utils.hn.hnj(oj.hnj(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.oj ojVar, ImageView imageView, as asVar) {
        if (ojVar == null || TextUtils.isEmpty(ojVar.hnj()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVar).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(asVar, ojVar.hnj(), imageView));
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.oj ojVar, ImageView imageView, as asVar, jip jipVar) {
        if (ojVar == null || TextUtils.isEmpty(ojVar.hnj()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVar).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(asVar, ojVar.hnj(), imageView, jipVar));
    }

    public void hnj(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(str).qor(2).hnj(new com.bytedance.sdk.component.sk.aq() { // from class: com.bytedance.sdk.openadsdk.apu.hn.6
            @Override // com.bytedance.sdk.component.sk.aq
            public Bitmap hnj(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(view2.getContext(), bitmap, 10);
            }
        }).hnj(new jip() { // from class: com.bytedance.sdk.openadsdk.apu.hn.5
            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                final View view2;
                if (dnmVar == null) {
                    return;
                }
                final Object objHn = dnmVar.hn();
                if (!(objHn instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!ua.dkl()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apu.hn.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objHn));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objHn));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objHn));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objHn));
                }
            }
        });
    }
}
