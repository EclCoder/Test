package com.hecorat.screenrecorder.free.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.d0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.q0;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.AboutActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.FAQActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.LanguagesActivity;
import com.hecorat.screenrecorder.free.feedback.FeedbackActivity;
import com.hecorat.screenrecorder.free.helpers.webserver.ga.CnrFvGiAIjOOU;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.mbridge.msdk.shake.hNcq.sYaE;
import fl.g0;
import ig.m0;
import ig.w0;
import ig.x;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.r;
import nh.f0;
import nh.l0;
import tf.o;
import vh.i0;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class HomeActivity extends ff.b implements dg.l.b, SharedPreferences.OnSharedPreferenceChangeListener, lg.g {
    public static final int[] Q = {R.string.videos, R.string.screenshots, R.string.utilities, R.string.az_common_setting};
    public static final int[] R = {R.drawable.ic_video_outline, R.drawable.ic_image_outline, R.drawable.baseline_construction_24, R.drawable.ic_setting_outline};
    public FrameLayout A;
    public lf.i C;
    public o D;
    public lf.h E;
    public lg.a F;
    public FirebaseAnalytics G;
    public p H;
    public dg.l I;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f22556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22557d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TabLayout f22559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewPager2 f22560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DrawerLayout f22561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuItem f22562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f22563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f22564k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem f22566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MenuItem f22567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f22568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f22569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f22570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MenuItem f22573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f22574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.app.b f22575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w0 f22576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ig.j f22577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m0 f22578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x f22579z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22558e = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22565l = false;
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final Handler J = new Handler();
    public long K = 0;
    public boolean L = false;
    public final TabLayout.d M = new e();
    public final vh.h N = new vh.h() { // from class: ff.s
        @Override // vh.h
        public final void b(List list, boolean z10) {
            HomeActivity.K0(this.f38561a, list, z10);
        }
    };
    public final View.OnClickListener O = new View.OnClickListener() { // from class: ff.t
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HomeActivity.G0(this.f38566a, view);
        }
    };
    public final Runnable P = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (HomeActivity.this.B.getAndSet(true)) {
                return;
            }
            HomeActivity.this.A.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            HomeActivity.this.C.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class b extends d0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            try {
                if (HomeActivity.this.f22557d == 0 && HomeActivity.this.f22576w != null && HomeActivity.this.f22576w.H() != null && HomeActivity.this.f22576w.H().f43309a) {
                    HomeActivity.this.f22576w.H().J(false);
                    return;
                }
                if (HomeActivity.this.f22557d == 1 && HomeActivity.this.f22577x != null && HomeActivity.this.f22577x.z().p()) {
                    HomeActivity.this.f22577x.z().l();
                } else if (HomeActivity.this.f22557d != 0) {
                    HomeActivity.this.f22557d = 0;
                    HomeActivity.this.f22560g.j(HomeActivity.this.f22557d, true);
                } else {
                    HomeActivity.this.finish();
                    HomeActivity.this.finish();
                }
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c implements OnAdInspectorClosedListener {
        public c() {
        }

        @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
        public void onAdInspectorClosed(AdInspectorError adInspectorError) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d extends androidx.appcompat.app.b {
        public d(Activity activity, DrawerLayout drawerLayout, int i10, int i11) {
            super(activity, drawerLayout, i10, i11);
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            super.a(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class e implements TabLayout.d {
        public e() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            HomeActivity.this.f22557d = gVar.g();
            HomeActivity.this.n1();
            gVar.f().setAlpha(255);
            HomeActivity.this.k1();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            gVar.f().setAlpha(50);
            HomeActivity.this.f22557d = gVar.g();
            int i10 = HomeActivity.this.f22557d;
            if (i10 == 0) {
                if (HomeActivity.this.f22576w.H() == null || !HomeActivity.this.f22576w.H().f43309a) {
                    return;
                }
                HomeActivity.this.f22576w.H().J(false);
                return;
            }
            if (i10 == 1 && HomeActivity.this.f22577x.z() != null && HomeActivity.this.f22577x.z().p()) {
                HomeActivity.this.p1(false);
                HomeActivity.this.o1(false);
                HomeActivity.this.f22577x.z().f43288a = false;
                HomeActivity.this.f22577x.z().r(false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeActivity.this.r1();
            HomeActivity.this.J.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            String action = intent.getAction();
            action.getClass();
            switch (action) {
                case "saved_new_video":
                    try {
                        HomeActivity.this.f22576w.G();
                        break;
                    } catch (Exception e10) {
                        wp.a.e(e10);
                        com.google.firebase.crashlytics.a.b().d(e10);
                        return;
                    }
                    break;
                case "grant_permission_storage":
                    try {
                        HomeActivity.this.f22576w.G();
                        HomeActivity.this.f22577x.y();
                        break;
                    } catch (Exception e11) {
                        wp.a.e(e11);
                        com.google.firebase.crashlytics.a.b().d(e11);
                        return;
                    }
                    break;
                case "grant_overlay_permission":
                    if (lg.c.c()) {
                        HomeActivity.this.F.m(R.string.pref_countdown, "3");
                        break;
                    }
                    break;
            }
        }

        public /* synthetic */ g(HomeActivity homeActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class h extends w4.a {
        public h(s sVar) {
            super(sVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return HomeActivity.this.f22556c.size();
        }

        @Override // w4.a
        public Fragment h(int i10) {
            return (Fragment) HomeActivity.this.f22556c.get(i10);
        }
    }

    public static /* synthetic */ void A0(HomeActivity homeActivity, TabLayout.g gVar, int i10) {
        homeActivity.getClass();
        gVar.p(homeActivity.getString(Q[i10]));
    }

    private void A1() {
        if (this.f22567n == null) {
            return;
        }
        boolean z10 = false;
        boolean zB = this.F.b(R.string.pref_has_shown_battery_prompt, false);
        MenuItem menuItem = this.f22567n;
        if (!e1() && !zB) {
            z10 = true;
        }
        menuItem.setVisible(z10);
    }

    public static /* synthetic */ void B0(HomeActivity homeActivity) {
        homeActivity.J.post(homeActivity.P);
        homeActivity.k1();
    }

    public static /* synthetic */ void D0(HomeActivity homeActivity, rc.e eVar) {
        homeActivity.getClass();
        if (eVar != null) {
            Toast.makeText(homeActivity, eVar.b(), 0).show();
        }
    }

    public static /* synthetic */ void E0(HomeActivity homeActivity, AlertDialog alertDialog, View view) {
        homeActivity.getClass();
        alertDialog.dismiss();
        homeActivity.g1();
    }

    public static /* synthetic */ void F0(HomeActivity homeActivity, Boolean bool) {
        homeActivity.getClass();
        if (Boolean.TRUE.equals(bool) && !ef.a.h() && homeActivity.getLifecycle().b().e(androidx.lifecycle.s.b.RESUMED)) {
            qf.j.x().U(homeActivity);
        }
    }

    public static /* synthetic */ void G0(HomeActivity homeActivity, View view) {
        homeActivity.getClass();
        if (SystemClock.elapsedRealtime() - homeActivity.K < 1000) {
            return;
        }
        homeActivity.K = SystemClock.elapsedRealtime();
        if (ef.a.h()) {
            homeActivity.I.x0("fab_button");
        } else {
            homeActivity.I.w0("fab_button");
        }
    }

    public static /* synthetic */ void H0(HomeActivity homeActivity) {
        homeActivity.J.removeCallbacks(homeActivity.P);
        homeActivity.k1();
    }

    public static /* synthetic */ void I0(HomeActivity homeActivity, boolean z10) {
        o oVar = homeActivity.D;
        if (oVar == null) {
            return;
        }
        if (z10) {
            oVar.G.a0();
        } else {
            oVar.G.h0();
        }
    }

    public static /* synthetic */ g0 J0(HomeActivity homeActivity) {
        homeActivity.h1();
        return null;
    }

    public static /* synthetic */ void K0(HomeActivity homeActivity, List list, boolean z10) {
        homeActivity.getClass();
        if (!z10 || ef.a.h()) {
            return;
        }
        homeActivity.w1();
    }

    public static /* synthetic */ void L0(HomeActivity homeActivity, rc.e eVar) {
        if (eVar != null) {
            homeActivity.getClass();
            wp.a.g("%s: %s", Integer.valueOf(eVar.a()), eVar.b());
        }
        homeActivity.f22569p.setVisibility(homeActivity.E.k() ? 0 : 8);
    }

    public static /* synthetic */ void M0(HomeActivity homeActivity) {
        homeActivity.J.post(homeActivity.P);
        homeActivity.k1();
    }

    public static /* synthetic */ void N0(HomeActivity homeActivity) {
        homeActivity.J.removeCallbacks(homeActivity.P);
        homeActivity.k1();
    }

    private void b1() {
        if (this.D == null) {
            return;
        }
        final boolean z10 = ef.a.h() || (this.f22557d == 0 && !this.L);
        this.D.G.post(new Runnable() { // from class: ff.k
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.I0(this.f38535a, z10);
            }
        });
    }

    private void d1() {
        this.f22556c = new ArrayList();
        this.f22576w = new w0();
        this.f22577x = new ig.j();
        this.f22578y = new m0();
        this.f22579z = new x();
        this.f22556c.add(0, this.f22576w);
        this.f22556c.add(1, this.f22577x);
        this.f22556c.add(2, this.f22578y);
        this.f22556c.add(3, this.f22579z);
        this.f22560g.setAdapter(new h(this));
        new com.google.android.material.tabs.d(this.f22559f, this.f22560g, new com.google.android.material.tabs.d.b() { // from class: ff.q
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.g gVar, int i10) {
                HomeActivity.A0(this.f38555a, gVar, i10);
            }
        }).a();
        int i10 = 0;
        while (true) {
            int[] iArr = R;
            if (i10 >= iArr.length) {
                this.f22559f.setTabGravity(0);
                this.f22560g.setOffscreenPageLimit(2);
                this.f22560g.j(this.f22557d, true);
                this.f22559f.h(this.M);
                return;
            }
            this.f22559f.z(i10).p("").m(iArr[i10]).f().setAlpha(this.f22557d == i10 ? 255 : 50);
            i10++;
        }
    }

    private boolean e1() {
        return ((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName());
    }

    private boolean f1() {
        try {
            w0 w0Var = this.f22576w;
            if (w0Var != null && w0Var.H() != null && this.f22576w.H().f43309a) {
                return true;
            }
            ig.j jVar = this.f22577x;
            return (jVar == null || jVar.z() == null || !this.f22577x.z().p()) ? false : true;
        } catch (Exception e10) {
            wp.a.e(e10);
            return false;
        }
    }

    private void h1() {
        if (ef.a.h()) {
            return;
        }
        if (qf.j.E()) {
            qf.j.x().U(this);
        }
        if (this.f22565l) {
            return;
        }
        this.f22565l = true;
        qf.j.J().j(this, new q0() { // from class: ff.n
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                HomeActivity.F0(this.f38546a, (Boolean) obj);
            }
        });
    }

    private void i1() {
        this.G.a("view_survey_prompt", null);
        wf.g.c(R.string.survey_dialog_title, R.string.survey_dialog_message, R.string.survey_positive_act, android.R.string.cancel, android.R.string.no, R.drawable.ic_survey_speaker, "", false).show(getFragmentManager(), "Survey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        if (this.D == null) {
            return;
        }
        boolean zH = ef.a.h();
        boolean z10 = zH && this.I.f0();
        if (zH) {
            this.D.G.setIconResource(R.drawable.ic_round_stop_24);
            this.D.G.setContentDescription(getString(R.string.cd_stop_recording));
            n0.q0.A0(this.D.G, getString(z10 ? R.string.notification_pausing_title : R.string.notification_recording_title));
            r1();
        } else {
            this.D.G.setIconResource(R.drawable.ic_record);
            this.D.G.setContentDescription(getString(R.string.record));
            n0.q0.A0(this.D.G, null);
            this.D.G.setText(R.string.record);
        }
        this.D.G.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(this, R.color.bright_red)));
        if (!z10) {
            this.D.G.clearAnimation();
        } else if (this.D.G.getAnimation() == null) {
            this.D.G.startAnimation(AnimationUtils.loadAnimation(this, R.anim.blink));
        }
        b1();
        this.D.G.setVisibility(f1() ? 8 : 0);
    }

    private void l1() {
        if (Build.VERSION.SDK_INT < 33 || ef.a.h()) {
            return;
        }
        i0.j(this).g("android.permission.POST_NOTIFICATIONS").b(new r()).h(this.N);
    }

    private void m1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("utility_type", str);
        this.G.a("select_drawer_item", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.C(Q[this.f22557d]);
    }

    private void q1() {
        d dVar = new d(this, this.f22561h, R.string.open_drawer, R.string.close_drawer);
        this.f22575v = dVar;
        this.f22561h.a(dVar);
        this.f22575v.k();
        View viewFindViewById = this.f22561h.findViewById(R.id.layout_upgrade);
        this.f22568o = viewFindViewById;
        viewFindViewById.setVisibility(l0.o() ? 8 : 0);
        View viewFindViewById2 = this.f22561h.findViewById(R.id.layout_privacy_options);
        this.f22569p = viewFindViewById2;
        viewFindViewById2.setVisibility(this.E.k() ? 0 : 8);
        ((LinearLayout) this.f22561h.findViewById(R.id.layout_trash)).setVisibility(Build.VERSION.SDK_INT < 30 ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        long jX = this.I.X();
        this.D.G.setText(String.format(Locale.US, "%02d:%02d", Long.valueOf(jX / 60), Long.valueOf(jX % 60)));
    }

    private void s1() {
        o1(false);
        n1();
    }

    private void t1() {
        u0(this.D.I);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
            aVarL0.A(true);
        }
    }

    private void u1() {
        this.D.G.setOnClickListener(this.O);
        this.I.B(this);
        if (ef.a.h() && !this.I.f0()) {
            this.J.post(this.P);
        }
        k1();
    }

    private void v1() {
        if (e1()) {
            g1();
            return;
        }
        this.F.j(R.string.pref_has_shown_battery_prompt, true);
        invalidateOptionsMenu();
        Bundle bundle = new Bundle();
        bundle.putString("action", com.vungle.ads.internal.presenter.g.OPEN);
        this.G.a("avoid_unexpected_stop", bundle);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_battery_optimization, (ViewGroup) null);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.TransparentDialogTheme).setView(viewInflate).create();
        viewInflate.findViewById(R.id.positive_btn).setOnClickListener(new View.OnClickListener() { // from class: ff.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.E0(this.f38571a, alertDialogCreate, view);
            }
        });
        viewInflate.findViewById(R.id.negative_btn).setOnClickListener(new View.OnClickListener() { // from class: ff.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        alertDialogCreate.show();
    }

    private void w1() {
        l0.D(this, "show_idle_notification");
    }

    private boolean x1(boolean z10) {
        if (this.F.b(R.string.pref_need_to_show_tutorial, false)) {
            this.F.j(R.string.pref_need_to_show_tutorial, false);
            startActivityForResult(new Intent(this, (Class<?>) TutorialActivity.class), 1008);
            return true;
        }
        if (!z10) {
            l1();
        }
        return false;
    }

    private void y1() {
        this.E.f(this, new lf.h.b() { // from class: ff.j
            @Override // lf.h.b
            public final void a(rc.e eVar) {
                HomeActivity.L0(this.f38533a, eVar);
            }
        });
    }

    @Override // dg.l.b
    public void b() {
    }

    public void c1(int i10) {
        MenuItem menuItem = this.f22564k;
        if (menuItem == null) {
            return;
        }
        if (i10 < 5) {
            menuItem.setVisible(false);
            return;
        }
        this.f22570q = "";
        if ("".isEmpty()) {
            this.f22564k.setVisible(false);
            return;
        }
        int iD = this.F.h(R.string.pref_current_survey_url, "").equals(this.f22570q) ? this.F.d(R.string.pref_current_survey_view_times, 0) : 0;
        this.f22571r = iD;
        this.f22572s = 0;
        if (iD >= 0) {
            this.f22564k.setVisible(false);
        } else {
            this.f22564k.setVisible(true);
        }
    }

    public void click(View view) {
        this.f22561h.h();
        int id2 = view.getId();
        if (id2 == R.id.layout_upgrade) {
            m1("upgrade");
            Intent intent = new Intent(this, (Class<?>) UpgradeActivity.class);
            intent.putExtra("action_source", "navigation_drawer");
            startActivityForResult(intent, 882);
            return;
        }
        if (id2 == R.id.layout_trash) {
            m1("trash_folder");
            startActivity(new Intent(this, (Class<?>) TrashFolderActivity.class));
            return;
        }
        if (id2 == R.id.layout_feedback) {
            m1("send_feedback");
            startActivity(new Intent(this, (Class<?>) FeedbackActivity.class));
            return;
        }
        if (id2 == R.id.layout_share) {
            m1("share_app");
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.hecorat.screenrecorder.free");
            startActivity(Intent.createChooser(intent2, getString(R.string.share_app_title)));
            return;
        }
        if (id2 == R.id.layout_language) {
            m1("choose_language");
            startActivity(new Intent(this, (Class<?>) LanguagesActivity.class));
            return;
        }
        if (id2 == R.id.community_ll) {
            m1("join_community");
            l0.t(this);
            return;
        }
        if (id2 == R.id.layout_question) {
            m1("faqs");
            startActivity(new Intent(this, (Class<?>) FAQActivity.class));
        } else if (id2 == R.id.layout_privacy_options) {
            m1("privacy_options");
            this.E.l(this, new rc.b.a() { // from class: ff.r
                @Override // rc.b.a
                public final void a(rc.e eVar) {
                    HomeActivity.D0(this.f38558a, eVar);
                }
            });
        } else if (id2 == R.id.layout_about) {
            m1("about_us");
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
        }
    }

    @Override // dg.l.b
    public void d() {
        runOnUiThread(new Runnable() { // from class: ff.u
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.N0(this.f38568a);
            }
        });
    }

    @Override // dg.l.b
    public void i() {
        runOnUiThread(new Runnable() { // from class: ff.o
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.H0(this.f38550a);
            }
        });
    }

    public void j1(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        b1();
    }

    @Override // lg.g
    public void k(int i10) {
        this.G.a("answer_survey", null);
        lg.a aVar = this.F;
        int i11 = this.f22571r + 1;
        this.f22571r = i11;
        aVar.k(R.string.pref_current_survey_view_times, i11);
        this.F.m(R.string.pref_current_survey_url, this.f22570q);
        if (this.f22571r >= this.f22572s) {
            this.f22564k.setVisible(false);
        }
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.f22764d, this.f22570q);
        startActivity(intent);
    }

    @Override // dg.l.b
    public void o() {
        runOnUiThread(new Runnable() { // from class: ff.m
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.B0(this.f38543a);
            }
        });
    }

    public void o1(boolean z10) {
        MenuItem menuItem = this.f22573t;
        if (menuItem == null || this.f22563j == null) {
            return;
        }
        menuItem.setIcon(R.drawable.ic_select_all);
        this.f22558e = false;
        this.f22573t.setVisible(z10);
        this.f22563j.setVisible(z10);
        if (this.f22557d == 1) {
            this.f22562i.setVisible(z10);
        } else {
            this.f22562i.setVisible(false);
        }
        k1();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 882) {
            if (i10 == 1008) {
                l1();
            } else if (i10 == 2022) {
                this.f22576w.E(i11 == -1);
            } else if (i10 != 2024) {
                if (i10 == 2025) {
                    this.f22577x.x(i11 == -1 ? f0.d.SUCCESSFUL : f0.d.FAILED);
                }
            } else if (i11 == -1) {
                this.f22576w.L();
            }
        } else if (i11 == -1) {
            lf.i iVar = this.C;
            if (iVar != null) {
                iVar.h();
            }
            this.A.removeAllViews();
            this.A.setVisibility(8);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AzRecorderApp.d().H(this);
        super.onCreate(bundle);
        nh.b.b(this);
        boolean zX1 = x1(bundle != null);
        this.f22557d = getIntent().getIntExtra("fragment_code", 0);
        o oVar = (o) androidx.databinding.g.j(this, R.layout.activity_home);
        this.D = oVar;
        y0(oVar.B());
        o oVar2 = this.D;
        this.f22559f = oVar2.H;
        this.f22560g = oVar2.J;
        this.f22561h = oVar2.C;
        this.A = oVar2.A;
        this.E = lf.h.j(AzRecorderApp.e().getApplicationContext());
        t1();
        q1();
        d1();
        s1();
        u1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("grant_overlay_permission");
        intentFilter.addAction("grant_permission_storage");
        intentFilter.addAction("saved_new_video");
        g gVar = new g(this, null);
        this.f22574u = gVar;
        l0.z(this, gVar, intentFilter);
        this.F.g().registerOnSharedPreferenceChangeListener(this);
        if (!l0.o()) {
            if (!zX1) {
                y1();
            }
            lf.i iVar = new lf.i(lf.c.n(lf.c.a.HOME), lf.l.m(lf.l.a.HOME), this.A, this.D.D.F, null, true);
            this.C = iVar;
            iVar.i();
            this.A.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
        getOnBackPressedDispatcher().g(this, new b(true));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_settings, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_upgrade);
        this.f22566m = menuItemFindItem;
        menuItemFindItem.setVisible(!l0.o());
        this.f22573t = menu.findItem(R.id.action_select_all);
        this.f22563j = menu.findItem(R.id.action_delete);
        if (f0.N(this)) {
            this.f22563j.setTitle(R.string.move_to_trash);
        }
        this.f22562i = menu.findItem(R.id.action_share);
        o1(false);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.action_survey);
        this.f22564k = menuItemFindItem2;
        menuItemFindItem2.setVisible(false);
        this.f22567n = menu.findItem(R.id.action_protect_recording);
        A1();
        menu.findItem(R.id.action_ads_inspector).setVisible(false);
        return true;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, InvocationTargetException {
        sYaE.jrd.invoke(null, this);
    }

    @Override // androidx.activity.p, android.app.Activity
    protected void onNewIntent(Intent intent) {
        int intExtra = intent.getIntExtra("fragment_code", -1);
        this.f22557d = intExtra;
        this.f22560g.setCurrentItem(intExtra);
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        androidx.appcompat.app.b bVar = this.f22575v;
        if (bVar != null && bVar.f(menuItem)) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getOnBackPressedDispatcher().l();
            return true;
        }
        if (itemId == R.id.action_upgrade) {
            Intent intent = new Intent(this, (Class<?>) UpgradeActivity.class);
            intent.putExtra("action_source", "gift_icon_in_main");
            startActivityForResult(intent, 882);
            return true;
        }
        if (itemId == R.id.action_select_all) {
            if (this.f22558e) {
                this.f22573t.setIcon(R.drawable.ic_select_all);
                if (this.f22557d == 0) {
                    this.f22576w.H().I(false);
                }
                if (this.f22557d == 1) {
                    this.f22577x.z().r(false);
                }
                this.f22558e = false;
            } else {
                this.f22573t.setIcon(R.drawable.ic_select_all_checked);
                if (this.f22557d == 0) {
                    this.f22576w.H().I(true);
                }
                if (this.f22557d == 1) {
                    this.f22577x.z().r(true);
                }
                this.f22558e = true;
            }
        }
        if (itemId == R.id.action_delete) {
            if (this.f22557d == 0) {
                this.f22576w.F();
            }
            if (this.f22557d == 1) {
                try {
                    this.f22577x.z().k();
                } catch (NullPointerException e10) {
                    wp.a.e(e10);
                    com.google.firebase.crashlytics.a.b().d(e10);
                }
            }
        }
        if (itemId == R.id.action_share && this.f22557d == 1) {
            this.f22577x.z().s();
        }
        if (itemId == R.id.action_protect_recording) {
            v1();
            return true;
        }
        if (itemId == R.id.action_survey) {
            i1();
        }
        if (itemId == R.id.action_ads_inspector) {
            MobileAds.openAdInspector(this, new c());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPause() throws IllegalAccessException, InvocationTargetException {
        CnrFvGiAIjOOU.mmzYcLkWgfe.invoke(null, this);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        boolean zL = false;
        if (!RecordService.r() && ef.a.h()) {
            wp.a.a("Start service in HomeActivity", new Object[0]);
            l0.D(this, null);
            this.H.s(62, false);
        }
        lf.i iVar = this.C;
        if (iVar != null) {
            iVar.j();
        }
        if (!l0.o() && !ef.a.h() && getIntent().getBooleanExtra("show_open_app_ads", false)) {
            getIntent().removeExtra("show_open_app_ads");
            zL = mg.a.g().l(this, new tl.a() { // from class: ff.p
                @Override // tl.a
                public final Object invoke() {
                    return HomeActivity.J0(this.f38552a);
                }
            });
        }
        if (!zL) {
            h1();
        }
        A1();
        k1();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        MenuItem menuItem;
        if (!Objects.equals(str, getString(R.string.pref_bought_products)) || (menuItem = this.f22566m) == null) {
            return;
        }
        boolean zIsVisible = menuItem.isVisible();
        boolean zO = l0.o();
        this.f22566m.setVisible(!zO);
        this.f22568o.setVisibility(zO ? 8 : 0);
        if (zIsVisible != this.f22566m.isVisible()) {
            if (this.f22576w.isAdded()) {
                this.f22576w.M();
            }
            if (this.f22577x.isAdded()) {
                this.f22577x.C();
            }
            if (this.f22579z.isAdded()) {
                this.f22579z.p0();
            }
        }
    }

    public void p1(boolean z10) {
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        if (!z10) {
            this.f22575v.i(true);
            this.f22561h.setDrawerLockMode(0);
            n1();
        } else {
            this.f22575v.i(false);
            this.f22561h.setDrawerLockMode(1);
            aVarL0.y(R.drawable.ic_close_24dp);
            aVarL0.D("");
        }
    }

    @Override // dg.l.b
    public void s() {
    }

    @Override // lg.g
    public void w(int i10) {
    }

    @Override // dg.l.b
    public void y() {
        runOnUiThread(new Runnable() { // from class: ff.l
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.M0(this.f38539a);
            }
        });
    }

    public void z1(int i10, Fragment fragment) {
        this.f22556c.set(i10, fragment);
        if (i10 == 0) {
            this.f22576w = (w0) fragment;
            return;
        }
        if (i10 == 1) {
            this.f22577x = (ig.j) fragment;
        } else if (i10 == 2) {
            this.f22578y = (m0) fragment;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f22579z = (x) fragment;
        }
    }

    private void g1() {
        Bundle bundle = new Bundle();
        bundle.putString(NhHRaDJCHtCTJR.RhpeXVML, com.vungle.ads.internal.presenter.g.OPEN);
        this.G.a("avoid_unexpected_stop", bundle);
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
    }
}
