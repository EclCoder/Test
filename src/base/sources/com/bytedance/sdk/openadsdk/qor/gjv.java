package com.bytedance.sdk.openadsdk.qor;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends TTDislikeDialogAbstract {
    private hnj gjv;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hn();

        void hnj();

        void hnj(int i10, FilterWord filterWord);
    }

    public gjv(Context context, String str, List<FilterWord> list) {
        super(context, wu.dkl(context, "tt_dislikeDialog"));
        this.hnj = str;
        this.f13030hn = list;
    }

    private void hn() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.qor.gjv.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (gjv.this.gjv != null) {
                    hnj unused = gjv.this.gjv;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.qor.gjv.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (gjv.this.gjv != null) {
                    gjv.this.gjv.hn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(sq.qor(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new ojm(getContext(), this.qor, this.f13030hn);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            hnj();
            hn();
            setMaterialMeta(this.hnj, this.f13030hn);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void hnj(hnj hnjVar) {
        this.gjv = hnjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.hn
    public void hnj(int i10) {
        FilterWord filterWordHn;
        if (ta.qor == i10) {
            dismiss();
            return;
        }
        if (ta.f14600sk == i10) {
            hnj hnjVar = this.gjv;
            if (hnjVar != null) {
                hnjVar.hnj();
                return;
            }
            return;
        }
        if (ta.f14599hn != i10 || (filterWordHn = this.qor.hn()) == null || ta.hnj.equals(filterWordHn)) {
            return;
        }
        hnj hnjVar2 = this.gjv;
        if (hnjVar2 != null) {
            try {
                hnjVar2.hnj(0, filterWordHn);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void hnj() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
