package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.vungle.ads.ServiceLocator;
import fl.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;
    public static final a Companion = new a(null);
    private static final String TAG = "BlackScreenDetector";
    private volatile tl.o callback;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Function1 $onComplete;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, Function1 function1) {
            super(0);
            this.$view = view;
            this.$onComplete = function1;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m173invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m173invoke() {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.$view.getWidth(), this.$view.getHeight(), Bitmap.Config.ARGB_8888);
                this.$view.draw(new Canvas(bitmapCreateBitmap));
                this.$onComplete.invoke(bitmapCreateBitmap);
            } catch (Throwable th2) {
                q.Companion.e(c.TAG, "Bitmap capture failed", th2);
                this.$onComplete.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0536c extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0536c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements tl.a {
        final /* synthetic */ fl.k $executors$delegate;
        final /* synthetic */ Function1 $onComplete;
        final /* synthetic */ View $view;
        final /* synthetic */ Window $window;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, fl.k kVar, c cVar, Window window, Function1 function1) {
            super(0);
            this.$view = view;
            this.$executors$delegate = kVar;
            this.this$0 = cVar;
            this.$window = window;
            this.$onComplete = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m174invoke$lambda0(int i10, int i11, c this$0, Window window, Rect rect, Function1 onComplete) {
            Bitmap bitmapCreateBitmap;
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(rect, "$rect");
            kotlin.jvm.internal.s.h(onComplete, "$onComplete");
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    this$0.executePixelCopyRequest(window, rect, bitmapCreateBitmap, onComplete);
                } catch (Throwable th2) {
                    th = th2;
                    q.Companion.e(c.TAG, "Bitmap creation failed", th);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    onComplete.invoke(null);
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap = null;
            }
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m175invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m175invoke() {
            final int width = this.$view.getWidth();
            final int height = this.$view.getHeight();
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            final Rect rect = new Rect(i10, i11, i10 + width, i11 + height);
            com.vungle.ads.internal.executor.i jobExecutor = c.m171captureViewWithPixelCopy$lambda0(this.$executors$delegate).getJobExecutor();
            final c cVar = this.this$0;
            final Window window = this.$window;
            final Function1 function1 = this.$onComplete;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.d.m174invoke$lambda0(width, height, cVar, window, rect, function1);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.jvm.internal.t implements Function1 {
        final /* synthetic */ int $samplingFactor;
        final /* synthetic */ View $view;
        final /* synthetic */ c this$0;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends kotlin.jvm.internal.t implements tl.a {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
            @Override // tl.a
            public final com.vungle.ads.internal.executor.a invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, c cVar, int i10) {
            super(1);
            this.$view = view;
            this.this$0 = cVar;
            this.$samplingFactor = i10;
        }

        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        private static final com.vungle.ads.internal.executor.a m176invoke$lambda0(fl.k kVar) {
            return (com.vungle.ads.internal.executor.a) kVar.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m177invoke$lambda1(c this$0, Bitmap bitmap, int i10) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            try {
                fl.q qVarProcessBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i10);
                int iIntValue = ((Number) qVarProcessBitmapForBlackScreen$vungle_ads_release.d()).intValue();
                String str = (String) qVarProcessBitmapForBlackScreen$vungle_ads_release.g();
                tl.o oVar = this$0.callback;
                if (oVar != null) {
                    oVar.invoke(Integer.valueOf(iIntValue), str);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.callback = null;
            } catch (Throwable th2) {
                try {
                    q.Companion.e(c.TAG, "Black screen detection failed", th2);
                    tl.o oVar2 = this$0.callback;
                    if (oVar2 != null) {
                        oVar2.invoke(-1, "Internal calculation error: " + th2.getMessage());
                    }
                } finally {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Bitmap) obj);
            return g0.f38750a;
        }

        public final void invoke(final Bitmap bitmap) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context = this.$view.getContext();
            kotlin.jvm.internal.s.g(context, "view.context");
            com.vungle.ads.internal.executor.i jobExecutor = m176invoke$lambda0(fl.l.a(fl.o.SYNCHRONIZED, new a(context))).getJobExecutor();
            final c cVar = this.this$0;
            final int i10 = this.$samplingFactor;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    c.e.m177invoke$lambda1(cVar, bitmap, i10);
                }
            });
        }
    }

    private final int calculateBlackScreenPercentageWithMargin(Bitmap bitmap, double d10, int i10, double d11) {
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = (int) (((double) width) * d10);
        int i13 = (int) (((double) height) * d10);
        int i14 = width - (i12 * 2);
        int i15 = height - (i13 * 2);
        if (i14 <= 0 || i15 <= 0) {
            return -1;
        }
        long j10 = ((long) i14) * ((long) i15);
        if (j10 > 2147483647L) {
            if (d10 >= d11) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(bitmap, d10 * ((double) 2), i10, d11);
        }
        int i16 = (int) j10;
        int[] iArr = new int[i16];
        bitmap.getPixels(iArr, 0, i14, i12, i13, i14, i15);
        int i17 = i16 - 1;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i10 + '.');
        }
        int iB = nl.c.b(0, i17, i10);
        int i18 = 0;
        if (iB >= 0) {
            int i19 = 0;
            i11 = 0;
            while (true) {
                i18++;
                int i20 = iArr[i19];
                int i21 = (i20 >> 24) & 255;
                int i22 = (i20 >> 16) & 255;
                int i23 = (i20 >> 8) & 255;
                int i24 = i20 & 255;
                if (i21 > 0 && i22 < 10 && i23 < 10 && i24 < 10) {
                    i11++;
                }
                if (i19 == iB) {
                    break;
                }
                i19 += i10;
            }
        } else {
            i11 = 0;
        }
        if (i18 > 0) {
            return (int) ((((long) i11) * ((long) 100)) / ((long) i18));
        }
        return 0;
    }

    static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(c cVar, Bitmap bitmap, double d10, int i10, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 100;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            d11 = 0.5d;
        }
        return cVar.calculateBlackScreenPercentageWithMargin(bitmap, d10, i12, d11);
    }

    private final void captureViewWithCanvas(View view, Function1 function1) {
        y.INSTANCE.runOnUiThread(new b(view, function1));
    }

    private final void captureViewWithPixelCopy(View view, Function1 function1) {
        Activity activity = getActivity(view.getContext());
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            q.Companion.w(TAG, "Activity/Window not found for PixelCopy");
            function1.invoke(null);
        } else {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context = view.getContext();
            kotlin.jvm.internal.s.g(context, "view.context");
            y.INSTANCE.runOnUiThread(new d(view, fl.l.a(fl.o.SYNCHRONIZED, new C0536c(context)), this, window, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final com.vungle.ads.internal.executor.a m171captureViewWithPixelCopy$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.executor.a) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePixelCopyRequest(Window window, Rect rect, final Bitmap bitmap, final Function1 function1) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.b
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    c.m172executePixelCopyRequest$lambda1(function1, bitmap, i10);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th2) {
            q.Companion.e(TAG, "PixelCopy request failed", th2);
            bitmap.recycle();
            function1.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m172executePixelCopyRequest$lambda1(Function1 onComplete, Bitmap bitmap, int i10) {
        kotlin.jvm.internal.s.h(onComplete, "$onComplete");
        kotlin.jvm.internal.s.h(bitmap, "$bitmap");
        if (i10 == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        q.Companion.w(TAG, "PixelCopy failed: " + i10);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void captureViewBitmapAsync$vungle_ads_release(View view, Function1 onComplete) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    public final fl.q processBitmapForBlackScreen$vungle_ads_release(Bitmap bitmap, int i10) {
        if (bitmap != null) {
            int iCalculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, i10, 0.0d, 8, null);
            return new fl.q(Integer.valueOf(iCalculateBlackScreenPercentageWithMargin$default), iCalculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        q.Companion.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new fl.q(-1, "Snapshot capture failure");
    }

    public final void start(View view, int i10, tl.o callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        this.callback = callback;
        if (view != null) {
            captureViewBitmapAsync$vungle_ads_release(view, new e(view, this, i10));
            return;
        }
        q.Companion.w(TAG, "Black screen detection failed: View not available");
        tl.o oVar = this.callback;
        if (oVar != null) {
            oVar.invoke(-1, "View not available");
        }
        this.callback = null;
    }

    public final void stop() {
        this.callback = null;
    }
}
