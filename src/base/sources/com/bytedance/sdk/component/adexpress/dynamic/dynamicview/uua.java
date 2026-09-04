package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends dkl {
    private TextView apu;
    private LinearLayout as;
    private TextView eum;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private TextView f12555hn;
    private TextView hnj;
    private TextView wu;

    public uua(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.hnj = new TextView(this.dnm);
        this.f12555hn = new TextView(this.dnm);
        this.apu = new TextView(this.dnm);
        this.as = new LinearLayout(this.dnm);
        this.eum = new TextView(this.dnm);
        this.wu = new TextView(this.dnm);
        this.hnj.setTag(9);
        this.f12555hn.setTag(10);
        this.apu.setTag(12);
        this.as.addView(this.apu);
        this.as.addView(this.wu);
        this.as.addView(this.f12555hn);
        this.as.addView(this.eum);
        this.as.addView(this.hnj);
        addView(this.as, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.dse, this.aq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    protected boolean gjv() {
        this.hnj.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.hnj.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f12555hn.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f12555hn.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.apu.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.apu.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        this.apu.setText("Function");
        this.f12555hn.setText("Permission list");
        this.eum.setText(" | ");
        this.wu.setText(" | ");
        this.hnj.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar = this.bug;
        if (dseVar != null) {
            this.apu.setTextColor(dseVar.dse());
            this.apu.setTextSize(this.bug.sk());
            this.f12555hn.setTextColor(this.bug.dse());
            this.f12555hn.setTextSize(this.bug.sk());
            this.eum.setTextColor(this.bug.dse());
            this.wu.setTextColor(this.bug.dse());
            this.hnj.setTextColor(this.bug.dse());
            this.hnj.setTextSize(this.bug.sk());
            return false;
        }
        this.apu.setTextColor(-1);
        this.apu.setTextSize(12.0f);
        this.f12555hn.setTextColor(-1);
        this.f12555hn.setTextSize(12.0f);
        this.eum.setTextColor(-1);
        this.wu.setTextColor(-1);
        this.hnj.setTextColor(-1);
        this.hnj.setTextSize(12.0f);
        return false;
    }
}
