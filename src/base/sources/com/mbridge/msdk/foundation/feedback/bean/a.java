package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f30445c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f30447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30448f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f30452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Dialog f30453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONArray f30454l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f30459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<g> f30460r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f30463u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f30443a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30446d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f30449g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30450h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30455m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30456n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30457o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30458p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f30461s = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f30462t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f30464v = new C0394a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f30465w = A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f30466x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f30467y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f30468z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0394a implements com.mbridge.msdk.widget.dialog.b {
        C0394a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.mbridge.msdk.widget.dialog.b {
        c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f30452j != null) {
                a.this.f30452j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f30453k == null || !a.this.f30453k.isShowing()) {
                    return;
                }
                a.this.f30453k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f30460r = new ArrayList();
        this.f30451i = str;
        if (this.f30460r == null) {
            this.f30460r = new ArrayList();
        }
        d();
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 1, 4, B, this.f30446d);
        List<g> list = this.f30460r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 0, 4, B, this.f30446d);
        List<g> list = this.f30460r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 0, 4, B, this.f30446d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f30460r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    private void o() {
        if (TextUtils.isEmpty(this.f30462t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f30453k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f30453k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f30453k.setContentView(viewInflate);
                this.f30453k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        FeedBackButton feedBackButton = this.f30447e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f30447e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f30447e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30447e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f30452j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f30452j.setListener(null);
        }
        this.f30452j = null;
        this.f30460r = null;
        this.f30447e = null;
        this.f30464v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f30452j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f30452j.cancel();
    }

    public CampaignEx h() {
        return this.f30445c;
    }

    public FeedBackButton i() {
        if (this.f30447e == null) {
            e();
        }
        return this.f30447e;
    }

    public int j() {
        return this.f30459q;
    }

    public int k() {
        return this.f30463u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 0, 1, B, this.f30446d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f30452j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f30447e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, contextD, this.f30452j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = h.b().a();
                }
                com.mbridge.msdk.setting.b.C0444b c0444bA = gVarF.A();
                if (c0444bA == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f30452j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f30464v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0444bA);
                this.f30452j.setCancelText(c0444bA.d());
                this.f30452j.setConfirmText(c0444bA.a());
                this.f30452j.setPrivacyText(c0444bA.c());
                this.f30462t = c0444bA.e();
                this.f30452j.setTitle(c0444bA.f());
                this.f30452j.setContent(feedbackRadioGroupA);
                this.f30452j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0444bA);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f30464v == null) {
            this.f30464v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f30447e = feedBackButton;
                int i10 = 8;
                if (this.f30465w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f30447e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str) {
        this.f30446d = str;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f30475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f30476b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f30475a = aVar;
            this.f30476b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f30438f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f30475a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f30438f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f30475a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f30475a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f30475a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f30438f = true;
            this.f30475a.a();
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f30447e;
        if (feedBackButton != null) {
            int i10 = this.f30467y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f30468z;
            if (i11 > -1) {
                this.f30447e.setY(i11);
            }
            float f10 = this.f30443a;
            if (f10 >= 0.0f) {
                this.f30447e.setAlpha(f10);
                this.f30447e.setEnabled(this.f30443a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f30447e.getLayoutParams();
            int i12 = this.f30466x;
            if (i12 > 0) {
                this.f30447e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f30466x;
                }
            }
            int i13 = this.f30450h;
            if (i13 > 0) {
                this.f30447e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f30450h;
                }
            }
            if (layoutParams != null) {
                this.f30447e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f30448f)) {
                    this.f30447e.setTextColor(Color.parseColor(this.f30448f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f30449g;
            if (f11 > 0.0f) {
                this.f30447e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f30454l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f30447e.setPadding(v0.a(contextD, (float) this.f30454l.optDouble(0)), v0.a(contextD, (float) this.f30454l.optDouble(1)), v0.a(contextD, (float) this.f30454l.optDouble(2)), v0.a(contextD, (float) this.f30454l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f30461s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f30444b)) {
                gradientDrawable.setColor(Color.parseColor(this.f30444b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f30447e.setBackground(gradientDrawable);
        }
    }

    public void a(g gVar) {
        if (this.f30460r == null) {
            this.f30460r = new ArrayList();
        }
        this.f30460r.add(gVar);
    }

    public void d(int i10) {
        this.f30465w = i10;
        FeedBackButton feedBackButton = this.f30447e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f30445c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 0, 2, B, this.f30446d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f30451i, 0, 3, B, this.f30446d);
        }
        List<g> list = this.f30460r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f30445c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f30445c));
            }
        }
    }

    private FeedbackRadioGroup a(com.mbridge.msdk.setting.b.C0444b c0444b) {
        JSONArray jSONArrayB = c0444b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f30463u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, com.mbridge.msdk.setting.b.C0444b c0444b) {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = c0444b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", TtmlNode.ATTR_TTS_COLOR);
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f30459q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f30447e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f30443a);
            feedBackButton.setEnabled(this.f30443a != 0.0f);
            feedBackButton.setVisibility(this.f30465w != 8 ? 0 : 8);
            this.f30447e = feedBackButton;
            CampaignEx campaignEx = this.f30445c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f30467y = i10;
        }
        if (i11 > -1) {
            this.f30468z = i11;
        }
        if (i12 > -1) {
            this.f30466x = i12;
        }
        if (i13 > -1) {
            this.f30450h = i13;
        }
        if (f11 > -1.0f) {
            this.f30449g = f11;
        }
        if (jSONArray != null) {
            this.f30454l = jSONArray;
        }
        this.f30448f = str;
        this.f30444b = str2;
        this.f30443a = f10;
        this.f30461s = i14;
        b();
    }
}
