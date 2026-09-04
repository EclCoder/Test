package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.Cdo;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends Dialog {
    private final Context aq;
    private String bug;
    private com.bytedance.sdk.openadsdk.core.dkl.hnj dkl;
    private String dnm;
    private View dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f14265fc;
    private com.bytedance.sdk.openadsdk.core.dkl.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.gjv f14266hn;
    public InterfaceC0238hn hnj;
    private OnBackInvokedCallback mjg;
    private String ojm;
    private int orl;
    private com.bytedance.sdk.openadsdk.core.dkl.aq qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.hnj f14267sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14268ta;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0238hn {
        void hn();

        void hnj();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements OnBackInvokedCallback {
        private final WeakReference<hn> hnj;

        hnj(hn hnVar) {
            this.hnj = new WeakReference<>(hnVar);
        }

        public void onBackInvoked() {
            hn hnVar = this.hnj.get();
            if (hnVar != null) {
                com.bytedance.sdk.component.utils.apu.hnj("CustomCommonDialog", "onBackInvoked");
                hnVar.onBackPressed();
            }
        }
    }

    public hn(Context context) {
        super(context, wu.dkl(context, "tt_custom_dialog"));
        this.orl = -1;
        this.f14265fc = false;
        this.aq = context;
    }

    private void hn() {
        if (TextUtils.isEmpty(this.f14268ta)) {
            this.qor.setVisibility(8);
        } else {
            this.qor.setText(this.f14268ta);
            this.qor.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.ojm)) {
            this.gjv.setText(this.ojm);
        }
        if (TextUtils.isEmpty(this.dnm)) {
            this.dkl.setText(wu.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_postive_txt"));
        } else {
            this.dkl.setText(this.dnm);
        }
        if (TextUtils.isEmpty(this.bug)) {
            this.f14267sk.setText(wu.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_negtive_txt"));
        } else {
            this.f14267sk.setText(this.bug);
        }
        int i10 = this.orl;
        if (i10 != -1) {
            this.f14266hn.setImageResource(i10);
            this.f14266hn.setVisibility(0);
        } else {
            this.f14266hn.setVisibility(8);
        }
        if (this.f14265fc) {
            this.dse.setVisibility(8);
            this.f14267sk.setVisibility(8);
        } else {
            this.f14267sk.setVisibility(0);
            this.dse.setVisibility(0);
        }
    }

    private void hnj() {
        this.dkl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.hn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0238hn interfaceC0238hn = hn.this.hnj;
                if (interfaceC0238hn != null) {
                    interfaceC0238hn.hnj();
                }
            }
        });
        this.f14267sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.hn.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0238hn interfaceC0238hn = hn.this.hnj;
                if (interfaceC0238hn != null) {
                    interfaceC0238hn.hn();
                }
            }
        });
    }

    private void qor() {
        if (this.mjg == null || !Cdo.hnj()) {
            return;
        }
        com.bytedance.sdk.component.utils.apu.hnj("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.mjg);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        qor();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.apu.hnj("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(hnj(this.aq));
        if (Cdo.hnj()) {
            com.bytedance.sdk.component.utils.apu.hnj("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.mjg = new hnj(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.mjg);
        }
        setCanceledOnTouchOutside(false);
        hn();
        hnj();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        hn();
    }

    private View hnj(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        dseVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        skVar.setMinimumWidth(hnj(260.0f));
        skVar.setPadding(0, hnj(32.0f), 0, 0);
        skVar.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_custom_dialog_bg"));
        skVar.setOrientation(1);
        skVar.setLayoutParams(layoutParams);
        this.qor = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = hnj(16.0f);
        layoutParams2.rightMargin = hnj(16.0f);
        layoutParams2.bottomMargin = hnj(16.0f);
        this.qor.setGravity(17);
        this.qor.setVisibility(0);
        this.qor.setTextColor(Color.parseColor("#333333"));
        this.qor.setTextSize(18.0f);
        this.qor.setLayoutParams(layoutParams2);
        this.f14266hn = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = hnj(16.0f);
        layoutParams3.rightMargin = hnj(16.0f);
        layoutParams3.bottomMargin = hnj(10.0f);
        this.f14266hn.setMaxHeight(hnj(150.0f));
        this.f14266hn.setMaxWidth(hnj(150.0f));
        this.f14266hn.setVisibility(0);
        this.f14266hn.setLayoutParams(layoutParams3);
        this.gjv = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = hnj(20.0f);
        layoutParams4.rightMargin = hnj(20.0f);
        this.gjv.setGravity(17);
        this.gjv.setLineSpacing(hnj(3.0f), 1.2f);
        this.gjv.setTextSize(18.0f);
        this.gjv.setTextColor(Color.parseColor("#000000"));
        this.gjv.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = hnj(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        skVar2.setOrientation(0);
        skVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.dkl.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.dkl.hnj(context);
        this.f14267sk = hnjVar;
        hnjVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = hnj(10.0f);
        layoutParams7.weight = 1.0f;
        this.f14267sk.setPadding(0, hnj(16.0f), 0, hnj(16.0f));
        this.f14267sk.setBackground(null);
        this.f14267sk.setGravity(17);
        this.f14267sk.setSingleLine(true);
        this.f14267sk.setTextColor(Color.parseColor("#999999"));
        this.f14267sk.setTextSize(16.0f);
        this.f14267sk.setLayoutParams(layoutParams7);
        this.dse = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.dse.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.dse.setLayoutParams(layoutParams8);
        this.dkl = new com.bytedance.sdk.openadsdk.core.dkl.hnj(context);
        this.f14267sk.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = hnj(10.0f);
        layoutParams9.weight = 1.0f;
        this.dkl.setPadding(0, hnj(16.0f), 0, hnj(16.0f));
        this.dkl.setBackground(null);
        this.dkl.setGravity(17);
        this.dkl.setSingleLine(true);
        this.dkl.setTextColor(Color.parseColor("#38ADFF"));
        this.dkl.setTextSize(16.0f);
        this.dkl.setLayoutParams(layoutParams9);
        dseVar.addView(skVar);
        skVar.addView(this.qor);
        skVar.addView(this.f14266hn);
        skVar.addView(this.gjv);
        skVar.addView(view);
        skVar.addView(skVar2);
        skVar2.addView(this.f14267sk);
        skVar2.addView(this.dse);
        skVar2.addView(this.dkl);
        return dseVar;
    }

    public hn qor(String str) {
        this.bug = str;
        return this;
    }

    public hn hn(String str) {
        this.dnm = str;
        return this;
    }

    private int hnj(float f10) {
        return sq.hn(getContext(), f10);
    }

    public hn hnj(InterfaceC0238hn interfaceC0238hn) {
        this.hnj = interfaceC0238hn;
        return this;
    }

    public hn hnj(String str) {
        this.ojm = str;
        return this;
    }
}
