package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orp {
    private static boolean hnj = false;

    public static void hnj(boolean z10) {
        hnj = z10;
    }

    private static com.bytedance.sdk.openadsdk.jip.hnj.hn hnj(int i10, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        com.bytedance.sdk.openadsdk.jip.hnj.hn hnVar = new com.bytedance.sdk.openadsdk.jip.hnj.hn();
        hnVar.hnj(com.bytedance.sdk.openadsdk.gjv.hn.hnj.hnj);
        hnVar.hnj(asVar);
        hnVar.hn(com.bytedance.sdk.openadsdk.utils.orp.hnj(asVar));
        hnVar.hnj(i10);
        hnVar.hnj(false);
        hnVar.hn(asVar.rg());
        return hnVar;
    }

    public static boolean hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar, String str, com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar, boolean z10, int i11) {
        String strHnj;
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(-1, asVar));
        if (context != null && asVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.orl orlVarPdc = asVar.pdc();
            HashMap map = new HashMap();
            if (asVar.vz() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && asVar.qs()) {
                map.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (orlVarPdc != null && !TextUtils.isEmpty(orlVarPdc.hnj())) {
                if (hnj(context, asVar, i10, str, z10, map)) {
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(2, asVar));
                    com.bytedance.sdk.openadsdk.utils.sk.hnj(asVar);
                    return true;
                }
                if (orlVarPdc.qor() != 2 || asVar.qri() == 5 || asVar.qri() == 15) {
                    if (orlVarPdc.qor() == 1 && !TextUtils.isEmpty(orlVarPdc.hn())) {
                        strHnj = orlVarPdc.hn();
                    } else {
                        strHnj = hnj(asVar);
                    }
                } else if (qorVar != null) {
                    if (!qorVar.gjv(asVar)) {
                        if (qorVar.qor(asVar)) {
                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(3, asVar));
                            com.bytedance.sdk.openadsdk.utils.sk.hnj(asVar);
                            return true;
                        }
                        strHnj = hnj(orlVarPdc, asVar);
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(3, asVar));
                    } else {
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(3, asVar));
                        com.bytedance.sdk.openadsdk.utils.sk.hnj(asVar);
                        return true;
                    }
                } else {
                    strHnj = hnj(orlVarPdc, asVar);
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, "open_fallback_url", map);
            } else {
                strHnj = hnj(asVar);
            }
            String str2 = strHnj;
            if (asVar.vz() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(4, asVar));
                boolean zHnj = com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(context, str2, strSubstring, str, asVar);
                if (zHnj) {
                    com.bytedance.sdk.openadsdk.utils.sk.hnj(asVar);
                }
                return zHnj;
            }
            boolean zHnj2 = hnj(context, asVar, i10, pAGNativeAd, hnjVar, str, z10, str2);
            if (zHnj2) {
                com.bytedance.sdk.openadsdk.utils.sk.hnj(asVar);
            }
            return zHnj2;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(1, asVar));
        return false;
    }

    private static String hnj(com.bytedance.sdk.openadsdk.core.model.orl orlVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (!TextUtils.isEmpty(orlVar.hn())) {
            return orlVar.hn();
        }
        return hnj(asVar);
    }

    private static String hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar.qs() && asVar.mzt() != null) {
            return asVar.mzt().ojm();
        }
        return asVar.xe();
    }

    public static boolean hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, String str, boolean z10, Map<String, Object> map) {
        if (asVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.orl orlVarPdc = asVar.pdc();
        if (orlVarPdc != null && !TextUtils.isEmpty(orlVarPdc.hnj())) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.eum.hnj.hnj.hnj.hnj(context, orlVarPdc.hnj(), asVar, i10, map, z10);
        }
        sk.hnj(asVar, str, orlVarPdc == null ? -1 : -2, orlVarPdc != null ? orlVarPdc.gjv() : null);
        return false;
    }

    public static boolean hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.hqh.hn(asVar)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(hnj(5, asVar));
            return false;
        }
        int iRg = asVar.rg();
        if (iRg != 2 && iRg != 8) {
            com.bytedance.sdk.component.utils.hn.hnj(context, hnj(context, str2, asVar, i10, pAGNativeAd, hnjVar, str, z10), null);
            hnj = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.as.hnj(context, str2, asVar, com.bytedance.sdk.openadsdk.gjv.hn.hnj.hnj, false);
    }

    public static void hnj(Context context, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, String str2, boolean z10) {
        com.bytedance.sdk.component.utils.hn.hnj(context, hnj(context, str, asVar, i10, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.gjv.hnj) null, str2, z10), null);
    }

    public static void hnj(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, final String str2, boolean z10, apu apuVar) {
        com.bytedance.sdk.component.utils.hn.hnj(context, hnj(context, str, asVar, i10, null, null, str2, z10, true, apuVar), new com.bytedance.sdk.component.utils.hn.InterfaceC0195hn() { // from class: com.bytedance.sdk.openadsdk.core.orp.1
            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj() {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.hn.InterfaceC0195hn
            public void hnj(Throwable th2) {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent hnj(Context context, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar, String str2, boolean z10) {
        return hnj(context, str, asVar, i10, pAGNativeAd, hnjVar, str2, z10, false, null);
    }

    public static boolean hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i11);
            com.bytedance.sdk.openadsdk.gjv.qor.dkl(asVar, str, jSONObject);
            Intent intentHnj = hnj(context, asVar, str, i10);
            if (intentHnj == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.hn.hnj(context, intentHnj, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, int i10) {
        if (context == null || asVar == null || !com.bytedance.sdk.openadsdk.core.model.hqh.hn(asVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strDnm = com.bytedance.sdk.openadsdk.core.model.hqh.dnm(asVar);
        if (!TextUtils.isEmpty(strDnm)) {
            if (strDnm.contains("?")) {
                strDnm = strDnm + "&orientation=portrait";
            } else {
                strDnm = strDnm + "?orientation=portrait";
            }
        }
        asVar.sk(strDnm);
        asVar.dkl(str);
        asVar.gjv(i10);
        intent.putExtra("meta_index", hqh.hnj().hnj(asVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent hnj(Context context, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar, String str2, boolean z10, boolean z11, apu apuVar) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.hqh.hn(asVar) && (pAGNativeAd != 0 || hnjVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zHnj = hnj(asVar, z10);
            intent.putExtra("ad_pending_download", zHnj);
            String strDnm = com.bytedance.sdk.openadsdk.core.model.hqh.dnm(asVar);
            if (!TextUtils.isEmpty(strDnm)) {
                if (strDnm.contains("?")) {
                    str = strDnm + "&orientation=portrait";
                } else {
                    str = strDnm + "?orientation=portrait";
                }
            }
            asVar.hn(zHnj);
        } else if (!z11 && asVar.rg() == 3 && ((asVar.qb() == 2 || (asVar.qb() == 1 && hnj)) && !asVar.gyx())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z11 && apuVar != null) {
            asVar.apu(apuVar.hn());
            asVar.hnj(apuVar.hnj());
        }
        asVar.sk(str);
        asVar.dkl(str2);
        asVar.gjv(i10);
        intent.putExtra("meta_index", hqh.hnj().hnj(asVar));
        if (asVar.qri() == 5 || asVar.qri() == 15 || asVar.qri() == 50) {
            com.bytedance.sdk.openadsdk.xn.qor.hnj hnjVarQor = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.xn.qor.hnj.InterfaceC0258hnj) {
                    hnjVarQor = ((com.bytedance.sdk.openadsdk.xn.qor.hnj.InterfaceC0258hnj) pAGNativeAd).dkl();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.hnj.hn.hnj.hn) {
                    hnjVarQor = ((com.bytedance.sdk.openadsdk.hnj.hn.hnj.hn) pAGNativeAd).hn();
                }
                if (hnjVarQor != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, hnjVarQor.hnj().toString());
                }
            }
            if (hnjVar != null && hnjVar.hn() && (hnjVarQor = hnjVar.qor()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, hnjVarQor.hnj().toString());
            }
            if (hnjVarQor != null) {
                intent.putExtra("video_is_auto_play", hnjVarQor.gjv);
                if (com.bytedance.sdk.component.utils.fc.qor()) {
                    hnjVarQor.hnj().toString();
                }
            }
        }
        return intent;
    }

    private static boolean hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, boolean z10) {
        if (z10 && asVar != null && asVar.rg() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.hqh.hn(asVar);
        }
        return false;
    }
}
