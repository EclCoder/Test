package com.bytedance.sdk.openadsdk.eum.hnj.hnj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jip;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.dkl;
import com.bytedance.sdk.openadsdk.core.model.orl;
import com.bytedance.sdk.openadsdk.core.model.vf;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orp;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.sk;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected int f14341hn;
    protected String hnj;
    private final WeakReference<Context> qor;

    public hn(Context context, String str) {
        this.qor = new WeakReference<>(context);
        this.hnj = str;
        "====tag===".concat(String.valueOf(str));
        if (oj.hnj() == null) {
            oj.hn(context);
        }
    }

    private static boolean hn() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sk(as asVar) {
        if (hn(asVar)) {
            asVar.dkl(true);
            sk.hnj(asVar);
            return;
        }
        if (gjv(asVar)) {
            asVar.dkl(true);
            sk.hnj(asVar);
            return;
        }
        if (hnj(asVar, false)) {
            sk.hnj(asVar);
            return;
        }
        if (qor(asVar)) {
            asVar.dkl(true);
            sk.hnj(asVar);
        } else {
            if (asVar.zyh() != null || asVar.xe() == null) {
                return;
            }
            orp.hnj(hnj(), asVar.xe(), asVar, com.bytedance.sdk.openadsdk.utils.orp.hnj(this.hnj), this.hnj, true);
            asVar.dkl(true);
            sk.hnj(asVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor
    public boolean gjv(as asVar) {
        dkl dklVarZyh;
        if (asVar == null || (dklVarZyh = asVar.zyh()) == null || asVar.zg() == 0) {
            return false;
        }
        String strQor = dklVarZyh.qor();
        if (TextUtils.isEmpty(strQor)) {
            return false;
        }
        return hnj(asVar, strQor, hnj(), this.hnj, new HashMap());
    }

    @Override // com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor
    public boolean qor(as asVar) {
        dkl dklVarZyh;
        if (asVar == null || (dklVarZyh = asVar.zyh()) == null) {
            return false;
        }
        return hnj(hnj(), asVar, dklVarZyh.hnj(), dklVarZyh.qor());
    }

    public static boolean hnj(Context context, String str, String str2, String str3, as asVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str3, "store_open", (JSONObject) null);
                sk.hnj(asVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str3, "store_open", (JSONObject) null);
                        sk.hnj(asVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    public boolean hn(as asVar) {
        orl orlVarPdc = asVar.pdc();
        if (orlVarPdc == null) {
            return false;
        }
        HashMap map = new HashMap();
        hnj(asVar, map);
        if (hnj.hnj(hnj(), orlVarPdc.hnj(), asVar, com.bytedance.sdk.openadsdk.utils.orp.hn(asVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, this.hnj, "open_fallback_url", map);
        return false;
    }

    public static boolean hn(as asVar, Context context, boolean z10) {
        String strQor;
        IPBroadcastReceiver iPBroadcastReceiverHnj;
        if (asVar != null && context != null) {
            try {
                vf vfVarUi = asVar.ui();
                if (vfVarUi != null && !TextUtils.isEmpty(vfVarUi.ta())) {
                    if (vfVarUi.ojm() && hnj(asVar, context, z10)) {
                        return true;
                    }
                    if (vfVarUi.dse() || vfVarUi.aq()) {
                        if (asVar.oj() == 1) {
                            strQor = vfVarUi.hnj();
                        } else {
                            strQor = (asVar.zyh() == null || TextUtils.isEmpty(asVar.zyh().qor())) ? null : asVar.zyh().qor();
                        }
                        if (!TextUtils.isEmpty(strQor) && (iPBroadcastReceiverHnj = IPBroadcastReceiver.hnj(context, asVar)) != null) {
                            iPBroadcastReceiverHnj.hnj(strQor, asVar);
                        }
                    }
                    final boolean zHnj = hnj.hnj(context, vfVarUi.ta(), asVar, com.bytedance.sdk.openadsdk.utils.orp.hn(asVar), hnj(asVar, z10, vfVarUi), true);
                    ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zHnj) {
                                ta.hnj("oem_store", "1");
                            } else {
                                ta.hnj("oem_store", "-2");
                            }
                        }
                    });
                    return zHnj;
                }
            } catch (Throwable th2) {
                apu.qor("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    public static boolean hnj(as asVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentHnj;
        if (asVar != null && asVar.zg() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentHnj = com.bytedance.sdk.openadsdk.utils.orp.hnj(context, str)) == null) {
                return false;
            }
            intentHnj.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentHnj.addFlags(268435456);
            }
            context.startActivity(intentHnj);
            if (map == null) {
                map = new HashMap<>();
            }
            if (asVar != null && asVar.vz() == 0) {
                map.put("auto_click", Boolean.valueOf(!asVar.xn()));
            }
            map.put("can_query_install", Integer.valueOf(hn() ? 1 : 0));
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor
    public void hnj(int i10) {
        this.f14341hn = i10;
    }

    public boolean hnj(Context context, as asVar, String str, String str2) {
        return hnj(context, str, str2, this.hnj, asVar);
    }

    protected Context hnj() {
        WeakReference<Context> weakReference = this.qor;
        return (weakReference == null || weakReference.get() == null) ? oj.hnj() : this.qor.get();
    }

    @Override // com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor
    public void hnj(final as asVar) {
        if (hnj() == null || asVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.as.sk.hnj("gp_downloader_async", 0) == 1) {
            ua.ojm().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.1
                @Override // java.lang.Runnable
                public void run() {
                    hn.this.sk(asVar);
                }
            });
        } else {
            sk(asVar);
        }
    }

    private void hnj(as asVar, Map<String, Object> map) {
        if (asVar != null && asVar.vz() == 0) {
            map.put("auto_click", Boolean.valueOf(!asVar.xn()));
        }
        if (asVar != null && asVar.vz() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f14341hn >= 11));
        }
        map.put("can_query_install", Integer.valueOf(hn() ? 1 : 0));
    }

    public boolean hnj(as asVar, boolean z10) {
        return hn(asVar, hnj(), z10);
    }

    private static void hnj(final JSONObject jSONObject, as asVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.2
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hnj() {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static boolean hnj(as asVar, Context context, boolean z10) {
        if (asVar != null && asVar.ui() != null && asVar.ui().ojm() && !TextUtils.isEmpty(asVar.ui().ta()) && context != null) {
            try {
                vf vfVarUi = asVar.ui();
                String strHnj = com.bytedance.sdk.openadsdk.utils.orp.hnj(asVar);
                final JSONObject jSONObjectDnm = vfVarUi.dnm();
                jSONObjectDnm.put("from_web", z10 ? 1 : 0);
                jSONObjectDnm.put("is_w2a", asVar.oj());
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, strHnj, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.3
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        try {
                            jSONObjectDnm.put(NotificationCompat.CATEGORY_STATUS, 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectDnm;
                    }
                });
                Intent intentHnj = hnj(context, vfVarUi);
                if (intentHnj == null) {
                    hnj(jSONObjectDnm, asVar, strHnj, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!com.bytedance.sdk.openadsdk.utils.as.hnj((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityHn = jip.hnj().sk().hn();
                    if (activityHn != null && com.bytedance.sdk.openadsdk.utils.as.hnj(activityHn)) {
                        context = activityHn;
                    }
                }
                if (!(context instanceof Activity)) {
                    hnj(jSONObjectDnm, asVar, strHnj, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentHnj.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentHnj, 0);
                        hnj(jSONObjectDnm, asVar, strHnj, 1);
                        return true;
                    } catch (Throwable unused) {
                        hnj(jSONObjectDnm, asVar, strHnj, -3);
                        return false;
                    }
                }
                hnj(jSONObjectDnm, asVar, strHnj, -4);
                return false;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    private static Intent hnj(Context context, vf vfVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strGjv = vfVar.gjv();
            if (!TextUtils.isEmpty(strGjv)) {
                intent.setPackage(strGjv);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(vfVar.ta()));
            boolean z10 = true;
            if (vfVar.hn() != 1) {
                z10 = false;
            }
            intent.putExtra("overlay", z10);
            if (TextUtils.isEmpty(vfVar.qor())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", vfVar.qor());
            }
            vfVar.hnj(intent);
            return intent;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    private static Map<String, Object> hnj(as asVar, boolean z10, vf vfVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", vfVar.dkl());
            jSONObject.put("from_web", z10 ? 1 : 0);
            jSONObject.put("is_w2a", asVar.oj());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean hnj(String str, as asVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !"https".equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return hnj(queryParameter, asVar);
                    }
                }
                return true;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return false;
    }

    public static boolean hnj(as asVar, String str) {
        if (asVar == null || asVar.ui() == null) {
            return false;
        }
        String strSk = asVar.ui().sk();
        if (TextUtils.isEmpty(strSk)) {
            return false;
        }
        return Pattern.compile(strSk).matcher(str).matches();
    }
}
