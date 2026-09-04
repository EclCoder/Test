package com.bytedance.sdk.component.dkl.hnj.dkl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final sk f12756hn;
    private final Context hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj extends com.bytedance.sdk.component.dkl.hnj.sk.sk {
        private final Map<String, String> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final gjv f12759hn;
        private final String qor;

        private String qor(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.qor)) ? str.replace("{UID}", this.qor).replace("__UID__", this.qor) : str;
        }

        String hn(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(qor.qor().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        boolean hnj(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.dkl.hnj.sk.gjv gjvVarHnj;
            com.bytedance.sdk.component.dkl.hnj.sk skVarFc = dse.dkl().fc();
            if (skVarFc == null || dse.dkl().sk() == null || !skVarFc.qor() || !hnj(this.f12759hn.hn())) {
                return;
            }
            if (this.f12759hn.gjv() >= skVarFc.qor(this.f12759hn.dkl())) {
                qor.this.f12756hn.qor(this.f12759hn);
                return;
            }
            try {
                if (this.f12759hn.dnm()) {
                    qor.this.f12756hn.hnj(this.f12759hn);
                }
                if (skVarFc.hnj(qor.this.hnj())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strHn = this.f12759hn.hn();
                    if (skVarFc.dkl() == 0) {
                        strHn = qor(this.f12759hn.hn());
                        if (this.f12759hn.qor()) {
                            strHn = hn(strHn);
                        }
                    }
                    com.bytedance.sdk.component.dkl.hnj.sk.qor qorVarTa = skVarFc.ta();
                    if (qorVarTa == null) {
                        return;
                    }
                    qorVarTa.hnj(Command.HTTP_HEADER_USER_AGENT, skVarFc.ojm());
                    qorVarTa.hnj("csj_client_source_from", "1");
                    if (this.gjv != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.gjv.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        qorVarTa.hnj("csj_extra_info", jSONObject.toString());
                    }
                    qorVarTa.hnj(strHn);
                    try {
                        gjvVarHnj = qorVarTa.hnj();
                        try {
                            gjvVarHnj.hnj();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        gjvVarHnj = null;
                    }
                    gjv gjvVar = this.f12759hn;
                    gjvVar.hnj(gjvVar.gjv() + 1);
                    if (gjvVarHnj != null && gjvVarHnj.hnj()) {
                        qor.this.f12756hn.qor(this.f12759hn);
                        this.f12759hn.hn();
                        skVarFc.hnj(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f12759hn);
                        return;
                    }
                    if (gjvVarHnj != null) {
                        this.f12759hn.hn(gjvVarHnj.hn());
                        this.f12759hn.qor(gjvVarHnj.qor());
                    }
                    if (gjvVarHnj == null || gjvVarHnj.hn() != 8848) {
                        this.f12759hn.hn();
                        if (this.f12759hn.gjv() >= skVarFc.qor(this.f12759hn.dkl())) {
                            qor.this.f12756hn.qor(this.f12759hn);
                            this.f12759hn.hn();
                        } else {
                            qor.this.f12756hn.hn(this.f12759hn);
                        }
                    } else {
                        gjvVarHnj.qor();
                        qor.this.f12756hn.qor(this.f12759hn);
                    }
                    skVarFc.hnj(false, this.f12759hn.aq(), System.currentTimeMillis() - jCurrentTimeMillis, this.f12759hn);
                }
            } catch (Throwable unused3) {
            }
        }

        private hnj(gjv gjvVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.f12759hn = gjvVar;
            this.qor = str;
            this.gjv = map;
        }
    }

    public qor(Context context, sk skVar) {
        this.hnj = context;
        this.f12756hn = skVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random qor() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context hnj() {
        Context context = this.hnj;
        return context == null ? dse.dkl().sk() : context;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.hn
    public void hnj(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.dkl.hnj.sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || skVarFc.gjv() == null || !skVarFc.qor() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            skVarFc.gjv().execute(new hnj(new gjv(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.hn
    public Runnable hnj(final gjv gjvVar, final String str, final Map<String, String> map) {
        if (gjvVar == null || TextUtils.isEmpty(gjvVar.hnj())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.dkl.hnj.dkl.qor.1
            @Override // java.lang.Runnable
            public void run() {
                if (qor.this.f12756hn.hnj(gjvVar.hnj()) != null) {
                    new hnj(gjvVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.hn
    public void hnj(final String str, final boolean z10) {
        com.bytedance.sdk.component.dkl.hnj.sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || dse.dkl().sk() == null || !skVarFc.qor()) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.sk.sk skVar = new com.bytedance.sdk.component.dkl.hnj.sk.sk("trackFailedUrls") { // from class: com.bytedance.sdk.component.dkl.hnj.dkl.qor.2
            @Override // java.lang.Runnable
            public void run() {
                qor.this.hnj(qor.this.f12756hn.hnj(), str, z10);
            }
        };
        skVar.hnj(1);
        if (skVarFc.gjv() != null) {
            skVarFc.gjv().execute(skVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(List<gjv> list, String str, boolean z10) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.sk skVarFc = dse.dkl().fc();
        for (gjv gjvVar : list) {
            if (skVarFc == null || skVarFc.gjv() == null) {
                str2 = str;
            } else {
                gjvVar.hnj(z10);
                str2 = str;
                skVarFc.gjv().execute(new hnj(gjvVar, str2, null));
            }
            str = str2;
        }
    }
}
