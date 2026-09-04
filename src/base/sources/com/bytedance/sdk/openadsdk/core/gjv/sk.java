package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.wu;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private final dkl.hnj aq;
    private final dkl.hn dkl;
    private final View.OnAttachStateChangeListener dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private dkl f13764hn;
    private wu hnj;
    private List<hnj> qor = new ArrayList();
    private final String gjv = "BannerSwiperManager";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13765sk = -1;

    public sk(wu wuVar, Context context, int i10, int i11) {
        dkl.hn hnVar = new dkl.hn() { // from class: com.bytedance.sdk.openadsdk.core.gjv.sk.1
            @Override // com.bytedance.sdk.openadsdk.core.gjv.dkl.hn
            public void hnj(boolean z10) {
                try {
                    if (z10) {
                        sk.this.gjv();
                    } else {
                        sk.this.qor();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.dkl = hnVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.sk.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                sk.this.sk();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (sk.this.qor != null && !sk.this.qor.isEmpty()) {
                    for (int i12 = 0; i12 < sk.this.qor.size(); i12++) {
                        ((hnj) sk.this.qor.get(i12)).dkl();
                    }
                }
                sk.this.f13765sk = -1;
                if (sk.this.f13764hn != null) {
                    sk.this.f13764hn.gjv();
                }
            }
        };
        this.dse = onAttachStateChangeListener;
        dkl.hnj hnjVar = new dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.sk.3
            @Override // com.bytedance.sdk.openadsdk.core.gjv.dkl.hnj
            public void hnj(boolean z10) {
                if (z10) {
                    sk.this.gjv();
                } else {
                    sk.this.qor();
                }
            }
        };
        this.aq = hnjVar;
        this.hnj = wuVar;
        dkl dklVar = new dkl(context);
        this.f13764hn = dklVar;
        dklVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f13764hn.setSwiperWindowFocusChangedListener(hnVar);
        this.f13764hn.setSwiperVisibleChangeListener(hnjVar);
        hnj(context, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        dkl dklVar;
        wu wuVar = this.hnj;
        if (wuVar != null && wuVar.hn() == 1 && (dklVar = this.f13764hn) != null) {
            dklVar.sk();
        }
        int i10 = this.f13765sk;
        if (i10 >= 0) {
            hnj(i10);
            hn(this.f13765sk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        dkl dklVar;
        wu wuVar = this.hnj;
        if (wuVar != null && wuVar.hn() == 1 && (dklVar = this.f13764hn) != null) {
            dklVar.dkl();
        }
        if (this.f13765sk >= 0) {
            hn(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void sk() {
        if (this.hnj == null) {
            this.hnj = new wu();
        }
        this.f13764hn.hnj(TextUtils.equals(this.hnj.hnj(), "vertical") ? 1 : 0).hnj("dot").qor(false).gjv(this.hnj.gjv() == 1).hnj(this.hnj.hn() == 1).qor(this.hnj.ojm()).sk(this.hnj.ta() == 1).gjv(this.hnj.aq()).hn(this.hnj.qor() == 1).aq(this.hnj.sk()).ojm(this.hnj.dkl()).dse(this.hnj.dse());
        this.f13764hn.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.dkl.qor() { // from class: com.bytedance.sdk.openadsdk.core.gjv.sk.4
            @Override // com.bytedance.adsdk.ugeno.dkl.qor
            public void hnj(boolean z10, int i10, float f10, int i11) {
            }

            @Override // com.bytedance.adsdk.ugeno.dkl.qor
            public void hnj(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                sk.this.qor(i10);
                sk.this.f13765sk = i10;
                sk.this.hnj(i10);
                sk.this.hn(i10);
            }

            @Override // com.bytedance.adsdk.ugeno.dkl.qor
            public void hnj(boolean z10, int i10) {
                if (i10 == 1 || i10 == 2) {
                    sk.this.hn(-1);
                } else if (i10 == 0) {
                    sk skVar = sk.this;
                    skVar.hnj(skVar.f13765sk);
                }
            }
        });
        hn(this.qor);
        this.f13764hn.qor();
    }

    public void hn(int i10) {
        hnj hnjVar;
        for (int i11 = 0; i11 < this.qor.size(); i11++) {
            try {
                if (i11 != i10 && (hnjVar = this.qor.get(i11)) != null) {
                    hnjVar.ojm();
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
    }

    protected void hnj(Context context, float f10, float f11) {
        int iHn = sq.hn(context, f10);
        int iHn2 = sq.hn(context, f11);
        ViewGroup.LayoutParams layoutParams = this.f13764hn.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iHn, iHn2);
        }
        layoutParams.width = iHn;
        layoutParams.height = iHn2;
        this.f13764hn.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(int i10) {
        hnj hnjVar;
        try {
            int i11 = this.f13765sk;
            if (i11 != -1 && i11 != i10 && (hnjVar = this.qor.get(i11)) != null) {
                hnjVar.gjv();
                hnjVar.aq();
            }
            hnj hnjVar2 = this.qor.get(i10);
            if (hnjVar2 != null) {
                hnjVar2.sk();
            }
        } catch (Throwable unused) {
        }
    }

    private void hn(List<hnj> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f13764hn.hnj(list.get(i10).hnj());
        }
    }

    public View hn() {
        return this.f13764hn;
    }

    public void hnj(List<hnj> list) {
        this.qor = list;
    }

    public void hnj(final int i10) {
        hnj hnjVar;
        try {
            final int size = this.qor.size();
            if (i10 < size && (hnjVar = this.qor.get(i10)) != null) {
                hnjVar.hnj(new com.bytedance.sdk.openadsdk.hnj.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.core.gjv.sk.5
                    @Override // com.bytedance.sdk.openadsdk.hnj.hnj.hn
                    public void hnj() {
                        int i11 = i10 + 1;
                        if (i11 >= size) {
                            return;
                        }
                        sk.this.hnj(i11);
                    }
                });
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void hnj() {
        if (this.f13764hn != null) {
            try {
                List<hnj> list = this.qor;
                if (list != null && !list.isEmpty()) {
                    for (int i10 = 0; i10 < this.qor.size(); i10++) {
                        this.qor.get(i10).dse();
                    }
                }
                this.f13765sk = -1;
                this.f13764hn.gjv();
                this.f13764hn.setSwiperWindowFocusChangedListener(null);
                this.f13764hn.setSwiperVisibleChangeListener(null);
                this.f13764hn.removeOnAttachStateChangeListener(this.dse);
                this.f13764hn = null;
            } catch (Throwable unused) {
            }
        }
    }
}
