package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.nyv;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, com.bytedance.sdk.openadsdk.core.gjv.dse.hnj> gjv = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Intent f13054hn;
    as hnj = null;
    private nyv qor;

    private void gjv() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void sk() {
        int intExtra = this.f13054hn.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (this.hnj == null) {
                this.hnj = hqh.hnj().hnj(hqh.hnj(this.f13054hn));
            }
            as asVar = this.hnj;
            if (asVar == null) {
                finish();
            } else {
                hnj(asVar.ldn(), com.bytedance.sdk.openadsdk.tool.hnj.hnj(this.hnj.yl()), this.f13054hn.getStringExtra("closed_listener_key"), this.hnj);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fc.sk()) {
            finish();
            return;
        }
        gjv();
        this.f13054hn = getIntent();
        if (oj.hnj() == null) {
            oj.hn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        nyv nyvVar = this.qor;
        if (nyvVar != null) {
            nyvVar.hn();
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (oj.hnj() == null) {
            oj.hn(this);
        }
        setIntent(intent);
        this.f13054hn = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        nyv nyvVar = this.qor;
        if ((nyvVar == null || ((com.bytedance.sdk.openadsdk.qor.qor) nyvVar).hnj == null || !((com.bytedance.sdk.openadsdk.qor.qor) nyvVar).hnj.isShowing()) && this.f13054hn != null) {
            sk();
        }
    }

    public static void hnj(as asVar, String str, com.bytedance.sdk.openadsdk.core.gjv.dse.hnj hnjVar) {
        if (asVar == null) {
            return;
        }
        Intent intent = new Intent(oj.hnj(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", hqh.hnj().hnj(asVar));
        if (hnjVar != null) {
            gjv.put(str, hnjVar);
        }
        com.bytedance.sdk.component.utils.hn.hnj(oj.hnj(), intent, null);
    }

    public static void hnj(as asVar, String str) {
        hnj(asVar, str, null);
    }

    private void hnj(String str, String str2, final String str3, as asVar) {
        if (str2 != null && str != null && this.qor == null) {
            com.bytedance.sdk.openadsdk.qor.qor qorVar = new com.bytedance.sdk.openadsdk.qor.qor(this, str, com.bytedance.sdk.openadsdk.tool.hnj.hnj(str2), asVar);
            this.qor = qorVar;
            qorVar.hnj(new nyv.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.nyv.hnj
                public void hnj(int i10, String str4) {
                    com.bytedance.sdk.openadsdk.core.gjv.dse.hnj hnjVarSk;
                    if (TTDelegateActivity.gjv != null && TTDelegateActivity.gjv.size() > 0 && !TextUtils.isEmpty(str3)) {
                        com.bytedance.sdk.openadsdk.core.gjv.dse.hnj hnjVar = (com.bytedance.sdk.openadsdk.core.gjv.dse.hnj) TTDelegateActivity.gjv.get(str3);
                        if (hnjVar != null) {
                            hnjVar.hnj();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (hnjVarSk = ta.hn().sk(str3)) != null) {
                        hnjVarSk.hnj();
                        ta.hn().dkl(str3);
                    }
                    TTDelegateActivity.this.hnj(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.nyv.hnj
                public void hnj() {
                    if (!((com.bytedance.sdk.openadsdk.qor.qor) TTDelegateActivity.this.qor).qor()) {
                        TTDelegateActivity.this.hnj(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.qor.qor) TTDelegateActivity.this.qor).hnj(false);
                }
            });
        }
        nyv nyvVar = this.qor;
        if (nyvVar != null) {
            nyvVar.hnj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str) {
        Map<String, com.bytedance.sdk.openadsdk.core.gjv.dse.hnj> map = gjv;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.fc.qor()) {
            map.size();
        }
    }
}
