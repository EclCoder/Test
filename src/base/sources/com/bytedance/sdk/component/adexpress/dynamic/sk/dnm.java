package com.bytedance.sdk.component.adexpress.dynamic.sk;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.bytedance.sdk.component.utils.wu;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f12666hn;
    private static final Set<String> hnj = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double hn(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0435  */
    /* JADX WARN: Code duplicated, block: B:222:0x0443 A[Catch: Exception -> 0x0454, TryCatch #5 {Exception -> 0x0454, blocks: (B:220:0x0439, B:222:0x0443, B:227:0x044d), top: B:282:0x0439 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x044c  */
    public static hn.qor hnj(String str, String str2, String str3, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, double d10, int i11, double d11, String str4, orl orlVar) {
        float f10;
        float f11;
        hn.qor qorVarHnj;
        int i12;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk;
        String strOptString = str;
        int i13 = i10;
        String strGjv = orlVar.gjv();
        int iDse = orlVar.dse();
        if (com.bytedance.sdk.component.adexpress.gjv.hn() && i11 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new hn.qor(0.0f, 0.0f);
        }
        hn.qor qorVar = new hn.qor();
        if (strOptString.startsWith("<svg") || hnj.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.gjv.hn() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                    qorVar.hnj = fOptDouble;
                    qorVar.f12673hn = fOptDouble;
                    return qorVar;
                }
            } catch (Exception unused) {
            }
            qorVar.hnj = 10.0f;
            qorVar.f12673hn = 10.0f;
            return qorVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_text_privacy_app_version") + strOptString;
            }
            int i14 = 0;
            if ("score-count".equals(str2)) {
                try {
                    i14 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                }
                if (com.bytedance.sdk.component.adexpress.gjv.hn() && i14 < 0) {
                    return new hn.qor(0.0f, 0.0f);
                }
                return hnj("(" + String.format(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_comment_num"), Integer.valueOf(i14)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i14 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                }
                if (com.bytedance.sdk.component.adexpress.gjv.hn() && i14 < 0) {
                    return new hn.qor(0.0f, 0.0f);
                }
                return hnj("(" + String.format(new DecimalFormat("###,###,###").format(i14), Integer.valueOf(i14)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.gjv.hn()) {
                hn.qor qorVar2 = new hn.qor();
                float fHn = (float) hn(str3);
                qorVar2.hnj = fHn;
                qorVar2.f12673hn = fHn;
                return qorVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!orlVar.hnj() || !com.bytedance.sdk.component.adexpress.gjv.dkl.hn(strGjv)) {
                    return d10 < 10.0d ? hnj("0S", str3) : hnj("00S", str3);
                }
                if (((int) (d10 + 0.5d)) - iDse < 10) {
                    return com.bytedance.sdk.component.adexpress.gjv.hn() ? hnj("0s", str3) : hnj(String.format(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip"), MBridgeConstans.ENDCARD_URL_TYPE_PL), str3);
                }
                return com.bytedance.sdk.component.adexpress.gjv.hn() ? hnj("00s", str3) : hnj(String.format(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return hnj("| " + wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return hnj("| ".concat(String.format(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                hn.qor qorVarHnj2 = hnj("| " + wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    try {
                        qorVarHnj2.f12673hn = (float) ((((double) qorVarHnj2.f12673hn) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    qorVarHnj2.hnj = qorVarHnj2.f12673hn;
                }
                return qorVarHnj2;
            }
            if (FreeSpaceBox.TYPE.equals(str2)) {
                return hnj(wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return hnj("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.gjv.hn() || (d11 >= 0.0d && d11 <= 5.0d)) ? hnj("0.0", str3) : new hn.qor(0.0f, 0.0f);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return hnj("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return hnj("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.gjv.hn() && TextUtils.isEmpty(strOptString) && (dklVarSk = aqVar.ta().sk()) != null) {
                strOptString = dklVarSk.hkr() != null ? aqVar.ta().sk().hkr().optString(com.bytedance.sdk.component.adexpress.gjv.dse.qor(com.bytedance.sdk.component.adexpress.gjv.hnj())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.gjv.hn() && "open_ad".equals(strGjv))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return hnj(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f12 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                if ("muted".equals(str2)) {
                    qorVar.hnj = fOptDouble2;
                    qorVar.f12673hn = fOptDouble2;
                    return qorVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.gjv.hn() && (d11 < 0.0d || d11 > 5.0d || i11 != 4)) {
                        return new hn.qor(0.0f, 0.0f);
                    }
                    hn.qor qorVarHnj3 = hnj("str", str3);
                    qorVarHnj3.hnj = fOptDouble2 * 5.0f;
                    return qorVarHnj3;
                }
                if (RewardPlus.ICON.equals(str2)) {
                    qorVar.hnj = fOptDouble2;
                    qorVar.f12673hn = fOptDouble2;
                    return qorVar;
                }
                if (z10) {
                    int i15 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z11 && i15 >= i13) {
                        i15 = i13;
                    }
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2 * i15)) * 1.2d);
                } else {
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f12 <= fOptDouble5) {
                        f11 = f12;
                    }
                    if (CampaignEx.JSON_KEY_TITLE.equals(str2) || (com.bytedance.sdk.component.adexpress.gjv.hn() && "open_ad".equals(strGjv) && "source".equals(str2))) {
                        try {
                            qorVarHnj = hnj(strOptString.replace('\n', ' '), str3, false);
                            if (z10) {
                                i12 = ((int) (f12 / fOptDouble5)) + 1;
                                if (z11 || i12 < i13) {
                                    i13 = i12;
                                }
                                qorVarHnj.f12673hn *= i13;
                            }
                            return qorVarHnj;
                        } catch (Exception unused5) {
                        }
                    }
                    qorVar.hnj = f11;
                    qorVar.f12673hn = f10;
                }
                f11 = fOptDouble5;
                if (CampaignEx.JSON_KEY_TITLE.equals(str2)) {
                    qorVarHnj = hnj(strOptString.replace('\n', ' '), str3, false);
                    if (z10) {
                        i12 = ((int) (f12 / fOptDouble5)) + 1;
                        if (z11) {
                            i13 = i12;
                        } else {
                            i13 = i12;
                        }
                        qorVarHnj.f12673hn *= i13;
                    }
                    return qorVarHnj;
                }
                qorVarHnj = hnj(strOptString.replace('\n', ' '), str3, false);
                if (z10) {
                    i12 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z11) {
                        i13 = i12;
                    } else {
                        i13 = i12;
                    }
                    qorVarHnj.f12673hn *= i13;
                }
                return qorVarHnj;
            } catch (JSONException unused6) {
            }
        } else {
            if (!com.bytedance.sdk.component.adexpress.gjv.hn() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || hn())) {
                return hn() ? hnj(qorVar, strOptString, str3, f12666hn) : hnj(qorVar, strOptString, str3, "");
            }
            qorVar.hnj = "union".equals(strOptString) ? 14.0f : 20.0f;
            qorVar.f12673hn = 10.0f;
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                String strXyo = orlVar.xyo();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strXyo)) {
                    qorVar.hnj = 0.0f;
                }
                String str5 = str2 + strOptString;
                float fHn2 = (float) hn(str3);
                if (str5.contains("logoad")) {
                    String strVf = orlVar.vf();
                    if (!TextUtils.isEmpty(strVf)) {
                        return hnj(strVf, str3);
                    }
                    qorVar.hnj = 0.0f;
                }
                qorVar.f12673hn = fHn2;
                return qorVar;
            }
        }
        return qorVar;
    }

    public static int[] hn(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.gjv.hnj());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean hn() {
        return !TextUtils.isEmpty(f12666hn);
    }

    public static String hnj(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static hn.qor hnj(hn.qor qorVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            qorVar.hnj = 0.0f;
            qorVar.f12673hn = 0.0f;
            return qorVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = hnj(str);
        }
        if (TextUtils.isEmpty(str3)) {
            qorVar.hnj = 0.0f;
            qorVar.f12673hn = 0.0f;
            return qorVar;
        }
        return hnj(str3, str2);
    }

    public static hn.qor hnj(String str, String str2) {
        return hnj(str, str2, false);
    }

    public static hn.qor hnj(String str, String str2, boolean z10) {
        hn.qor qorVar = new hn.qor();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrHnj = hnj(str, (float) hn(str2), z10);
            qorVar.hnj = iArrHnj[0];
            qorVar.f12673hn = iArrHnj[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                qorVar.f12673hn = 0.0f;
            }
        } catch (Exception unused) {
        }
        return qorVar;
    }

    public static int[] hnj(String str, float f10, boolean z10) {
        int[] iArrHn = hn(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), iArrHn[0]), com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), iArrHn[1])};
    }

    public static String hnj() {
        return f12666hn;
    }
}
