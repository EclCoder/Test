package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import fl.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7674f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SidecarInterface f7675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.a f7679e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/layout/m;", "sidecarAdapter", "callbackInterface", "<init>", "(Landroidx/window/layout/m;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lfl/g0;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", BidResponsed.KEY_TOKEN, "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "a", "Landroidx/window/layout/m;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m sidecarAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SidecarInterface.SidecarCallback callbackInterface;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ReentrantLock lock;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private SidecarDeviceState lastDeviceState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final WeakHashMap mActivityWindowLayoutInfo;

        public DistinctSidecarElementCallback(m sidecarAdapter, SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.s.h(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.s.h(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap();
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.s.h(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.a(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                g0 g0Var = g0.f38750a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.s.h(token, "token");
            kotlin.jvm.internal.s.h(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.d((SidecarWindowLayoutInfo) this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lfl/g0;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f7685a;

        public TranslatingCallback(SidecarCompat this$0) {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            this.f7685a = this$0;
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceG;
            kotlin.jvm.internal.s.h(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f7685a.f7677c.values();
            SidecarCompat sidecarCompat = this.f7685a;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f7674f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceG = sidecarCompat.g()) != null) {
                    windowLayoutInfo = sidecarInterfaceG.getWindowLayoutInfo(iBinderA);
                }
                g.a aVar = sidecarCompat.f7679e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f7676b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.s.h(windowToken, "windowToken");
            kotlin.jvm.internal.s.h(newLayout, "newLayout");
            Activity activity = (Activity) this.f7685a.f7677c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            m mVar = this.f7685a.f7676b;
            SidecarInterface sidecarInterfaceG = this.f7685a.g();
            SidecarDeviceState deviceState = sidecarInterfaceG == null ? null : sidecarInterfaceG.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            u uVarE = mVar.e(newLayout, deviceState);
            g.a aVar = this.f7685a.f7679e;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, uVarE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final z4.h c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return z4.h.f58636f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f7686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantLock f7687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakHashMap f7688c;

        public b(g.a callbackInterface) {
            kotlin.jvm.internal.s.h(callbackInterface, "callbackInterface");
            this.f7686a = callbackInterface;
            this.f7687b = new ReentrantLock();
            this.f7688c = new WeakHashMap();
        }

        @Override // androidx.window.layout.g.a
        public void a(Activity activity, u newLayout) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f7687b;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.s.c(newLayout, (u) this.f7688c.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                this.f7686a.a(activity, newLayout);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SidecarCompat f7689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f7690b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            kotlin.jvm.internal.s.h(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.s.h(activity, "activity");
            this.f7689a = sidecarCompat;
            this.f7690b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.s.h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f7690b.get();
            IBinder iBinderA = SidecarCompat.f7674f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f7689a.i(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.s.h(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, m sidecarAdapter) {
        kotlin.jvm.internal.s.h(sidecarAdapter, "sidecarAdapter");
        this.f7675a = sidecarInterface;
        this.f7676b = sidecarAdapter;
        this.f7677c = new LinkedHashMap();
        this.f7678d = new LinkedHashMap();
    }

    private final void j(Activity activity) {
        if (this.f7678d.get(activity) == null) {
            d dVar = new d(activity);
            this.f7678d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void k(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks) this.f7678d.get(activity));
        this.f7678d.remove(activity);
    }

    @Override // androidx.window.layout.g
    public void a(g.a extensionCallback) {
        kotlin.jvm.internal.s.h(extensionCallback, "extensionCallback");
        this.f7679e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f7675a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f7676b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.g
    public void b(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        IBinder iBinderA = f7674f.a(activity);
        if (iBinderA != null) {
            i(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.g
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.s.h(activity, "activity");
        IBinder iBinderA = f7674f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f7675a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        k(activity);
        boolean z10 = this.f7677c.size() == 1;
        this.f7677c.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.f7675a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface g() {
        return this.f7675a;
    }

    public final u h(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        IBinder iBinderA = f7674f.a(activity);
        if (iBinderA == null) {
            return new u(gl.r.l());
        }
        SidecarInterface sidecarInterface = this.f7675a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderA);
        m mVar = this.f7676b;
        SidecarInterface sidecarInterface2 = this.f7675a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return mVar.e(windowLayoutInfo, deviceState);
    }

    public final void i(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.s.h(windowToken, "windowToken");
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f7677c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f7675a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f7677c.size() == 1 && (sidecarInterface = this.f7675a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        g.a aVar = this.f7679e;
        if (aVar != null) {
            aVar.a(activity, h(activity));
        }
        j(activity);
    }

    public boolean l() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f7675a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.s.c(returnType, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.s.p("Illegal return type for 'setSidecarCallback': ", returnType));
            }
            SidecarInterface sidecarInterface2 = this.f7675a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f7675a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f7675a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!kotlin.jvm.internal.s.c(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.s.p("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
            }
            SidecarInterface sidecarInterface5 = this.f7675a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!kotlin.jvm.internal.s.c(returnType3, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.s.p("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
            }
            SidecarInterface sidecarInterface6 = this.f7675a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!kotlin.jvm.internal.s.c(returnType4, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.s.p("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.s.g(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (kotlin.jvm.internal.s.c(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SidecarCompat(Context context) {
        this(f7674f.b(context), new m(null, 1, 0 == true ? 1 : 0));
        kotlin.jvm.internal.s.h(context, "context");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements ComponentCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7692b;

        d(Activity activity) {
            this.f7692b = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            kotlin.jvm.internal.s.h(newConfig, "newConfig");
            g.a aVar = SidecarCompat.this.f7679e;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f7692b;
            aVar.a(activity, SidecarCompat.this.h(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
