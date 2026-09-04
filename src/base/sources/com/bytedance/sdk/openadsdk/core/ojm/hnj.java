package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.nyv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    protected int aq;
    protected String dkl;
    protected String dnm;
    protected int dse;
    protected com.bytedance.sdk.openadsdk.qor.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected Context f14061hn;
    private com.bytedance.sdk.openadsdk.gjv.dse hnj;
    protected boolean ojm;
    protected com.bytedance.sdk.openadsdk.core.model.as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected TTDislikeDialogAbstract f14062sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected boolean f14063ta;

    public hnj(Context context) {
        super(context);
        this.dkl = "embeded_ad";
        this.ojm = true;
        this.f14063ta = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    protected String getDescription() {
        if (TextUtils.isEmpty(this.qor.kby())) {
            return !TextUtils.isEmpty(this.qor.br()) ? this.qor.br() : "";
        }
        return this.qor.kby();
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.qor;
        if (asVar == null) {
            return "";
        }
        if (asVar.zyh() == null || TextUtils.isEmpty(this.qor.zyh().hn())) {
            return !TextUtils.isEmpty(this.qor.mw()) ? this.qor.mw() : "";
        }
        return this.qor.zyh().hn();
    }

    public float getRealHeight() {
        return sq.qor(this.f14061hn, this.aq);
    }

    public float getRealWidth() {
        return sq.qor(this.f14061hn, this.dse);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    protected String getTitle() {
        if (this.qor.zyh() != null && !TextUtils.isEmpty(this.qor.zyh().hn())) {
            return this.qor.zyh().hn();
        }
        if (TextUtils.isEmpty(this.qor.mw())) {
            return !TextUtils.isEmpty(this.qor.kby()) ? this.qor.kby() : "";
        }
        return this.qor.mw();
    }

    protected com.bytedance.sdk.openadsdk.core.mjg.hn.dkl getVideoView() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar;
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.qor;
        if (asVar != null && this.f14061hn != null) {
            if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar)) {
                try {
                    dklVar = new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl(this.f14061hn, this.qor, this.dkl, true, false, this.hnj);
                    dklVar.setVideoCacheUrl(this.dnm);
                    dklVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn() { // from class: com.bytedance.sdk.openadsdk.core.ojm.hnj.2
                        @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hn
                        public void hnj(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    dklVar.setIsAutoPlay(this.ojm);
                    dklVar.hnj(this.f14063ta, "bannerGetVideoView");
                } catch (Throwable unused) {
                    dklVar = null;
                }
            } else {
                dklVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.as.sk(this.qor) && dklVar != null && dklVar.hnj(0L, true, false)) {
                return dklVar;
            }
        }
        return null;
    }

    public void hnj() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f14062sk;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.qor.qor qorVar = this.gjv;
        if (qorVar != null) {
            qorVar.hnj();
        } else {
            TTDelegateActivity.hnj(this.qor, (String) null);
        }
    }

    protected abstract void hnj(View view, int i10, com.bytedance.sdk.openadsdk.core.model.jip jipVar);

    public void setDislikeInner(nyv nyvVar) {
        if (nyvVar instanceof com.bytedance.sdk.openadsdk.qor.qor) {
            this.gjv = (com.bytedance.sdk.openadsdk.qor.qor) nyvVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        if (tTDislikeDialogAbstract != null && (asVar = this.qor) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(asVar.ldn(), this.qor.yl());
        }
        this.f14062sk = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    protected void hnj(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.f14061hn;
            com.bytedance.sdk.openadsdk.core.model.as asVar = this.qor;
            String str = this.dkl;
            hnVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(context, asVar, str, orp.hnj(str));
        } else {
            Context context2 = this.f14061hn;
            com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.qor;
            String str2 = this.dkl;
            hnVar = new com.bytedance.sdk.openadsdk.core.qor.hn(context2, asVar2, str2, orp.hnj(str2));
        }
        view.setOnTouchListener(hnVar);
        view.setOnClickListener(hnVar);
        hnVar.hnj(new hn() { // from class: com.bytedance.sdk.openadsdk.core.ojm.hnj.1
            @Override // com.bytedance.sdk.openadsdk.core.ojm.hn
            public void hnj(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.jip jipVar) {
                hnj.this.hnj(view2, i10, jipVar);
            }
        });
    }

    protected void hnj(View view) {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.qor;
        if (asVar == null || asVar.pwt() == null || view == null) {
            return;
        }
        hnj(view, this.qor.znr() == 1 && this.ojm);
    }
}
