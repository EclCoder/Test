package com.hecorat.screenrecorder.free.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ToolboxActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.j0;
import tf.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/ToolboxActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Lfl/g0;", "Z0", "Landroid/view/View;", "tile", "Landroid/widget/ImageView;", RewardPlus.ICON, "", "on", "Y0", "(Landroid/view/View;Landroid/widget/ImageView;Z)V", "Q0", "a1", "h1", "d1", "g1", "I0", "c1", "H0", "f1", "G0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ltf/l0;", "c", "Ltf/l0;", "binding", "Llg/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llg/a;", "N0", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lbh/e;", "e", "Lbh/e;", "K0", "()Lbh/e;", "setDrawerBubbleManager", "(Lbh/e;)V", "drawerBubbleManager", "Leh/c;", "f", "Leh/c;", "P0", "()Leh/c;", "setScreenshotBubbleManager", "(Leh/c;)V", "screenshotBubbleManager", "Lah/g;", "g", "Lah/g;", "J0", "()Lah/g;", "setCameraBubbleManager", "(Lah/g;)V", "cameraBubbleManager", "Ldh/f;", "h", "Ldh/f;", "M0", "()Ldh/f;", "setMagicViewManager", "(Ldh/f;)V", "magicViewManager", "Ldg/l;", "i", "Ldg/l;", "O0", "()Ldg/l;", "setRecordingController", "(Ldg/l;)V", "recordingController", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "j", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "L0", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ToolboxActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public l0 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public bh.e drawerBubbleManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public eh.c screenshotBubbleManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ah.g cameraBubbleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public dh.f magicViewManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public dg.l recordingController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics firebaseAnalytics;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WindowManager f22678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f22679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int[] f22680d;

        public a(WindowManager windowManager, FrameLayout frameLayout, int[] iArr) {
            this.f22678b = windowManager;
            this.f22679c = frameLayout;
            this.f22680d = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.h(animation, "animation");
            super.onAnimationEnd(animation);
            ToolboxActivity.this.N0().j(R.string.pref_show_screenshot, true);
            this.f22678b.removeViewImmediate(this.f22679c);
            ToolboxActivity.this.P0().u(Integer.valueOf(this.f22680d[1]));
            ToolboxActivity.this.P0().l();
            ToolboxActivity.this.finish();
        }
    }

    private final void G0() {
        if (ef.a.d()) {
            j0.j(this, R.string.toast_change_preference_during_recording);
            return;
        }
        if (ef.a.h()) {
            O0().r0(false);
        }
        N0().j(R.string.pref_use_magic_button, false);
        M0().h();
        Bundle bundle = new Bundle();
        bundle.putString("action_source", "disable_in_toolbox");
        L0().a("switch_magic_button", bundle);
        finish();
    }

    private final void H0() {
        N0().j(R.string.pref_show_screendraw, false);
        K0().F();
        finish();
    }

    private final void I0() {
        N0().j(R.string.pref_show_screenshot, false);
        P0().s();
        finish();
    }

    private final void Q0() {
        l0 l0Var = this.binding;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        if (l0Var.E.isActivated()) {
            N0().j(R.string.pref_show_camera, false);
            J0().b();
        } else if (lg.c.d()) {
            J0().c();
        } else {
            lg.c.j(new lg.c.a() { // from class: ff.g1
                @Override // lg.c.a
                public final void a(boolean z10) {
                    ToolboxActivity.R0(this.f38524a, z10);
                }
            });
        }
        finish();
    }

    public static final void R0(ToolboxActivity toolboxActivity, boolean z10) {
        if (z10) {
            toolboxActivity.J0().c();
        } else {
            Toast.makeText(toolboxActivity, R.string.explain_permission_camera, 1).show();
        }
    }

    public static final void S0(ToolboxActivity toolboxActivity, View view) {
        toolboxActivity.finish();
    }

    public static final void T0(ToolboxActivity toolboxActivity, View view) {
        l0 l0Var = toolboxActivity.binding;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        if (l0Var.J.isActivated()) {
            toolboxActivity.I0();
        } else {
            toolboxActivity.g1();
        }
    }

    public static final void U0(ToolboxActivity toolboxActivity, View view) {
        toolboxActivity.Q0();
    }

    public static final void V0(ToolboxActivity toolboxActivity, View view) {
        l0 l0Var = toolboxActivity.binding;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        if (l0Var.C.isActivated()) {
            toolboxActivity.H0();
        } else {
            toolboxActivity.c1();
        }
    }

    public static final void W0(ToolboxActivity toolboxActivity, View view) {
        l0 l0Var = toolboxActivity.binding;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        if (l0Var.H.isActivated()) {
            toolboxActivity.G0();
        } else {
            toolboxActivity.f1();
        }
    }

    public static final void X0(ToolboxActivity toolboxActivity, View view) {
        if (ef.a.h() || ef.a.d()) {
            j0.j(toolboxActivity, R.string.toast_change_preference_during_recording);
        } else {
            toolboxActivity.a1();
        }
    }

    private final void Y0(View tile, ImageView icon, boolean on2) {
        tile.setActivated(on2);
        icon.setColorFilter(androidx.core.content.a.getColor(this, on2 ? R.color.sunset_orange : R.color.grey));
    }

    private final void Z0() {
        l0 l0Var = this.binding;
        l0 l0Var2 = null;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        LinearLayout screenshotTile = l0Var.J;
        s.g(screenshotTile, "screenshotTile");
        l0 l0Var3 = this.binding;
        if (l0Var3 == null) {
            s.w("binding");
            l0Var3 = null;
        }
        ImageView screenshotTileIcon = l0Var3.K;
        s.g(screenshotTileIcon, "screenshotTileIcon");
        Y0(screenshotTile, screenshotTileIcon, N0().b(R.string.pref_show_screenshot, false));
        l0 l0Var4 = this.binding;
        if (l0Var4 == null) {
            s.w("binding");
            l0Var4 = null;
        }
        LinearLayout cameraTile = l0Var4.E;
        s.g(cameraTile, "cameraTile");
        l0 l0Var5 = this.binding;
        if (l0Var5 == null) {
            s.w("binding");
            l0Var5 = null;
        }
        ImageView cameraTileIcon = l0Var5.F;
        s.g(cameraTileIcon, "cameraTileIcon");
        Y0(cameraTile, cameraTileIcon, N0().b(R.string.pref_show_camera, false));
        l0 l0Var6 = this.binding;
        if (l0Var6 == null) {
            s.w("binding");
            l0Var6 = null;
        }
        LinearLayout brushTile = l0Var6.C;
        s.g(brushTile, "brushTile");
        l0 l0Var7 = this.binding;
        if (l0Var7 == null) {
            s.w("binding");
            l0Var7 = null;
        }
        ImageView brushTileIcon = l0Var7.D;
        s.g(brushTileIcon, "brushTileIcon");
        Y0(brushTile, brushTileIcon, N0().b(R.string.pref_show_screendraw, false));
        l0 l0Var8 = this.binding;
        if (l0Var8 == null) {
            s.w("binding");
            l0Var8 = null;
        }
        LinearLayout magicTile = l0Var8.H;
        s.g(magicTile, "magicTile");
        l0 l0Var9 = this.binding;
        if (l0Var9 == null) {
            s.w("binding");
        } else {
            l0Var2 = l0Var9;
        }
        ImageView magicTileIcon = l0Var2.I;
        s.g(magicTileIcon, "magicTileIcon");
        Y0(magicTile, magicTileIcon, N0().b(R.string.pref_use_magic_button, false));
        h1();
    }

    private final void a1() {
        boolean z10 = Build.VERSION.SDK_INT >= 29;
        String[] stringArray = getResources().getStringArray(z10 ? R.array.audio_source_entries : R.array.audio_source_entries_lower_10);
        s.g(stringArray, "getStringArray(...)");
        final String[] stringArray2 = getResources().getStringArray(z10 ? R.array.audio_source_values : R.array.audio_source_values_lower_10);
        s.g(stringArray2, "getStringArray(...)");
        new AlertDialog.Builder(this, R.style.GeneralDialogTheme).setTitle(R.string.audio_source).setSingleChoiceItems(stringArray, gl.j.c0(stringArray2, N0().h(R.string.pref_audio_source, MBridgeConstans.ENDCARD_URL_TYPE_PL)), new DialogInterface.OnClickListener() { // from class: ff.h1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ToolboxActivity.b1(stringArray2, this, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
    }

    public static final void b1(String[] strArr, ToolboxActivity toolboxActivity, DialogInterface dialogInterface, int i10) {
        String str = strArr[i10];
        toolboxActivity.N0().m(R.string.pref_audio_source, str);
        toolboxActivity.h1();
        dialogInterface.dismiss();
        if (s.c(str, "1") || s.c(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            toolboxActivity.d1();
        }
    }

    private final void c1() {
        N0().j(R.string.pref_show_screendraw, true);
        ef.a.l(true);
        K0().H();
        finish();
    }

    private final void d1() {
        new AlertDialog.Builder(this, R.style.GeneralDialogTheme).setTitle(R.string.internal_audio_warning_title).setMessage(R.string.internal_audio_warning_message).setPositiveButton(R.string.f22516ok, new DialogInterface.OnClickListener() { // from class: ff.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ToolboxActivity.e1(dialogInterface, i10);
            }
        }).show();
    }

    public static final void e1(DialogInterface dialogInterface, int i10) {
    }

    private final void f1() {
        if (ef.a.d()) {
            j0.j(this, R.string.toast_change_preference_during_recording);
            return;
        }
        if (ef.a.h()) {
            M0().k(0);
            O0().r0(true);
            if (O0().f0()) {
                M0().f();
            }
        } else {
            M0().k(2);
        }
        N0().j(R.string.pref_use_magic_button, true);
        Bundle bundle = new Bundle();
        bundle.putString("action_source", "enable_in_toolbox");
        L0().a("switch_magic_button", bundle);
        finish();
    }

    private final void g1() {
        int[] iArr = new int[2];
        l0 l0Var = this.binding;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        l0Var.J.getLocationOnScreen(iArr);
        l0 l0Var2 = this.binding;
        if (l0Var2 == null) {
            s.w("binding");
            l0Var2 = null;
        }
        l0Var2.J.setClickable(false);
        Object systemService = getSystemService("window");
        s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, AzRecorderApp.e().f(), 824, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = iArr[1];
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.screenshot_animation_layout, (ViewGroup) null);
        s.f(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        windowManager.addView(frameLayout, layoutParams);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.screenshot_iv);
        imageView.setX(iArr[0]);
        imageView.animate().x(0.0f).setDuration(500L).setListener(new a(windowManager, frameLayout, iArr)).start();
    }

    public final ah.g J0() {
        ah.g gVar = this.cameraBubbleManager;
        if (gVar != null) {
            return gVar;
        }
        s.w("cameraBubbleManager");
        return null;
    }

    public final bh.e K0() {
        bh.e eVar = this.drawerBubbleManager;
        if (eVar != null) {
            return eVar;
        }
        s.w("drawerBubbleManager");
        return null;
    }

    public final FirebaseAnalytics L0() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        s.w("firebaseAnalytics");
        return null;
    }

    public final dh.f M0() {
        dh.f fVar = this.magicViewManager;
        if (fVar != null) {
            return fVar;
        }
        s.w("magicViewManager");
        return null;
    }

    public final lg.a N0() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    public final dg.l O0() {
        dg.l lVar = this.recordingController;
        if (lVar != null) {
            return lVar;
        }
        s.w("recordingController");
        return null;
    }

    public final eh.c P0() {
        eh.c cVar = this.screenshotBubbleManager;
        if (cVar != null) {
            return cVar;
        }
        s.w("screenshotBubbleManager");
        return null;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().v(this);
        super.onCreate(savedInstanceState);
        this.binding = (l0) androidx.databinding.g.j(this, R.layout.activity_toolbox);
        setFinishOnTouchOutside(true);
        l0 l0Var = this.binding;
        l0 l0Var2 = null;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        l0Var.H.setVisibility(ef.a.f() ? 4 : 0);
        Z0();
        l0 l0Var3 = this.binding;
        if (l0Var3 == null) {
            s.w("binding");
            l0Var3 = null;
        }
        l0Var3.G.setOnClickListener(new View.OnClickListener() { // from class: ff.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.S0(this.f38502a, view);
            }
        });
        l0 l0Var4 = this.binding;
        if (l0Var4 == null) {
            s.w("binding");
            l0Var4 = null;
        }
        l0Var4.J.setOnClickListener(new View.OnClickListener() { // from class: ff.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.T0(this.f38506a, view);
            }
        });
        l0 l0Var5 = this.binding;
        if (l0Var5 == null) {
            s.w("binding");
            l0Var5 = null;
        }
        l0Var5.E.setOnClickListener(new View.OnClickListener() { // from class: ff.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.U0(this.f38509a, view);
            }
        });
        l0 l0Var6 = this.binding;
        if (l0Var6 == null) {
            s.w("binding");
            l0Var6 = null;
        }
        l0Var6.C.setOnClickListener(new View.OnClickListener() { // from class: ff.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.V0(this.f38512a, view);
            }
        });
        l0 l0Var7 = this.binding;
        if (l0Var7 == null) {
            s.w("binding");
            l0Var7 = null;
        }
        l0Var7.H.setOnClickListener(new View.OnClickListener() { // from class: ff.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.W0(this.f38515a, view);
            }
        });
        l0 l0Var8 = this.binding;
        if (l0Var8 == null) {
            s.w("binding");
        } else {
            l0Var2 = l0Var8;
        }
        l0Var2.A.setOnClickListener(new View.OnClickListener() { // from class: ff.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolboxActivity.X0(this.f38518a, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    private final void h1() {
        int i10;
        float f10;
        String strH = N0().h(R.string.pref_audio_source, IAoPeRfJn.CoAzxms);
        if (strH != null) {
            int iHashCode = strH.hashCode();
            if (iHashCode != 49) {
                if (iHashCode != 50) {
                    if (iHashCode == 1444 && strH.equals("-1")) {
                        i10 = R.string.mute;
                    } else {
                        i10 = R.string.microphone;
                    }
                } else if (strH.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    i10 = R.string.internal_audio_and_microphone;
                } else {
                    i10 = R.string.microphone;
                }
            } else if (strH.equals("1")) {
                i10 = R.string.internal_audio_android_10;
            } else {
                i10 = R.string.microphone;
            }
        } else {
            i10 = R.string.microphone;
        }
        l0 l0Var = this.binding;
        l0 l0Var2 = null;
        if (l0Var == null) {
            s.w("binding");
            l0Var = null;
        }
        l0Var.B.setText(i10);
        l0 l0Var3 = this.binding;
        if (l0Var3 == null) {
            s.w("binding");
        } else {
            l0Var2 = l0Var3;
        }
        LinearLayout linearLayout = l0Var2.A;
        if (!ef.a.h() && !ef.a.d()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        linearLayout.setAlpha(f10);
    }
}
