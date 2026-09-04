package com.bytedance.sdk.component.sk.hn.qor;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.sk.apu;
import com.bytedance.sdk.component.sk.eum;
import com.bytedance.sdk.component.sk.oj;
import com.bytedance.sdk.component.sk.orl;
import com.bytedance.sdk.component.sk.uua;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private ExecutorService aq;
    private com.bytedance.sdk.component.sk.gjv dkl;
    private ExecutorService dse;
    private volatile oj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final orl f12949hn;
    private Context ojm;
    private volatile uua qor;
    private Map<String, List<qor>> hnj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Map<String, com.bytedance.sdk.component.sk.qor> f12950sk = new ConcurrentHashMap();

    public dkl(Context context, orl orlVar) {
        this.f12949hn = (orl) dse.hnj(orlVar);
        this.ojm = context;
        com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hnj(context, orlVar.sk());
    }

    private ExecutorService dnm() {
        ExecutorService executorServiceHnj = this.f12949hn.hnj();
        return executorServiceHnj != null ? executorServiceHnj : com.bytedance.sdk.component.sk.hn.hnj.hn.hnj();
    }

    private com.bytedance.sdk.component.sk.gjv ta() {
        com.bytedance.sdk.component.sk.gjv gjvVarQor = this.f12949hn.qor();
        return gjvVarQor == null ? new com.bytedance.sdk.component.sk.hnj.hnj() : gjvVarQor;
    }

    public ExecutorService aq() {
        ExecutorService executorServiceHn;
        apu apuVarHn = this.f12949hn.hn();
        if (apuVarHn != null && (executorServiceHn = apuVarHn.hn()) != null) {
            return executorServiceHn;
        }
        if (this.aq == null) {
            this.aq = com.bytedance.sdk.component.sk.hn.hnj.hn.hnj();
        }
        return this.aq;
    }

    public ExecutorService dkl() {
        ExecutorService executorServiceHnj;
        apu apuVarHn = this.f12949hn.hn();
        if (apuVarHn != null && (executorServiceHnj = apuVarHn.hnj()) != null) {
            return executorServiceHnj;
        }
        if (this.dse == null) {
            this.dse = dnm();
        }
        return this.dse;
    }

    public eum dse() {
        orl orlVar = this.f12949hn;
        if (orlVar != null) {
            return orlVar.dkl();
        }
        return null;
    }

    public Collection<com.bytedance.sdk.component.sk.qor> gjv() {
        return this.f12950sk.values();
    }

    public boolean hn() {
        return this.f12949hn.dse();
    }

    public Context hnj() {
        return this.ojm;
    }

    public Map<String, List<qor>> ojm() {
        return this.hnj;
    }

    public oj qor() {
        return this.gjv;
    }

    public com.bytedance.sdk.component.sk.gjv sk() {
        if (this.dkl == null) {
            this.dkl = ta();
        }
        return this.dkl;
    }

    private com.bytedance.sdk.component.sk.qor gjv(com.bytedance.sdk.component.sk.hn hnVar) {
        com.bytedance.sdk.component.sk.qor qorVarGjv = this.f12949hn.gjv();
        return qorVarGjv != null ? qorVarGjv : new com.bytedance.sdk.component.sk.hn.qor.hnj.hnj.hn(hnVar.aq(), hnVar.hnj());
    }

    public oj hn(com.bytedance.sdk.component.sk.hn hnVar) {
        if (hnVar == null) {
            hnVar = com.bytedance.sdk.component.sk.hn.qor.hnj.hn.ojm();
        }
        if (this.gjv == null) {
            synchronized (com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hn.class) {
                try {
                    if (this.gjv == null) {
                        this.gjv = new com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hn(hnVar.hn(), hnVar.gjv());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.gjv;
    }

    public uua hnj(com.bytedance.sdk.component.sk.hn hnVar) {
        if (hnVar == null) {
            hnVar = com.bytedance.sdk.component.sk.hn.qor.hnj.hn.ojm();
        }
        if (this.qor == null) {
            synchronized (com.bytedance.sdk.component.sk.hn.qor.hnj.hn.qor.class) {
                try {
                    if (this.qor == null) {
                        this.qor = new com.bytedance.sdk.component.sk.hn.qor.hnj.hn.qor(new com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hnj(hnVar.hn(), hnVar.qor()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.qor;
    }

    public com.bytedance.sdk.component.sk.qor qor(com.bytedance.sdk.component.sk.hn hnVar) {
        if (hnVar == null) {
            hnVar = com.bytedance.sdk.component.sk.hn.qor.hnj.hn.ojm();
        }
        String string = hnVar.aq().toString();
        com.bytedance.sdk.component.sk.qor qorVar = this.f12950sk.get(string);
        if (qorVar != null) {
            return qorVar;
        }
        com.bytedance.sdk.component.sk.qor qorVarGjv = gjv(hnVar);
        this.f12950sk.put(string, qorVarGjv);
        return qorVarGjv;
    }

    public com.bytedance.sdk.component.sk.qor hnj(String str) {
        return qor(com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hnj(new File(str)));
    }

    public com.bytedance.sdk.component.sk.hn.qor.hn.hn hnj(qor qorVar) {
        ImageView.ScaleType scaleTypeOjm = qorVar.ojm();
        if (scaleTypeOjm == null) {
            scaleTypeOjm = com.bytedance.sdk.component.sk.hn.qor.hn.hn.hnj;
        }
        ImageView.ScaleType scaleType = scaleTypeOjm;
        Bitmap.Config configTa = qorVar.ta();
        if (configTa == null) {
            configTa = com.bytedance.sdk.component.sk.hn.qor.hn.hn.f12954hn;
        }
        return new com.bytedance.sdk.component.sk.hn.qor.hn.hn(qorVar.hn(), qorVar.qor(), scaleType, configTa, qorVar.gjv(), qorVar.sk());
    }
}
