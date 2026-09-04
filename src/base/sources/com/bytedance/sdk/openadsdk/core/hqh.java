package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hqh {
    private static hqh hnj;
    private com.bytedance.sdk.openadsdk.hnj.qor.hn dkl;
    private com.bytedance.sdk.openadsdk.hnj.gjv.hn dse;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.hnj.sk.hnj f13775sk;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AtomicInteger f13774hn = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.hnj> qor = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, hnj<?>> gjv = new ConcurrentHashMap<>();
    private final Map<String, hn> aq = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj<T> {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final String f13776hn;
        public final T hnj;
        public final long qor = System.currentTimeMillis();

        public hnj(T t10, String str) {
            this.hnj = t10;
            this.f13776hn = str;
        }
    }

    private hqh() {
    }

    public com.bytedance.sdk.openadsdk.hnj.gjv.hn gjv() {
        return this.dse;
    }

    public com.bytedance.sdk.openadsdk.hnj.sk.hnj hn() {
        return this.f13775sk;
    }

    public <T> void hnj(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.gjv.put(str, new hnj<>(t10, str));
    }

    public com.bytedance.sdk.openadsdk.hnj.qor.hn qor() {
        return this.dkl;
    }

    public void sk() {
        this.f13775sk = null;
        this.dkl = null;
        this.dse = null;
    }

    private static String gjv(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            return null;
        }
        String strJp = asVar.jp();
        return TextUtils.isEmpty(strJp) ? String.valueOf(asVar.hashCode()) : strJp;
    }

    public com.bytedance.sdk.openadsdk.core.model.hnj hn(int i10) {
        return this.qor.remove(Integer.valueOf(i10));
    }

    public void qor(int i10) {
        this.qor.remove(Integer.valueOf(i10));
    }

    public void hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        hn hnVar;
        if (asVar == null) {
            return;
        }
        String strGjv = gjv(asVar);
        if (TextUtils.isEmpty(strGjv) || (hnVar = this.aq.get(strGjv)) == null) {
            return;
        }
        hnVar.hnj();
    }

    public <T> T hnj(String str, Class<T> cls) {
        hnj<?> hnjVar;
        if (TextUtils.isEmpty(str) || cls == null || (hnjVar = this.gjv.get(str)) == null || !cls.isInstance(hnjVar.hnj)) {
            return null;
        }
        return cls.cast(hnjVar.hnj);
    }

    public void qor(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        String strGjv = gjv(asVar);
        if (TextUtils.isEmpty(strGjv)) {
            return;
        }
        this.aq.remove(strGjv);
    }

    public hnj<?> hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.gjv.remove(str);
    }

    public static hqh hnj() {
        if (hnj == null) {
            hnj = new hqh();
        }
        return hnj;
    }

    public com.bytedance.sdk.openadsdk.core.model.as hnj(int i10) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarRemove = this.qor.remove(Integer.valueOf(i10));
        if (hnjVarRemove != null) {
            return hnjVarRemove.bug();
        }
        return null;
    }

    public int hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.model.hnj();
        hnjVar.hn(asVar);
        return hnj(hnjVar);
    }

    public void hnj(com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar) {
        this.dkl = hnVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar) {
        this.f13775sk = hnjVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.hnj.gjv.hn hnVar) {
        this.dse = hnVar;
    }

    public int hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        int iIncrementAndGet = this.f13774hn.incrementAndGet();
        this.qor.put(Integer.valueOf(iIncrementAndGet), hnjVar);
        return iIncrementAndGet;
    }

    public static int hnj(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, hn hnVar) {
        if (asVar == null || hnVar == null) {
            return;
        }
        String strGjv = gjv(asVar);
        if (TextUtils.isEmpty(strGjv)) {
            return;
        }
        this.aq.put(strGjv, hnVar);
    }

    public void hnj(String str, boolean z10, boolean z11) {
        boolean z12 = z10 || !z11;
        boolean zFc = ta.hn().fc();
        if (zFc) {
            com.bytedance.sdk.component.utils.apu.hnj("BVA", "cleanListener: isFinish = " + z10 + ",isConfigChange = " + z11);
        }
        if (z12) {
            hnj(str, zFc);
        } else if (z10 || !z11) {
            hnj(str, zFc);
        }
    }

    private void hnj(String str, boolean z10) {
        hnj<?> hnjVarHnj = hnj(str);
        if (z10) {
            if (hnjVarHnj == null) {
                com.bytedance.sdk.component.utils.apu.hnj("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            com.bytedance.sdk.component.utils.apu.hnj("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + hnjVarHnj.hnj);
        }
    }
}
