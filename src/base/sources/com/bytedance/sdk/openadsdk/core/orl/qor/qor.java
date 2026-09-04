package com.bytedance.sdk.openadsdk.core.orl.qor;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.f;
import f8.Ygx.FuoITeVPeXAj;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class qor {
    private static boolean gjv;
    private static SimpleDateFormat hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final List<String> f14148hn;
    private final Map<hn, String> qor;

    private String hn() {
        if (hnj == null) {
            hnj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String str = hnj.format(new Date());
        if (!gjv) {
            return str;
        }
        int iTu = orp.tu();
        if (iTu < 0) {
            if (iTu <= -10) {
                return str + iTu;
            }
            return str + "-0" + (-iTu);
        }
        if (iTu < 10) {
            return str + "+0" + iTu;
        }
        return str + "+" + iTu;
    }

    private String qor() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    public List<String> hnj() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f14148hn) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (hn hnVar : hn.values()) {
                    String str = this.qor.get(hnVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = hnVar == hn.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(hnVar.name(), str) : strReplaceAll.replaceAll("\\[" + hnVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public qor(List<String> list, as asVar) {
        int iIz;
        this.f14148hn = list;
        HashMap map = new HashMap();
        this.qor = map;
        map.put(hn.CACHEBUSTING, qor());
        map.put(hn.TIMESTAMP, hn());
        map.put(hn.APPBUNDLE, oj.hnj().getPackageName());
        hn hnVar = hn.PLAYERSTATE;
        map.put(hnVar, "");
        if (asVar != null && ((iIz = asVar.iz()) == 3 || iIz == 7 || iIz == 8)) {
            map.put(hnVar, f.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(hn.SERVERSIDE, FuoITeVPeXAj.IomyEENTYth);
    }

    public qor hn(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.qor.put(hn.ASSETURI, str);
        }
        return this;
    }

    public qor hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj hnjVar) {
        if (hnjVar != null) {
            this.qor.put(hn.ERRORCODE, hnjVar.hnj());
        }
        return this;
    }

    public qor hnj(long j10) {
        if (j10 >= 0) {
            String strHn = hn(j10);
            if (!TextUtils.isEmpty(strHn)) {
                this.qor.put(hn.CONTENTPLAYHEAD, strHn);
            }
        }
        return this;
    }

    private String hn(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }

    public qor hnj(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.qor.put(hn.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }
}
