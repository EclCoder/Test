package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class xn extends Dialog {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final String[] f13321hn = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private ImageView dkl;
    private TextView gjv;
    private final Handler hnj;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Button f13322sk;

    public xn(Context context) {
        super(context, wu.dkl(context, "tt_privacy_dialog_theme_ad_report"));
        this.hnj = new Handler(Looper.getMainLooper());
        this.qor = "";
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(hnj(getContext()), new ViewGroup.LayoutParams(sq.qor(getContext()), (int) (((double) sq.sk(getContext())) * 0.9d)));
        hn();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.hnj.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.xn.3
                @Override // java.lang.Runnable
                public void run() {
                    xn.this.gjv.setText(xn.this.qor);
                }
            }, 1000L);
        } catch (Exception e10) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e10);
        }
    }

    private void hn() {
        final String strDkl = orp.dkl();
        final String strAq = orp.aq();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.f13322sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) xn.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strDkl, strAq, str, str2, xn.this.qor};
                    for (int i10 = 0; i10 < xn.f13321hn.length; i10++) {
                        sb2.append(xn.f13321hn[i10]);
                        sb2.append(": ");
                        sb2.append(strArr[i10]);
                        sb2.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.dkl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xn.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                xn.this.gjv.setText("loading ...");
                xn.this.cancel();
            }
        });
    }

    public void hnj(as asVar) {
        try {
            this.qor = com.bytedance.sdk.component.utils.hnj.hnj(asVar.alw()).toString();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTPrivacyAdReportDialog", th2.getMessage());
        }
    }

    private View hnj(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        skVar.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_ad_report_info_bg"));
        skVar.setOrientation(1);
        skVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        dseVar.setLayoutParams(new ViewGroup.LayoutParams(-1, hnj(44.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(hnj(191.0f), hnj(24.0f));
        layoutParams2.addRule(13);
        aqVar.setGravity(17);
        aqVar.setText("Ad Report");
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setTextSize(1, 17.0f);
        aqVar.setLayoutParams(layoutParams2);
        this.dkl = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(hnj(40.0f), hnj(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = hnj(8.0f);
        this.dkl.setPadding(hnj(12.0f), hnj(14.0f), hnj(12.0f), hnj(14.0f));
        this.dkl.setImageResource(wu.gjv(context, "tt_ad_xmark"));
        this.dkl.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, hnj(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = hnj(16.0f);
        layoutParams5.rightMargin = hnj(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(hnj(16.0f));
        layoutParams5.setMarginEnd(hnj(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        skVar2.setOrientation(1);
        skVar2.setLayoutParams(layoutParams6);
        String strDkl = orp.dkl();
        String strAq = orp.aq();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj = hnj(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj2 = hnj(context, "App", strDkl);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj3 = hnj(context, "App version", strAq);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj4 = hnj(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj5 = hnj(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj6 = hnj(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, hnj(76.0f));
        skVar3.setBackgroundColor(-1);
        skVar3.setLayoutParams(layoutParams7);
        this.f13322sk = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iHnj = hnj(16.0f);
        layoutParams8.setMargins(iHnj, iHnj, iHnj, iHnj);
        this.f13322sk.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_ad_report_info_button_bg"));
        this.f13322sk.setText(mTFeqtajA.eTyQckJNjIWHQeJ);
        this.f13322sk.setTextColor(Color.parseColor("#333333"));
        this.f13322sk.setTextSize(14.0f);
        this.f13322sk.setLayoutParams(layoutParams8);
        skVar.addView(dseVar);
        dseVar.addView(aqVar);
        dseVar.addView(this.dkl);
        skVar.addView(view);
        skVar.addView(scrollView);
        scrollView.addView(skVar2);
        skVar2.addView(skVarHnj);
        skVar2.addView(skVarHnj2);
        skVar2.addView(skVarHnj3);
        skVar2.addView(skVarHnj4);
        skVar2.addView(skVarHnj5);
        skVar2.addView(skVarHnj6);
        skVar.addView(skVar3);
        skVar3.addView(this.f13322sk);
        return skVar;
    }

    private com.bytedance.sdk.openadsdk.core.dkl.sk hnj(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : hnj(74.0f));
        skVar.setOrientation(1);
        skVar.setPadding(0, hnj(16.0f), 0, hnj(16.0f));
        skVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = hnj(7.0f);
        aqVar.setIncludeFontPadding(false);
        aqVar.setText(str);
        aqVar.setTextColor(Color.parseColor("#333333"));
        aqVar.setTextSize(16.0f);
        aqVar.setTypeface(Typeface.defaultFromStyle(1));
        aqVar.setLayoutParams(layoutParams2);
        skVar.addView(aqVar);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        if (str.equals("Creative info")) {
            this.gjv = aqVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        aqVar2.setIncludeFontPadding(false);
        aqVar2.setTextColor(Color.parseColor("#666666"));
        aqVar2.setText(str2);
        aqVar2.setTextSize(14.0f);
        aqVar2.setLayoutParams(layoutParams3);
        skVar.addView(aqVar2);
        return skVar;
    }

    private int hnj(float f10) {
        return sq.hn(getContext(), f10);
    }
}
