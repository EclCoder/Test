package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBAlertDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Button f35244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f35245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f35246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f35247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f35248e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f35249a;

        a(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f35249a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f35249a;
            if (bVar != null) {
                bVar.b();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f35251a;

        b(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f35251a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f35251a;
            if (bVar != null) {
                bVar.a();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    public MBAlertDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(i0.a(context, "mbridge_cm_alertview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.f35247d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f35248e = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                q0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f35246c = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f35245b = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f35244a = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e11) {
                q0.a("MBAlertDialog", e11.getMessage());
            }
        }
        Button button = this.f35244a;
        if (button != null) {
            button.setOnClickListener(new a(bVar));
        }
        Button button2 = this.f35245b;
        if (button2 != null) {
            button2.setOnClickListener(new b(bVar));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void a(int i10) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "Confirm" : "Tips");
            setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
            setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "Close" : "Cancel");
            setCancelText("Continue");
            return;
        }
        setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭？" : "提示");
        setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
        setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭" : "取消");
        setCancelText("继续");
    }

    private void b() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续观看");
    }

    public void clear() {
        if (this.f35247d != null) {
            this.f35247d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f35247d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(4098);
            f1.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void makeDownloadAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.a(this, str);
    }

    public void makeIVAlertView(int i10, String str) {
        try {
            String string = y0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = y0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = y0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = y0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                a(i10);
            } else {
                a(string, string2, string3, string4);
            }
        } catch (Exception e10) {
            q0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void makeInsAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.b(this, str);
    }

    public void makePlayableAlertView() {
        g gVarF = h.b().f(c.n().b());
        if (gVarF != null) {
            a(gVarF.t(), gVarF.r(), gVarF.s(), gVarF.p());
        } else {
            a();
        }
    }

    public void makeRVAlertView(String str) {
        try {
            String string = y0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = y0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = y0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = y0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarF = h.b().f(c.n().b());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (gVarF != null) {
                    a(gVarF.t(), gVarF.r(), gVarF.s(), gVarF.q());
                    return;
                } else {
                    b();
                    return;
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (gVarF != null) {
                    string = gVarF.t();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (gVarF != null) {
                    string2 = gVarF.r();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (gVarF != null) {
                    string4 = gVarF.s();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (gVarF != null) {
                    string3 = gVarF.q();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            a(string, string2, string4, string3);
        } catch (Exception e10) {
            q0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f35244a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f35245b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f35246c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f35248e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e10) {
            q0.b("MBAlertDialog", e10.getMessage());
            super.show();
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    private void a() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }
}
