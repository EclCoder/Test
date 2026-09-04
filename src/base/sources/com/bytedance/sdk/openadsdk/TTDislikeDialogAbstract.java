package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.qor.ta;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements ta.hn {
    private View gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected List<FilterWord> f13030hn;
    protected String hnj;
    protected final ta qor;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        ta taVar = new ta();
        this.qor = taVar;
        taVar.hnj(this);
    }

    public void destroy() {
        ta taVar = this.qor;
        if (taVar != null) {
            taVar.hnj();
        }
    }

    public ta getDislikeManager() {
        return this.qor;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.gjv = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.gjv;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        ta taVar = this.qor;
        if (taVar != null) {
            taVar.qor(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.hnj = str;
        this.f13030hn = list;
        this.qor.hnj(str);
        this.qor.hnj(this.f13030hn);
    }

    public TTDislikeDialogAbstract(Context context, int i10) {
        super(context, i10);
        ta taVar = new ta();
        this.qor = taVar;
        taVar.hnj(this);
    }
}
