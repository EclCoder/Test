package com.hecorat.screenrecorder.free.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import bm.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.MainActivity;
import com.hecorat.screenrecorder.free.helpers.webserver.ga.CnrFvGiAIjOOU;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.shake.hNcq.sYaE;
import gl.r;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.g0;
import nh.j0;
import nh.l0;
import re.xQrM.UoyZyZEcGYBpIg;
import vl.Rlkc.CIdIVqKnNZ;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001_B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J)\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/MainActivity;", "Landroidx/appcompat/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lfl/g0;", "N0", "O0", "M0", "P0", "E0", "U0", "T0", "W0", "V0", "K0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "c", "Z", "updateAndroid11", "Llg/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llg/a;", "J0", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Ltf/c;", "e", "Ltf/c;", "binding", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "f", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "F0", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "Ldh/i;", "g", "Ldh/i;", "I0", "()Ldh/i;", "setMainBubbleManager", "(Ldh/i;)V", "mainBubbleManager", "Ldh/f;", "h", "Ldh/f;", "H0", "()Ldh/f;", "setMagicViewManager", "(Ldh/f;)V", "magicViewManager", "Lzg/p;", "i", "Lzg/p;", "G0", "()Lzg/p;", "setGlobalBubbleManager", "(Lzg/p;)V", "globalBubbleManager", "Landroid/view/animation/Animation;", "j", "Landroid/view/animation/Animation;", "swipeAnim", "Landroid/widget/ImageView;", CampaignEx.JSON_KEY_AD_K, "Landroid/widget/ImageView;", "swipeIv", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "animHandler", "m", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends androidx.appcompat.app.d implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean updateAndroid11;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public tf.c binding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics firebaseAnalytics;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public dh.i mainBubbleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public dh.f magicViewManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public p globalBubbleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Animation swipeAnim;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public ImageView swipeIv;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Handler animHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Animation.AnimationListener {
        public b() {
        }

        public static final void b(MainActivity mainActivity) {
            if (mainActivity.swipeAnim != null) {
                tf.c cVar = mainActivity.binding;
                if (cVar == null) {
                    s.w("binding");
                    cVar = null;
                }
                cVar.I.startAnimation(mainActivity.swipeAnim);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            s.h(animation, "animation");
            wp.a.a("onAnimationRepeat", new Object[0]);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            s.h(animation, "animation");
            wp.a.a("onAnimationEnd", new Object[0]);
            tf.c cVar = MainActivity.this.binding;
            if (cVar == null) {
                s.w(HqKnbV.qnkgpRNc);
                cVar = null;
            }
            cVar.J.setImageDrawable(androidx.core.content.a.getDrawable(MainActivity.this, R.drawable.ic_baseline_toggle_on_24));
            Handler handler = MainActivity.this.animHandler;
            final MainActivity mainActivity = MainActivity.this;
            handler.postDelayed(new Runnable() { // from class: ff.g0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.b.b(mainActivity);
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            s.h(animation, "animation");
            wp.a.a("onAnimationStart", new Object[0]);
            tf.c cVar = MainActivity.this.binding;
            if (cVar == null) {
                s.w(UoyZyZEcGYBpIg.ePvKeO);
                cVar = null;
            }
            cVar.J.setImageDrawable(androidx.core.content.a.getDrawable(MainActivity.this, R.drawable.ic_baseline_toggle_off_24));
        }
    }

    private final void E0() {
        int iD = J0().d(R.string.pref_app_version_code, 32);
        if (iD != 70388) {
            J0().k(R.string.pref_app_version_code, 70388);
            if (iD < 70388) {
                J0().j(R.string.pref_show_change_log, true);
            }
            if (iD < 50200 || (iD > 60000 && iD < 60200)) {
                J0().j(R.string.pref_hide_record_window, true);
            }
            if (iD < 70243) {
                this.updateAndroid11 = true;
            }
            if (iD < 70249 && !J0().b(R.string.pref_audio_record_enable, true)) {
                J0().m(R.string.pref_audio_source, "-1");
            }
            if (iD < 70253) {
                W0();
                U0();
                T0();
            }
            if (iD < 70304) {
                V0();
            }
        }
    }

    private final void K0() {
        tf.c cVar = (tf.c) androidx.databinding.g.j(this, R.layout.activity_ask_overlay);
        this.binding = cVar;
        tf.c cVar2 = null;
        if (cVar == null) {
            s.w("binding");
            cVar = null;
        }
        this.swipeIv = cVar.I;
        TranslateAnimation translateAnimation = new TranslateAnimation(-getResources().getDimensionPixelOffset(R.dimen.imageview_normal_size), 0.0f, 0.0f, 0.0f);
        this.swipeAnim = translateAnimation;
        translateAnimation.setDuration(1200L);
        Animation animation = this.swipeAnim;
        if (animation != null) {
            animation.setFillAfter(true);
        }
        Animation animation2 = this.swipeAnim;
        if (animation2 != null) {
            animation2.setAnimationListener(new b());
        }
        tf.c cVar3 = this.binding;
        if (cVar3 == null) {
            s.w("binding");
            cVar3 = null;
        }
        cVar3.F.setOnClickListener(this);
        tf.c cVar4 = this.binding;
        if (cVar4 == null) {
            s.w("binding");
            cVar4 = null;
        }
        cVar4.E.setOnClickListener(this);
        tf.c cVar5 = this.binding;
        if (cVar5 == null) {
            s.w("binding");
        } else {
            cVar2 = cVar5;
        }
        cVar2.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ff.d0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                MainActivity.L0(this.f38511a, compoundButton, z10);
            }
        });
    }

    public static final void L0(MainActivity mainActivity, CompoundButton compoundButton, boolean z10) {
        mainActivity.J0().j(R.string.pref_not_again_ask_overlay_permission, z10);
    }

    private final void M0() {
        String string = UUID.randomUUID().toString();
        s.g(string, "toString(...)");
        J0().m(R.string.pref_uuid, string);
        J0().j(R.string.pref_need_to_show_tutorial, true);
        J0().k(R.string.pref_app_version_code, 70388);
        J0().l(R.string.pref_first_launch_time, System.currentTimeMillis());
    }

    private final void N0() {
        wp.a.h(AzRecorderApp.f22504d).g("launchApp", new Object[0]);
        if (ef.a.h() || ef.a.d() || (lg.c.c() && I0().M())) {
            wp.a.h(AzRecorderApp.f22504d).g("openGallery", new Object[0]);
            l0.v(l0.f47742a, this, false, 2, null);
            return;
        }
        wp.a.h(AzRecorderApp.f22504d).g("don't openGallery", new Object[0]);
        if (J0().a(R.string.pref_app_version_code)) {
            wp.a.h(AzRecorderApp.f22504d).g("not firstUse, check if this is new version", new Object[0]);
            E0();
        } else {
            wp.a.h(AzRecorderApp.f22504d).g("firstUse, installApp", new Object[0]);
            M0();
        }
        if (Build.VERSION.SDK_INT < 30 || !J0().b(R.string.pref_show_camera, false)) {
            l0.D(this, null);
        } else {
            l0.D(this, "add_camera_permission");
        }
        if (this.updateAndroid11) {
            wp.a.h(AzRecorderApp.f22504d).g("updateAndroid11", new Object[0]);
            P0();
            this.updateAndroid11 = false;
        } else if (!lg.c.c() && !J0().b(R.string.pref_not_again_ask_overlay_permission, false)) {
            wp.a.h(AzRecorderApp.f22504d).g("ask for overlay permission", new Object[0]);
            setTheme(R.style.AskOverlayTheme);
            K0();
        } else if (J0().b(R.string.pref_need_to_show_tutorial, false) || !lg.c.c()) {
            wp.a.h(AzRecorderApp.f22504d).g("openGallery because user don't like Overlay permission", new Object[0]);
            l0.f47742a.u(this, true);
        } else {
            wp.a.h(AzRecorderApp.f22504d).g("start launching floating controller", new Object[0]);
            O0();
        }
    }

    private final void O0() {
        G0().s(62, true);
        finish();
    }

    private final void P0() {
        setContentView(R.layout.progress_bar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: ff.c0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.Q0(this.f38507a, handler);
            }
        });
    }

    public static final void Q0(final MainActivity mainActivity, final Handler handler) {
        g0.a(mainActivity.J0(), mainActivity, new MediaScannerConnection.OnScanCompletedListener() { // from class: ff.e0
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                MainActivity.R0(handler, mainActivity, str, uri);
            }
        });
    }

    public static final void R0(Handler handler, final MainActivity mainActivity, String str, Uri uri) {
        handler.post(new Runnable() { // from class: ff.f0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.S0(this.f38517a);
            }
        });
    }

    public static final void S0(MainActivity mainActivity) {
        if (lg.c.c()) {
            mainActivity.O0();
        } else {
            l0.v(l0.f47742a, mainActivity, false, 2, null);
        }
    }

    private final void T0() {
        String strH = J0().h(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        String[] stringArray = getResources().getStringArray(R.array.bitrate_entry_values_for2k);
        if (Arrays.asList(Arrays.copyOf(stringArray, stringArray.length)).contains(strH)) {
            return;
        }
        J0().m(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    private final void U0() {
        if (!J0().b(R.string.pref_enable_countdown_timer, false)) {
            J0().m(R.string.pref_countdown, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            return;
        }
        String strH = J0().h(R.string.pref_countdown, "3");
        String[] stringArray = getResources().getStringArray(R.array.countdown_values);
        List listAsList = Arrays.asList(Arrays.copyOf(stringArray, stringArray.length));
        if (strH == null || !listAsList.contains(strH)) {
            J0().m(R.string.pref_countdown, "3");
        }
    }

    private final void V0() {
        String strH = J0().h(R.string.pref_display_language, "device");
        if (s.c(strH, "device")) {
            return;
        }
        androidx.appcompat.app.h.M(j0.k.b(strH));
    }

    private final void W0() {
        List listL;
        String strH = J0().h(R.string.pref_resolution, "720");
        s.e(strH);
        List listJ = new o("x").j(strH, 0);
        if (!listJ.isEmpty()) {
            ListIterator listIterator = listJ.listIterator(listJ.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listL = r.l();
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listL = r.A0(listJ, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listL = r.l();
            break;
        }
        String[] strArr = (String[]) listL.toArray(new String[0]);
        String strValueOf = String.valueOf(Math.min(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1])));
        String[] stringArray = getResources().getStringArray(R.array.resolution_entry_values_for_2k);
        J0().m(R.string.pref_resolution, Arrays.asList(Arrays.copyOf(stringArray, stringArray.length)).contains(strValueOf) ? strValueOf : "720");
    }

    public final FirebaseAnalytics F0() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        s.w("firebaseAnalytics");
        return null;
    }

    public final p G0() {
        p pVar = this.globalBubbleManager;
        if (pVar != null) {
            return pVar;
        }
        s.w("globalBubbleManager");
        return null;
    }

    public final dh.f H0() {
        dh.f fVar = this.magicViewManager;
        if (fVar != null) {
            return fVar;
        }
        s.w("magicViewManager");
        return null;
    }

    public final dh.i I0() {
        dh.i iVar = this.mainBubbleManager;
        if (iVar != null) {
            return iVar;
        }
        s.w("mainBubbleManager");
        return null;
    }

    public final lg.a J0() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (!lg.c.f("android.settings.action.MANAGE_OVERLAY_PERMISSION")) {
                Bundle bundle = new Bundle();
                bundle.putString("permission_granting", "cancel_at_start");
                F0().a("ask_overlay_permission", bundle);
                l0.v(l0.f47742a, this, false, 2, null);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("permission_granting", "allow_at_start");
            F0().a("ask_overlay_permission", bundle2);
            if (J0().b(R.string.pref_need_to_show_tutorial, false)) {
                l0.v(l0.f47742a, this, false, 2, null);
            } else {
                l0.A(this, "grant_overlay_permission");
                finish();
            }
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onBackPressed() {
        if (lg.c.c()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("permission_granting", "exit_app");
        F0().a("ask_overlay_permission", bundle);
        l0.v(l0.f47742a, this, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().u(this);
        super.onCreate(savedInstanceState);
        if (!getIntent().getBooleanExtra("exit_app", false)) {
            mg.a.f46242e.a().k();
            N0();
            return;
        }
        if (ef.a.d()) {
            finish();
            return;
        }
        if (!J0().b(R.string.pref_has_reported_draw_over_apps_permission, false)) {
            Bundle bundle = new Bundle();
            bundle.putString("permission_granting", lg.c.c() ? "allowed" : "did_not_allow");
            F0().a("check_draw_over_other_apps_permission", bundle);
            J0().j(R.string.pref_has_reported_draw_over_apps_permission, true);
        }
        G0().r(62);
        H0().h();
        stopService(new Intent(this, (Class<?>) RecordService.class));
        finishAffinity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() throws IllegalAccessException, InvocationTargetException {
        sYaE.HrClD.invoke(null, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() throws IllegalAccessException, InvocationTargetException {
        CnrFvGiAIjOOU.FtzeKr.invoke(null, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        s.h(v10, CIdIVqKnNZ.wNrayHSSKkYBMRa);
        int id2 = v10.getId();
        if (id2 == R.id.notification_use_btn) {
            if (!lg.c.f("android.settings.action.MANAGE_OVERLAY_PERMISSION")) {
                Bundle bundle = new Bundle();
                bundle.putString("permission_granting", "use_notification");
                F0().a("ask_overlay_permission", bundle);
                l0.v(l0.f47742a, this, false, 2, null);
            }
            finish();
            return;
        }
        if (id2 != R.id.permission_enable_btn) {
            return;
        }
        try {
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 1);
        } catch (ActivityNotFoundException e10) {
            try {
                com.google.firebase.crashlytics.a.b().d(e10);
                startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + getPackageName())), 1);
            } catch (ActivityNotFoundException e11) {
                com.google.firebase.crashlytics.a.b().d(e11);
                j0.b(this, R.string.device_not_support_overlay);
                l0.v(l0.f47742a, this, false, 2, null);
            }
        }
    }
}
