package com.bytedance.sdk.openadsdk.qor;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.sdk.openadsdk.core.dkl.qor implements ta.gjv, ta.hn, ta.hnj, ta.qor {
    private View aq;
    private int bug;
    private TextView dkl;
    private com.bytedance.sdk.openadsdk.core.dkl.aq dnm;
    private dnm dse;
    private final ta gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14592hn;
    dkl hnj;
    private FilterWord mjg;
    private View ojm;
    private int orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.aq f14593sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.gjv f14594ta;

    public ojm(Context context, ta taVar) {
        this(context, taVar, null);
    }

    private boolean gjv() {
        if (this.bug == 0) {
            qor();
        }
        return this.bug < this.orl;
    }

    private com.bytedance.sdk.openadsdk.core.dkl.aq hn(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gjv() ? this.f14592hn : sq.hn(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.qor);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.qor);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i10 = this.qor;
        aqVar.setPadding(0, i10, 0, i10);
        aqVar.setGravity(17);
        aqVar.setBackground(stateListDrawable);
        aqVar.setTextColor(-1);
        aqVar.setTextSize(16.0f);
        aqVar.setText(wu.hnj(context, "tt_suggestion_commit"));
        aqVar.setEnabled(false);
        aqVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.ojm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ojm.this.gjv.gjv();
            }
        });
        aqVar.setLayoutParams(layoutParams);
        return aqVar;
    }

    private void qor() {
        if (this.bug > 0) {
            return;
        }
        this.bug = sq.qor(getContext());
        int iSk = sq.sk(getContext());
        this.orl = iSk;
        this.gjv.hnj(this.bug, iSk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.qor, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.bug == 0) {
                qor();
            }
            layoutParams.width = Math.min(this.bug, this.orl) - (sq.hn(getContext(), 16.0f) * 2);
        }
    }

    public ojm(Context context, ta taVar, List<FilterWord> list) {
        super(context);
        this.gjv = taVar;
        taVar.hnj((ta.qor) this);
        taVar.hnj((ta.hn) this);
        taVar.hnj((ta.gjv) this);
        taVar.hnj((ta.hnj) this);
        qor();
        hnj(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        hn(list);
    }

    private void hnj(Context context) {
        this.qor = sq.hn(context, 8.0f);
        this.f14592hn = sq.hn(context, 20.0f);
        int iHn = sq.hn(context, 56.0f);
        int iHn2 = sq.hn(context, 30.0f);
        int iHn3 = sq.hn(context, 12.0f);
        if (gjv()) {
            iHn3 = this.f14592hn;
        }
        if (!gjv()) {
            iHn = iHn2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, sq.hn(getContext(), 98.0f));
        view.setBackground(wu.qor(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.qor);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        int iHn4 = sq.hn(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iHn4, iHn4);
        layoutParams3.setMargins(0, iHn3, iHn3, 0);
        layoutParams3.gravity = 8388661;
        gjvVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_titlebar_close_seletor"));
        addView(gjvVar, layoutParams3);
        gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.ojm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ojm.this.gjv.sk();
            }
        });
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        this.f14594ta = gjvVar2;
        gjvVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.ojm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ojm.this.hn();
            }
        });
        this.f14594ta.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iHn4, iHn4);
        layoutParams4.setMargins(iHn3, iHn3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableHnj = com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_leftbackicon_selector");
        drawableHnj.setAutoMirrored(true);
        this.f14594ta.setImageDrawable(drawableHnj);
        addView(this.f14594ta, layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iHn3, iHn, iHn3, iHn3);
        skVar.setOrientation(1);
        addView(skVar, layoutParams5);
        View viewQor = qor(context);
        this.aq = viewQor;
        skVar.addView(viewQor);
        View viewGjv = gjv(context);
        this.ojm = viewGjv;
        skVar.addView(viewGjv);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVarHn = hn(context);
        this.f14593sk = aqVarHn;
        skVar.addView(aqVarHn);
    }

    private View gjv(Context context) {
        int iHn;
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(1);
        if (!gjv()) {
            iHn = sq.hn(context, 200.0f);
        } else {
            iHn = sq.hn(context, 358.0f);
        }
        skVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iHn));
        TextView textView = new TextView(context);
        textView.setText(wu.hnj(context, "tt_select_reason"));
        textView.setTextSize(gjv() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = sq.hn(context, gjv() ? 24.0f : 4.0f);
        skVar.addView(textView, layoutParams);
        dkl dklVar = new dkl(context, this.gjv);
        this.hnj = dklVar;
        skVar.addView(dklVar);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dnm = aqVar;
        aqVar.setId(jip.tab);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gjv() ? this.f14592hn : sq.hn(context, 6.0f);
        layoutParams2.gravity = 17;
        this.dnm.setLayoutParams(layoutParams2);
        this.dnm.setFocusable(false);
        this.dnm.setHint(wu.hnj(context, "tt_add_bad_reason"));
        this.dnm.setHintTextColor(Color.parseColor("#57000000"));
        this.dnm.setTextColor(Color.rgb(22, 24, 35));
        this.dnm.setTextSize(15.0f);
        this.dnm.setGravity(8388615);
        this.dnm.setVisibility(0);
        this.dnm.setPadding(0, sq.hn(context, 15.0f), 0, sq.hn(context, 14.0f));
        this.dnm.setEllipsize(TextUtils.TruncateAt.END);
        this.dnm.setSingleLine();
        this.dnm.setMaxLines(1);
        this.dnm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.ojm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ojm.this.gjv.dkl();
            }
        });
        skVar.addView(this.dnm, layoutParams2);
        skVar.addView(new dnm(context, Color.argb(128, 0, 0, 0)));
        skVar.setVisibility(8);
        return skVar;
    }

    private View qor(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        skVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(wu.hnj(context, "tt_like_this_ad"));
        textView.setTextSize(gjv() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        skVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(wu.hnj(context, "tt_feel_hint"));
        textView2.setTextSize(gjv() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (gjv()) {
            layoutParams2.topMargin = sq.hn(context, 4.0f);
        }
        skVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iHn = sq.hn(context, 16.0f);
        int iHn2 = sq.hn(context, 12.0f);
        int iHn3 = sq.hn(context, 8.0f);
        if (gjv()) {
            layoutParams3.topMargin = iHn;
            layoutParams3.bottomMargin = iHn;
        } else {
            layoutParams3.topMargin = iHn2;
            layoutParams3.bottomMargin = iHn3;
        }
        skVar.addView(skVar2, layoutParams3);
        skVar2.addView(new sk(context, 1, this.gjv));
        sk skVar3 = new sk(context, 2, this.gjv);
        ViewGroup.LayoutParams layoutParams4 = skVar3.getLayoutParams();
        boolean z10 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z10) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iHn;
        layoutParams7.rightMargin = iHn;
        skVar2.addView(skVar3, layoutParams5);
        skVar2.addView(new sk(context, 3, this.gjv));
        dnm dnmVar = new dnm(context);
        this.dse = dnmVar;
        skVar.addView(dnmVar);
        this.dkl = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!gjv()) {
            iHn = iHn3;
        }
        layoutParams8.topMargin = iHn;
        this.dkl.setTextColor(-16777216);
        this.dkl.setPadding(iHn2, iHn3, iHn2, iHn3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iHn3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.dkl.setBackground(gradientDrawable);
        this.dkl.setText(wu.hnj(context, "tt_report_this_ad"));
        this.dkl.setTextSize(gjv() ? 14 : 12);
        Drawable drawableQor = wu.qor(context, "tt_report_ad_arrow");
        drawableQor.setBounds(0, 0, iHn2, iHn2);
        this.dkl.setCompoundDrawables(null, null, drawableQor, null);
        this.dkl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.ojm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ojm.this.hnj();
            }
        });
        skVar.addView(this.dkl, layoutParams8);
        return skVar;
    }

    private void hn(List<FilterWord> list) {
        this.hnj.hnj(list);
    }

    public void hn() {
        View view = this.ojm;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.aq;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = this.f14594ta;
        if (gjvVar != null) {
            gjvVar.setVisibility(8);
        }
        ta taVar = this.gjv;
        if (taVar != null) {
            FilterWord filterWord = this.mjg;
            if (filterWord != null) {
                taVar.hnj(filterWord);
            } else {
                taVar.hnj(ta.hnj);
            }
            this.gjv.qor(null);
        }
    }

    public void hnj() {
        View view = this.ojm;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.aq;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = this.f14594ta;
        if (gjvVar != null) {
            gjvVar.setVisibility(0);
        }
        ta taVar = this.gjv;
        if (taVar == null || !taVar.qor()) {
            return;
        }
        this.mjg = this.gjv.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.qor
    public void hnj(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f14593sk != null && TextUtils.isEmpty(this.gjv.dse())) {
            this.f14593sk.setEnabled(!ta.hnj.equals(filterWord));
        }
        if (sk.hnj.equals(filterWord) || sk.f14597hn.equals(filterWord)) {
            this.dkl.setVisibility(8);
            this.dse.setVisibility(8);
        }
        if (sk.qor.equals(filterWord) || ta.hnj.equals(filterWord)) {
            this.dkl.setVisibility(0);
            this.dse.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.hn
    public void hnj(int i10) {
        if (ta.qor == i10) {
            this.mjg = null;
            hn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.gjv
    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar;
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = this.dnm;
        if (aqVar2 != null) {
            aqVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            ta taVar = this.gjv;
            if (taVar == null || (aqVar = this.f14593sk) == null) {
                return;
            }
            aqVar.setEnabled(taVar.qor());
            return;
        }
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = this.f14593sk;
        if (aqVar3 != null) {
            aqVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.hnj
    public void hnj(List<FilterWord> list) {
        hn(list);
    }
}
