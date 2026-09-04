package com.hecorat.screenrecorder.free.activities.permission;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.c;
import androidx.appcompat.app.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.permission.AskPermissionActivity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AskPermissionActivity extends d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f22858v = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22860d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f22863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f22864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f22865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f22866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Intent f22867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Intent f22868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f22871o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    FirebaseAnalytics f22874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    lg.a f22875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f22876t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22861e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22862f = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22872p = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22877u = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("reason");
                wp.a.a("reason: %s", stringExtra);
                if ("homekey".equals(stringExtra) || ("recentapps".equals(stringExtra) && !AskPermissionActivity.this.f22877u)) {
                    if ("recentapps".equals(stringExtra)) {
                        AskPermissionActivity.this.f22877u = true;
                    }
                    if (AskPermissionActivity.this.Q0()) {
                        AskPermissionActivity.this.finish();
                        return;
                    }
                    lg.c.g(AskPermissionActivity.this.f22873q);
                    Intent intent2 = new Intent(AskPermissionActivity.this, (Class<?>) AskPermissionActivity.class);
                    intent2.setFlags(335544320);
                    intent2.setAction("finish");
                    AskPermissionActivity.this.startActivity(intent2);
                    if (Objects.equals(AskPermissionActivity.this.f22865i, "android.permission.RECORD_AUDIO") || Objects.equals(AskPermissionActivity.this.f22865i, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                        ef.a.o(false);
                        l0.A(AskPermissionActivity.this, "press_home_while_requesting_permission");
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A0(AskPermissionActivity askPermissionActivity, DialogInterface dialogInterface) {
        askPermissionActivity.f22861e = false;
        askPermissionActivity.N0();
    }

    public static /* synthetic */ void B0(AskPermissionActivity askPermissionActivity, DialogInterface dialogInterface, int i10) {
        askPermissionActivity.f22861e = true;
        askPermissionActivity.N0();
    }

    private void C0() {
        if (Q0()) {
            I0(this.f22865i);
            finish();
            return;
        }
        lg.c.a aVar = lg.c.f44503a;
        if (aVar != null) {
            aVar.a(true);
        }
        I0(this.f22865i);
        finish();
    }

    private void I0(String str) {
        str.getClass();
        if (str.equals("android.settings.action.MANAGE_OVERLAY_PERMISSION")) {
            l0.A(this, "grant_overlay_permission");
        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            l0.A(this, "grant_permission_storage");
        }
    }

    private void J0() {
        if (this.f22860d) {
            C0();
        } else {
            N0();
        }
    }

    private void K0() {
        if (Q0()) {
            finish();
            return;
        }
        lg.c.a aVar = lg.c.f44503a;
        if (aVar != null) {
            aVar.a(false);
        }
        finish();
    }

    private void L0() {
        int i10 = this.f22869m;
        if (i10 == 0) {
            androidx.core.app.b.f(this, new String[]{this.f22865i}, this.f22870n);
            return;
        }
        if (i10 == 1) {
            R0(this.f22863g);
            return;
        }
        if (i10 == 2) {
            androidx.core.app.b.f(this, new String[]{this.f22865i}, this.f22870n);
            return;
        }
        if (i10 == 3) {
            R0(this.f22864h);
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return;
            }
            startActivityForResult(this.f22868l, 6);
            return;
        }
        try {
            startActivityForResult(this.f22867k, this.f22870n);
        } catch (ActivityNotFoundException e10) {
            try {
                startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + getPackageName())), this.f22870n);
            } catch (ActivityNotFoundException unused) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                j0.b(this, R.string.device_not_support_permission);
                C0();
            }
        }
    }

    private int M0(String str) {
        str.getClass();
        switch (str) {
            case "android.permission.CAMERA":
                return R.string.pref_never_show_camera_permission_dialog;
            case "android.permission.GET_ACCOUNTS":
                return R.string.pref_never_show_account_permission_dialog;
            case "android.permission.WRITE_EXTERNAL_STORAGE":
                return R.string.pref_never_show_storage_permission_dialog;
            case "android.permission.RECORD_AUDIO":
                return R.string.pref_never_show_microphone_permission_dialog;
            default:
                return 0;
        }
    }

    private void N0() {
        int i10 = this.f22869m;
        if (i10 == 0) {
            if (this.f22859c) {
                K0();
                return;
            } else {
                this.f22869m = 1;
                L0();
                return;
            }
        }
        if (i10 == 1) {
            if (this.f22861e) {
                this.f22869m = 2;
                L0();
                return;
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("permission_granting", "cancel_in_explained_dialog_1");
                this.f22874r.a(this.f22866j, bundle);
                K0();
                return;
            }
        }
        if (i10 == 2) {
            K0();
            return;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                K0();
                return;
            } else {
                if (i10 != 5) {
                    return;
                }
                this.f22869m = 4;
                L0();
                return;
            }
        }
        if (this.f22861e) {
            this.f22869m = 4;
            L0();
        } else if (this.f22862f) {
            this.f22869m = 5;
            L0();
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("permission_granting", "cancel_in_explained_dialog_2");
            this.f22874r.a(this.f22866j, bundle2);
            K0();
        }
    }

    public static boolean O0() {
        return f22858v.get() > 0;
    }

    private void P0() {
        String str = this.f22865i;
        str.getClass();
        switch (str) {
            case "android.permission.CAMERA":
                this.f22870n = 3;
                this.f22863g = getString(R.string.explain_permission_camera);
                this.f22864h = getString(R.string.explain_permission_camera_edited);
                this.f22866j = "ask_camera_permission";
                break;
            case "android.settings.action.MANAGE_OVERLAY_PERMISSION":
                this.f22870n = 5;
                this.f22864h = getString(R.string.az_request_popup_permission);
                this.f22866j = "ask_overlay_permission";
                break;
            case "android.permission.GET_ACCOUNTS":
                this.f22870n = 4;
                this.f22863g = getString(R.string.explain_permission_contacts);
                this.f22864h = getString(R.string.explain_permission_contacts_edited);
                this.f22866j = "ask_account_permission";
                break;
            case "android.permission.WRITE_EXTERNAL_STORAGE":
                this.f22870n = 1;
                this.f22863g = getString(R.string.explain_permission_storage, getString(R.string.app_name));
                this.f22864h = getString(R.string.explain_permission_storage_edited);
                this.f22866j = "ask_storage_permission";
                break;
            case "android.permission.RECORD_AUDIO":
                this.f22870n = 2;
                this.f22863g = getString(R.string.explain_permission_record_audio);
                this.f22864h = getString(R.string.explain_permission_record_audio_edited);
                this.f22866j = "ask_audio_permission";
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q0() {
        return this.f22873q != lg.c.h();
    }

    private void R0(String str) {
        this.f22861e = false;
        this.f22862f = false;
        c.a positiveButton = new c.a(this, R.style.GeneralDialogTheme).f(str).c(R.drawable.ic_app_icon).setPositiveButton(R.string.az_common_allow, new DialogInterface.OnClickListener() { // from class: jf.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AskPermissionActivity.B0(this.f42446a, dialogInterface, i10);
            }
        });
        if (this.f22869m == 3 && this.f22870n == 5) {
            positiveButton.setNegativeButton(R.string.tutorial, new DialogInterface.OnClickListener() { // from class: jf.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AskPermissionActivity.x0(this.f42447a, dialogInterface, i10);
                }
            });
        } else {
            positiveButton.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: jf.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AskPermissionActivity.z0(this.f42448a, dialogInterface, i10);
                }
            });
        }
        c cVarCreate = positiveButton.create();
        this.f22876t = cVarCreate;
        cVarCreate.setCanceledOnTouchOutside(true);
        this.f22876t.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: jf.d
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return AskPermissionActivity.y0(this.f42449a, dialogInterface, i10, keyEvent);
            }
        });
        this.f22876t.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: jf.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AskPermissionActivity.A0(this.f42450a, dialogInterface);
            }
        });
        this.f22876t.show();
    }

    public static /* synthetic */ void x0(AskPermissionActivity askPermissionActivity, DialogInterface dialogInterface, int i10) {
        askPermissionActivity.f22862f = true;
        askPermissionActivity.N0();
    }

    public static /* synthetic */ boolean y0(AskPermissionActivity askPermissionActivity, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            askPermissionActivity.getClass();
            return true;
        }
        askPermissionActivity.f22861e = false;
        askPermissionActivity.N0();
        return true;
    }

    public static /* synthetic */ void z0(AskPermissionActivity askPermissionActivity, DialogInterface dialogInterface, int i10) {
        askPermissionActivity.f22861e = false;
        askPermissionActivity.N0();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (lg.c.f(this.f22865i)) {
            this.f22860d = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("permission_granting", this.f22860d ? "allow_in_settings" : "cancel_in_settings");
        this.f22874r.a(this.f22866j, bundle);
        J0();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f22858v.incrementAndGet();
        AzRecorderApp.d().w(this);
        this.f22873q = lg.c.h();
        String action = getIntent().getAction();
        this.f22865i = action;
        if ("finish".equals(action)) {
            finish();
            return;
        }
        this.f22871o = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        l0.z(this, this.f22871o, intentFilter);
        P0();
        this.f22868l = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=jXyooYE62kQ"));
        if (this.f22865i.equals("android.settings.action.MANAGE_OVERLAY_PERMISSION")) {
            this.f22867k = new Intent(this.f22865i, Uri.fromParts("package", getPackageName(), null));
            this.f22869m = 3;
        } else {
            this.f22867k = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), null));
            boolean zB = this.f22875s.b(M0(this.f22865i), false);
            this.f22859c = zB;
            this.f22869m = zB ? 3 : 0;
        }
        L0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f22858v.decrementAndGet();
        b bVar = this.f22871o;
        if (bVar != null) {
            unregisterReceiver(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        c cVar = this.f22876t;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f22876t.dismiss();
        if (isFinishing()) {
            return;
        }
        this.f22872p = true;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (iArr[i11] != 0) {
                boolean z10 = !androidx.core.app.b.j(this, strArr[i11]);
                this.f22875s.j(M0(strArr[i11]), z10);
                if (i10 == this.f22870n) {
                    this.f22859c = z10;
                    this.f22860d = false;
                }
            } else if (i10 == this.f22870n) {
                this.f22860d = true;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("permission_granting", this.f22860d ? "allow_in_system_dialog" : "deny_in_system_dialog");
        this.f22874r.a(this.f22866j, bundle);
        J0();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f22872p) {
            this.f22872p = false;
            L0();
        }
    }
}
