package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.fc;
import com.bytedance.sdk.component.hn.hnj.mjg;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends mjg {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f12871hn = -2;
    public static int hnj = -1;
    String dkl;
    String dse;
    bug gjv;
    HttpURLConnection qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final int f12872sk;

    public aq(HttpURLConnection httpURLConnection, bug bugVar, int i10) {
        this.qor = httpURLConnection;
        this.gjv = bugVar;
        this.f12872sk = i10;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public com.bytedance.sdk.component.hn.hnj.ta aq() {
        if (ta() == null || ta().f12850hn == null) {
            return null;
        }
        return new com.bytedance.sdk.component.hn.hnj.ta(ta().f12850hn);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            dkl().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public fc dkl() {
        ojm ojmVar;
        com.bytedance.sdk.component.qor.hnj.hnj hnjVar;
        com.bytedance.sdk.component.qor.hnj.hnj hnjVar2;
        bug bugVar = this.gjv;
        if (bugVar != null && (hnjVar2 = bugVar.f12850hn) != null) {
            hnjVar2.dnm();
        }
        try {
            try {
                ojmVar = new ojm(this.qor);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.qor;
                ojmVar = new ojm(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th2) {
            th2.getMessage();
            ojmVar = null;
        }
        bug bugVar2 = this.gjv;
        if (bugVar2 != null && (hnjVar = bugVar2.f12850hn) != null) {
            hnjVar.orl();
        }
        return ojmVar;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public com.bytedance.sdk.component.hn.hnj.dkl dse() {
        if (this.qor == null) {
            return new com.bytedance.sdk.component.hn.hnj.dkl(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.qor.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || qor() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.hn.hnj.dkl((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public boolean gjv() {
        int i10 = this.f12872sk;
        return i10 >= 200 && i10 < 300;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public long hn() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public long hnj() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public String ojm() {
        return this.dse;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public int qor() {
        return this.f12872sk;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.mjg
    public String sk() {
        return !TextUtils.isEmpty(this.dkl) ? this.dkl : this.qor.getResponseMessage();
    }

    public bug ta() {
        return this.gjv;
    }

    public String toString() {
        return "";
    }

    public void hnj(String str) {
        this.dse = str;
    }

    public aq(int i10, String str, bug bugVar) {
        this.dkl = str;
        this.gjv = bugVar;
        this.f12872sk = i10;
    }

    public aq(int i10, String str, bug bugVar, String str2) {
        this.dkl = str;
        this.gjv = bugVar;
        this.f12872sk = i10;
        this.dse = str2;
    }
}
