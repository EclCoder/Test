package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, c> trackedViews;
    private final Handler visibilityHandler;
    private final d visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final a Companion = new a(null);
    private static final String TAG = i.class.getSimpleName();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void onImpression(View view);

        void onViewInvisible(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        private b impressionListener;
        private int minViewablePercent;

        public final b getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(b bVar) {
            this.impressionListener = bVar;
        }

        public final void setMinViewablePercent(int i10) {
            this.minViewablePercent = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class d implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b impressionListener;
            b impressionListener2;
            int i10 = 0;
            i.this.isVisibilityScheduled = false;
            for (Map.Entry entry : i.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (i.this.isVisible(view, ((c) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            ArrayList<View> arrayList = this.visibleViews;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = arrayList.get(i11);
                i11++;
                View view3 = view2;
                c cVar = (c) i.this.trackedViews.get(view3);
                if (cVar != null && (impressionListener2 = cVar.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view3);
                }
                i iVar = i.this;
                s.g(view3, "view");
                iVar.removeView(view3);
            }
            this.visibleViews.clear();
            ArrayList<View> arrayList2 = this.invisibleViews;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                View view4 = arrayList2.get(i10);
                i10++;
                View view5 = view4;
                c cVar2 = (c) i.this.trackedViews.get(view5);
                if (cVar2 != null && (impressionListener = cVar2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(view5);
                }
            }
            this.invisibleViews.clear();
            if (i.this.trackedViews.isEmpty() || i.this.setViewTreeObserverSucceed) {
                return;
            }
            i.this.scheduleVisibilityCheck();
        }
    }

    public i(Context context, Map<View, c> trackedViews, Handler visibilityHandler) {
        s.h(context, "context");
        s.h(trackedViews, "trackedViews");
        s.h(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new d();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.h
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return i.m95_init_$lambda0(this.f35806a);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m95_init_$lambda0(i this$0) {
        s.h(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            if (!q0.S(view)) {
                com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
                String TAG2 = TAG;
                s.g(TAG2, "TAG");
                aVar.w(TAG2, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                return rootView;
            }
        }
        return viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i10) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    com.vungle.ads.internal.util.q.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (!view.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
            long height = ((long) view.getHeight()) * ((long) view.getWidth());
            if (height > 0 && ((long) 100) * jHeight >= ((long) i10) * height) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            com.vungle.ads.internal.util.q.a aVar = com.vungle.ads.internal.util.q.Companion;
            String TAG2 = TAG;
            s.g(TAG2, "TAG");
            aVar.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        com.vungle.ads.internal.util.q.a aVar2 = com.vungle.ads.internal.util.q.Companion;
        String TAG3 = TAG;
        s.g(TAG3, "TAG");
        aVar2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, b bVar) {
        s.h(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        c cVar = this.trackedViews.get(view);
        if (cVar == null) {
            cVar = new c();
            this.trackedViews.put(view, cVar);
            scheduleVisibilityCheck();
        }
        cVar.setMinViewablePercent(1);
        cVar.setImpressionListener(bVar);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        s.h(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        s.h(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        s.h(context, "context");
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
