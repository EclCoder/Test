package com.bytedance.sdk.openadsdk.qor;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class bug extends Dialog {
    private com.bytedance.sdk.openadsdk.core.dkl.gjv dkl;
    private final ta dse;
    private com.bytedance.sdk.openadsdk.core.dkl.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f14586hn;
    private com.bytedance.sdk.openadsdk.core.dkl.sk hnj;
    private com.bytedance.sdk.openadsdk.core.dkl.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.aq f14587sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface hnj {
        void hn();

        void hnj();

        void hnj(int i10, FilterWord filterWord, String str);

        void qor();
    }

    public bug(Context context, ta taVar) {
        super(context, wu.dkl(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.dse = taVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        hn();
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVarHnj = hnj(oj.hnj());
        this.hnj = skVarHnj;
        setContentView(skVarHnj);
        hnj(this.hnj);
        qor();
        hnj();
        gjv();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        hnj hnjVar = this.f14586hn;
        if (hnjVar != null) {
            hnjVar.hnj();
        }
    }

    private void gjv() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.qor.bug.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (bug.this.f14586hn != null) {
                    bug.this.f14586hn.qor();
                }
            }
        });
    }

    private void hnj(View view) {
        hnj((EditText) this.qor);
        ta taVar = this.dse;
        if (taVar != null) {
            String strDse = taVar.dse();
            if (!TextUtils.isEmpty(strDse)) {
                this.qor.setText(strDse);
                this.gjv.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strDse.length()), "/200"));
            }
            this.f14587sk.setEnabled(!TextUtils.isEmpty(strDse));
        }
        this.f14587sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.bug.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = bug.this.qor.getText().toString();
                if (bug.this.f14586hn != null) {
                    bug.this.f14586hn.hnj(4, ta.hnj, string);
                }
                bug.this.dismiss();
            }
        });
        this.dkl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qor.bug.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (bug.this.f14586hn != null) {
                    bug.this.f14586hn.hn();
                }
                bug.this.dismiss();
            }
        });
        this.qor.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.qor.bug.3
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.dkl.aq aqVar;
                int iRound = Math.round(charSequence.length());
                bug.this.gjv.setText(iRound + "/200");
                boolean z10 = true;
                if (iRound <= 0) {
                    aqVar = bug.this.f14587sk;
                    if (bug.this.dse == null || TextUtils.isEmpty(bug.this.dse.dse())) {
                        z10 = false;
                    }
                } else if (bug.this.f14587sk.isEnabled()) {
                    return;
                } else {
                    aqVar = bug.this.f14587sk;
                }
                aqVar.setEnabled(z10);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
    }

    private void qor() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    public void hn() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.dkl.hn hnVar = this.qor;
        if (hnVar == null || (inputMethodManager = (InputMethodManager) hnVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.hnj.getWindowToken(), 0);
    }

    public static void hnj(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.qor.bug.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void hnj(hnj hnjVar) {
        this.f14586hn = hnjVar;
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.core.dkl.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void hnj(as asVar) {
        ta taVar = this.dse;
        if (taVar != null) {
            taVar.hnj(asVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.dkl.sk hnj(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        skVar.setOrientation(1);
        skVar.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        dseVar.setLayoutParams(new LinearLayout.LayoutParams(-1, sq.hn(context, 48.0f)));
        this.dkl = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        int iHn = sq.hn(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iHn, iHn);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iHn2 = sq.hn(context, 10.0f);
        layoutParams.topMargin = iHn2;
        layoutParams.rightMargin = iHn2;
        this.dkl.setLayoutParams(layoutParams);
        this.dkl.setClickable(true);
        this.dkl.setFocusable(true);
        this.dkl.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = sq.hn(context, 12.0f);
        aqVar.setLayoutParams(layoutParams2);
        aqVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        aqVar.setGravity(17);
        aqVar.setSingleLine(true);
        aqVar.setText(wu.hnj(context, "tt_other_reason"));
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setTextSize(15.0f);
        aqVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, sq.hn(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        skVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.dkl.hn hnVar = new com.bytedance.sdk.openadsdk.core.dkl.hn(context);
        this.qor = hnVar;
        hnVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = sq.hn(context, 16.0f);
        layoutParams3.rightMargin = sq.hn(context, 16.0f);
        layoutParams3.topMargin = sq.hn(context, 11.5f);
        this.qor.setLayoutParams(layoutParams3);
        this.qor.setLines(4);
        this.qor.setGravity(48);
        this.qor.setTextSize(15.0f);
        this.qor.setTextColor(Color.rgb(22, 24, 35));
        this.qor.setHintTextColor(Color.parseColor("#57161823"));
        this.qor.setBackground(null);
        this.qor.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iHn3 = sq.hn(context, 16.0f);
        int iHn4 = sq.hn(context, 17.0f);
        skVar3.setPadding(iHn3, iHn4, iHn3, iHn4);
        skVar3.setLayoutParams(layoutParams4);
        skVar3.setOrientation(0);
        this.gjv = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.gjv.setLayoutParams(layoutParams5);
        this.gjv.setText(String.format("0%s", "/200"));
        this.gjv.setGravity(8388611);
        this.gjv.setTextColor(Color.parseColor("#57161823"));
        this.gjv.setTextSize(15.0f);
        this.f14587sk = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.f14587sk.setLayoutParams(layoutParams6);
        this.f14587sk.setTextSize(14.0f);
        this.f14587sk.setTextColor(-1);
        this.f14587sk.setVisibility(0);
        this.f14587sk.setSingleLine(true);
        int iHn5 = sq.hn(context, 27.0f);
        int iHn6 = sq.hn(context, 5.0f);
        this.f14587sk.setPadding(iHn5, iHn6, iHn5, iHn6);
        int iHn7 = sq.hn(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iHn7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.f14587sk.setBackground(stateListDrawable);
        this.f14587sk.setText(wu.hnj(context, dOIDCKnIR.VnTelEGqfnn));
        this.f14587sk.setEnabled(false);
        skVar.addView(dseVar);
        skVar.addView(view);
        skVar.addView(skVar2);
        dseVar.addView(this.dkl);
        dseVar.addView(aqVar);
        skVar2.addView(this.qor);
        skVar2.addView(skVar3);
        skVar3.addView(this.gjv);
        skVar3.addView(this.f14587sk);
        return skVar;
    }
}
