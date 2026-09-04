package com.bytedance.sdk.openadsdk.as;

import android.text.TextUtils;
import android.util.Log;
import com.google.api.client.http.HttpMethods;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private qor f13256hn;
    private dkl qor;
    private final String hnj = "StrategyCenter";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13257sk = 0;
    private final ConcurrentHashMap<String, Object> dkl = new ConcurrentHashMap<>();
    private Runnable dse = new Runnable() { // from class: com.bytedance.sdk.openadsdk.as.gjv.2
        @Override // java.lang.Runnable
        public void run() {
            gjv.this.hn();
        }
    };

    public gjv(dkl dklVar) {
        this.f13256hn = null;
        dse dseVar = new dse(dklVar);
        this.qor = dseVar;
        String strQor = dseVar.qor();
        if (!TextUtils.isEmpty(strQor) && !strQor.startsWith("pag")) {
            strQor = "pag_".concat(strQor);
        }
        this.f13256hn = new qor(this.qor.hn(), strQor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        dkl dklVar = this.qor;
        if (dklVar == null || dklVar.sk() == null || this.qor.dkl() == null || this.qor.aq()) {
            return;
        }
        this.qor.hnj().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.as.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                gjv.this.f13257sk++;
                try {
                    if (gjv.this.gjv != null) {
                        gjv.this.gjv.hnj();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(gjv.this.qor.sk()).openConnection();
                    if (gjv.this.qor.dse() != null && gjv.this.qor.dse().size() > 0) {
                        for (Map.Entry<String, String> entry : gjv.this.qor.dse().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(HttpMethods.POST);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(gjv.this.qor.dkl().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectHnj = gjv.this.qor.hnj(new JSONObject(stringBuffer.toString()));
                                gjv.this.f13256hn.hnj();
                                gjv.this.qor();
                                gjv.this.f13256hn.hnj(jSONObjectHnj);
                                if (gjv.this.gjv != null) {
                                    gjv.this.gjv.hn();
                                }
                            } else if (gjv.this.gjv != null) {
                                gjv.this.gjv.hnj(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                    }
                } catch (Throwable th4) {
                    Log.e("StrategyCenter", th4.getMessage() == null ? "error " : th4.getMessage());
                    if (gjv.this.gjv != null) {
                        gjv.this.gjv.hnj(-1, th4.getMessage());
                    }
                }
                gjv.this.f13256hn.hnj("local_last_update_time", System.currentTimeMillis());
                gjv.this.hnj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        this.dkl.clear();
    }

    public void hnj(hnj hnjVar) {
        this.gjv = hnjVar;
    }

    public void hnj() {
        if (this.qor != null) {
            int i10 = 3600000;
            int iHnj = this.f13256hn.hnj("req_interval", 3600000);
            long j10 = 0;
            long jHn = this.f13256hn.hn("local_last_update_time", 0L);
            if (iHnj >= 600000 && iHnj <= 86400000) {
                i10 = iHnj;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jHn;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.qor.gjv().removeCallbacks(this.dse);
            if (this.f13257sk > 24) {
                return;
            }
            this.qor.gjv().postDelayed(this.dse, j10);
        }
    }

    public int hnj(String str, int i10) {
        qor qorVar = this.f13256hn;
        return qorVar == null ? i10 : qorVar.hnj(str, i10);
    }

    public String hnj(String str, String str2) {
        qor qorVar = this.f13256hn;
        return qorVar == null ? str2 : qorVar.hnj(str, str2);
    }

    public boolean hnj(String str, boolean z10) {
        qor qorVar = this.f13256hn;
        return qorVar == null ? z10 : qorVar.hnj(str, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T hnj(java.lang.String r3, T r4, com.bytedance.sdk.openadsdk.as.hn.hnj<T> r5) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.as.qor r0 = r2.f13256hn
            if (r0 == 0) goto L2c
            if (r3 != 0) goto L7
            goto L2c
        L7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.dkl
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1c
            if (r4 == 0) goto L1b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1c
            boolean r1 = r1.isInstance(r0)     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1c
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L2c
            com.bytedance.sdk.openadsdk.as.qor r0 = r2.f13256hn     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r0.hnj(r3, r4, r5)     // Catch: java.lang.Exception -> L2c
            if (r5 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.dkl     // Catch: java.lang.Exception -> L2c
            r0.put(r3, r5)     // Catch: java.lang.Exception -> L2c
            return r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.as.gjv.hnj(java.lang.String, java.lang.Object, com.bytedance.sdk.openadsdk.as.hn$hnj):java.lang.Object");
    }
}
