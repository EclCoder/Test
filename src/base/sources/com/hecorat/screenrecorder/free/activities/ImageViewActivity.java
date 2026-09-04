package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.activity.d0;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.coremedia.iso.boxes.apple.aJ.StSVLPWGUM;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ImageViewActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.AddStickerActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.AddTextActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.BlackWhiteActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.BlurActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.DrawOnBitmapActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.ImageCropActivity;
import com.hecorat.screenrecorder.free.helpers.zoom.ImageViewTouch;
import com.hecorat.screenrecorder.free.widget.GifView;
import com.mbridge.msdk.shake.hNcq.sYaE;
import h2.Ynu.kdlJedXNVoSIa;
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
import nh.k0;
import nh.l0;
import tf.u;
import wf.m;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ImageViewActivity extends MediaViewActivity implements View.OnTouchListener, View.OnClickListener, f0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f22589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f22590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f22591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GifView f22594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f22595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f22596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f22597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f22601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f22602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f22603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FirebaseAnalytics f22604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lf.j f22605t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final vh.h f22606u = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements vh.h {
        public a() {
        }

        @Override // vh.h
        public void a(List list, boolean z10) {
            j0.b(ImageViewActivity.this, R.string.access_storage_permission_message);
            ImageViewActivity.this.c1("unknown", 0L);
            ImageViewActivity.this.finish();
        }

        @Override // vh.h
        public void b(List list, boolean z10) {
            ImageViewActivity.this.Z0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class b extends d0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            ImageViewActivity.this.e1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class c implements lf.j.c {
        public c() {
        }

        @Override // lf.j.c
        public void onAdDismissed() {
            ImageViewActivity.this.finish();
        }

        @Override // lf.j.c
        public void x() {
            ImageViewActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d implements ViewPager.j {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            ImageViewActivity.this.f22592g = i10;
            String strG = ((pg.d) ImageViewActivity.this.f22591f.get(ImageViewActivity.this.f22592g)).g();
            ImageViewActivity.this.f22595j.Z.setText(strG);
            if (ImageViewActivity.this.f22593h) {
                ImageViewActivity.this.U0();
            } else {
                ImageViewActivity.this.f1();
            }
            ImageViewActivity.this.b1(strG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class e implements f0.c {
        public e() {
        }

        @Override // nh.f0.c
        public void a(f0.d dVar) {
            ImageViewActivity.this.V0(dVar);
        }

        @Override // nh.f0.c
        public void b(String str, String str2) {
            ImageViewActivity.this.f22596k = str;
            ImageViewActivity.this.f22597l = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (!ImageViewActivity.this.f22593h) {
                ImageViewActivity.this.f22595j.Y.setVisibility(8);
            } else {
                if (ImageViewActivity.this.f22599n) {
                    return;
                }
                ImageViewActivity.this.f22595j.Y.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class g implements Animation.AnimationListener {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (ImageViewActivity.this.f22593h) {
                ImageViewActivity.this.f22595j.A.setVisibility(0);
                ImageViewActivity.this.U0();
            } else {
                ImageViewActivity.this.f22595j.A.setVisibility(8);
                ImageViewActivity imageViewActivity = ImageViewActivity.this;
                imageViewActivity.y0(imageViewActivity.f22595j.W);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends PagerAdapter {
        public h() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ImageViewActivity.this.f22591f.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            pg.d dVar = (pg.d) ImageViewActivity.this.f22591f.get(i10);
            String strW0 = ImageViewActivity.this.W0(dVar.g());
            Uri uriF = dVar.f();
            View viewInflate = LayoutInflater.from(ImageViewActivity.this).inflate(R.layout.pager_item, viewGroup, false);
            ImageViewTouch imageViewTouch = (ImageViewTouch) viewInflate.findViewById(R.id.iv_thumb);
            final ImageViewActivity imageViewActivity = ImageViewActivity.this;
            imageViewTouch.setSingleTapListener(new ImageViewTouch.c() { // from class: com.hecorat.screenrecorder.free.activities.d
                @Override // com.hecorat.screenrecorder.free.helpers.zoom.ImageViewTouch.c
                public final void a() {
                    imageViewActivity.f1();
                }
            });
            GifView gifView = (GifView) viewInflate.findViewById(R.id.gif1);
            gifView.setTag(GifView.class.getSimpleName() + i10);
            if ("image/gif".equals(strW0)) {
                imageViewTouch.setVisibility(8);
                gifView.setVisibility(0);
                gifView.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.activities.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ImageViewActivity.this.f1();
                    }
                });
                gifView.setGifImageUri(uriF);
            } else {
                imageViewTouch.setVisibility(0);
                gifView.setVisibility(8);
                ((com.bumptech.glide.k) com.bumptech.glide.c.C(ImageViewActivity.this).r(uriF).k()).A0(imageViewTouch);
            }
            try {
                viewGroup.addView(viewInflate, 0);
                return viewInflate;
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                return viewInflate;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        public /* synthetic */ h(ImageViewActivity imageViewActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends TimerTask {
        public i() {
        }

        public static /* synthetic */ void a(i iVar) {
            if (ImageViewActivity.this.f22593h) {
                ImageViewActivity.this.f1();
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            new Handler(ImageViewActivity.this.getMainLooper()).post(new Runnable() { // from class: com.hecorat.screenrecorder.free.activities.f
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewActivity.i.a(this.f22768a);
                }
            });
        }

        public /* synthetic */ i(ImageViewActivity imageViewActivity, a aVar) {
            this();
        }
    }

    public static /* synthetic */ void D0(ImageViewActivity imageViewActivity, ArrayList arrayList) {
        imageViewActivity.f22591f.addAll(arrayList);
        imageViewActivity.Z0();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    private String T0() {
        String string;
        ArrayList arrayList = new ArrayList(Arrays.asList("_id", "_data", "_display_name", "date_modified", "_size"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            arrayList.add("volume_name");
        }
        if (i10 >= 30) {
            arrayList.add("resolution");
        }
        try {
            Cursor cursorQuery = getContentResolver().query(this.f22601p, (String[]) arrayList.toArray(new String[0]), null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                        this.f22591f.add(new pg.c(string2.endsWith(".gif") ? 3 : 2, j10, string2, string, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified")), this.f22601p, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size")), i10 >= 30 ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("resolution")) : null));
                    } else {
                        string = null;
                    }
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } else {
                string = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return string;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        Timer timer = this.f22589d;
        if (timer != null) {
            timer.cancel();
            this.f22589d.purge();
        }
        Timer timer2 = new Timer();
        this.f22589d = timer2;
        timer2.schedule(new i(this, null), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String W0(String str) {
        return str.endsWith(".gif") ? "image/gif" : "image/*";
    }

    private boolean X0(Uri uri) {
        int iB;
        return (uri == null || (iB = k0.b(getApplicationContext(), uri)) == 2 || iB == 1) ? false : true;
    }

    private void Y0() {
        int i10;
        boolean z10 = !l0.o() && ((i10 = this.f22588c) == 2 || i10 == 3);
        this.f22598m = z10;
        if (z10) {
            lf.j jVarH = lf.j.h(lf.j.a.IMAGE_VIEW);
            this.f22605t = jVarH;
            jVarH.n(this);
            this.f22605t.q(new c());
        }
        lf.i.g(lf.l.m(lf.l.a.SHARE), lf.c.n(lf.c.a.SHARE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0() {
        String strG;
        if (!X0(this.f22601p)) {
            j0.b(this, R.string.toast_can_not_open_file);
            c1("unknown", 0L);
            finish();
            return;
        }
        int i10 = 0;
        if (this.f22588c != 0) {
            while (true) {
                if (i10 >= this.f22591f.size()) {
                    strG = "";
                    break;
                } else {
                    if (((pg.d) this.f22591f.get(i10)).f().equals(this.f22601p)) {
                        this.f22592g = i10;
                        strG = ((pg.d) this.f22591f.get(i10)).g();
                        break;
                    }
                    i10++;
                }
            }
        } else {
            this.f22592g = 0;
            strG = T0();
        }
        if (strG == null) {
            j0.b(this, R.string.toast_can_not_open_file);
            c1("unknown", 0L);
            finish();
            return;
        }
        c1(strG.contains(".") ? strG.substring(strG.lastIndexOf(".") + 1).toLowerCase() : "unknown", 1L);
        h hVar = new h(this, null);
        this.f22590e = hVar;
        this.f22595j.f53382a0.setAdapter(hVar);
        this.f22595j.f53382a0.setCurrentItem(this.f22592g);
        this.f22595j.Z.setText(strG);
        b1(strG);
        this.f22595j.f53382a0.addOnPageChangeListener(new d());
        this.f22593h = true;
        U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(String str) {
        if (!str.endsWith(".gif")) {
            this.f22595j.U.setVisibility(0);
            this.f22595j.V.setVisibility(0);
            this.f22595j.P.setVisibility(0);
            this.f22595j.N.setVisibility(0);
            this.f22595j.R.setVisibility(0);
            this.f22595j.O.setVisibility(0);
            this.f22595j.S.setVisibility(8);
            return;
        }
        this.f22595j.U.setVisibility(8);
        this.f22595j.V.setVisibility(8);
        this.f22595j.P.setVisibility(8);
        this.f22595j.N.setVisibility(8);
        this.f22595j.R.setVisibility(8);
        this.f22595j.O.setVisibility(8);
        this.f22595j.S.setVisibility(0);
        GifView gifView = (GifView) this.f22595j.f53382a0.findViewWithTag(GifView.class.getSimpleName() + this.f22592g);
        this.f22594i = gifView;
        if (gifView != null) {
            gifView.g();
        }
        this.f22595j.J.setImageDrawable(androidx.core.content.a.getDrawable(this, R.drawable.ic_pause_white_32dp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("file_type", str);
        bundle.putLong("success", j10);
        bundle.putString("action_source", pf.b.f50032a[this.f22588c]);
        this.f22604s.a("view_photo", bundle);
    }

    private void d1() {
        this.f22595j.E.setOnClickListener(this);
        this.f22595j.B.setOnClickListener(this);
        this.f22595j.H.setOnClickListener(this);
        this.f22595j.K.setOnClickListener(this);
        this.f22595j.F.setOnClickListener(this);
        this.f22595j.I.setOnClickListener(this);
        this.f22595j.C.setOnClickListener(this);
        this.f22595j.D.setOnClickListener(this);
        this.f22595j.G.setOnClickListener(this);
        this.f22595j.L.setOnClickListener(this);
        this.f22595j.Y.setOnTouchListener(this);
        this.f22595j.M.setOnClickListener(this);
        this.f22595j.J.setOnClickListener(this);
        this.f22595j.Q.setVisibility((this.f22588c == 0 && this.f22602q == null) ? 8 : 0);
        this.f22595j.H.setVisibility((this.f22588c == 0 || this.f22599n) ? 8 : 0);
        if (this.f22599n) {
            this.f22595j.I.setVisibility(8);
            this.f22595j.Y.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        if (!l0.o() && this.f22598m && this.f22605t.s(this)) {
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f1() {
        TranslateAnimation translateAnimation;
        TranslateAnimation translateAnimation2;
        try {
            boolean z10 = this.f22593h;
            this.f22593h = !z10;
            if (!z10) {
                u uVar = this.f22595j;
                B0(uVar.W, uVar.A, uVar.Y);
            }
            if (this.f22593h) {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, nh.b.a(this, 100), 0.0f);
                translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, -nh.b.a(this, 50), 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, nh.b.a(this, 100));
                translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -nh.b.a(this, 50));
            }
            translateAnimation.setDuration(200L);
            translateAnimation.setAnimationListener(new f());
            translateAnimation2.setDuration(200L);
            translateAnimation2.setAnimationListener(new g());
            this.f22595j.Y.startAnimation(translateAnimation);
            this.f22595j.A.startAnimation(translateAnimation2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void V0(f0.d dVar) {
        if (dVar != f0.d.SUCCESSFUL) {
            if (dVar == f0.d.FAILED) {
                j0.b(this, R.string.toast_can_not_rename_file);
            }
        } else {
            pg.d dVar2 = (pg.d) this.f22591f.get(this.f22592g);
            this.f22595j.Z.setText(this.f22596k);
            dVar2.o(this.f22596k);
            dVar2.m(this.f22597l);
        }
    }

    public void a1() {
        V0(f0.G(this, (pg.d) this.f22591f.get(this.f22592g), this.f22596k));
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        super.onActivityResult(i10, i11, intent);
        if ((i10 == 1234 || i10 == 1235 || i10 == 1236) && (data = intent.getData()) != null) {
            f0.B(this, data, "image/*");
            finish();
        }
        if (i10 == 2025) {
            t(i11 == -1);
        }
        if (i10 == 2024 && i11 == -1) {
            a1();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        pg.d dVar = (pg.d) this.f22591f.get(this.f22592g);
        if (id2 == R.id.iv_crop) {
            Intent intent = new Intent(this, (Class<?>) ImageCropActivity.class);
            intent.setData(dVar.f());
            intent.putExtra("from", 5);
            startActivityForResult(intent, 1234);
            return;
        }
        if (id2 == R.id.iv_black_white) {
            Intent intent2 = new Intent(this, (Class<?>) BlackWhiteActivity.class);
            intent2.setData(dVar.f());
            startActivityForResult(intent2, 1235);
            return;
        }
        if (id2 == R.id.iv_blur) {
            Intent intent3 = new Intent(this, (Class<?>) BlurActivity.class);
            intent3.setData(dVar.f());
            startActivityForResult(intent3, 1236);
            return;
        }
        if (id2 == R.id.iv_draw) {
            Intent intent4 = new Intent(this, (Class<?>) DrawOnBitmapActivity.class);
            intent4.setData(dVar.f());
            startActivityForResult(intent4, 1235);
            return;
        }
        if (id2 == R.id.iv_sticker) {
            Intent intent5 = new Intent(this, (Class<?>) AddStickerActivity.class);
            intent5.setData(dVar.f());
            startActivityForResult(intent5, 1236);
            return;
        }
        if (id2 == R.id.iv_text) {
            Intent intent6 = new Intent(this, (Class<?>) AddTextActivity.class);
            intent6.setData(dVar.f());
            startActivityForResult(intent6, 1236);
            return;
        }
        if (id2 == R.id.iv_share) {
            f0.K(this, dVar.f(), W0(dVar.g()));
            return;
        }
        if (id2 == R.id.iv_delete) {
            try {
                Uri uriF = this.f22588c == 0 ? this.f22602q : ((pg.d) this.f22591f.get(this.f22592g)).f();
                int i10 = this.f22588c;
                if (i10 != 1 && i10 != 3) {
                    f0.o(this, Collections.singletonList(uriF), this, 2025);
                    return;
                }
                f0.p(this, uriF, this, 2025);
                return;
            } catch (IndexOutOfBoundsException e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                return;
            }
        }
        if (id2 == R.id.iv_image_info) {
            String strE = dVar.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Path: ");
            sb2.append(strE);
            String strH = dVar.h();
            if (strH != null) {
                sb2.append("\n\nResolution: ");
                sb2.append(strH);
            }
            if (dVar.j() > 0) {
                String strC = nh.e.c(dVar.j());
                sb2.append("\nSize: ");
                sb2.append(strC);
            }
            m.u(sb2.toString()).show(getSupportFragmentManager(), "dialog");
            return;
        }
        if (id2 == R.id.iv_back) {
            e1();
            return;
        }
        if (id2 != R.id.iv_play_pause) {
            if (id2 == R.id.iv_edit_name) {
                f0.L(this, dVar, new e());
                return;
            }
            return;
        }
        if (this.f22594i == null) {
            this.f22594i = (GifView) this.f22595j.f53382a0.findViewWithTag(GifView.class.getSimpleName() + this.f22592g);
        }
        GifView gifView = this.f22594i;
        if (gifView == null) {
            j0.b(this, R.string.toast_file_not_found);
        } else if (gifView.e()) {
            this.f22594i.f();
            this.f22595j.J.setImageDrawable(androidx.core.content.a.getDrawable(this, R.drawable.ic_play_white_32dp));
        } else {
            this.f22594i.g();
            this.f22595j.J.setImageDrawable(androidx.core.content.a.getDrawable(this, R.drawable.ic_pause_white_32dp));
        }
    }

    @Override // androidx.appcompat.app.d, androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f22600o = configuration.orientation == 2;
        if (this.f22593h) {
            u uVar = this.f22595j;
            B0(uVar.W, uVar.A, uVar.Y);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().L(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("from", 0);
        this.f22588c = intExtra;
        this.f22599n = intExtra == 4;
        Uri data = intent.getData();
        this.f22601p = data;
        if (this.f22588c == 0) {
            this.f22602q = f0.x(this, data, 2);
        }
        setRequestedOrientation(4);
        u uVar = (u) androidx.databinding.g.j(this, R.layout.activity_image_view);
        this.f22595j = uVar;
        B0(uVar.W, uVar.A, uVar.Y);
        this.f22600o = getResources().getConfiguration().orientation == 2;
        d1();
        Y0();
        this.f22591f = new ArrayList();
        if (this.f22588c != 0) {
            new mf.l().i(new mf.l.a() { // from class: ff.x
                @Override // mf.l.a
                public final void a(ArrayList arrayList) {
                    ImageViewActivity.D0(this.f38582a, arrayList);
                }
            });
        } else if (androidx.core.content.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Z0();
        } else {
            h0.a(this, this.f22606u);
        }
        getOnBackPressedDispatcher().f(new b(true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() throws IllegalAccessException, InvocationTargetException {
        sYaE.KlG.invoke(null, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() throws IllegalAccessException, InvocationTargetException {
        StSVLPWGUM.efZSA.invoke(null, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() throws IllegalAccessException, InvocationTargetException {
        kdlJedXNVoSIa.scdBzqCitl.invoke(null, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return view.getId() == R.id.layout_toolbar;
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        if (!z10) {
            j0.b(this, R.string.toast_image_was_not_deleted);
            return;
        }
        l0.A(this, "grant_permission_storage");
        j0.b(this, f0.N(this) ? R.string.toast_image_have_been_moved_to_trash : R.string.toast_image_have_been_deleted);
        this.f22591f.remove(this.f22592g);
        if (this.f22591f.size() < 1) {
            this.f22590e.notifyDataSetChanged();
            finish();
            return;
        }
        if (this.f22592g == this.f22591f.size()) {
            this.f22592g--;
        }
        this.f22590e.notifyDataSetChanged();
        this.f22595j.f53382a0.setCurrentItem(this.f22592g);
        String strG = ((pg.d) this.f22591f.get(this.f22592g)).g();
        this.f22595j.Z.setText(strG);
        b1(strG);
    }
}
