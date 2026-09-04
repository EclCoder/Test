package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.hn.hnj.orl;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn implements com.bytedance.sdk.component.hn.hnj.hn {
    private static List<Object> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.component.hn.hnj.gjv f12875hn;
    bug hnj;
    private AtomicBoolean qor = new AtomicBoolean(false);

    static {
        try {
            gjv = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                gjv.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                gjv.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    hn(bug bugVar, com.bytedance.sdk.component.hn.hnj.gjv gjvVar) {
        this.hnj = bugVar;
        this.f12875hn = gjvVar;
    }

    private static void qor(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private boolean sk() {
        if (this.hnj.dkl() == null) {
            return false;
        }
        return this.hnj.dkl().containsKey("Content-Type");
    }

    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.hn.hnj.hn clone() {
        return new hn(this.hnj, this.f12875hn);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn
    public mjg hn() {
        List<com.bytedance.sdk.component.hn.hnj.aq> list;
        com.bytedance.sdk.component.qor.hnj.hnj hnjVar;
        bug bugVar = this.hnj;
        if (bugVar != null && (hnjVar = bugVar.f12850hn) != null) {
            if (hnjVar.mjg() == 0) {
                this.hnj.f12850hn.fc();
            }
            this.hnj.f12850hn.hnj();
        }
        this.f12875hn.qor().remove(this);
        this.f12875hn.gjv().add(this);
        com.bytedance.sdk.component.hn.hnj.gjv gjvVar = this.f12875hn;
        if ((gjvVar instanceof dkl) && (gjvVar.qor().size() + this.f12875hn.gjv().size() > this.f12875hn.hnj() || this.qor.get())) {
            this.f12875hn.gjv().remove(this);
            return new aq(aq.hnj, "Maximum number of requests exceeded", this.hnj);
        }
        try {
            dnm dnmVar = this.hnj.hnj;
            if (dnmVar == null || (list = dnmVar.hnj) == null || list.size() <= 0) {
                mjg mjgVarHnj = hnj(this.hnj);
                this.f12875hn.gjv().remove(this);
                return mjgVarHnj;
            }
            ArrayList arrayList = new ArrayList(this.hnj.hnj.hnj);
            arrayList.add(new com.bytedance.sdk.component.hn.hnj.aq() { // from class: com.bytedance.sdk.component.hn.hnj.hnj.hnj.hn.1
                @Override // com.bytedance.sdk.component.hn.hnj.aq
                public mjg hnj(com.bytedance.sdk.component.hn.hnj.aq.hnj hnjVar2) {
                    return hn.this.hnj(hnjVar2.hnj());
                }
            });
            mjg mjgVarHnj2 = ((com.bytedance.sdk.component.hn.hnj.aq) arrayList.get(0)).hnj(new qor(arrayList, this.hnj));
            this.f12875hn.gjv().remove(this);
            return mjgVarHnj2;
        } catch (Throwable th2) {
            try {
                throw new IOException(th2.getMessage());
            } catch (Throwable th3) {
                this.f12875hn.gjv().remove(this);
                throw th3;
            }
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn
    public bug hnj() {
        return this.hnj;
    }

    private boolean hnj(orl orlVar) {
        bug bugVar;
        byte[] bArr;
        return orlVar != null && (bugVar = this.hnj) != null && HttpMethods.POST.equalsIgnoreCase(bugVar.sk()) && orlVar.dkl == orl.hnj.BYTE_ARRAY_TYPE && (bArr = orlVar.f12881sk) != null && bArr.length > 0;
    }

    public mjg hnj(bug bugVar) {
        return hnj(bugVar, com.bytedance.sdk.component.dse.hnj.sk());
    }

    public mjg hnj(bug bugVar, boolean z10) {
        boolean zDkl = com.bytedance.sdk.component.dse.hnj.dkl();
        List<String> listHnj = bugVar != null ? bugVar.hnj() : null;
        boolean z11 = (listHnj == null || listHnj.isEmpty()) ? false : true;
        if (zDkl && z11) {
            return hnj(bugVar, listHnj);
        }
        return hn(bugVar, z10);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn
    public void qor() {
        this.qor.set(true);
    }

    private bug hnj(bug bugVar, String str) {
        return bugVar.dnm().hn(str).hn();
    }

    private mjg hnj(bug bugVar, List<String> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        String string = bugVar.gjv().hnj().toString();
        arrayList.add(string);
        for (String str : list) {
            if (str != null && !str.equals(string)) {
                arrayList.add(str);
            }
        }
        long jHn = bugVar.hn();
        int size = arrayList.size();
        mjg mjgVar = null;
        int i10 = 0;
        while (i10 < size) {
            String str2 = (String) arrayList.get(i10);
            if (System.currentTimeMillis() - jCurrentTimeMillis > jHn) {
                return mjgVar != null ? mjgVar : new aq(-1, "Total timeout", bugVar, str2);
            }
            if (this.qor.get()) {
                return new aq(aq.f12871hn, "Request canceled", bugVar, str2);
            }
            try {
                arrayList.size();
                toString();
                mjg mjgVarHn = hn(i10 == 0 ? bugVar : hnj(bugVar, str2), com.bytedance.sdk.component.dse.hnj.sk());
                if (mjgVarHn instanceof aq) {
                    ((aq) mjgVarHn).hnj(str2);
                }
                try {
                    if (mjgVarHn.gjv()) {
                        toString();
                    } else if (i10 == arrayList.size() - 1) {
                        mjgVarHn.qor();
                    } else {
                        mjgVar = mjgVarHn;
                        i10++;
                    }
                    return mjgVarHn;
                } catch (IOException e10) {
                    e = e10;
                    mjgVar = mjgVarHn;
                    e.getMessage();
                    if (i10 == arrayList.size() - 1) {
                        e.getMessage();
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        }
        return mjgVar != null ? mjgVar : new aq(aq.hnj, "No URLs to try", bugVar, (String) arrayList.get(arrayList.size() - 1));
    }

    private boolean hn(orl orlVar) {
        bug bugVar;
        return (orlVar == null || (bugVar = this.hnj) == null || !HttpMethods.POST.equalsIgnoreCase(bugVar.sk()) || orlVar.dkl != orl.hnj.STRING_TYPE || TextUtils.isEmpty(orlVar.gjv)) ? false : true;
    }

    private mjg hn(bug bugVar, boolean z10) {
        HttpURLConnection httpURLConnection;
        IOException e10;
        String strHnj;
        int i10 = aq.hnj;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(bugVar.gjv().hnj().toString()).openConnection();
            if (z10) {
                try {
                    if (!"setting".equals(bugVar.aq()) && !"gecko".equals(bugVar.aq()) && !"load_ug_t".equals(bugVar.aq())) {
                        hn(httpURLConnection);
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    if (i10 == -1 && z10) {
                        bugVar.gjv().hnj().toString();
                        return hn(bugVar, false);
                    }
                    strHnj = hnj(httpURLConnection, e10);
                } catch (Exception e12) {
                    e = e12;
                    httpURLConnection2 = httpURLConnection;
                    strHnj = hnj(httpURLConnection2, e);
                }
            }
            if (bugVar.dkl() != null && !bugVar.dkl().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : bugVar.dkl().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            qor(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            dnm dnmVar = bugVar.hnj;
            if (dnmVar != null) {
                TimeUnit timeUnit = dnmVar.qor;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(dnmVar.f12854hn));
                }
                dnm dnmVar2 = bugVar.hnj;
                TimeUnit timeUnit2 = dnmVar2.f12855sk;
                if (timeUnit2 != null) {
                    httpURLConnection.setReadTimeout((int) timeUnit2.toMillis(dnmVar2.gjv));
                }
            }
            if (bugVar.ta() == null) {
                httpURLConnection.setRequestMethod(HttpMethods.GET);
            } else {
                if (!sk() && bugVar.ta().qor != null) {
                    httpURLConnection.addRequestProperty("Content-Type", bugVar.ta().qor.hnj());
                }
                httpURLConnection.setRequestMethod(bugVar.sk());
                if (jyeoXJ.ixdAnLFScXWyb.equalsIgnoreCase(bugVar.sk())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (hnj(bugVar.ta())) {
                        outputStream.write(bugVar.ta().f12881sk);
                    } else if (hn(bugVar.ta())) {
                        outputStream.write(bugVar.ta().gjv.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.qor.hnj.hnj hnjVar = bugVar.f12850hn;
            if (hnjVar != null) {
                hnjVar.hn();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.qor.hnj.hnj hnjVar2 = bugVar.f12850hn;
            if (hnjVar2 != null) {
                hnjVar2.qor();
            }
            int responseCode = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.qor.hnj.hnj hnjVar3 = bugVar.f12850hn;
            if (hnjVar3 != null) {
                hnjVar3.sk();
            }
            if (this.qor.get()) {
                i10 = aq.f12871hn;
                hnj(httpURLConnection);
                strHnj = "internal error";
                return new aq(i10, strHnj, bugVar);
            }
            return new aq(httpURLConnection, bugVar, responseCode);
        } catch (IOException e13) {
            httpURLConnection = null;
            e10 = e13;
        } catch (Exception e14) {
            e = e14;
        }
    }

    private void hnj(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
    }

    private static String hnj(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn
    public void hnj(final com.bytedance.sdk.component.hn.hnj.qor qorVar) {
        com.bytedance.sdk.component.qor.hnj.hnj hnjVar;
        bug bugVar = this.hnj;
        if (bugVar != null && (hnjVar = bugVar.f12850hn) != null) {
            hnjVar.fc();
        }
        this.f12875hn.hn().submit(new com.bytedance.sdk.component.aq.hn.qor(this.hnj.aq(), this.hnj.ojm()) { // from class: com.bytedance.sdk.component.hn.hnj.hnj.hnj.hn.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    mjg mjgVarHn = hn.this.hn();
                    if (mjgVarHn == null) {
                        qorVar.hnj(hn.this, new IOException("response is null"));
                    } else {
                        qorVar.hnj(hn.this, mjgVarHn);
                    }
                } catch (IOException e10) {
                    qorVar.hnj(hn.this, e10);
                }
            }
        });
    }

    private static void hn(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (gjv.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, gjv);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
