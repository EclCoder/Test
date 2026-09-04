package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.go, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC3001go implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f26642d;

    public RunnableC3001go(AbstractC3104ko visibilityTracker, AtomicBoolean isPaused) {
        kotlin.jvm.internal.s.h(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.s.h(isPaused, "isPaused");
        this.f26639a = isPaused;
        this.f26640b = new ArrayList();
        this.f26641c = new ArrayList();
        this.f26642d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26639a.get()) {
            return;
        }
        AbstractC3104ko abstractC3104ko = (AbstractC3104ko) this.f26642d.get();
        if (abstractC3104ko != null) {
            abstractC3104ko.f26885k = false;
            for (Map.Entry entry : abstractC3104ko.f26875a.entrySet()) {
                View view = (View) entry.getKey();
                C3052io c3052io = (C3052io) entry.getValue();
                int i10 = c3052io.f26759a;
                View view2 = c3052io.f26761c;
                byte b10 = abstractC3104ko.f26877c;
                boolean z10 = true;
                if (b10 == 1) {
                    C3268r7 c3268r7 = C3346u7.f27601k;
                    if (c3268r7.b(view2, view, i10) && c3268r7.a(view, view, i10)) {
                        this.f26640b.add(view);
                    } else {
                        this.f26641c.add(view);
                    }
                } else if (b10 == 2) {
                    C3268r7 c3268r8 = C3346u7.f27601k;
                    kotlin.jvm.internal.s.f(c3268r8, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    boolean zB = c3268r8.b(view2, view, i10);
                    boolean zA = c3268r8.a(view, view, i10);
                    kotlin.jvm.internal.s.h(view, "view");
                    if (!(view instanceof GestureDetectorOnGestureListenerC3228pi)) {
                        z10 = false;
                        break;
                    }
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        z10 = false;
                        break;
                    }
                    GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) view;
                    int[] iArr = new int[2];
                    gestureDetectorOnGestureListenerC3228pi.getLocationInWindow(iArr);
                    int[] viewableFrameArray = gestureDetectorOnGestureListenerC3228pi.getViewableFrameArray();
                    int i11 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                    int i12 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                    if (!rect.intersect(new Rect(i11, i12, i11 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i12))) {
                        z10 = false;
                        break;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC3228pi.getWidth(), gestureDetectorOnGestureListenerC3228pi.getHeight(), Bitmap.Config.ARGB_8888);
                    kotlin.jvm.internal.s.g(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
                    gestureDetectorOnGestureListenerC3228pi.draw(canvas);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, J3.b(gestureDetectorOnGestureListenerC3228pi.getWidth() / N5.b()), J3.b(gestureDetectorOnGestureListenerC3228pi.getHeight() / N5.b()), true);
                    kotlin.jvm.internal.s.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC3228pi.getViewableFrameArray();
                    int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                    int iMin2 = Math.min(bitmapCreateScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                    int iMin3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, bitmapCreateScaledBitmap.getWidth() - iMin);
                    int iMin4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, bitmapCreateScaledBitmap.getHeight() - iMin2);
                    Bitmap bitmapCreateBitmap2 = (iMin3 <= 0 || iMin4 <= 0) ? null : Bitmap.createBitmap(bitmapCreateScaledBitmap, iMin, iMin2, iMin3, iMin4);
                    if (bitmapCreateBitmap2 == null) {
                        z10 = false;
                        break;
                    }
                    int height = bitmapCreateBitmap2.getHeight() * bitmapCreateBitmap2.getWidth();
                    int[] iArr2 = new int[height];
                    bitmapCreateBitmap2.getPixels(iArr2, 0, bitmapCreateBitmap2.getWidth(), 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= height) {
                            z10 = false;
                            break;
                        }
                        int i15 = iArr2[i13];
                        if (i15 > -16777216 && i15 < 0 && (i14 = i14 + 1) >= gestureDetectorOnGestureListenerC3228pi.getMinimumPixelsPainted()) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (zB && zA && z10) {
                        this.f26640b.add(view);
                    } else {
                        this.f26641c.add(view);
                    }
                } else {
                    C3268r7 c3268r9 = C3346u7.f27601k;
                    if (c3268r9.b(view2, view, i10) && c3268r9.a(view, view, i10)) {
                        this.f26640b.add(view);
                    } else {
                        this.f26641c.add(view);
                    }
                }
            }
        }
        InterfaceC3027ho interfaceC3027ho = abstractC3104ko != null ? abstractC3104ko.f26882h : null;
        if (interfaceC3027ho != null) {
            interfaceC3027ho.a(this.f26640b, this.f26641c);
        }
        this.f26640b.clear();
        this.f26641c.clear();
        if (abstractC3104ko != null) {
            abstractC3104ko.d();
        }
    }
}
