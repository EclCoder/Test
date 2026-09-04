package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private LinearLayout f13273hn;
    private Context hnj;
    private hnj qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void gjv();

        void hn();

        void hnj();

        void qor();
    }

    public apu(Context context, boolean z10) {
        super(context);
        this.hnj = context;
        this.gjv = z10;
        hn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dkl(View view) {
        hnj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gjv(View view) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }

    private void hn() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f13272a.hnj(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.hnj);
        this.f13273hn = linearLayout;
        linearLayout.setOrientation(1);
        this.f13273hn.setGravity(80);
        this.f13273hn.setPadding(hnj(16.0f), 0, hnj(16.0f), hnj(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(hnj(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.f13273hn.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = hnj(16.0f);
        this.f13273hn.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.hnj);
        qorVar.setPadding(hnj(6.0f), 0, hnj(6.0f), 0);
        qorVar.setLayoutParams(new LinearLayout.LayoutParams(-1, hnj(44.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this.hnj);
        Context context = this.hnj;
        aqVar.setText(context.getString(wu.hn(context, "tt_more_title")));
        aqVar.setTextColor(Color.parseColor("#000000"));
        aqVar.setTextSize(2, 17.0f);
        aqVar.setGravity(17);
        aqVar.setTypeface(Typeface.defaultFromStyle(1));
        qorVar.addView(aqVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.hnj);
        imageView.setImageResource(wu.gjv(this.hnj, "tt_titlebar_close_drawable"));
        imageView.setPadding(hnj(10.0f), hnj(10.0f), hnj(10.0f), hnj(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13274a.dkl(view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(hnj(44.0f), hnj(44.0f));
        layoutParams2.gravity = 8388629;
        qorVar.addView(imageView, layoutParams2);
        this.f13273hn.addView(qorVar);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj = hnj(8);
        Context context2 = this.hnj;
        hnj(skVarHnj, context2.getString(wu.hn(context2, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13277a.sk(view);
            }
        });
        Context context3 = this.hnj;
        hnj(skVarHnj, context3.getString(wu.hn(context3, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13278a.gjv(view);
            }
        });
        Context context4 = this.hnj;
        hnj(skVarHnj, context4.getString(wu.hn(context4, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13281a.qor(view);
            }
        });
        this.f13273hn.addView(skVarHnj);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj2 = hnj(8);
        Context context5 = this.hnj;
        hnj(skVarHnj2, context5.getString(wu.hn(context5, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13291a.hn(view);
            }
        });
        this.f13273hn.addView(skVarHnj2);
        addView(this.f13273hn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean hnj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.f13273hn.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                hnj();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qor(View view) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.qor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sk(View view) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj();
        }
    }

    public void setOnMenuItemClickListener(hnj hnjVar) {
        this.qor = hnjVar;
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.dkl.sk skVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(this.hnj);
        skVar2.setOrientation(0);
        skVar2.setGravity(16);
        skVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.hnj);
        imageView.setImageResource(wu.gjv(this.hnj, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(hnj(20.0f), hnj(20.0f));
        layoutParams.setMargins(hnj(16.0f), hnj(0.0f), hnj(16.0f), hnj(0.0f));
        skVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this.hnj);
        aqVar.setText(str);
        aqVar.setTextColor(Color.parseColor("#000000"));
        aqVar.setTextSize(2, 16.0f);
        aqVar.setGravity(8388627);
        aqVar.setTypeface(Typeface.defaultFromStyle(0));
        skVar2.addView(aqVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, hnj(52.0f));
        if (skVar.getChildCount() > 0) {
            View view = new View(this.hnj);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            skVar.addView(view, new LinearLayout.LayoutParams(-1, hnj(1.0f)));
        }
        skVar.addView(skVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.dkl.sk hnj(int i10) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this.hnj);
        skVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(hnj(i10));
        gradientDrawable.setColor(-1);
        skVar.setBackgroundDrawable(gradientDrawable);
        skVar.setPadding(hnj(8.0f), hnj(8.0f), hnj(8.0f), hnj(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = hnj(8.0f);
        skVar.setLayoutParams(layoutParams);
        return skVar;
    }

    public void hnj(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hn(View view) {
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.gjv();
        }
    }

    public void hnj() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private int hnj(float f10) {
        return sq.hn(this.hnj, f10);
    }
}
