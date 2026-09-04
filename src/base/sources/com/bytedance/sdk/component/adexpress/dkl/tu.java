package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Cdo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tu extends LinearLayout {
    private com.bytedance.adsdk.hn.dkl dkl;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.ta dse;
    private hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Cdo f12506hn;
    private TextView hnj;
    private TextView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private LinearLayout f12507sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
    }

    public tu(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar) {
        super(context);
        this.dse = taVar;
        hnj(context, view);
    }

    public TextView getTopTextView() {
        return this.hnj;
    }

    public LinearLayout getWriggleLayout() {
        return this.f12507sk;
    }

    public View getWriggleProgressIv() {
        return this.dkl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f12506hn == null) {
                this.f12506hn = new Cdo(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.dkl.tu.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar = this.dse;
            if (taVar != null) {
                taVar.qor();
                this.dse.sk();
                this.dse.dkl();
                this.dse.aq();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.hn.dkl dklVar = this.dkl;
            if (dklVar != null) {
                dklVar.sk();
            }
        } catch (Exception unused) {
        }
    }

    public void setOnShakeViewListener(hnj hnjVar) {
        this.gjv = hnjVar;
    }

    public void setShakeText(String str) {
        this.qor.setText(str);
    }

    private void hnj(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.f12507sk = (LinearLayout) findViewById(2097610722);
        this.hnj = (TextView) findViewById(2097610719);
        this.qor = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.hn.dkl dklVar = (com.bytedance.adsdk.hn.dkl) findViewById(2097610706);
        this.dkl = dklVar;
        dklVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.dkl.setImageAssetsFolder("images/");
        this.dkl.hnj(true);
    }

    public void hnj() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dkl.tu.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    tu.this.dkl.hnj();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
