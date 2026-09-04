package com.bytedance.adsdk.ugeno.hn;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.dse.aq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj<E extends ViewGroup> extends qor {
    protected List<qor<View>> hnj;

    public hnj(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected qor gjv(String str) {
        qor<T> qorVarAq;
        if (!TextUtils.isEmpty(str) && bug(str) != null) {
            return this;
        }
        for (qor<View> qorVar : this.hnj) {
            if (qorVar != null && (qorVarAq = qorVar.aq(str)) != 0) {
                return qorVarAq;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
    }

    public void hnj(qor qorVar) {
        if (qorVar == null) {
            return;
        }
        this.hnj.add(qorVar);
        View viewDnm = qorVar.dnm();
        if (viewDnm != null) {
            ((ViewGroup) this.f12293sk).addView(viewDnm);
        }
    }

    public List<qor<View>> ojm() {
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected qor qor(String str) {
        qor<T> qorVarDse;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.bug) && this.f12287qb == 0) {
            return this;
        }
        if (this.f12287qb != 0) {
            return null;
        }
        for (qor<View> qorVar : this.hnj) {
            if (qorVar != null && (qorVarDse = qorVar.dse(str)) != 0) {
                return qorVarDse;
            }
        }
        return null;
    }

    public C0169hnj ta() {
        return new C0169hnj(this);
    }

    public hnj(Context context, hnj hnjVar) {
        super(context, hnjVar);
        this.hnj = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public qor hn(String str) {
        qor<T> qorVarDkl;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.bug)) {
            return this;
        }
        for (qor<View> qorVar : this.hnj) {
            if (qorVar != null && (qorVarDkl = qorVar.dkl(str)) != 0) {
                return qorVarDkl;
            }
        }
        return null;
    }

    public void hnj(qor qorVar, ViewGroup.LayoutParams layoutParams) {
        if (qorVar == null) {
            return;
        }
        this.hnj.add(qorVar);
        View viewDnm = qorVar.dnm();
        if (viewDnm != null) {
            ((ViewGroup) this.f12293sk).addView(viewDnm, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public qor hnj(String str) {
        qor<T> qorVarSk;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.dnm)) {
            return this;
        }
        for (qor<View> qorVar : this.hnj) {
            if (qorVar != null && (qorVarSk = qorVar.sk(str)) != 0) {
                return qorVarSk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0169hnj {
        protected boolean apu;
        protected float aq;
        protected boolean as;
        protected float bug;
        protected float dkl;
        protected float dnm;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        protected ViewGroup.LayoutParams f9do;
        protected float dse;
        protected boolean eum;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        protected boolean f12267fc;
        protected boolean jip;
        protected float mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        protected boolean f12269oj;
        protected float ojm;
        protected float orl;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        protected float f12270sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        protected float f12271ta;
        protected hnj tu;
        protected boolean uua;
        protected boolean wu;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        protected boolean f12272xn;
        protected float hnj = -2.0f;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        protected float f12268hn = -2.0f;
        protected float qor = 0.0f;
        protected float gjv = 0.0f;

        public C0169hnj(hnj hnjVar) {
            this.tu = hnjVar;
        }

        public void hnj(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.dnm = aq.hnj(context, str2);
                    this.jip = true;
                    break;
                case "minWidth":
                    this.qor = aq.hnj(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f12268hn = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.f12268hn = aq.hnj(context, str2);
                        } else {
                            this.f12268hn = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.f12270sk = aq.hnj(context, str2);
                    break;
                case "marginTop":
                    this.aq = aq.hnj(context, str2);
                    this.wu = true;
                    break;
                case "padding":
                    this.f12271ta = aq.hnj(context, str2);
                    this.f12267fc = true;
                    break;
                case "marginBottom":
                    this.ojm = aq.hnj(context, str2);
                    this.as = true;
                    break;
                case "minHeight":
                    this.gjv = aq.hnj(context, str2);
                    break;
                case "paddingTop":
                    this.bug = aq.hnj(context, str2);
                    this.f12269oj = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.hnj = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.hnj = aq.hnj(context, str2);
                        } else {
                            this.hnj = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.mjg = aq.hnj(context, str2);
                    this.f12272xn = true;
                    break;
                case "paddingRight":
                    this.orl = aq.hnj(context, str2);
                    this.uua = true;
                    break;
                case "marginRight":
                    this.dse = aq.hnj(context, str2);
                    this.eum = true;
                    break;
                case "marginLeft":
                    this.dkl = aq.hnj(context, str2);
                    this.apu = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.hnj + ", mHeight=" + this.f12268hn + ", mMargin=" + this.f12270sk + ", mMarginLeft=" + this.dkl + ", mMarginRight=" + this.dse + ", mMarginTop=" + this.aq + ", mMarginBottom=" + this.ojm + ", mParams=" + this.f9do + '}';
        }

        public ViewGroup.LayoutParams hnj() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.hnj, (int) this.f12268hn);
            marginLayoutParams.leftMargin = (int) (this.apu ? this.dkl : this.f12270sk);
            marginLayoutParams.rightMargin = (int) (this.eum ? this.dse : this.f12270sk);
            marginLayoutParams.topMargin = (int) (this.wu ? this.aq : this.f12270sk);
            marginLayoutParams.bottomMargin = (int) (this.as ? this.ojm : this.f12270sk);
            return marginLayoutParams;
        }
    }
}
