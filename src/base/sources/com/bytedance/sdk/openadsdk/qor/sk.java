package com.bytedance.sdk.openadsdk.qor;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.sdk.openadsdk.core.dkl.sk implements View.OnClickListener, ta.qor {
    private StateListDrawable dkl;
    private final int dse;
    private final ta gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private FilterWord f14598sk;
    public static FilterWord hnj = new FilterWord("100:1", "GOOD");

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static FilterWord f14597hn = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord qor = new FilterWord("100:3", "BAD");

    public sk(Context context, int i10, ta taVar) {
        super(context);
        this.dse = i10;
        this.gjv = taVar;
        if (taVar != null) {
            taVar.hnj(this);
        }
        hnj(i10);
        hnj();
        hn();
    }

    private void hn() {
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(getContext());
        aqVar.setTextSize(this.gjv.ojm() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, sq.hn(getContext(), 12.0f), 0, sq.hn(getContext(), this.gjv.ojm() ? 8.0f : 4.0f));
        addView(aqVar, layoutParams);
        hnj hnjVar = new hnj(getContext());
        hnjVar.setTextSize(this.gjv.ojm() ? 17 : 12);
        hnjVar.setTextColor(-16777216);
        hnjVar.setMaxLines(1);
        hnjVar.setSingleLine();
        hnjVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, sq.hn(getContext(), 12.0f));
        addView(hnjVar, layoutParams2);
        int i10 = this.dse;
        if (i10 == 1) {
            aqVar.setText("😍");
            hnjVar.setText(wu.hnj(getContext(), "tt_good"));
        } else if (i10 == 2) {
            hnjVar.setText(wu.hnj(getContext(), "tt_not_bad"));
            aqVar.setText("😐");
        } else {
            if (i10 != 3) {
                return;
            }
            hnjVar.setText(wu.hnj(getContext(), "tt_bad"));
            aqVar.setText("😡");
        }
    }

    private void hnj(int i10) {
        if (i10 == 1) {
            this.f14598sk = hnj;
        } else if (i10 == 2) {
            this.f14598sk = f14597hn;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f14598sk = qor;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.gjv.hnj(ta.hnj);
        } else {
            this.gjv.hnj(this.f14598sk);
        }
    }

    private void hnj() {
        if (this.dkl == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(sq.hn(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(sq.hn(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(sq.hn(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.dkl = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.dkl.addState(new int[0], gradientDrawable);
        }
        setBackground(this.dkl);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.qor
    public void hnj(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.f14598sk) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
