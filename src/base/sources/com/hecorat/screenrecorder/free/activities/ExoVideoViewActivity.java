package com.hecorat.screenrecorder.free.activities;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Rational;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.SeekBar;
import androidx.activity.d0;
import androidx.transition.t;
import androidx.transition.v;
import com.coremedia.iso.boxes.apple.aJ.StSVLPWGUM;
import com.google.android.exoplayer2.x1;
import com.google.android.exoplayer2.y0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ExoVideoViewActivity;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;
import com.mbridge.msdk.shake.hNcq.sYaE;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import nh.f0;
import nh.h0;
import nh.j0;
import nh.l0;
import pb.z;
import v7.XOSD.qnwOeeQSSWa;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ExoVideoViewActivity extends MediaViewActivity implements View.OnClickListener, f0.b {
    public p A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tf.i f22524c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.k f22531j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f22535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f22536o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Timer f22538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f22539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22541t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Runnable f22543v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FirebaseAnalytics f22546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public lg.a f22547z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22525d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22526e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22527f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22528g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lf.j f22529h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f22530i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22532k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22533l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22537p = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22542u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22544w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rational f22545x = new Rational(16, 9);
    public final vh.h B = new a();
    public final BroadcastReceiver C = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements vh.h {
        public a() {
        }

        @Override // vh.h
        public void a(List list, boolean z10) {
            j0.b(ExoVideoViewActivity.this, R.string.access_storage_permission_message);
            ExoVideoViewActivity.this.x1(0L);
            ExoVideoViewActivity.this.finish();
        }

        @Override // vh.h
        public void b(List list, boolean z10) {
            ExoVideoViewActivity.this.j1();
            ExoVideoViewActivity.this.r1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class b extends d0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            ExoVideoViewActivity.this.o1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10 && ExoVideoViewActivity.this.f22531j != null) {
                ExoVideoViewActivity.this.f22531j.seekTo(i10);
                ExoVideoViewActivity.this.h1(false, 0L);
            }
            ExoVideoViewActivity.this.f22524c.D.setText(l0.c(i10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ExoVideoViewActivity.this.f22524c.F.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ExoVideoViewActivity.this.f22524c.F.setProgress((int) ExoVideoViewActivity.this.f22534m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ExoVideoViewActivity.this.f22531j == null) {
                    return;
                }
                if (!ExoVideoViewActivity.this.z0() && ExoVideoViewActivity.this.s1()) {
                    int currentPosition = (int) ExoVideoViewActivity.this.f22531j.getCurrentPosition();
                    ExoVideoViewActivity.this.f22524c.F.setProgress(currentPosition);
                    ExoVideoViewActivity.this.f22524c.D.setText(l0.c(currentPosition));
                }
                ExoVideoViewActivity exoVideoViewActivity = ExoVideoViewActivity.this;
                exoVideoViewActivity.y1(exoVideoViewActivity.f22531j.isPlaying());
                ExoVideoViewActivity.this.f22530i.postDelayed(this, 500L);
            } catch (OutOfMemoryError e10) {
                wp.a.d("OutOfMemory when updating SeekBar", new Object[0]);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("AZSR.PIP.REWIND_5".equals(action)) {
                if (ExoVideoViewActivity.this.f22531j != null) {
                    ExoVideoViewActivity.this.f22531j.seekTo(Math.max(0L, ExoVideoViewActivity.this.f22531j.getCurrentPosition() - 5000));
                    ExoVideoViewActivity.this.F1();
                    return;
                }
                return;
            }
            if (!"AZSR.PIP.FORWARD_5".equals(action)) {
                if (!"AZSR.PIP.TOGGLE_PLAY".equals(action) || ExoVideoViewActivity.this.f22531j == null) {
                    return;
                }
                boolean z10 = !ExoVideoViewActivity.this.f22531j.getPlayWhenReady();
                ExoVideoViewActivity.this.f22531j.setPlayWhenReady(z10);
                ExoVideoViewActivity.this.y1(z10);
                ExoVideoViewActivity.this.F1();
                return;
            }
            if (ExoVideoViewActivity.this.f22531j != null) {
                long duration = ExoVideoViewActivity.this.f22531j.getDuration();
                long currentPosition = ExoVideoViewActivity.this.f22531j.getCurrentPosition();
                if (duration <= 0) {
                    duration = Long.MAX_VALUE;
                }
                ExoVideoViewActivity.this.f22531j.seekTo(Math.min(duration, currentPosition + 5000));
                ExoVideoViewActivity.this.F1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class g extends TimerTask {
        public g() {
        }

        public static /* synthetic */ void a(g gVar) {
            if (ExoVideoViewActivity.this.f22526e) {
                return;
            }
            ExoVideoViewActivity.this.E1();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExoVideoViewActivity.this.f22530i.post(new Runnable() { // from class: com.hecorat.screenrecorder.free.activities.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExoVideoViewActivity.g.a(this.f22765a);
                }
            });
        }

        public /* synthetic */ g(ExoVideoViewActivity exoVideoViewActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h implements x1.d {
        public h() {
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
            if (!z10) {
                ExoVideoViewActivity.this.C1();
            } else {
                if (ExoVideoViewActivity.this.z0()) {
                    return;
                }
                ExoVideoViewActivity.this.B1();
            }
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            super.onPlayWhenReadyChanged(z10, i10);
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onPlaybackStateChanged(int i10) {
            super.onPlaybackStateChanged(i10);
            if (i10 == 3) {
                if (!ExoVideoViewActivity.this.f22537p) {
                    int duration = (int) ExoVideoViewActivity.this.f22531j.getDuration();
                    ExoVideoViewActivity.this.f22524c.F.setMax(duration);
                    ExoVideoViewActivity.this.f22524c.R.setText(l0.c(duration));
                    ExoVideoViewActivity.this.f22537p = true;
                    ExoVideoViewActivity.this.f22524c.F.setProgress((int) ExoVideoViewActivity.this.f22534m);
                }
            } else if (i10 == 4) {
                ExoVideoViewActivity.this.f22525d = true;
                if (ExoVideoViewActivity.this.f22531j != null) {
                    ExoVideoViewActivity.this.f22531j.setPlayWhenReady(false);
                    ExoVideoViewActivity.this.f22531j.seekTo(0L);
                }
                ExoVideoViewActivity.this.f22524c.F.setProgress(0);
                ExoVideoViewActivity.this.y1(false);
                ExoVideoViewActivity.this.C1();
                if (!ExoVideoViewActivity.this.z0()) {
                    ExoVideoViewActivity.this.h1(false, 0L);
                    if (ExoVideoViewActivity.this.f22526e) {
                        ExoVideoViewActivity.this.E1();
                    }
                    if (!l0.o() && !ExoVideoViewActivity.this.f22528g && ExoVideoViewActivity.this.A1() && ExoVideoViewActivity.this.f22527f == 1) {
                        ExoVideoViewActivity exoVideoViewActivity = ExoVideoViewActivity.this;
                        exoVideoViewActivity.f22528g = exoVideoViewActivity.f22529h.s(ExoVideoViewActivity.this);
                    }
                }
            }
            ExoVideoViewActivity.this.F1();
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void w(z zVar) {
            super.w(zVar);
            if (zVar.f49997a <= 0 || zVar.f49998b <= 0) {
                return;
            }
            ExoVideoViewActivity.this.f22545x = ExoVideoViewActivity.v1(zVar);
            if (Build.VERSION.SDK_INT >= 26 && ExoVideoViewActivity.this.isInPictureInPictureMode()) {
                try {
                    ExoVideoViewActivity exoVideoViewActivity = ExoVideoViewActivity.this;
                    ff.d.a();
                    exoVideoViewActivity.setPictureInPictureParams(ff.c.a().setAspectRatio(ExoVideoViewActivity.this.f22545x).setActions(ExoVideoViewActivity.this.i1()).build());
                } catch (IllegalArgumentException unused) {
                    ExoVideoViewActivity.this.f22545x = new Rational(16, 9);
                    try {
                        ExoVideoViewActivity exoVideoViewActivity2 = ExoVideoViewActivity.this;
                        ff.d.a();
                        exoVideoViewActivity2.setPictureInPictureParams(ff.c.a().setAspectRatio(ExoVideoViewActivity.this.f22545x).setActions(ExoVideoViewActivity.this.i1()).build());
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 31 || ExoVideoViewActivity.this.isInPictureInPictureMode()) {
                return;
            }
            try {
                ExoVideoViewActivity exoVideoViewActivity3 = ExoVideoViewActivity.this;
                ff.d.a();
                exoVideoViewActivity3.setPictureInPictureParams(ff.c.a().setAutoEnterEnabled(true).setAspectRatio(ExoVideoViewActivity.this.f22545x).setActions(ExoVideoViewActivity.this.i1()).build());
            } catch (Throwable unused3) {
            }
        }

        public /* synthetic */ h(ExoVideoViewActivity exoVideoViewActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A1() {
        return this.f22547z.b(R.string.pref_clicked_ok_ask_for_review, false) || this.f22547z.d(R.string.pref_number_of_recordings, 0) != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1() {
        C1();
        e eVar = new e();
        this.f22543v = eVar;
        this.f22530i.postDelayed(eVar, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1() {
        Runnable runnable = this.f22543v;
        if (runnable != null) {
            this.f22530i.removeCallbacks(runnable);
            this.f22543v = null;
        }
    }

    public static /* synthetic */ boolean D0(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    private boolean D1() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            return getPackageManager().hasSystemFeature("android.software.picture_in_picture");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean E0(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1() {
        boolean z10 = this.f22526e;
        this.f22526e = !z10;
        if (z10) {
            tf.i iVar = this.f22524c;
            B0(iVar.N, iVar.A, iVar.C);
        }
        androidx.transition.l lVar = new androidx.transition.l(80);
        lVar.c0(300L);
        lVar.c(this.f22524c.C);
        androidx.transition.l lVar2 = new androidx.transition.l(48);
        lVar2.c0(300L);
        lVar2.c(this.f22524c.A);
        v vVar = new v();
        vVar.m0(lVar);
        vVar.m0(lVar2);
        t.b(this.f22524c.N, vVar);
        this.f22524c.C.setVisibility(this.f22526e ? 8 : 0);
        this.f22524c.A.setVisibility(this.f22526e ? 8 : 0);
        if (this.f22526e) {
            y0(this.f22524c.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1() {
        if (Build.VERSION.SDK_INT < 26 || !isInPictureInPictureMode()) {
            return;
        }
        try {
            ff.d.a();
            setPictureInPictureParams(ff.c.a().setAspectRatio(k1(this.f22545x)).setActions(i1()).build());
        } catch (IllegalArgumentException unused) {
            this.f22545x = new Rational(16, 9);
            try {
                ff.d.a();
                setPictureInPictureParams(ff.c.a().setAspectRatio(this.f22545x).setActions(i1()).build());
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(boolean z10, long j10) {
        Timer timer = this.f22538q;
        if (timer != null) {
            timer.cancel();
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f22538q = timer2;
            timer2.schedule(new g(this, null), j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1() {
        try {
            lg.f fVar = new lg.f();
            try {
                fVar.setDataSource(this, this.f22535n);
                int i10 = Integer.parseInt(fVar.extractMetadata(9));
                if (!l0.o() && this.f22541t != 0) {
                    t1(i10);
                }
                fVar.close();
                x1(1L);
                this.f22542u = true;
                h1(true, 5000L);
            } catch (Throwable th2) {
                try {
                    fVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            x1(0L);
            j0.b(this, R.string.toast_can_not_open_file);
            finish();
        }
    }

    public static Rational k1(Rational rational) {
        if (rational == null || rational.getDenominator() == 0) {
            return new Rational(16, 9);
        }
        float numerator = rational.getNumerator() / rational.getDenominator();
        if (!Float.isFinite(numerator) || numerator <= 0.0f) {
            numerator = 1.7777778f;
        }
        return l1(numerator);
    }

    public static Rational l1(float f10) {
        return new Rational(Math.max(1, Math.round(Math.min(2.39f, Math.max(0.41841f, f10)) * 1000.0f)), 1000);
    }

    public static float m1(z zVar) {
        int iMax = Math.max(1, zVar.f49997a);
        int iMax2 = Math.max(1, zVar.f49998b);
        float f10 = zVar.f50000d;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        float fMax = (iMax * f10) / iMax2;
        if (zVar.f49999c % 180 != 0) {
            fMax = 1.0f / Math.max(1.0E-4f, fMax);
        }
        if (!Float.isFinite(fMax) || fMax <= 0.0f) {
            return 1.7777778f;
        }
        return fMax;
    }

    private void n1() {
        if (Build.VERSION.SDK_INT < 26 || !D1() || isInPictureInPictureMode() || isFinishing() || isDestroyed()) {
            return;
        }
        try {
            ff.d.a();
            enterPictureInPictureMode(ff.c.a().setAspectRatio(k1(this.f22545x)).setActions(i1()).build());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            wp.a.j(e10, "Failed to enter PiP (will ignore on this device/content)", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        l0.s(this, this.f22547z);
        setResult(-1);
        finish();
    }

    private void p1(boolean z10, int i10) {
        if (!z10) {
            j0.b(this, R.string.toast_no_action_performed);
            return;
        }
        l0.A(this, "grant_permission_storage");
        j0.f(getApplicationContext(), getResources().getQuantityString(i10 == 2026 ? R.plurals.toast_deleted_several_media_files : R.plurals.toast_restored_several_media_files, 1, 1));
        l0.s(this, this.f22547z);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1() {
        C1();
        com.google.android.exoplayer2.k kVar = this.f22531j;
        if (kVar != null) {
            try {
                kVar.setPlayWhenReady(false);
                this.f22531j.stop();
            } catch (Throwable unused) {
            }
            tf.i iVar = this.f22524c;
            if (iVar != null) {
                iVar.H.setPlayer(null);
            }
            this.f22531j.o(this.f22539r);
            this.f22531j.release();
            this.f22531j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        if (this.f22531j == null) {
            com.google.android.exoplayer2.k kVarE = new com.google.android.exoplayer2.k.b(this).e();
            this.f22531j = kVarE;
            kVarE.E(this.f22539r);
            this.f22524c.H.setPlayer(this.f22531j);
            this.f22531j.seekTo(this.f22533l, this.f22534m);
            this.f22531j.setPlayWhenReady(this.f22532k);
            y1(this.f22532k);
        }
        this.f22537p = false;
        this.f22531j.A(y0.d(this.f22535n));
        this.f22531j.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s1() {
        tf.i iVar = this.f22524c;
        return iVar != null && iVar.B().isAttachedToWindow();
    }

    private void t1(int i10) {
        if (i10 > 2500) {
            lf.j jVarH = lf.j.h(lf.j.a.VIDEO_VIEW);
            this.f22529h = jVarH;
            jVarH.n(this);
            this.f22527f = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1() {
        com.google.android.exoplayer2.k kVar = this.f22531j;
        if (kVar != null) {
            this.f22534m = kVar.getCurrentPosition();
            this.f22533l = this.f22531j.l();
            this.f22532k = this.f22531j.getPlayWhenReady();
            this.f22531j.o(this.f22539r);
            this.f22531j.release();
            this.f22531j = null;
        }
    }

    public static Rational v1(z zVar) {
        return l1(m1(zVar));
    }

    private void w1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        this.f22546y.a("picture_in_picture", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(long j10) {
        String strU;
        Bundle bundle = new Bundle();
        Uri uri = this.f22535n;
        bundle.putString("file_type", (uri == null || (strU = f0.u(this, uri)) == null || !strU.contains(".")) ? "unknown" : strU.substring(strU.lastIndexOf(".") + 1).toLowerCase());
        bundle.putString("action_source", pf.b.f50032a[this.f22541t]);
        bundle.putLong("success", j10);
        this.f22546y.a("watch_video", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(boolean z10) {
        if (z10) {
            this.f22524c.K.setVisibility(8);
            this.f22524c.J.setVisibility(0);
        } else {
            this.f22524c.K.setVisibility(0);
            this.f22524c.J.setVisibility(8);
        }
    }

    private void z1() {
        this.f22524c.F.setOnSeekBarChangeListener(new c());
        this.f22524c.F.getViewTreeObserver().addOnGlobalLayoutListener(new d());
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f22524c.I.setImageResource(R.drawable.ic_replay_5_24);
            this.f22524c.M.setImageResource(R.drawable.ic_forward_5_24);
        }
        this.f22524c.Q.setDragDirectMode(SwipeBackLayout.c.VERTICAL);
        this.f22524c.C.setOnTouchListener(new View.OnTouchListener() { // from class: ff.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ExoVideoViewActivity.E0(view, motionEvent);
            }
        });
        this.f22524c.F.setOnTouchListener(new View.OnTouchListener() { // from class: ff.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ExoVideoViewActivity.D0(view, motionEvent);
            }
        });
        this.f22524c.J.setOnClickListener(this);
        this.f22524c.P.setOnClickListener(this);
        this.f22524c.G.setOnClickListener(this);
        this.f22524c.E.setOnClickListener(this);
        this.f22524c.L.setOnClickListener(this);
        this.f22524c.K.setOnClickListener(this);
        this.f22524c.I.setOnClickListener(this);
        this.f22524c.M.setOnClickListener(this);
        this.f22524c.B.setOnClickListener(this);
        this.f22524c.O.setOnClickListener(this);
        this.f22524c.H.setOnClickListener(this);
        this.f22524c.E.setVisibility(this.f22536o == null ? 8 : 0);
        this.f22524c.L.setVisibility(this.f22541t != 4 ? 8 : 0);
        if (this.f22541t == 4) {
            this.f22524c.P.setVisibility(8);
            this.f22524c.G.setVisibility(8);
            this.f22524c.E.setImageDrawable(i.a.b(this, R.drawable.ic_delete_forever_24));
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2022) {
            t(i11 == -1);
        } else if (i10 == 2026 || i10 == 2027) {
            p1(i11 == -1, i10);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.back_btn) {
            o1();
        } else if (id2 == R.id.edit_btn) {
            Intent intent = new Intent(this, (Class<?>) EditVideoActivity.class);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.add(this.f22535n);
            intent.putParcelableArrayListExtra("video_uri_list_key", arrayList);
            intent.putExtra("from", 5);
            startActivity(intent);
            finish();
        } else if (id2 == R.id.play_btn) {
            if (this.f22525d) {
                this.f22525d = false;
            }
            com.google.android.exoplayer2.k kVar = this.f22531j;
            if (kVar != null) {
                kVar.setPlayWhenReady(true);
                y1(true);
            }
        } else if (id2 == R.id.pause_btn || id2 == R.id.share_btn || id2 == R.id.delete_btn || id2 == R.id.restore_btn) {
            com.google.android.exoplayer2.k kVar2 = this.f22531j;
            if (kVar2 != null) {
                kVar2.setPlayWhenReady(false);
                y1(false);
            }
            if (id2 == R.id.share_btn) {
                f0.K(this, this.f22535n, "video/*");
            } else if (id2 == R.id.delete_btn) {
                int i10 = this.f22541t;
                if (i10 == 1 || i10 == 3) {
                    f0.p(this, this.f22536o, this, 2022);
                } else {
                    f0.o(this, Collections.singletonList(this.f22536o), this, this.f22541t == 4 ? 2026 : 2022);
                }
            } else if (id2 == R.id.restore_btn) {
                f0.E(this, Collections.singletonList(this.f22535n), 2027);
            }
        } else if (id2 == R.id.forward_btn) {
            com.google.android.exoplayer2.k kVar3 = this.f22531j;
            if (kVar3 != null) {
                this.f22524c.F.setProgress(((int) kVar3.getCurrentPosition()) + 5000);
                com.google.android.exoplayer2.k kVar4 = this.f22531j;
                kVar4.seekTo(kVar4.getCurrentPosition() + 5000);
            }
        } else if (id2 == R.id.rewind_btn) {
            com.google.android.exoplayer2.k kVar5 = this.f22531j;
            if (kVar5 != null) {
                this.f22524c.F.setProgress(((int) kVar5.getCurrentPosition()) - 5000);
                com.google.android.exoplayer2.k kVar6 = this.f22531j;
                kVar6.seekTo(kVar6.getCurrentPosition() - 5000);
            }
        } else if (id2 == R.id.rotate_btn) {
            setRequestedOrientation(this.f22540s ? 1 : 0);
        } else if (id2 == R.id.exo_player_view) {
            E1();
        }
        h1(false, 0L);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f22540s = configuration.orientation == 2;
        if (this.f22526e) {
            return;
        }
        tf.i iVar = this.f22524c;
        B0(iVar.N, iVar.A, iVar.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().F(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f22541t = intent.getIntExtra("from", 0);
        Uri data = intent.getData();
        this.f22535n = data;
        if (data == null) {
            x1(0L);
            finish();
            return;
        }
        this.f22536o = data;
        if (this.f22541t == 0) {
            this.f22536o = f0.x(this, data, 1);
        }
        setRequestedOrientation(4);
        tf.i iVar = (tf.i) androidx.databinding.g.j(this, R.layout.activity_exo_video_view);
        this.f22524c = iVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            iVar.O.setVisibility(8);
        }
        tf.i iVar2 = this.f22524c;
        B0(iVar2.N, iVar2.A, iVar2.C);
        this.f22540s = getResources().getConfiguration().orientation == 2;
        z1();
        this.f22539r = new h(this, null);
        if (this.f22541t != 0 || androidx.core.content.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            j1();
        } else {
            h0.a(this, this.B);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("AZSR.PIP.TOGGLE_PLAY");
        intentFilter.addAction("AZSR.PIP.REWIND_5");
        intentFilter.addAction("AZSR.PIP.FORWARD_5");
        androidx.core.content.a.registerReceiver(this, this.C, intentFilter, 4);
        if (i10 >= 31 && D1()) {
            try {
                ff.d.a();
                setPictureInPictureParams(ff.c.a().setAutoEnterEnabled(true).setAspectRatio(k1(this.f22545x)).setActions(i1()).build());
            } catch (Throwable unused) {
            }
        }
        getOnBackPressedDispatcher().g(this, new b(true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() throws IllegalAccessException, InvocationTargetException {
        sYaE.GgpeX.invoke(null, this);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() throws IllegalAccessException, InvocationTargetException {
        sYaE.agUYVwul.invoke(null, this);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        com.google.android.exoplayer2.k kVar;
        super.onPictureInPictureModeChanged(z10, configuration);
        this.f22524c.A.setVisibility(z10 ? 8 : 0);
        this.f22524c.C.setVisibility(z10 ? 8 : 0);
        if (z10) {
            h1(false, 0L);
            this.f22526e = true;
            C1();
            w1("enter");
        } else if (this.f22544w) {
            q1();
            w1("close");
        } else {
            com.google.android.exoplayer2.k kVar2 = this.f22531j;
            if (kVar2 != null && (kVar2.isPlaying() || this.f22531j.getPlaybackState() == 3)) {
                B1();
            }
            if (!l0.o() && (kVar = this.f22531j) != null && !kVar.isPlaying() && !this.f22528g && A1() && this.f22527f == 1) {
                this.f22528g = this.f22529h.s(this);
            }
            w1("back_to_fullscreen");
        }
        F1();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f22534m = bundle.getLong("play_position");
        this.f22532k = bundle.getBoolean("play_state");
        this.f22525d = bundle.getBoolean("video_ended");
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() throws IllegalAccessException, InvocationTargetException {
        StSVLPWGUM.RfRidUgLPiz.invoke(null, this);
    }

    @Override // androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        com.google.android.exoplayer2.k kVar = this.f22531j;
        if (kVar != null) {
            this.f22534m = kVar.getCurrentPosition();
            this.f22532k = this.f22531j.getPlayWhenReady();
        }
        super.onSaveInstanceState(bundle);
        bundle.putLong("play_position", this.f22534m);
        bundle.putBoolean("play_state", this.f22532k);
        bundle.putBoolean("video_ended", this.f22525d);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() throws IllegalAccessException, InvocationTargetException {
        sYaE.doiSlT.invoke(null, this);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStop() throws IllegalAccessException, InvocationTargetException {
        StSVLPWGUM.qfeOsgTiGkmwyk.invoke(null, this);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        n1();
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        if (!z10) {
            j0.b(this, R.string.toast_video_was_not_deleted);
            return;
        }
        l0.A(this, "grant_permission_storage");
        j0.b(this, f0.N(this) ? R.string.toast_video_have_been_moved_to_trash : R.string.toast_video_have_been_deleted);
        l0.s(this, this.f22547z);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List i1() {
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.EMPTY_LIST;
        }
        com.google.android.exoplayer2.k kVar = this.f22531j;
        boolean z10 = kVar != null && kVar.isPlaying();
        String str = z10 ? "Pause" : "Play";
        int i10 = z10 ? R.drawable.ic_pause_white_32dp : R.drawable.ic_play_white_32dp;
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 2002, new Intent("AZSR.PIP.REWIND_5").setPackage(getPackageName()), 201326592);
        ff.f.a();
        Icon iconCreateWithResource = Icon.createWithResource(this, R.drawable.ic_replay_5_24);
        String str2 = qnwOeeQSSWa.OpwJVPVWERXz;
        RemoteAction remoteActionA = ff.e.a(iconCreateWithResource, str2, str2, broadcast);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 2001, new Intent("AZSR.PIP.TOGGLE_PLAY").setPackage(getPackageName()), 201326592);
        ff.f.a();
        RemoteAction remoteActionA2 = ff.e.a(Icon.createWithResource(this, i10), str, str, broadcast2);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 2003, new Intent("AZSR.PIP.FORWARD_5").setPackage(getPackageName()), 201326592);
        ff.f.a();
        return Arrays.asList(remoteActionA, remoteActionA2, ff.e.a(Icon.createWithResource(this, R.drawable.ic_forward_5_24), "Forward 5s", "Forward 5s", broadcast3));
    }
}
