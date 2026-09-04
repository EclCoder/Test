package com.bytedance.sdk.component.hnj;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class dkl {
    private final com.bytedance.sdk.component.hnj.hnj aq;
    private final dnm dse;
    private final dse hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Map<String, hn> f12889hn = new HashMap();
    private final uua<String, oj> qor = new uua<>();
    private final Map<String, qor.hn> gjv = new HashMap();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final List<mjg> f12890sk = new ArrayList();
    private final Set<qor> dkl = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        String f12892hn;
        boolean hnj;

        private hnj(boolean z10, String str) {
            this.hnj = z10;
            this.f12892hn = str;
        }
    }

    dkl(ojm ojmVar, com.bytedance.sdk.component.hnj.hnj hnjVar) {
        this.aq = hnjVar;
        this.hnj = ojmVar.gjv;
        this.dse = ojmVar.aq;
    }

    hnj hnj(mjg mjgVar, sk skVar) {
        hn hnVar = this.f12889hn.get(mjgVar.gjv);
        if (hnVar != null) {
            try {
                if (hnVar instanceof gjv) {
                    mjgVar.toString();
                    return hnj(mjgVar, (gjv) hnVar, skVar);
                }
            } catch (IllegalStateException unused) {
                mjgVar.toString();
                this.f12890sk.add(mjgVar);
                return new hnj(false, xn.hnj());
            }
        }
        oj ojVarHnj = this.qor.hnj(mjgVar.gjv);
        if (ojVarHnj != null) {
            mjgVar.toString();
            return hnj(mjgVar, ojVarHnj, skVar);
        }
        qor.hn hnVar2 = this.gjv.get(mjgVar.gjv);
        if (hnVar2 == null) {
            mjgVar.toString();
            return null;
        }
        qor qorVarHnj = hnVar2.hnj();
        qorVarHnj.hnj(mjgVar.gjv);
        mjgVar.toString();
        return hnj(mjgVar, qorVarHnj, skVar);
    }

    void hnj(String str, gjv<?, ?> gjvVar) {
        gjvVar.hnj(str);
        this.f12889hn.put(str, gjvVar);
    }

    void hnj(Set<String> set, oj<?, ?> ojVar) {
        ojVar.hnj(set);
        this.qor.hnj(set, ojVar);
        Objects.toString(set);
    }

    void hnj(String str, qor.hn hnVar) {
        this.gjv.put(str, hnVar);
    }

    void hnj() {
        Iterator<qor> it = this.dkl.iterator();
        while (it.hasNext()) {
            it.next().sk();
        }
        this.dkl.clear();
        this.f12889hn.clear();
        this.gjv.clear();
        this.qor.hnj();
    }

    private hnj hnj(mjg mjgVar, gjv gjvVar, sk skVar) {
        return new hnj(true, xn.hnj(this.hnj.hnj(gjvVar.hnj(mjgVar.gjv, hnj(mjgVar.f12900sk, (hn) gjvVar), skVar)), gjvVar.hn()));
    }

    private hnj hnj(final mjg mjgVar, final qor qorVar, sk skVar) {
        this.dkl.add(qorVar);
        qorVar.hnj(hnj(mjgVar.f12900sk, qorVar), skVar, new qor.hnj() { // from class: com.bytedance.sdk.component.hnj.dkl.1
            @Override // com.bytedance.sdk.component.hnj.qor.hnj
            public void hnj(Object obj) {
                if (dkl.this.aq == null) {
                    return;
                }
                dkl.this.aq.hn(xn.hnj(dkl.this.hnj.hnj(obj), qorVar.hn()), mjgVar);
                dkl.this.dkl.remove(qorVar);
            }

            @Override // com.bytedance.sdk.component.hnj.qor.hnj
            public void hnj(Throwable th2) {
                if (dkl.this.aq == null) {
                    return;
                }
                dkl.this.aq.hn(xn.hnj(th2), mjgVar);
                dkl.this.dkl.remove(qorVar);
            }
        });
        return new hnj(false, xn.hnj());
    }

    private Object hnj(String str, hn hnVar) {
        return this.hnj.hnj(str, hnj(hnVar)[0]);
    }

    private static Type[] hnj(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
