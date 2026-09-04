package com.bytedance.sdk.openadsdk.component.reward;

import a7.a;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.tu;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.core.wu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj<L, A> {
    protected com.bytedance.sdk.component.aq.hn.qor gjv;
    protected final Context hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final AtomicBoolean f13415hn = new AtomicBoolean(false);
    protected final List<hnj<L, A>.gjv> qor = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final tgn.hnj f13416sk = new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.6
        @Override // com.bytedance.sdk.component.utils.tgn.hnj
        public void hnj(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                hnj hnjVar = hnj.this;
                if (hnjVar.gjv == null) {
                    hnjVar.gjv = new hn("net connect task", hnjVar.qor);
                    com.bytedance.sdk.component.utils.ojm.hnj().post(hnj.this.gjv);
                }
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class gjv extends com.bytedance.sdk.component.aq.hn.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final AdSlot f13424hn;
        final as hnj;
        final com.bytedance.sdk.openadsdk.core.model.hnj qor;

        public gjv(as asVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            super("VideoPreloadTask");
            this.hnj = asVar;
            this.f13424hn = adSlot;
            this.qor = hnjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            as asVar = this.hnj;
            if (asVar == null || asVar.pwt() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).hnj(), this.hnj);
            hnVarHnj.hnj("material_meta", this.hnj);
            hnVarHnj.hnj("ad_slot", this.f13424hn);
            com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.gjv.1
                @Override // a7.b.a
                public void hnj(c cVar, int i10, String str) {
                }

                @Override // a7.b.a
                public void hnj(c cVar, int i10) {
                    mjg mjgVarHnj = hnj.this.hnj();
                    gjv gjvVar = gjv.this;
                    mjgVarHnj.hnj(gjvVar.f13424hn, gjvVar.qor);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class hn extends com.bytedance.sdk.component.aq.hn.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final List<hnj<L, A>.gjv> f13425hn;

        public hn(String str, List<hnj<L, A>.gjv> list) {
            super(str);
            this.f13425hn = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<hnj<L, A>.gjv> list = this.f13425hn;
            if (list == null || list.isEmpty()) {
                hnj.this.gjv = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.f13425hn);
            this.f13425hn.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((gjv) obj).run();
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.apu.hnj("BVL", "continue download task error", e10);
                }
            }
            hnj.this.gjv = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class qor {
        protected final com.bytedance.sdk.openadsdk.core.model.hnj gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        protected final AtomicBoolean f13428hn;
        protected final hnj<L, A>.C0203hnj hnj;
        protected final AtomicInteger qor;

        private int hnj() {
            if (!this.gjv.sk()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.gjv.gjv().size(); i11++) {
                as asVar = this.gjv.gjv().get(i11);
                if (asVar != null && !hqh.qor(asVar) && asVar.pwt() != null) {
                    i10++;
                }
            }
            return i10;
        }

        private qor(hnj<L, A>.C0203hnj c0203hnj, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            this.f13428hn = new AtomicBoolean(false);
            this.hnj = c0203hnj;
            this.gjv = hnjVar;
            this.qor = new AtomicInteger(hnj());
        }

        public void hnj(int i10, String str) {
            if (this.qor.decrementAndGet() > 0 || !this.f13428hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.hnj(i10, str);
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.qor.1
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", qor.this.gjv.hn());
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("choose_ad_load_error").hn(jSONObject.toString());
                }
            });
        }

        public void hnj(A a10) {
            this.qor.decrementAndGet();
            if (this.hnj == null || !this.f13428hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.hnj(a10);
        }
    }

    protected hnj(Context context) {
        this.hnj = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context.getApplicationContext();
        qor();
    }

    private void hn(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, hnj(adSlot, true), hn(), new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.1
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                return hnj.this.hnj().hnj(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                boolean zHnj = hnj.this.hnj().hnj(hnjVar);
                this.hnj = zHnj;
                return zHnj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                if (this.hnj || hnjVar.gjv() == null || hnjVar.gjv().isEmpty()) {
                    return;
                }
                hnj hnjVar2 = hnj.this;
                hnj.this.hnj(hnjVar, hnjVar2.hnj(hnjVar2.hnj, hnjVar, adSlot), adSlot, true, (Object) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(AdSlot adSlot) {
        hnj().hnj(adSlot.getCodeId());
    }

    protected abstract int dkl();

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.gjv != null) {
            try {
                com.bytedance.sdk.component.utils.ojm.hnj().removeCallbacks(this.gjv);
            } catch (Throwable unused) {
            }
            this.gjv = null;
        }
        gjv();
    }

    protected void gjv() {
        if (this.f13415hn.get()) {
            this.f13415hn.set(false);
            try {
                tgn.hnj(this.f13416sk);
            } catch (Exception unused) {
            }
        }
    }

    protected abstract int hn();

    protected abstract void hn(A a10);

    protected abstract mjg hnj();

    protected abstract A hnj(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, AdSlot adSlot);

    protected abstract Object hnj(A a10);

    protected abstract void hnj(L l10, int i10, String str);

    protected abstract void hnj(L l10, Object obj);

    public void sk() {
        try {
            hnj().hnj();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class C0203hnj {
        protected final boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        protected final com.bytedance.sdk.openadsdk.core.model.hnj f13426hn;
        protected final AdSlot hnj;
        protected final L qor;

        public C0203hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, L l10, boolean z10) {
            this.hnj = adSlot;
            this.f13426hn = hnjVar;
            this.qor = l10;
            this.gjv = z10;
        }

        public void hnj(int i10, String str) {
            L l10 = this.qor;
            if (l10 != null) {
                hnj.this.hnj(l10, i10, str);
            }
        }

        public void hnj(A a10) {
            hnj.this.hnj(this.hnj, this.f13426hn, this.qor, a10, this.gjv);
        }
    }

    private void hn(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, hnj(adSlot, false), hn(), new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.2
            boolean hnj = false;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                Object obj = l10;
                if (obj != null) {
                    hnj.this.hnj(obj, i10, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVar2;
                if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
                    hnj hnjVar3 = hnj.this;
                    Object objHnj = hnjVar3.hnj(hnjVar3.hnj, hnjVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.wu.hnj.gjv.hnj().hnj(hnjVar.gjv().isEmpty() ? null : hnjVar.gjv().get(0));
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(hnjVar.dkl(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 0) {
                        hnjVar2 = hnjVar;
                    } else {
                        hnj.this.hnj(adSlot, hnjVar, l10, objHnj, this.hnj);
                        hnjVar2 = hnjVar;
                        objHnj = objHnj;
                    }
                    hnj.this.hnj(hnjVar2, objHnj, adSlot, false, l10);
                    return;
                }
                Object obj = l10;
                if (obj != null) {
                    hnj.this.hnj(obj, -3, com.bytedance.sdk.openadsdk.core.ojm.hnj(-3));
                    qorVar.hnj(-3);
                    qorVar.qor(hnj.this.dkl());
                    com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strHnj = hnj.this.hnj().hnj(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strHnj);
                if (TextUtils.isEmpty(strHnj)) {
                    return null;
                }
                return strHnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                this.hnj = hnj.this.hnj().hnj(hnjVar);
                return this.hnj;
            }
        });
    }

    public void hnj(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        hn(adSlot);
    }

    protected void qor() {
        if (this.f13415hn.get()) {
            return;
        }
        this.f13415hn.set(true);
        tgn.hnj(this.f13416sk, this.hnj);
    }

    public void hnj(AdSlot adSlot, L l10) {
        Objects.toString(adSlot);
        Objects.toString(l10);
        hn(adSlot, l10);
    }

    protected void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, A a10, AdSlot adSlot, boolean z10, L l10) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.mjg.hnj.hnj().hnj(hnjVar.dkl());
        }
        hnj<L, A> hnjVar2 = this;
        AdSlot adSlot2 = adSlot;
        hnj<L, A>.qor qorVar = new qor(hnjVar2.new C0203hnj(adSlot2, hnjVar, l10, false), hnjVar);
        hnj(hnjVar);
        int i10 = 0;
        while (i10 < hnjVar.gjv().size()) {
            as asVar = hnjVar.gjv().get(i10);
            int iQb = asVar.qb();
            if (i10 == 0 && iQb == 43) {
                asVar.pwt().f(0);
            }
            A a11 = a10;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            hnjVar2.hnj(hnjVar, asVar, a11, adSlot3, z11, qorVar);
            adSlot2 = adSlot3;
            if (hnjVar.aq() && iQb != 43) {
                return;
            }
            i10++;
            hnjVar2 = this;
            a10 = a11;
            z10 = z11;
        }
    }

    protected void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        tu tuVarTa = hnjVar.ta();
        int iJip = hnjVar.aq() ? 10 : 1;
        if (tuVarTa != null) {
            iJip = tuVarTa.jip();
        }
        for (final int i10 = 0; i10 < hnjVar.gjv().size() && i10 < iJip; i10++) {
            com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnjVar.gjv().get(i10), new com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.3
                @Override // com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj
                public void hnj(boolean z10) {
                    com.bytedance.sdk.component.utils.apu.hnj("BVL", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private boolean hnj(boolean z10, as asVar, AdSlot adSlot) {
        if (z10) {
            return !hqh.qor(asVar) && as.sk(asVar) && com.bytedance.sdk.openadsdk.core.oj.gjv().tgn(adSlot.getCodeId()).gjv == 1 && !com.bytedance.sdk.component.utils.oj.gjv(this.hnj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(hnj<L, A>.qor qorVar) {
        return qorVar != null && com.bytedance.sdk.openadsdk.core.oj.gjv().vf() == 1;
    }

    private void hnj(as asVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, final A a10, final boolean z10, final hnj<L, A>.qor qorVar) {
        com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(asVar.gkx()).hnj(), asVar);
        hnVarHnj.hnj("material_meta", asVar);
        hnVarHnj.hnj("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // a7.b.a
            public void hnj(c cVar, int i10) {
                hnj.this.hn(a10);
                if (z10) {
                    hnj.this.hnj().hnj(adSlot, hnjVar);
                } else if (hnj.this.hnj(qorVar)) {
                    qorVar.hnj(a10);
                }
            }

            @Override // a7.b.a
            public void hnj(c cVar, int i10, String str) {
                if (hnj.this.hnj(qorVar)) {
                    qorVar.hnj(i10, str);
                }
            }
        });
    }

    protected void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, as asVar, A a10, AdSlot adSlot, boolean z10, hnj<L, A>.qor qorVar) {
        A a11;
        hnj<L, A>.qor qorVar2;
        if (hnj(z10, asVar, adSlot)) {
            hnj((gjv) new gjv(asVar, adSlot, hnjVar));
            return;
        }
        boolean zHnj = hnj((qor) qorVar);
        if (hqh.qor(asVar)) {
            a11 = a10;
            qorVar2 = qorVar;
            if (z10) {
                hnj().hnj(adSlot, hnjVar);
            }
        } else if (!as.sk(asVar)) {
            a11 = a10;
            qorVar2 = qorVar;
            if (z10) {
                hnj().hnj(adSlot, hnjVar);
            }
        } else {
            if (asVar.pwt() == null) {
                return;
            }
            a11 = a10;
            qorVar2 = qorVar;
            hnj(asVar, adSlot, hnjVar, a11, z10, qorVar2);
            zHnj = false;
        }
        if (zHnj) {
            qorVar2.hnj(a11);
        }
    }

    protected void hnj(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, L l10, A a10, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.5
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    hnj.this.qor(adSlot);
                } else {
                    hnj.this.hnj().hnj(adSlot, hnjVar);
                    hnj.this.qor(adSlot);
                }
            }
        });
        if (l10 != null) {
            hnj(l10, hnj(a10));
        }
    }

    protected void hnj(hnj<L, A>.gjv gjvVar) {
        if (gjvVar == null) {
            return;
        }
        if (this.qor.size() > 0) {
            this.qor.remove(0);
        }
        this.qor.add(gjvVar);
    }

    protected xyo hnj(AdSlot adSlot, boolean z10) {
        xyo xyoVar = new xyo();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.oj.gjv().bug(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            xyoVar.ojm = 2;
        }
        if (hn() == 7) {
            xyoVar.f14017hn = z10 ? 2 : 1;
            return xyoVar;
        }
        xyoVar.qor = z10 ? 2 : 1;
        return xyoVar;
    }

    public void hnj(String str, as asVar) {
        hnj().hnj(str, asVar);
    }
}
