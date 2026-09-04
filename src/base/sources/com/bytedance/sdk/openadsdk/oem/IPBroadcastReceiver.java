package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.vf;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver hnj;
    private int gjv = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final LruCache<String, as> f14565hn;
    private hnj qor;

    private IPBroadcastReceiver() {
        int i10 = 10;
        int iHnj = sk.hnj("ip_data_config", "ip_ad_cache_count", 10);
        if (iHnj > 0 && iHnj <= 200) {
            i10 = iHnj;
        }
        this.f14565hn = new LruCache<>(i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            hnj(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            hn(intent);
        }
    }

    private void hn(final Intent intent) {
        if (intent == null) {
            return;
        }
        ua.hn(new qor("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int iHnj = hn.hnj(intExtra);
                        final int iHn = hn.hn(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(iHnj), Integer.valueOf(iHn));
                        hnj hnjVar = IPBroadcastReceiver.this.qor;
                        if (iHnj > 0 && hnjVar != null) {
                            hnjVar.hnj(stringExtra3, iHnj);
                        }
                        final as asVarHnj = IPBroadcastReceiver.this.hnj(stringExtra3);
                        if (asVarHnj != null) {
                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVarHnj, orp.hnj(asVarHnj), "ip_listener_log", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                                public JSONObject hnj() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", iHnj);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", iHn);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.gjv);
                                        as asVar = asVarHnj;
                                        if (asVar != null) {
                                            jSONObject.put("ip_is_w2a", asVar.oj());
                                            if (asVarHnj.ui() != null) {
                                                jSONObject.put("ip_oem_type", asVarHnj.ui().dkl());
                                                return jSONObject;
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th2) {
                                        apu.hnj("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th2) {
                    apu.hnj("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                    IPBroadcastReceiver.this.gjv = 2;
                }
            }
        });
    }

    public static void hn(final Context context, final as asVar) {
        vf vfVarUi;
        if (hnj != null || asVar == null || (vfVarUi = asVar.ui()) == null) {
            return;
        }
        if (vfVarUi.dse() || vfVarUi.aq()) {
            fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.hnj(oj.hnj(context), asVar);
                    } catch (Throwable th2) {
                        apu.hnj("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th2);
                    }
                }
            });
        }
    }

    public void hnj(String str, as asVar) {
        if (TextUtils.isEmpty(str) || asVar == null || this.f14565hn.get(str) != null) {
            return;
        }
        this.f14565hn.put(str, asVar);
    }

    public as hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f14565hn.get(str);
    }

    public void hnj(hnj hnjVar) {
        this.qor = hnjVar;
    }

    public void hnj() {
        this.qor = null;
    }

    private void hnj(final Intent intent) {
        if (intent == null) {
            return;
        }
        ua.hn(new qor("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i10;
                final int i11;
                final int i12;
                try {
                    int intExtra = 0;
                    final int intExtra2 = intent.getIntExtra("errorCode", 0);
                    if (intExtra2 < 0) {
                        int intExtra3 = intent.getIntExtra("reason", 0);
                        if (intExtra2 == -4 && intExtra3 == -1) {
                            return;
                        } else {
                            i10 = intExtra3;
                        }
                    } else {
                        i10 = 0;
                    }
                    if (intExtra2 == 5) {
                        int intExtra4 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
                        if (intExtra4 == -2) {
                            try {
                                intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.gjv = 1;
                            }
                            if (intExtra < 100) {
                                return;
                            }
                        }
                        i11 = intExtra4;
                        i12 = intExtra;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    String stringExtra = intent.getStringExtra("packageName");
                    hnj hnjVar = IPBroadcastReceiver.this.qor;
                    if (intExtra2 > 0 && hnjVar != null) {
                        hnjVar.hnj(stringExtra, intExtra2);
                    }
                    final as asVarHnj = IPBroadcastReceiver.this.hnj(stringExtra);
                    if (asVarHnj != null) {
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVarHnj, orp.hnj(asVarHnj), "ip_listener_log", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                            public JSONObject hnj() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra2);
                                    as asVar = asVarHnj;
                                    if (asVar != null) {
                                        jSONObject.put("ip_is_w2a", asVar.oj());
                                    }
                                    int i13 = intExtra2;
                                    if (i13 > 0) {
                                        if (i13 == 5) {
                                            jSONObject.put("ip_status", i11);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.gjv);
                                        }
                                        if (i11 == -2) {
                                            jSONObject.put("ip_progress", i12);
                                        }
                                    }
                                    if (intExtra2 < 0) {
                                        jSONObject.put("ip_reason", i10);
                                    }
                                    return jSONObject;
                                } catch (Throwable th2) {
                                    apu.hnj("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    apu.hnj("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                }
            }
        });
    }

    public static IPBroadcastReceiver hnj(Context context, as asVar) {
        vf vfVarUi;
        if (sk.hnj("ip_data_config", "ip_link_listener", 0) == 0 || asVar == null || (vfVarUi = asVar.ui()) == null) {
            return null;
        }
        if (hnj == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (hnj == null) {
                        hnj = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (vfVarUi.dse()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (vfVarUi.aq()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && orp.dkl(context) >= 34) {
                            context.registerReceiver(hnj, intentFilter, 2);
                        } else {
                            context.registerReceiver(hnj, intentFilter);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }
}
