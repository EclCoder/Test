package dg;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.ThumbnailUtils;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity;
import com.hecorat.screenrecorder.free.activities.ScreenshotReviewActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import em.k0;
import em.o0;
import fl.g0;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import nh.f0;
import nh.j0;
import nh.l0;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f36814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cg.a f36815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk.a f36816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dk.a f36817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f36818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f36819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f36820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f36821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageReader f36822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Surface f36823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f36824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VirtualDisplay f36825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Bitmap f36829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f36830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f36831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private HandlerThread f36832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MediaProjection f36833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Handler f36834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f36835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f36836w;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    final class a implements Runnable {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final u uVar, final Bitmap bitmap, final Uri uri) {
            uVar.f36834u.post(new Runnable() { // from class: dg.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.d(uVar, uri, bitmap);
                }
            });
            uVar.H();
            FirebaseAnalytics.getInstance(uVar.f36835v).a("take_screenshot", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(u uVar, Uri uri, Bitmap bitmap) {
            uVar.D(uri, bitmap);
        }

        @Override // java.lang.Runnable
        public void run() {
            Image imageAcquireLatestImage;
            wp.a.a("Start Image saver", new Object[0]);
            ImageReader imageReader = u.this.f36822i;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, u.this.f36831r);
            }
            ImageReader imageReader2 = u.this.f36822i;
            if (imageReader2 == null || (imageAcquireLatestImage = imageReader2.acquireLatestImage()) == null) {
                return;
            }
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = planes[0].getRowStride();
            int i10 = u.this.f36827n * pixelStride * u.this.f36828o;
            byte[] bArr = new byte[u.this.f36827n * pixelStride];
            u.this.f36821h = ByteBuffer.allocate(i10);
            int i11 = u.this.f36828o;
            for (int i12 = 0; i12 < i11; i12++) {
                buffer.position(i12 * rowStride);
                buffer.get(bArr, 0, u.this.f36827n * pixelStride);
                ByteBuffer byteBuffer = u.this.f36821h;
                if (byteBuffer != null) {
                    byteBuffer.put(bArr);
                }
            }
            ByteBuffer byteBuffer2 = u.this.f36821h;
            if (byteBuffer2 != null) {
                byteBuffer2.rewind();
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(u.this.f36827n, u.this.f36828o, Bitmap.Config.ARGB_8888);
            ByteBuffer byteBuffer3 = u.this.f36821h;
            if (byteBuffer3 != null) {
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer3);
            }
            if (ef.a.e()) {
                int dimensionPixelSize = u.this.f36835v.getResources().getDimensionPixelSize(R.dimen.screenshot_notification_thumb_size);
                u.this.f36829p = ThumbnailUtils.extractThumbnail(bitmapCreateBitmap, dimensionPixelSize, dimensionPixelSize);
            }
            imageAcquireLatestImage.close();
            Context context = u.this.f36835v;
            final u uVar = u.this;
            f0.H(context, bitmapCreateBitmap, false, new f0.e() { // from class: dg.s
                @Override // nh.f0.e
                public final void a(Uri uri) {
                    u.a.c(uVar, bitmapCreateBitmap, uri);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f36839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f36840c;

        c(Bitmap bitmap, Uri uri) {
            this.f36839b = bitmap;
            this.f36840c = uri;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
            wp.a.a("onAnimationEnd", new Object[0]);
            u.this.J();
            ImageView imageView = u.this.f36830q;
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
            if (!this.f36839b.isRecycled()) {
                this.f36839b.recycle();
            }
            u.this.R();
            u.this.B();
            if (ef.a.h() || ef.a.f()) {
                return;
            }
            u.this.L(this.f36840c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends MediaProjection.Callback {
        d() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            super.onStop();
            wp.a.a("On media projection stop", new Object[0]);
            if (Build.VERSION.SDK_INT >= 29) {
                l0.D(u.this.f36835v, "show_stop_screenshot_notification");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class f extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36843r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f36845t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, kl.f fVar) {
            super(2, fVar);
            this.f36845t = uri;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return u.this.new f(this.f36845t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f36843r;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    cg.a aVar = u.this.f36815b;
                    g0 g0Var = g0.f38750a;
                    this.f36843r = 1;
                    obj = aVar.b(g0Var, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                if (!((Boolean) wg.d.b((wg.c) obj, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue()) {
                    if (ef.a.e()) {
                        ((zg.v) u.this.f36816c.get()).j(u.this.f36829p, this.f36845t);
                    } else {
                        ScreenshotReviewActivity.B0(u.this.f36835v, this.f36845t);
                    }
                }
            } catch (NullPointerException e10) {
                wp.a.e(e10);
                j0.j(u.this.f36835v, R.string.toast_try_again);
                com.google.firebase.crashlytics.a.b().d(e10);
            } catch (SecurityException e11) {
                wp.a.e(e11);
                j0.j(u.this.f36835v, R.string.screenshot_captured2);
                com.google.firebase.crashlytics.a.b().d(e11);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(u uVar, boolean z10) {
        if (z10) {
            uVar.Q();
        } else {
            uVar.B();
            j0.b(uVar.f36835v, R.string.toast_cant_use_without_grant_permission_edited);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        ef.a.p(false);
        synchronized (this.f36820g) {
            try {
                for (b bVar : this.f36820g) {
                    kotlin.jvm.internal.s.e(bVar);
                    bVar.a();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void C() {
        ef.a.p(true);
        synchronized (this.f36820g) {
            try {
                for (b bVar : this.f36820g) {
                    kotlin.jvm.internal.s.e(bVar);
                    bVar.b();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Uri uri, Bitmap bitmap) {
        try {
            View viewInflate = LayoutInflater.from(this.f36835v).inflate(R.layout.flash_view, (ViewGroup) null);
            this.f36824k = viewInflate;
            ImageView imageView = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.flash_iv) : null;
            this.f36830q = imageView;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            this.f36814a.addView(this.f36824k, new WindowManager.LayoutParams(-1, -1, AzRecorderApp.e().f(), Sdk$SDKError.b.DEEPLINK_OPEN_FAILED_VALUE, -3));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f36835v, R.anim.scale_down);
            animationLoadAnimation.setAnimationListener(new c(bitmap, uri));
            wp.a.a("startAnimation", new Object[0]);
            ImageView imageView2 = this.f36830q;
            if (imageView2 != null) {
                imageView2.startAnimation(animationLoadAnimation);
            }
        } catch (Exception e10) {
            H();
            R();
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private final VirtualDisplay E(MediaProjection mediaProjection) {
        mediaProjection.registerCallback(new d(), this.f36834u);
        VirtualDisplay virtualDisplayCreateVirtualDisplay = mediaProjection.createVirtualDisplay("screencap", this.f36827n, this.f36828o, this.f36826m, 16, this.f36823j, null, null);
        kotlin.jvm.internal.s.e(virtualDisplayCreateVirtualDisplay);
        return virtualDisplayCreateVirtualDisplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(u uVar, ImageReader imageReader) {
        Handler handler = uVar.f36831r;
        kotlin.jvm.internal.s.e(handler);
        handler.post(uVar.new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void H() {
        try {
            VirtualDisplay virtualDisplay = this.f36825l;
            if (virtualDisplay != null) {
                kotlin.jvm.internal.s.e(virtualDisplay);
                virtualDisplay.release();
                this.f36825l = null;
            }
            this.f36834u.post(new Runnable() { // from class: dg.r
                @Override // java.lang.Runnable
                public final void run() {
                    u.I(this.f36808a);
                }
            });
            ImageReader imageReader = this.f36822i;
            if (imageReader != null) {
                kotlin.jvm.internal.s.e(imageReader);
                imageReader.close();
                this.f36822i = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(u uVar) {
        if (ef.a.h() || ef.a.f()) {
            return;
        }
        MediaProjection mediaProjection = uVar.f36833t;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        uVar.f36833t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        View view = this.f36824k;
        if (view != null) {
            kotlin.jvm.internal.s.e(view);
            if (view.isAttachedToWindow()) {
                this.f36814a.removeView(this.f36824k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Uri uri) {
        if (uri != null) {
            em.k.d(this.f36818e, this.f36819f, null, new f(uri, null), 2, null);
        } else {
            j0.j(this.f36835v, R.string.toast_try_again);
        }
    }

    private final synchronized void M() {
        try {
            wp.a.a("start background thread", new Object[0]);
            N();
            try {
                S();
                ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f36827n, this.f36828o, 1, 2);
                this.f36822i = imageReaderNewInstance;
                this.f36823j = imageReaderNewInstance != null ? imageReaderNewInstance.getSurface() : null;
                MediaProjection mediaProjectionA = RecordService.INSTANCE.a();
                this.f36833t = mediaProjectionA;
                kotlin.jvm.internal.s.e(mediaProjectionA);
                this.f36825l = E(mediaProjectionA);
                ImageReader imageReader = this.f36822i;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(this.f36836w, this.f36831r);
                }
            } catch (Exception e10) {
                H();
                R();
                B();
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                j0.h(R.string.toast_start_capture_fail);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void N() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f36832s = handlerThread;
        kotlin.jvm.internal.s.e(handlerThread);
        handlerThread.start();
        HandlerThread handlerThread2 = this.f36832s;
        kotlin.jvm.internal.s.e(handlerThread2);
        this.f36831r = new Handler(handlerThread2.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(u uVar) {
        uVar.M();
    }

    private final void Q() {
        int i10;
        if (!l0.o()) {
            lf.l.f44461f.a(lf.l.a.REVIEW).a();
            lf.c.f44397g.a(lf.c.a.REVIEW).a();
        }
        try {
            if (RecordService.INSTANCE.b() == null || (i10 = Build.VERSION.SDK_INT) > 33) {
                Context context = this.f36835v;
                kotlin.jvm.internal.s.g(context, "context");
                mh.b.b(context, "start_screenshot", 0, 4, null);
            } else {
                if (i10 >= 29) {
                    l0.D(this.f36835v, "add_screenshot_permissions");
                }
                O(100L);
            }
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            Context context2 = this.f36835v;
            kotlin.jvm.internal.s.g(context2, "context");
            mh.b.b(context2, "start_screenshot", 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void R() {
        HandlerThread handlerThread = this.f36832s;
        if (handlerThread != null) {
            kotlin.jvm.internal.s.e(handlerThread);
            handlerThread.quitSafely();
            try {
                HandlerThread handlerThread2 = this.f36832s;
                kotlin.jvm.internal.s.e(handlerThread2);
                handlerThread2.join();
                this.f36832s = null;
                this.f36831r = null;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    private final void S() {
        Object systemService = this.f36835v.getSystemService("window");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            this.f36827n = displayMetrics.widthPixels;
            this.f36828o = displayMetrics.heightPixels;
            this.f36826m = displayMetrics.densityDpi;
            return;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        kotlin.jvm.internal.s.g(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        Rect bounds = currentWindowMetrics.getBounds();
        kotlin.jvm.internal.s.g(bounds, "getBounds(...)");
        this.f36827n = bounds.width();
        this.f36828o = bounds.height();
        this.f36826m = this.f36835v.getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        C();
        if (Build.VERSION.SDK_INT < 30) {
            lg.c.m(new lg.c.a() { // from class: dg.q
                @Override // lg.c.a
                public final void a(boolean z10) {
                    u.A(this.f36807a, z10);
                }
            });
        } else {
            Q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:17:0x001e, B:19:0x0024, B:21:0x0039, B:22:0x004b, B:12:0x0016), top: B:27:0x0001 }] */
    public final synchronized void G(boolean z10) {
        try {
            if (ef.a.h() || ef.a.d() || ef.a.f()) {
                if (Build.VERSION.SDK_INT > 33) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Object systemService = this.f36835v.getSystemService("activity");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                if (((ActivityManager) systemService).isBackgroundRestricted()) {
                    RestrictedBackgroundWarningActivity.Companion companion = RestrictedBackgroundWarningActivity.INSTANCE;
                    Context context = this.f36835v;
                    kotlin.jvm.internal.s.g(context, "context");
                    companion.a(context, new e());
                } else {
                    z();
                }
            } else {
                z();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void K(b bVar) {
        synchronized (this.f36820g) {
            this.f36820g.remove(bVar);
        }
    }

    public final void O(long j10) {
        if (ef.a.e()) {
            ((bh.e) this.f36817d.get()).I();
        }
        this.f36834u.postDelayed(new Runnable() { // from class: dg.p
            @Override // java.lang.Runnable
            public final void run() {
                u.P(this.f36806a);
            }
        }, j10);
    }

    public final void y(b bVar) {
        synchronized (this.f36820g) {
            this.f36820g.add(bVar);
        }
    }

    public u(WindowManager windowManager, cg.a aVar, dk.a screenshotNotiManager, dk.a drawerBubbleManager, o0 externalScope, k0 mainDispatcher) {
        kotlin.jvm.internal.s.h(windowManager, "windowManager");
        kotlin.jvm.internal.s.h(aVar, qnwOeeQSSWa.rIoPJempsrp);
        kotlin.jvm.internal.s.h(screenshotNotiManager, "screenshotNotiManager");
        kotlin.jvm.internal.s.h(drawerBubbleManager, "drawerBubbleManager");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(mainDispatcher, "mainDispatcher");
        this.f36814a = windowManager;
        this.f36815b = aVar;
        this.f36816c = screenshotNotiManager;
        this.f36817d = drawerBubbleManager;
        this.f36818e = externalScope;
        this.f36819f = mainDispatcher;
        this.f36820g = new HashSet();
        this.f36834u = new Handler(Looper.getMainLooper());
        this.f36835v = AzRecorderApp.e().getApplicationContext();
        this.f36836w = new ImageReader.OnImageAvailableListener() { // from class: dg.o
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                u.F(this.f36805a, imageReader);
            }
        };
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements RestrictedBackgroundWarningActivity.b {
        e() {
        }

        @Override // com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity.b
        public void ignore() {
            u.this.z();
        }

        @Override // com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity.b
        public void a() {
        }
    }
}
