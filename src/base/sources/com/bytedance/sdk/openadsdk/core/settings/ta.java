package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orl;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta implements sk {
    private boolean dnm;
    private final String dse;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final hnj f14197ta;
    private final ConcurrentHashMap<String, Object> qor = new ConcurrentHashMap<>();
    private final Object gjv = new Object();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Object f14196sk = new Object();
    private final CountDownLatch dkl = new CountDownLatch(1);
    private Properties aq = new Properties();
    private volatile boolean ojm = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hn();

        void hnj();
    }

    public ta(hnj hnjVar) {
        String strHnj = hnj();
        this.dse = strHnj;
        this.f14197ta = hnjVar;
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("SetL_" + strHnj) { // from class: com.bytedance.sdk.openadsdk.core.settings.ta.1
            @Override // java.lang.Runnable
            public void run() {
                ta.this.hnj(false);
            }
        });
    }

    private void dkl() {
        if (this.dnm && oj.hnj() != null) {
            hnj(true);
        }
        if (this.ojm) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.dkl.await(ua.dkl() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            apu.hnj("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    private File dse() {
        Context contextHnj = oj.hnj();
        if (contextHnj != null) {
            return new File(contextHnj.getFilesDir(), this.dse);
        }
        return null;
    }

    public void gjv() {
        File fileDse = dse();
        if (fileDse == null || !fileDse.exists()) {
            return;
        }
        fileDse.delete();
    }

    protected abstract String hnj();

    public boolean qor() {
        return this.ojm;
    }

    protected void sk() {
        hnj hnjVar = this.f14197ta;
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }

    public sk.hnj hn() {
        return new hn();
    }

    public String hnj(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        dkl();
        return this.aq.getProperty(str, str2);
    }

    public int hnj(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            dkl();
            try {
                return Integer.parseInt(this.aq.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                apu.hnj("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long hnj(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            dkl();
            try {
                return Long.parseLong(this.aq.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                apu.hnj("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float hnj(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            dkl();
            try {
                return Float.parseFloat(this.aq.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                apu.hnj("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class hn implements sk.hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final Map<String, Object> f14198hn = new HashMap();
        private final Object qor = new Object();

        public hn() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public void hnj() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.qor) {
                try {
                    properties.putAll(ta.this.aq);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.f14198hn.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z10 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        }
                    }
                    this.f14198hn.clear();
                    if (z10) {
                        ta.this.hnj(properties);
                        ta.this.aq = properties;
                        ta.this.qor.clear();
                        ta.this.dnm = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str, String str2) {
            synchronized (this.qor) {
                this.f14198hn.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str, int i10) {
            synchronized (this.qor) {
                this.f14198hn.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str, long j10) {
            synchronized (this.qor) {
                this.f14198hn.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str) {
            synchronized (this.qor) {
                this.f14198hn.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str, float f10) {
            synchronized (this.qor) {
                this.f14198hn.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hnj
        public sk.hnj hnj(String str, boolean z10) {
            synchronized (this.qor) {
                this.f14198hn.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean hnj(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            dkl();
            try {
                return Boolean.parseBoolean(this.aq.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                apu.hnj("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    public void hnj(boolean z10) {
        hnj hnjVar;
        synchronized (this.gjv) {
            try {
                if (!this.ojm || z10) {
                    if (oj.hnj() != null) {
                        this.dnm = false;
                        File fileDse = dse();
                        if (fileDse != null && fileDse.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileDse);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileDse.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.aq = properties;
                                            this.qor.clear();
                                        }
                                        orl.hnj(fileInputStream2);
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.dse.qor(fileDse);
                                        } catch (Throwable th2) {
                                            apu.hnj("SdkSettings.Prop", "delete: ", th2);
                                        }
                                        if (fileInputStream != null) {
                                            orl.hnj(fileInputStream);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileInputStream = fileInputStream2;
                                        apu.hnj("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            orl.hnj(fileInputStream);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    if (fileInputStream != null) {
                                        orl.hnj(fileInputStream);
                                    }
                                    this.gjv.notifyAll();
                                    throw th4;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            this.gjv.notifyAll();
                        }
                    } else {
                        this.dnm = true;
                    }
                    boolean z11 = this.ojm;
                    this.dkl.countDown();
                    this.ojm = true;
                    if (!z11 && (hnjVar = this.f14197ta) != null) {
                        hnjVar.hnj();
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public <T> T hnj(String str, T t10, sk.hn<T> hnVar) {
        T tHn;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.qor.get(str);
            if (t11 != null) {
                return t11;
            }
            dkl();
            String property = this.aq.getProperty(str, null);
            if (property != null && hnVar != null && (tHn = hnVar.hn(property)) != null) {
                this.qor.put(str, tHn);
                return tHn;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(Properties properties) {
        synchronized (this.f14196sk) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(dse());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        orl.hnj(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        apu.hnj("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            orl.hnj(fileOutputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            orl.hnj(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
