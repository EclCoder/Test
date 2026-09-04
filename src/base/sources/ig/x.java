package ig;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.ShowTouchActivity;
import com.hecorat.screenrecorder.free.activities.StopOptionsActivity;
import com.hecorat.screenrecorder.free.activities.TrashFolderActivity;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import com.hecorat.screenrecorder.free.activities.WatermarkSettingsActivity;
import com.hecorat.screenrecorder.free.data.prefs.AdsPreference;
import com.hecorat.screenrecorder.free.data.prefs.SingleLineListPreference;
import com.hecorat.screenrecorder.free.ui.live.LiveHomeActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u009b\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0006J\u0019\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u0006J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u00102J!\u00106\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u0006J#\u0010:\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010$2\b\u00109\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\u0006J\u0017\u0010=\u001a\u00020*2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0018\u0010R\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010LR\u0018\u0010T\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010LR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0096\u0001\u001a\u0014\u0012\u000f\u0012\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u0098\u0001\u001a\u0014\u0012\u000f\u0012\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R(\u0010\u0099\u0001\u001a\u0014\u0012\u000f\u0012\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010\u0095\u0001¨\u0006\u009c\u0001"}, d2 = {"Lig/x;", "Landroidx/preference/g;", "Landroidx/preference/Preference$e;", "Landroidx/preference/Preference$d;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "Lfl/g0;", "w0", "x0", "r0", "A0", "Landroidx/preference/Preference;", "pref", "U", "(Landroidx/preference/Preference;)V", "y0", "W", "()Landroidx/preference/Preference;", "", "keyId", "u0", "(I)V", "", "firstLine", "secondLine", "Landroid/text/SpannableStringBuilder;", "X", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "key", "curValue", "", "defaultEntry", "a0", "(ILjava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "j0", "Landroid/os/Bundle;", "bundle", "i0", "(Landroid/os/Bundle;)V", "h0", "B0", "", "sendAnalytics", "s0", "(Z)Z", "t0", "v0", "paramValue", "q0", "(Ljava/lang/String;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "p0", "rootKey", "z", "(Landroid/os/Bundle;Ljava/lang/String;)V", "onDestroy", "l", "(Landroidx/preference/Preference;)Z", "", "newValue", CampaignEx.JSON_KEY_AD_K, "(Landroidx/preference/Preference;Ljava/lang/Object;)Z", "Landroid/content/SharedPreferences;", "sharedPrefs", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "Landroidx/preference/PreferenceScreen;", "j", "Landroidx/preference/PreferenceScreen;", "mRootPref", "Landroidx/preference/PreferenceCategory;", "Landroidx/preference/PreferenceCategory;", "mVideoCategoryPref", "mStabilityCategoryPref", "m", "mControlCategoryPref", "n", "mViewCategoryPref", "o", "mOthersCategoryPref", "Llg/a;", TtmlNode.TAG_P, "Llg/a;", "d0", "()Llg/a;", "setMPreferenceManager", "(Llg/a;)V", "mPreferenceManager", "Ldh/f;", CampaignEx.JSON_KEY_AD_Q, "Ldh/f;", "e0", "()Ldh/f;", "setMagicViewManager", "(Ldh/f;)V", "magicViewManager", "Leh/c;", CampaignEx.JSON_KEY_AD_R, "Leh/c;", "g0", "()Leh/c;", "setScreenshotBubbleManager", "(Leh/c;)V", "screenshotBubbleManager", "Lbh/e;", "s", "Lbh/e;", "b0", "()Lbh/e;", "setDrawerBubbleManager", "(Lbh/e;)V", "drawerBubbleManager", "Lah/g;", "t", "Lah/g;", "Z", "()Lah/g;", "setCameraBubbleManager", "(Lah/g;)V", "cameraBubbleManager", "Ldg/l;", "u", "Ldg/l;", "f0", "()Ldg/l;", "setRecordingController", "(Ldg/l;)V", "recordingController", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "v", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "c0", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "Landroidx/fragment/app/k0;", "w", "Landroidx/fragment/app/k0;", "fragmentResultListener", "Lf/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "x", "Lf/c;", "startIgnoreBattery", "y", "startUpgradeToHideSavedWindow", "upgradeToRecordHighFpsLauncher", "A", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends androidx.preference.g implements Preference.e, Preference.d, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private PreferenceScreen mRootPref;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private PreferenceCategory mVideoCategoryPref;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private PreferenceCategory mStabilityCategoryPref;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private PreferenceCategory mControlCategoryPref;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private PreferenceCategory mViewCategoryPref;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private PreferenceCategory mOthersCategoryPref;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public lg.a mPreferenceManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public dh.f magicViewManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public eh.c screenshotBubbleManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public bh.e drawerBubbleManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public ah.g cameraBubbleManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public dg.l recordingController;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics firebaseAnalytics;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final androidx.fragment.app.k0 fragmentResultListener = new androidx.fragment.app.k0() { // from class: ig.t
        @Override // androidx.fragment.app.k0
        public final void a(String str, Bundle bundle) {
            x.Y(this.f41398a, str, bundle);
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final f.c startIgnoreBattery;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final f.c startUpgradeToHideSavedWindow;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final f.c upgradeToRecordHighFpsLauncher;

    public x() {
        f.c cVarRegisterForActivityResult = registerForActivityResult(new g.f(), new f.b() { // from class: ig.u
            @Override // f.b
            public final void a(Object obj) {
                x.C0(this.f41399a, (f.a) obj);
            }
        });
        kotlin.jvm.internal.s.g(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.startIgnoreBattery = cVarRegisterForActivityResult;
        f.c cVarRegisterForActivityResult2 = registerForActivityResult(new g.f(), new f.b() { // from class: ig.v
            @Override // f.b
            public final void a(Object obj) {
                x.D0(this.f41401a, (f.a) obj);
            }
        });
        kotlin.jvm.internal.s.g(cVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.startUpgradeToHideSavedWindow = cVarRegisterForActivityResult2;
        f.c cVarRegisterForActivityResult3 = registerForActivityResult(new g.f(), new f.b() { // from class: ig.w
            @Override // f.b
            public final void a(Object obj) {
                x.E0(this.f41404a, (f.a) obj);
            }
        });
        kotlin.jvm.internal.s.g(cVarRegisterForActivityResult3, "registerForActivityResult(...)");
        this.upgradeToRecordHighFpsLauncher = cVarRegisterForActivityResult3;
    }

    private final void A0() {
        if (ef.a.h()) {
            e0().k(0);
            f0().r0(true);
            if (f0().f0()) {
                e0().f();
            }
        } else {
            e0().k(2);
        }
        Bundle bundle = new Bundle();
        bundle.putString("action_source", "enable_in_settings");
        c0().a("switch_magic_button", bundle);
    }

    private final void B0() {
        wf.d0 d0VarV = wf.d0.v(d0().b(R.string.pref_use_internal_storage, true));
        kotlin.jvm.internal.s.g(d0VarV, "newInstance(...)");
        d0VarV.show(getParentFragmentManager(), "dialog");
        getParentFragmentManager().z1("SelectStorageDialog", getViewLifecycleOwner(), this.fragmentResultListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(x xVar, f.a it) {
        kotlin.jvm.internal.s.h(it, "it");
        xVar.s0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(x xVar, f.a it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (it.b() == -1) {
            xVar.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(x xVar, f.a it) {
        kotlin.jvm.internal.s.h(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("upgradeToRecordHighFpsLauncher: ");
        sb2.append(it.b());
        sb2.append(", ");
        Intent intentA = it.a();
        sb2.append(intentA != null ? Integer.valueOf(intentA.getIntExtra("key_extra_data", -1)) : null);
        wp.a.a(sb2.toString(), new Object[0]);
        if (it.b() == -1) {
            Intent intentA2 = it.a();
            Integer numValueOf = intentA2 != null ? Integer.valueOf(intentA2.getIntExtra("key_extra_data", -1)) : null;
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            String str = xVar.getResources().getStringArray(R.array.framerate_values)[numValueOf.intValue()];
            xVar.d0().m(R.string.pref_frame_rate, str);
            SingleLineListPreference singleLineListPreference = (SingleLineListPreference) xVar.j(xVar.getString(R.string.pref_frame_rate));
            if (singleLineListPreference != null) {
                singleLineListPreference.e1(str);
            }
            xVar.u0(R.string.pref_frame_rate);
        }
    }

    private final void U(final Preference pref) {
        lg.c.j(new lg.c.a() { // from class: ig.n
            @Override // lg.c.a
            public final void a(boolean z10) {
                x.V(pref, this, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Preference preference, x xVar, boolean z10) {
        if (!z10) {
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(false);
        } else {
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(true);
            xVar.Z().c();
        }
    }

    private final Preference W() {
        SingleLineListPreference singleLineListPreference = new SingleLineListPreference(getContext());
        singleLineListPreference.t0(R.drawable.ic_app_shortcut_24);
        singleLineListPreference.w0(getString(R.string.pref_magic_button_position));
        singleLineListPreference.a1(R.array.magic_button_position_entries);
        singleLineListPreference.c1(R.array.magic_button_position_values);
        singleLineListPreference.q0(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        singleLineListPreference.F0(R.string.magic_button_position);
        singleLineListPreference.x0(R.layout.preference_bold_summary_layout);
        Preference preferenceJ = j(getString(R.string.pref_use_magic_button));
        kotlin.jvm.internal.s.e(preferenceJ);
        singleLineListPreference.B0(preferenceJ.s() + 1);
        return singleLineListPreference;
    }

    private final SpannableStringBuilder X(String firstLine, String secondLine) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) firstLine);
        spannableStringBuilder.append((CharSequence) System.lineSeparator());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) secondLine);
        Context context = getContext();
        if (context != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(context, R.color.text_value)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(x xVar, String requestKey, Bundle bundle) {
        kotlin.jvm.internal.s.h(requestKey, "requestKey");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        int iHashCode = requestKey.hashCode();
        if (iHashCode == -751261565) {
            if (requestKey.equals("SdcardWarningDialog")) {
                xVar.h0(bundle);
            }
        } else if (iHashCode == -712056857) {
            if (requestKey.equals("SelectStorageDialog")) {
                xVar.i0(bundle);
            }
        } else if (iHashCode == -478218528 && requestKey.equals("SelectRecordingModeDialog")) {
            xVar.u0(R.string.pref_recording_mode);
        }
    }

    private final CharSequence a0(int key, String curValue, CharSequence defaultEntry) {
        SingleLineListPreference singleLineListPreference = (SingleLineListPreference) j(getString(key));
        if (singleLineListPreference != null) {
            CharSequence[] charSequenceArrX0 = singleLineListPreference.X0();
            CharSequence[] charSequenceArrV0 = singleLineListPreference.V0();
            int length = charSequenceArrX0.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (kotlin.jvm.internal.s.c(charSequenceArrX0[i10], curValue)) {
                    return charSequenceArrV0[i10];
                }
            }
        }
        return defaultEntry;
    }

    private final void h0(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("result", false)) {
            return;
        }
        d0().j(R.string.pref_use_internal_storage, false);
        u0(R.string.pref_use_internal_storage);
        Context context = getContext();
        if (context != null) {
            nh.l0.A(context, "grant_permission_storage");
        }
    }

    private final void i0(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean("use_internal", true)) {
                d0().j(R.string.pref_use_internal_storage, true);
                u0(R.string.pref_use_internal_storage);
            } else {
                new wf.w().show(getParentFragmentManager(), "SdcardWarning");
                getParentFragmentManager().z1("SdcardWarningDialog", getViewLifecycleOwner(), this.fragmentResultListener);
            }
        }
    }

    private final void j0() {
        SwitchPreference switchPreference = (SwitchPreference) j(getString(R.string.pref_hide_saved_window_after_recording));
        if (switchPreference != null) {
            switchPreference.P0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(x xVar, Preference preference, boolean z10) {
        if (z10) {
            xVar.A0();
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(true);
        } else {
            nh.j0.b(xVar.getActivity(), R.string.toast_must_grant_permission_alert);
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(x xVar, Preference preference, boolean z10) {
        if (!z10) {
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(false);
            nh.j0.b(xVar.getActivity(), R.string.toast_must_grant_permission_alert);
        } else if (lg.c.d()) {
            xVar.Z().c();
        } else {
            xVar.U(preference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(x xVar, Preference preference, boolean z10) {
        if (!z10) {
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(false);
        } else {
            xVar.g0().l();
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(x xVar, Preference preference, boolean z10) {
        if (!z10) {
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(false);
        } else {
            xVar.b0().l();
            kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
            ((SwitchPreference) preference).P0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(x xVar, boolean z10) {
        if (z10) {
            nh.l0.q(xVar.getContext(), LiveHomeActivity.class);
        } else {
            nh.j0.b(xVar.getContext(), R.string.toast_must_grant_permission_alert);
        }
    }

    private final void q0(String paramValue) {
        Bundle bundle = new Bundle();
        bundle.putString("action", paramValue);
        c0().a("avoid_unexpected_stop", bundle);
    }

    private final void r0() {
        if (Build.VERSION.SDK_INT < 29) {
            SingleLineListPreference singleLineListPreference = (SingleLineListPreference) j(getString(R.string.pref_audio_source));
            if (singleLineListPreference != null) {
                singleLineListPreference.a1(R.array.audio_source_entries_lower_10);
            }
            if (singleLineListPreference != null) {
                singleLineListPreference.c1(R.array.audio_source_values_lower_10);
            }
        }
    }

    private final boolean s0(boolean sendAnalytics) {
        PreferenceCategory preferenceCategory;
        int i10 = Build.VERSION.SDK_INT;
        Object systemService = requireContext().getSystemService("power");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(requireContext().getPackageName());
        if (zIsIgnoringBatteryOptimizations && i10 >= 28) {
            Object systemService2 = requireContext().getSystemService("activity");
            kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            if (((ActivityManager) systemService2).isBackgroundRestricted()) {
                zIsIgnoringBatteryOptimizations = false;
            }
        }
        if (zIsIgnoringBatteryOptimizations) {
            if (sendAnalytics) {
                q0("allow");
            }
            Preference preferenceJ = j(getString(R.string.pref_avoid_unexpected_stop));
            if (preferenceJ != null && (preferenceCategory = this.mStabilityCategoryPref) != null) {
                preferenceCategory.X0(preferenceJ);
            }
        }
        return zIsIgnoringBatteryOptimizations;
    }

    private final void t0() {
        Preference preferenceJ;
        PreferenceCategory preferenceCategory;
        if (Build.VERSION.SDK_INT >= 34 || (preferenceJ = j(getString(R.string.pref_enable_single_app))) == null || (preferenceCategory = this.mControlCategoryPref) == null) {
            return;
        }
        preferenceCategory.X0(preferenceJ);
    }

    private final void u0(int keyId) {
        String string;
        PreferenceCategory preferenceCategory;
        String string2 = getString(keyId);
        kotlin.jvm.internal.s.g(string2, "getString(...)");
        if (keyId == R.string.pref_recording_mode) {
            String string3 = getString(kotlin.jvm.internal.s.c("1", d0().h(keyId, pf.a.f50031f)) ? R.string.advanced_mode : R.string.default_mode);
            kotlin.jvm.internal.s.g(string3, "getString(...)");
            Preference preferenceJ = j(string2);
            if (preferenceJ != null) {
                preferenceJ.D0(string3);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_use_magic_button) {
            if (!d0().b(keyId, false)) {
                Preference preferenceJ2 = j(getString(R.string.pref_magic_button_position));
                if (preferenceJ2 == null || (preferenceCategory = this.mControlCategoryPref) == null) {
                    return;
                }
                preferenceCategory.X0(preferenceJ2);
                return;
            }
            Preference preferenceW = W();
            PreferenceCategory preferenceCategory2 = this.mControlCategoryPref;
            if (preferenceCategory2 != null) {
                preferenceCategory2.P0(preferenceW);
            }
            u0(R.string.pref_magic_button_position);
            preferenceW.z0(this);
            return;
        }
        if (keyId == R.string.pref_magic_button_position) {
            String strH = d0().h(keyId, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH);
            String string4 = getString(R.string.top_right_screen);
            kotlin.jvm.internal.s.g(string4, "getString(...)");
            CharSequence charSequenceA0 = a0(keyId, strH, string4);
            Preference preferenceJ3 = j(string2);
            if (preferenceJ3 != null) {
                preferenceJ3.D0(charSequenceA0);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_show_stop_options) {
            boolean zB = Build.VERSION.SDK_INT >= 35 ? true : d0().b(R.string.pref_stop_on_screen_off, false);
            boolean zB2 = d0().b(R.string.pref_stop_on_time_limit, false);
            boolean zB3 = d0().b(R.string.pref_stop_on_shake, false);
            String string5 = getString(R.string.notification);
            kotlin.jvm.internal.s.g(string5, "getString(...)");
            if (zB) {
                string5 = string5 + ", " + getString(R.string.scr_off);
            }
            if (zB2) {
                string5 = string5 + ", " + getString(R.string.time_out);
            }
            if (zB3) {
                string5 = string5 + ", " + getString(R.string.shake_device);
            }
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = string5.substring(0, 1);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.s.g(locale, "getDefault(...)");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.s.g(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            String strSubstring2 = string5.substring(1);
            kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            String string6 = sb2.toString();
            Preference preferenceJ4 = j(string2);
            if (preferenceJ4 != null) {
                preferenceJ4.D0(string6);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_resolution) {
            String strH2 = d0().h(keyId, "720");
            kotlin.jvm.internal.s.e(strH2);
            CharSequence charSequenceA1 = a0(keyId, strH2, strH2 + 'p');
            Preference preferenceJ5 = j(string2);
            if (preferenceJ5 != null) {
                preferenceJ5.D0(charSequenceA1);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_frame_rate) {
            String strH3 = d0().h(R.string.pref_frame_rate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH3);
            String string7 = getString(R.string.auto_recommended);
            kotlin.jvm.internal.s.g(string7, "getString(...)");
            CharSequence charSequenceA2 = a0(keyId, strH3, string7);
            String string8 = getString(R.string.frame_rate_warning);
            kotlin.jvm.internal.s.g(string8, "getString(...)");
            SpannableStringBuilder spannableStringBuilderX = X(string8, charSequenceA2.toString());
            Preference preferenceJ6 = j(string2);
            if (preferenceJ6 != null) {
                preferenceJ6.D0(spannableStringBuilderX);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_bitrate) {
            String strH4 = d0().h(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH4);
            String string9 = getString(R.string.auto_recommended);
            kotlin.jvm.internal.s.g(string9, "getString(...)");
            CharSequence charSequenceA3 = a0(keyId, strH4, string9);
            String string10 = getString(R.string.video_quality_warning);
            kotlin.jvm.internal.s.g(string10, "getString(...)");
            SpannableStringBuilder spannableStringBuilderX2 = X(string10, charSequenceA3.toString());
            Preference preferenceJ7 = j(string2);
            if (preferenceJ7 != null) {
                preferenceJ7.D0(spannableStringBuilderX2);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_orientation) {
            String strH5 = d0().h(R.string.pref_orientation, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH5);
            String string11 = getString(R.string.auto);
            kotlin.jvm.internal.s.g(string11, "getString(...)");
            CharSequence charSequenceA4 = a0(keyId, strH5, string11);
            Preference preferenceJ8 = j(string2);
            if (preferenceJ8 != null) {
                preferenceJ8.D0(charSequenceA4);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_audio_source) {
            String strH6 = d0().h(R.string.pref_audio_source, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH6);
            String string12 = getString(R.string.microphone);
            kotlin.jvm.internal.s.g(string12, "getString(...)");
            CharSequence charSequenceA5 = a0(keyId, strH6, string12);
            Preference preferenceJ9 = j(string2);
            if (preferenceJ9 != null) {
                preferenceJ9.D0(charSequenceA5);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_countdown) {
            String strH7 = d0().h(keyId, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            kotlin.jvm.internal.s.e(strH7);
            String string13 = getString(R.string.no_countdown);
            kotlin.jvm.internal.s.g(string13, "getString(...)");
            CharSequence charSequenceA6 = a0(keyId, strH7, string13);
            Preference preferenceJ10 = j(string2);
            if (preferenceJ10 != null) {
                preferenceJ10.D0(charSequenceA6);
                return;
            }
            return;
        }
        if (keyId == R.string.pref_use_internal_storage) {
            String strL = nh.e.l(getContext(), d0());
            boolean zB4 = d0().b(R.string.pref_use_internal_storage, true);
            String strJ = nh.e.j(d0(), zB4 ? nh.e.g() : nh.e.o(getContext()));
            if (zB4) {
                string = getString(R.string.internal_storage_w_duration, strJ);
                kotlin.jvm.internal.s.e(string);
            } else {
                string = getString(R.string.sd_card_w_duration, strJ);
                kotlin.jvm.internal.s.e(string);
            }
            kotlin.jvm.internal.s.e(strL);
            SpannableStringBuilder spannableStringBuilderX3 = X(strL, string);
            Preference preferenceJ11 = j(string2);
            if (preferenceJ11 != null) {
                preferenceJ11.D0(spannableStringBuilderX3);
            }
        }
    }

    private final void v0() {
        PreferenceScreen preferenceScreen;
        PreferenceCategory preferenceCategory;
        PreferenceCategory preferenceCategory2;
        if (Build.VERSION.SDK_INT < 30) {
            Preference preferenceJ = j(getString(R.string.pref_use_trash));
            if (preferenceJ != null && (preferenceCategory2 = this.mOthersCategoryPref) != null) {
                preferenceCategory2.X0(preferenceJ);
            }
            Preference preferenceJ2 = j(getString(R.string.pref_trash_folder));
            if (preferenceJ2 != null && (preferenceCategory = this.mOthersCategoryPref) != null) {
                preferenceCategory.X0(preferenceJ2);
            }
            PreferenceCategory preferenceCategory3 = this.mOthersCategoryPref;
            if (preferenceCategory3 == null || (preferenceScreen = this.mRootPref) == null) {
                return;
            }
            preferenceScreen.X0(preferenceCategory3);
        }
    }

    private final void w0() {
        if (nh.b.c().getHeight() >= 1440) {
            SingleLineListPreference singleLineListPreference = (SingleLineListPreference) j(getString(R.string.pref_bitrate));
            if (singleLineListPreference != null) {
                singleLineListPreference.a1(R.array.bitrate_entries_for2k);
            }
            if (singleLineListPreference != null) {
                singleLineListPreference.c1(R.array.bitrate_entry_values_for2k);
            }
            SingleLineListPreference singleLineListPreference2 = (SingleLineListPreference) j(getString(R.string.pref_resolution));
            if (singleLineListPreference2 != null) {
                singleLineListPreference2.a1(R.array.resolution_entries_for_2k);
            }
            if (singleLineListPreference2 != null) {
                singleLineListPreference2.c1(R.array.resolution_entry_values_for_2k);
            }
        }
    }

    private final void x0() {
        SingleLineListPreference singleLineListPreference = (SingleLineListPreference) j(getString(R.string.pref_frame_rate));
        if (singleLineListPreference != null) {
            singleLineListPreference.l1(new int[]{1, 2, 3});
        }
        if (singleLineListPreference != null) {
            singleLineListPreference.k1(this.upgradeToRecordHighFpsLauncher);
        }
    }

    private final void y0() {
        String strH = d0().h(R.string.pref_audio_source, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        if (kotlin.jvm.internal.s.c(strH, "1") || kotlin.jvm.internal.s.c(strH, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.GeneralDialogTheme);
            builder.setTitle(R.string.internal_audio_warning_title).setMessage(R.string.internal_audio_warning_message).setPositiveButton(R.string.f22516ok, new DialogInterface.OnClickListener() { // from class: ig.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    x.z0(dialogInterface, i10);
                }
            });
            builder.show();
        }
    }

    public final ah.g Z() {
        ah.g gVar = this.cameraBubbleManager;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.s.w("cameraBubbleManager");
        return null;
    }

    public final bh.e b0() {
        bh.e eVar = this.drawerBubbleManager;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.s.w("drawerBubbleManager");
        return null;
    }

    public final FirebaseAnalytics c0() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        kotlin.jvm.internal.s.w("firebaseAnalytics");
        return null;
    }

    public final lg.a d0() {
        lg.a aVar = this.mPreferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("mPreferenceManager");
        return null;
    }

    public final dh.f e0() {
        dh.f fVar = this.magicViewManager;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.s.w("magicViewManager");
        return null;
    }

    public final dg.l f0() {
        dg.l lVar = this.recordingController;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.s.w("recordingController");
        return null;
    }

    public final eh.c g0() {
        eh.c cVar = this.screenshotBubbleManager;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.s.w("screenshotBubbleManager");
        return null;
    }

    @Override // androidx.preference.Preference.d
    public boolean k(final Preference pref, Object newValue) {
        kotlin.jvm.internal.s.h(pref, "pref");
        kotlin.jvm.internal.s.h(newValue, "newValue");
        try {
            String strQ = pref.q();
            if (kotlin.jvm.internal.s.c(strQ, "com.facebook.appevents.SessionInfo.sessionEndTime")) {
                return true;
            }
            if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_use_magic_button))) {
                if (ef.a.d()) {
                    nh.j0.j(getActivity(), R.string.toast_change_preference_during_recording);
                    return false;
                }
                if (((Boolean) newValue).booleanValue()) {
                    if (!lg.c.c()) {
                        lg.c.k(new lg.c.a() { // from class: ig.m
                            @Override // lg.c.a
                            public final void a(boolean z10) {
                                x.k0(this.f41374a, pref, z10);
                            }
                        });
                        return false;
                    }
                    A0();
                    ((SwitchPreference) pref).P0(true);
                    return true;
                }
                if (ef.a.h()) {
                    f0().r0(false);
                }
                e0().h();
                Bundle bundle = new Bundle();
                bundle.putString("action_source", "disable_in_settings");
                c0().a("switch_magic_button", bundle);
                return true;
            }
            if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_magic_button_position))) {
                if (!ef.a.h() && !ef.a.d()) {
                    d0().m(R.string.pref_magic_button_position, (String) newValue);
                    e0().h();
                    e0().k(2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action", kotlin.jvm.internal.s.c(newValue, MBridgeConstans.ENDCARD_URL_TYPE_PL) ? "change_to_top_right" : "change_to_top_left");
                    c0().a("change_magic_button_position", bundle2);
                    return true;
                }
                nh.j0.j(getActivity(), R.string.toast_change_preference_during_recording);
                return false;
            }
            if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_show_camera))) {
                if (!((Boolean) newValue).booleanValue()) {
                    Z().b();
                    return true;
                }
                if (!lg.c.c()) {
                    lg.c.k(new lg.c.a() { // from class: ig.o
                        @Override // lg.c.a
                        public final void a(boolean z10) {
                            x.l0(this.f41386a, pref, z10);
                        }
                    });
                } else if (lg.c.d()) {
                    Z().c();
                } else {
                    U(pref);
                }
                return false;
            }
            if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_show_screenshot))) {
                if (!((Boolean) newValue).booleanValue()) {
                    g0().s();
                    return true;
                }
                if (lg.c.c()) {
                    g0().l();
                    ((SwitchPreference) pref).P0(true);
                } else {
                    lg.c.k(new lg.c.a() { // from class: ig.p
                        @Override // lg.c.a
                        public final void a(boolean z10) {
                            x.m0(this.f41389a, pref, z10);
                        }
                    });
                }
            }
            if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_show_screendraw))) {
                if (!((Boolean) newValue).booleanValue()) {
                    b0().F();
                    return true;
                }
                if (lg.c.c()) {
                    b0().l();
                    ((SwitchPreference) pref).P0(true);
                } else {
                    lg.c.k(new lg.c.a() { // from class: ig.q
                        @Override // lg.c.a
                        public final void a(boolean z10) {
                            x.n0(this.f41392a, pref, z10);
                        }
                    });
                }
            }
            if (!kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_hide_saved_window_after_recording)) || nh.l0.o()) {
                return true;
            }
            Intent intent = new Intent(getContext(), (Class<?>) UpgradeActivity.class);
            intent.putExtra("action_source", "hide_saved_window_after_recording");
            this.startUpgradeToHideSavedWindow.b(intent);
            return false;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00e7, please report this as an issue */
    @Override // androidx.preference.Preference.e
    public boolean l(Preference pref) {
        kotlin.jvm.internal.s.h(pref, "pref");
        String strQ = pref.q();
        if (ef.a.h() && kotlin.jvm.internal.s.c(getString(R.string.pref_recording_mode), strQ)) {
            nh.j0.j(getActivity(), R.string.toast_change_preference_during_recording);
            return false;
        }
        if (kotlin.jvm.internal.s.c(getString(R.string.pref_recording_mode), strQ)) {
            new wf.z().show(getParentFragmentManager(), "dialog");
            getParentFragmentManager().z1("SelectRecordingModeDialog", getViewLifecycleOwner(), this.fragmentResultListener);
            return true;
        }
        if (kotlin.jvm.internal.s.c(getString(R.string.pref_use_internal_storage), strQ) && nh.e.w(getContext())) {
            B0();
            return true;
        }
        if (kotlin.jvm.internal.s.c(getString(R.string.pref_show_touches), strQ)) {
            startActivity(new Intent(getContext(), (Class<?>) ShowTouchActivity.class));
            return true;
        }
        if (!kotlin.jvm.internal.s.c(getString(R.string.pref_avoid_unexpected_stop), strQ)) {
            if (kotlin.jvm.internal.s.c(getString(R.string.pref_live_stream), strQ)) {
                if (lg.c.c()) {
                    nh.l0.q(getContext(), LiveHomeActivity.class);
                } else {
                    lg.c.k(new lg.c.a() { // from class: ig.s
                        @Override // lg.c.a
                        public final void a(boolean z10) {
                            x.o0(this.f41396a, z10);
                        }
                    });
                }
                return true;
            }
            if (kotlin.jvm.internal.s.c(getString(R.string.pref_trash_folder), strQ)) {
                startActivity(new Intent(getContext(), (Class<?>) TrashFolderActivity.class));
                return true;
            }
            if (kotlin.jvm.internal.s.c(getString(R.string.pref_show_stop_options), strQ)) {
                startActivity(new Intent(getContext(), (Class<?>) StopOptionsActivity.class));
                return true;
            }
            if (!kotlin.jvm.internal.s.c(getString(R.string.pref_screen_watermark_logo), strQ)) {
                return false;
            }
            startActivity(new Intent(getContext(), (Class<?>) WatermarkSettingsActivity.class));
            return true;
        }
        if (!s0(true)) {
            q0(com.vungle.ads.internal.presenter.g.OPEN);
            if (Build.VERSION.SDK_INT >= 28) {
                Object systemService = requireContext().getSystemService("activity");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                if (((ActivityManager) systemService).isBackgroundRestricted()) {
                    this.startIgnoreBattery.b(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + requireContext().getPackageName())));
                } else {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    intent.setData(Uri.parse("package:" + requireContext().getPackageName()));
                    this.startIgnoreBattery.b(intent);
                }
            } else {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent2.setData(Uri.parse("package:" + requireContext().getPackageName()));
                this.startIgnoreBattery.b(intent2);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        d0().f().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPrefs, String key) {
        if (isAdded()) {
            if (key != null) {
                try {
                    if (bm.r.T(key, "com.facebook", false, 2, null)) {
                        return;
                    }
                } catch (Exception e10) {
                    wp.a.e(e10);
                    com.google.firebase.crashlytics.a.b().d(e10);
                    return;
                }
            }
            if (!kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_time_limit), key) && !kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_screen_off), key) && !kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_shake), key)) {
                if (!kotlin.jvm.internal.s.c(getString(R.string.pref_show_camera), key) && !kotlin.jvm.internal.s.c(getString(R.string.pref_show_screenshot), key) && !kotlin.jvm.internal.s.c(getString(R.string.pref_show_screendraw), key) && !kotlin.jvm.internal.s.c(getString(R.string.pref_use_magic_button), key)) {
                    if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_countdown))) {
                        u0(R.string.pref_countdown);
                        return;
                    }
                    if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_resolution))) {
                        u0(R.string.pref_resolution);
                        u0(R.string.pref_use_internal_storage);
                        return;
                    }
                    if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_frame_rate))) {
                        u0(R.string.pref_frame_rate);
                        u0(R.string.pref_use_internal_storage);
                        return;
                    }
                    if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_bitrate))) {
                        u0(R.string.pref_bitrate);
                        u0(R.string.pref_use_internal_storage);
                        return;
                    } else {
                        if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_orientation))) {
                            u0(R.string.pref_orientation);
                            return;
                        }
                        if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_audio_source))) {
                            u0(R.string.pref_audio_source);
                            y0();
                            return;
                        } else {
                            if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_magic_button_position))) {
                                u0(R.string.pref_magic_button_position);
                                return;
                            }
                            return;
                        }
                    }
                }
                Boolean boolValueOf = sharedPrefs != null ? Boolean.valueOf(sharedPrefs.getBoolean(key, false)) : null;
                SwitchPreference switchPreference = (SwitchPreference) j(key);
                if (!kotlin.jvm.internal.s.c(switchPreference != null ? Boolean.valueOf(switchPreference.O0()) : null, boolValueOf) && boolValueOf != null && switchPreference != null) {
                    switchPreference.P0(boolValueOf.booleanValue());
                }
                if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_use_magic_button))) {
                    u0(R.string.pref_use_magic_button);
                    return;
                }
                return;
            }
            u0(R.string.pref_show_stop_options);
        }
    }

    @Override // androidx.preference.g, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        HomeActivity homeActivity = (HomeActivity) getActivity();
        if (homeActivity != null) {
            homeActivity.z1(3, this);
        }
    }

    public final void p0() {
        PreferenceScreen preferenceScreen;
        boolean zO = nh.l0.o();
        try {
            AdsPreference adsPreference = (AdsPreference) j(getString(R.string.pref_ads_view));
            if (!zO) {
                if (adsPreference != null) {
                    adsPreference.Q0(getActivity());
                }
            } else {
                if (adsPreference == null || (preferenceScreen = this.mRootPref) == null) {
                    return;
                }
                preferenceScreen.X0(adsPreference);
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    @Override // androidx.preference.g
    public void z(Bundle savedInstanceState, String rootKey) {
        AzRecorderApp.d().j(this);
        q(R.xml.preferences);
        this.mRootPref = (PreferenceScreen) j(getString(R.string.pref_screen_root));
        this.mVideoCategoryPref = (PreferenceCategory) j(getString(R.string.pref_category_video));
        this.mStabilityCategoryPref = (PreferenceCategory) j(getString(R.string.pref_category_stability));
        this.mControlCategoryPref = (PreferenceCategory) j(getString(R.string.pref_category_recording_controls));
        this.mViewCategoryPref = (PreferenceCategory) j(getString(R.string.pref_category_view));
        this.mOthersCategoryPref = (PreferenceCategory) j(getString(R.string.pref_category_others));
        w0();
        x0();
        r0();
        p0();
        SharedPreferences sharedPreferencesF = d0().f();
        if (sharedPreferencesF != null) {
            sharedPreferencesF.registerOnSharedPreferenceChangeListener(this);
        }
        u0(R.string.pref_use_magic_button);
        u0(R.string.pref_show_stop_options);
        u0(R.string.pref_resolution);
        u0(R.string.pref_frame_rate);
        u0(R.string.pref_bitrate);
        u0(R.string.pref_orientation);
        u0(R.string.pref_audio_source);
        u0(R.string.pref_recording_mode);
        u0(R.string.pref_hide_screenshot_saved_window);
        u0(R.string.pref_use_internal_storage);
        u0(R.string.pref_countdown);
        if (nh.e.w(getContext())) {
            Preference preferenceJ = j(getString(R.string.pref_use_internal_storage));
            if (preferenceJ != null) {
                preferenceJ.A0(this);
            }
        } else {
            Preference preferenceJ2 = j(getString(R.string.pref_use_internal_storage));
            if (preferenceJ2 != null) {
                preferenceJ2.C0(false);
            }
        }
        s0(false);
        t0();
        v0();
        Preference preferenceJ3 = j(getString(R.string.pref_resolution));
        if (preferenceJ3 != null) {
            preferenceJ3.z0(this);
        }
        Preference preferenceJ4 = j(getString(R.string.pref_frame_rate));
        if (preferenceJ4 != null) {
            preferenceJ4.z0(this);
        }
        Preference preferenceJ5 = j(getString(R.string.pref_bitrate));
        if (preferenceJ5 != null) {
            preferenceJ5.z0(this);
        }
        Preference preferenceJ6 = j(getString(R.string.pref_orientation));
        if (preferenceJ6 != null) {
            preferenceJ6.z0(this);
        }
        Preference preferenceJ7 = j(getString(R.string.pref_audio_source));
        if (preferenceJ7 != null) {
            preferenceJ7.A0(this);
        }
        Preference preferenceJ8 = j(getString(R.string.pref_recording_mode));
        if (preferenceJ8 != null) {
            preferenceJ8.A0(this);
        }
        Preference preferenceJ9 = j(getString(R.string.pref_show_touches));
        if (preferenceJ9 != null) {
            preferenceJ9.A0(this);
        }
        Preference preferenceJ10 = j(getString(R.string.pref_hide_record_window));
        if (preferenceJ10 != null) {
            preferenceJ10.A0(this);
        }
        Preference preferenceJ11 = j(getString(R.string.pref_use_magic_button));
        if (preferenceJ11 != null) {
            preferenceJ11.z0(this);
        }
        Preference preferenceJ12 = j(getString(R.string.pref_show_camera));
        if (preferenceJ12 != null) {
            preferenceJ12.z0(this);
        }
        Preference preferenceJ13 = j(getString(R.string.pref_show_screenshot));
        if (preferenceJ13 != null) {
            preferenceJ13.z0(this);
        }
        Preference preferenceJ14 = j(getString(R.string.pref_show_screendraw));
        if (preferenceJ14 != null) {
            preferenceJ14.z0(this);
        }
        Preference preferenceJ15 = j(getString(R.string.pref_hide_saved_window_after_recording));
        if (preferenceJ15 != null) {
            preferenceJ15.z0(this);
        }
        Preference preferenceJ16 = j(getString(R.string.pref_avoid_unexpected_stop));
        if (preferenceJ16 != null) {
            preferenceJ16.A0(this);
        }
        Preference preferenceJ17 = j(getString(R.string.pref_countdown));
        if (preferenceJ17 != null) {
            preferenceJ17.z0(this);
        }
        Preference preferenceJ18 = j(getString(R.string.pref_live_stream));
        if (preferenceJ18 != null) {
            preferenceJ18.A0(this);
        }
        Preference preferenceJ19 = j(getString(R.string.pref_use_trash));
        if (preferenceJ19 != null) {
            preferenceJ19.A0(this);
        }
        Preference preferenceJ20 = j(getString(R.string.pref_trash_folder));
        if (preferenceJ20 != null) {
            preferenceJ20.A0(this);
        }
        Preference preferenceJ21 = j(getString(R.string.pref_show_stop_options));
        if (preferenceJ21 != null) {
            preferenceJ21.A0(this);
        }
        Preference preferenceJ22 = j(getString(R.string.pref_screen_watermark_logo));
        if (preferenceJ22 != null) {
            preferenceJ22.A0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(DialogInterface dialogInterface, int i10) {
    }
}
