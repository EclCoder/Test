package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.pairip.VMRunner;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import n0.a1;
import n0.b0;
import n0.c1;
import n0.k1;
import n0.q0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class j extends androidx.appcompat.app.h implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final androidx.collection.u f737j0 = new androidx.collection.u();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final boolean f738k0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f739l0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final boolean f740m0 = !"robolectric".equals(Build.FINGERPRINT);
    private boolean A;
    ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    private boolean L;
    private s[] M;
    private s N;
    private boolean O;
    private boolean P;
    private boolean Q;
    boolean R;
    private Configuration S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private p X;
    private p Y;
    boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f741a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Runnable f742b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f743c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Rect f744d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Rect f745e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private androidx.appcompat.app.s f746f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private androidx.appcompat.app.t f747g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private OnBackInvokedDispatcher f748h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private OnBackInvokedCallback f749i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Object f750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Context f751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window f752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n f753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.e f754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    androidx.appcompat.app.a f755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MenuInflater f756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.appcompat.widget.s f758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t f760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActionBarContextView f762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    PopupWindow f763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Runnable f764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    a1 f765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f766z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if ((jVar.f741a0 & 1) != 0) {
                jVar.n0(0);
            }
            j jVar2 = j.this;
            if ((jVar2.f741a0 & 4096) != 0) {
                jVar2.n0(108);
            }
            j jVar3 = j.this;
            jVar3.Z = false;
            jVar3.f741a0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements b0 {
        b() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            int iN = k1Var.n();
            int iK1 = j.this.k1(k1Var, null);
            if (iN != iK1) {
                k1Var = k1Var.u(k1Var.l(), iK1, k1Var.m(), k1Var.k());
            }
            return q0.Z(view, k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends c1 {
            a() {
            }

            @Override // n0.b1
            public void b(View view) {
                j.this.f762v.setAlpha(1.0f);
                j.this.f765y.g(null);
                j.this.f765y = null;
            }

            @Override // n0.c1, n0.b1
            public void c(View view) {
                j.this.f762v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f763w.showAtLocation(jVar.f762v, 55, 0, 0);
            j.this.o0();
            if (!j.this.Z0()) {
                j.this.f762v.setAlpha(1.0f);
                j.this.f762v.setVisibility(0);
            } else {
                j.this.f762v.setAlpha(0.0f);
                j jVar2 = j.this;
                jVar2.f765y = q0.e(jVar2.f762v).b(1.0f);
                j.this.f765y.g(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends c1 {
        e() {
        }

        @Override // n0.b1
        public void b(View view) {
            j.this.f762v.setAlpha(1.0f);
            j.this.f765y.g(null);
            j.this.f765y = null;
        }

        @Override // n0.c1, n0.b1
        public void c(View view) {
            j.this.f762v.setVisibility(0);
            if (j.this.f762v.getParent() instanceof View) {
                q0.j0((View) j.this.f762v.getParent());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements androidx.appcompat.app.b.InterfaceC0010b {
        f() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Context a() {
            return j.this.t0();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public boolean b() {
            androidx.appcompat.app.a aVarX = j.this.x();
            return (aVarX == null || (aVarX.i() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void c(Drawable drawable, int i10) {
            androidx.appcompat.app.a aVarX = j.this.x();
            if (aVarX != null) {
                aVarX.z(drawable);
                aVarX.x(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Drawable d() {
            o0 o0VarU = o0.u(a(), null, new int[]{h.a.C});
            Drawable drawableG = o0VarU.g(0);
            o0VarU.x();
            return drawableG;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void e(int i10) {
            androidx.appcompat.app.a aVarX = j.this.x();
            if (aVarX != null) {
                aVarX.x(i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class h implements androidx.appcompat.view.menu.j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            j.this.e0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackA0 = j.this.A0();
            if (callbackA0 == null) {
                return true;
            }
            callbackA0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f775a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends c1 {
            a() {
            }

            @Override // n0.b1
            public void b(View view) {
                j.this.f762v.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.f763w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.f762v.getParent() instanceof View) {
                    q0.j0((View) j.this.f762v.getParent());
                }
                j.this.f762v.k();
                j.this.f765y.g(null);
                j jVar2 = j.this;
                jVar2.f765y = null;
                q0.j0(jVar2.B);
            }
        }

        public i(androidx.appcompat.view.b.a aVar) {
            this.f775a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f775a.a(bVar);
            j jVar = j.this;
            if (jVar.f763w != null) {
                jVar.f752l.getDecorView().removeCallbacks(j.this.f764x);
            }
            j jVar2 = j.this;
            if (jVar2.f762v != null) {
                jVar2.o0();
                j jVar3 = j.this;
                jVar3.f765y = q0.e(jVar3.f762v).b(0.0f);
                j.this.f765y.g(new a());
            }
            j jVar4 = j.this;
            androidx.appcompat.app.e eVar = jVar4.f754n;
            if (eVar != null) {
                eVar.n(jVar4.f761u);
            }
            j jVar5 = j.this;
            jVar5.f761u = null;
            q0.j0(jVar5.B);
            j.this.i1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f775a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f775a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            q0.j0(j.this.B);
            return this.f775a.d(bVar, menu);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0011j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static j0.k b(Configuration configuration) {
            return j0.k.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(j0.k kVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(kVar.g()));
        }

        static void d(Configuration configuration, j0.k kVar) {
            configuration.setLocales(LocaleList.forLanguageTags(kVar.g()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final j jVar) {
            Objects.requireNonNull(jVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o
                public final void onBackInvoked() {
                    jVar.I0();
                }
            };
            androidx.appcompat.app.n.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.n.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.m.a(obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f781e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f780d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f780d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f779c = true;
                callback.onContentChanged();
            } finally {
                this.f779c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f781e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f781e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f780d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return j.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || j.this.L0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f778b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(j.this.f751k, callback);
            androidx.appcompat.view.b bVarC1 = j.this.c1(aVar);
            if (bVarC1 != null) {
                return aVar.e(bVarC1);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f779c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f778b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            j.this.O0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f781e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                j.this.P0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            g gVar = this.f778b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s sVarY0 = j.this.y0(0, true);
            if (sVarY0 == null || (eVar = sVarY0.f800j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (j.this.G0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f783c;

        o(Context context) {
            super();
            this.f783c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.j.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.p
        public int c() {
            return C0011j.a(this.f783c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.j.p
        public void d() {
            j.this.Y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f785a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                VMRunner.invoke("EHnqNWx5aRieEzCe", new Object[]{this, context, intent});
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f785a;
            if (broadcastReceiver != null) {
                try {
                    j.this.f751k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f785a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f785a == null) {
                this.f785a = new a();
            }
            j.this.f751k.registerReceiver(this.f785a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y f788c;

        q(y yVar) {
            super();
            this.f788c = yVar;
        }

        @Override // androidx.appcompat.app.j.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.p
        public int c() {
            return this.f788c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.j.p
        public void d() {
            j.this.Y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            j.this.g0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(i.a.b(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f799i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f800j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f801k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f802l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f803m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f804n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f805o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f806p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f807q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f808r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f809s;

        s(int i10) {
            this.f791a = i10;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.f800j == null) {
                return null;
            }
            if (this.f801k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f802l, h.g.f39959l);
                this.f801k = cVar;
                cVar.d(aVar);
                this.f800j.b(this.f801k);
            }
            return this.f801k.l(this.f797g);
        }

        public boolean b() {
            if (this.f798h == null) {
                return false;
            }
            return this.f799i != null || this.f801k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f800j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.f801k);
            }
            this.f800j = eVar;
            if (eVar == null || (cVar = this.f801k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(h.a.f39848a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(h.a.G, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(h.i.f39991g, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f802l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(h.j.A0);
            this.f792b = typedArrayObtainStyledAttributes.getResourceId(h.j.D0, 0);
            this.f796f = typedArrayObtainStyledAttributes.getResourceId(h.j.C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class t implements androidx.appcompat.view.menu.j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z11 = eVarF != eVar;
            j jVar = j.this;
            if (z11) {
                eVar = eVarF;
            }
            s sVarR0 = jVar.r0(eVar);
            if (sVarR0 != null) {
                if (!z11) {
                    j.this.h0(sVarR0, z10);
                } else {
                    j.this.d0(sVarR0.f791a, sVarR0, eVarF);
                    j.this.h0(sVarR0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackA0;
            if (eVar != eVar.F()) {
                return true;
            }
            j jVar = j.this;
            if (!jVar.G || (callbackA0 = jVar.A0()) == null || j.this.R) {
                return true;
            }
            callbackA0.onMenuOpened(108, eVar);
            return true;
        }
    }

    j(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void B0() {
        p0();
        if (this.G && this.f755o == null) {
            Object obj = this.f750j;
            if (obj instanceof Activity) {
                this.f755o = new z((Activity) this.f750j, this.H);
            } else if (obj instanceof Dialog) {
                this.f755o = new z((Dialog) this.f750j);
            }
            androidx.appcompat.app.a aVar = this.f755o;
            if (aVar != null) {
                aVar.s(this.f743c0);
            }
        }
    }

    private boolean C0(s sVar) {
        View view = sVar.f799i;
        if (view != null) {
            sVar.f798h = view;
            return true;
        }
        if (sVar.f800j == null) {
            return false;
        }
        if (this.f760t == null) {
            this.f760t = new t();
        }
        View view2 = (View) sVar.a(this.f760t);
        sVar.f798h = view2;
        return view2 != null;
    }

    private boolean D0(s sVar) {
        sVar.d(t0());
        sVar.f797g = new r(sVar.f802l);
        sVar.f793c = 81;
        return true;
    }

    private boolean E0(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f751k;
        int i10 = sVar.f791a;
        if ((i10 == 0 || i10 == 108) && this.f758r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(h.a.f39851d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(h.a.f39852e, typedValue, true);
            } else {
                theme.resolveAttribute(h.a.f39852e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        sVar.c(eVar);
        return true;
    }

    private void F0(int i10) {
        this.f741a0 = (1 << i10) | this.f741a0;
        if (this.Z) {
            return;
        }
        q0.e0(this.f752l.getDecorView(), this.f742b0);
        this.Z = true;
    }

    private boolean K0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarY0 = y0(i10, true);
        if (sVarY0.f805o) {
            return false;
        }
        return U0(sVarY0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean N0(int i10, KeyEvent keyEvent) {
        boolean zU0;
        androidx.appcompat.widget.s sVar;
        if (this.f761u != null) {
            return false;
        }
        boolean zB = true;
        s sVarY0 = y0(i10, true);
        if (i10 != 0 || (sVar = this.f758r) == null || !sVar.a() || ViewConfiguration.get(this.f751k).hasPermanentMenuKey()) {
            boolean z10 = sVarY0.f805o;
            if (z10 || sVarY0.f804n) {
                h0(sVarY0, true);
                zB = z10;
            } else if (sVarY0.f803m) {
                if (sVarY0.f808r) {
                    sVarY0.f803m = false;
                    zU0 = U0(sVarY0, keyEvent);
                } else {
                    zU0 = true;
                }
                if (zU0) {
                    R0(sVarY0, keyEvent);
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
        } else if (this.f758r.e()) {
            zB = this.f758r.b();
        } else if (this.R || !U0(sVarY0, keyEvent)) {
            zB = false;
        } else {
            zB = this.f758r.c();
        }
        if (zB) {
            AudioManager audioManager = (AudioManager) this.f751k.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zB;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void R0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f805o || this.R) {
            return;
        }
        if (sVar.f791a == 0 && (this.f751k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null && !callbackA0.onMenuOpened(sVar.f791a, sVar.f800j)) {
            h0(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f751k.getSystemService("window");
        if (windowManager != null && U0(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.f797g;
            if (viewGroup != null && !sVar.f807q) {
                View view = sVar.f799i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                sVar.f804n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, sVar.f794d, sVar.f795e, 1002, 8519680, -3);
                layoutParams2.gravity = sVar.f793c;
                layoutParams2.windowAnimations = sVar.f796f;
                windowManager.addView(sVar.f797g, layoutParams2);
                sVar.f805o = true;
                if (sVar.f791a == 0) {
                    i1();
                }
            }
            if (viewGroup == null) {
                if (!D0(sVar) || sVar.f797g == null) {
                    return;
                }
            } else if (sVar.f807q && viewGroup.getChildCount() > 0) {
                sVar.f797g.removeAllViews();
            }
            if (!C0(sVar) || !sVar.b()) {
                sVar.f807q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = sVar.f798h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f797g.setBackgroundResource(sVar.f792b);
            ViewParent parent = sVar.f798h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f798h);
            }
            sVar.f797g.addView(sVar.f798h, layoutParams3);
            if (!sVar.f798h.hasFocus()) {
                sVar.f798h.requestFocus();
            }
            i10 = -2;
            sVar.f804n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, sVar.f794d, sVar.f795e, 1002, 8519680, -3);
            layoutParams4.gravity = sVar.f793c;
            layoutParams4.windowAnimations = sVar.f796f;
            windowManager.addView(sVar.f797g, layoutParams4);
            sVar.f805o = true;
            if (sVar.f791a == 0) {
                i1();
            }
        }
    }

    private boolean T0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f803m || U0(sVar, keyEvent)) && (eVar = sVar.f800j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f758r == null) {
            h0(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean U0(s sVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.s sVar2;
        androidx.appcompat.widget.s sVar3;
        androidx.appcompat.widget.s sVar4;
        if (this.R) {
            return false;
        }
        if (sVar.f803m) {
            return true;
        }
        s sVar5 = this.N;
        if (sVar5 != null && sVar5 != sVar) {
            h0(sVar5, false);
        }
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null) {
            sVar.f799i = callbackA0.onCreatePanelView(sVar.f791a);
        }
        int i10 = sVar.f791a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (sVar4 = this.f758r) != null) {
            sVar4.f();
        }
        if (sVar.f799i == null && (!z10 || !(S0() instanceof w))) {
            androidx.appcompat.view.menu.e eVar = sVar.f800j;
            if (eVar == null || sVar.f808r) {
                if (eVar == null && (!E0(sVar) || sVar.f800j == null)) {
                    return false;
                }
                if (z10 && this.f758r != null) {
                    if (this.f759s == null) {
                        this.f759s = new h();
                    }
                    this.f758r.d(sVar.f800j, this.f759s);
                }
                sVar.f800j.i0();
                if (!callbackA0.onCreatePanelMenu(sVar.f791a, sVar.f800j)) {
                    sVar.c(null);
                    if (z10 && (sVar2 = this.f758r) != null) {
                        sVar2.d(null, this.f759s);
                    }
                    return false;
                }
                sVar.f808r = false;
            }
            sVar.f800j.i0();
            Bundle bundle = sVar.f809s;
            if (bundle != null) {
                sVar.f800j.S(bundle);
                sVar.f809s = null;
            }
            if (!callbackA0.onPreparePanel(0, sVar.f799i, sVar.f800j)) {
                if (z10 && (sVar3 = this.f758r) != null) {
                    sVar3.d(null, this.f759s);
                }
                sVar.f800j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f806p = z11;
            sVar.f800j.setQwertyMode(z11);
            sVar.f800j.h0();
        }
        sVar.f803m = true;
        sVar.f804n = false;
        this.N = sVar;
        return true;
    }

    private void V0(boolean z10) {
        androidx.appcompat.widget.s sVar = this.f758r;
        if (sVar == null || !sVar.a() || (ViewConfiguration.get(this.f751k).hasPermanentMenuKey() && !this.f758r.g())) {
            s sVarY0 = y0(0, true);
            sVarY0.f807q = true;
            h0(sVarY0, false);
            R0(sVarY0, null);
            return;
        }
        Window.Callback callbackA0 = A0();
        if (this.f758r.e() && z10) {
            this.f758r.b();
            if (this.R) {
                return;
            }
            callbackA0.onPanelClosed(108, y0(0, true).f800j);
            return;
        }
        if (callbackA0 == null || this.R) {
            return;
        }
        if (this.Z && (this.f741a0 & 1) != 0) {
            this.f752l.getDecorView().removeCallbacks(this.f742b0);
            this.f742b0.run();
        }
        s sVarY1 = y0(0, true);
        androidx.appcompat.view.menu.e eVar = sVarY1.f800j;
        if (eVar == null || sVarY1.f808r || !callbackA0.onPreparePanel(0, sVarY1.f799i, eVar)) {
            return;
        }
        callbackA0.onMenuOpened(108, sVarY1.f800j);
        this.f758r.c();
    }

    private boolean W(boolean z10) {
        return X(z10, true);
    }

    private int W0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean X(boolean z10, boolean z11) {
        if (this.R) {
            return false;
        }
        int iC0 = c0();
        int iH0 = H0(this.f751k, iC0);
        j0.k kVarB0 = Build.VERSION.SDK_INT < 33 ? b0(this.f751k) : null;
        if (!z11 && kVarB0 != null) {
            kVarB0 = x0(this.f751k.getResources().getConfiguration());
        }
        boolean zH1 = h1(iH0, kVarB0, z10);
        if (iC0 == 0) {
            w0(this.f751k).e();
        } else {
            p pVar = this.X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iC0 == 3) {
            v0(this.f751k).e();
            return zH1;
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zH1;
    }

    private void Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f752l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f751k.obtainStyledAttributes(h.j.A0);
        typedArrayObtainStyledAttributes.getValue(h.j.M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(h.j.N0, contentFrameLayout.getMinWidthMinor());
        int i10 = h.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = h.j.L0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = h.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = h.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void a0(Window window) {
        if (this.f752l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f753m = nVar;
        window.setCallback(nVar);
        o0 o0VarU = o0.u(this.f751k, null, f739l0);
        Drawable drawableH = o0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        o0VarU.x();
        this.f752l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f748h0 != null) {
            return;
        }
        Q(null);
    }

    private boolean a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f752l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int c0() {
        int i10 = this.T;
        return i10 != -100 ? i10 : androidx.appcompat.app.h.q();
    }

    private void e1() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void f0() {
        p pVar = this.X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private androidx.appcompat.app.d f1() {
        for (Context baseContext = this.f751k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g1(Configuration configuration) {
        Activity activity = (Activity) this.f750j;
        if (activity instanceof androidx.lifecycle.b0) {
            if (((androidx.lifecycle.b0) activity).getLifecycle().b().e(androidx.lifecycle.s.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private boolean h1(int i10, j0.k kVar, boolean z10) {
        boolean z11;
        Configuration configurationI0 = i0(this.f751k, i10, kVar, null, false);
        int iU0 = u0(this.f751k);
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = this.f751k.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationI0.uiMode & 48;
        j0.k kVarX0 = x0(configuration);
        j0.k kVarX1 = kVar == null ? null : x0(configurationI0);
        int i13 = i11 != i12 ? 512 : 0;
        if (kVarX1 != null && !kVarX0.equals(kVarX1)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~iU0) & i13) != 0 && z10 && this.P && (f740m0 || this.Q)) {
            Object obj = this.f750j;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z11 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f750j).getWindow().getDecorView().setLayoutDirection(configurationI0.getLayoutDirection());
                }
                androidx.core.app.b.e((Activity) this.f750j);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i13 == 0) {
            z12 = z11;
        } else {
            j1(i12, kVarX1, (i13 & iU0) == i13, null);
        }
        if (z12) {
            Object obj2 = this.f750j;
            if (obj2 instanceof androidx.appcompat.app.d) {
                if ((i13 & 512) != 0) {
                    ((androidx.appcompat.app.d) obj2).p0(i10);
                }
                if ((i13 & 4) != 0) {
                    ((androidx.appcompat.app.d) this.f750j).o0(kVar);
                }
            }
        }
        if (kVarX1 != null) {
            Y0(x0(this.f751k.getResources().getConfiguration()));
        }
        return z12;
    }

    private Configuration i0(Context context, int i10, j0.k kVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (kVar != null) {
            X0(configuration2, kVar);
        }
        return configuration2;
    }

    private ViewGroup j0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f751k.obtainStyledAttributes(h.j.A0);
        int i10 = h.j.F0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.O0, false)) {
            L(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            L(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.G0, false)) {
            L(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.H0, false)) {
            L(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(h.j.B0, false);
        typedArrayObtainStyledAttributes.recycle();
        q0();
        this.f752l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f751k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(h.g.f39964q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(h.g.f39963p, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(h.g.f39955h, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f751k.getTheme().resolveAttribute(h.a.f39851d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f751k, typedValue.resourceId) : this.f751k).inflate(h.g.f39965r, (ViewGroup) null);
            androidx.appcompat.widget.s sVar = (androidx.appcompat.widget.s) viewGroup.findViewById(h.f.f39938q);
            this.f758r = sVar;
            sVar.setWindowCallback(A0());
            if (this.H) {
                this.f758r.h(109);
            }
            if (this.E) {
                this.f758r.h(2);
            }
            if (this.F) {
                this.f758r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        q0.w0(viewGroup, new b());
        if (this.f758r == null) {
            this.C = (TextView) viewGroup.findViewById(h.f.S);
        }
        z0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.f39923b);
        ViewGroup viewGroup2 = (ViewGroup) this.f752l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f752l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void j1(int i10, j0.k kVar, boolean z10, Configuration configuration) {
        Resources resources = this.f751k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (kVar != null) {
            X0(configuration2, kVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            v.a(resources);
        }
        int i11 = this.U;
        if (i11 != 0) {
            this.f751k.setTheme(i11);
            this.f751k.getTheme().applyStyle(this.U, true);
        }
        if (z10 && (this.f750j instanceof Activity)) {
            g1(configuration2);
        }
    }

    private void l1(View view) {
        view.setBackgroundColor((q0.N(view) & 8192) != 0 ? androidx.core.content.a.getColor(this.f751k, h.c.f39876b) : androidx.core.content.a.getColor(this.f751k, h.c.f39875a));
    }

    private void p0() {
        if (this.A) {
            return;
        }
        this.B = j0();
        CharSequence charSequenceZ0 = z0();
        if (!TextUtils.isEmpty(charSequenceZ0)) {
            androidx.appcompat.widget.s sVar = this.f758r;
            if (sVar != null) {
                sVar.setWindowTitle(charSequenceZ0);
            } else if (S0() != null) {
                S0().E(charSequenceZ0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceZ0);
                }
            }
        }
        Z();
        Q0(this.B);
        this.A = true;
        s sVarY0 = y0(0, false);
        if (this.R) {
            return;
        }
        if (sVarY0 == null || sVarY0.f800j == null) {
            F0(108);
        }
    }

    private void q0() {
        if (this.f752l == null) {
            Object obj = this.f750j;
            if (obj instanceof Activity) {
                a0(((Activity) obj).getWindow());
            }
        }
        if (this.f752l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i30 & PsExtractor.AUDIO_STREAM;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int u0(Context context) {
        if (!this.W && (this.f750j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f750j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    private p v0(Context context) {
        if (this.Y == null) {
            this.Y = new o(context);
        }
        return this.Y;
    }

    private p w0(Context context) {
        if (this.X == null) {
            this.X = new q(y.a(context));
        }
        return this.X;
    }

    final Window.Callback A0() {
        return this.f752l.getCallback();
    }

    @Override // androidx.appcompat.app.h
    public void B(Configuration configuration) {
        androidx.appcompat.app.a aVarX;
        if (this.G && this.A && (aVarX = x()) != null) {
            aVarX.m(configuration);
        }
        androidx.appcompat.widget.h.b().g(this.f751k);
        this.S = new Configuration(this.f751k.getResources().getConfiguration());
        X(false, false);
    }

    @Override // androidx.appcompat.app.h
    public void C(Bundle bundle) {
        String strC;
        this.P = true;
        W(false);
        q0();
        Object obj = this.f750j;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.k.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarS0 = S0();
                if (aVarS0 == null) {
                    this.f743c0 = true;
                } else {
                    aVarS0.s(true);
                }
            }
            androidx.appcompat.app.h.e(this);
        }
        this.S = new Configuration(this.f751k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.h
    public void D() {
        if (this.f750j instanceof Activity) {
            androidx.appcompat.app.h.J(this);
        }
        if (this.Z) {
            this.f752l.getDecorView().removeCallbacks(this.f742b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.f750j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f737j0.put(this.f750j.getClass().getName(), Integer.valueOf(this.T));
            } else {
                f737j0.remove(this.f750j.getClass().getName());
            }
        } else {
            f737j0.remove(this.f750j.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f755o;
        if (aVar != null) {
            aVar.n();
        }
        f0();
    }

    @Override // androidx.appcompat.app.h
    public void E(Bundle bundle) {
        p0();
    }

    @Override // androidx.appcompat.app.h
    public void F() {
        androidx.appcompat.app.a aVarX = x();
        if (aVarX != null) {
            aVarX.B(true);
        }
    }

    public boolean G0() {
        return this.f766z;
    }

    @Override // androidx.appcompat.app.h
    public void H() {
        X(true, false);
    }

    int H0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return w0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return v0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.h
    public void I() {
        androidx.appcompat.app.a aVarX = x();
        if (aVarX != null) {
            aVarX.B(false);
        }
    }

    boolean I0() {
        boolean z10 = this.O;
        this.O = false;
        s sVarY0 = y0(0, false);
        if (sVarY0 != null && sVarY0.f805o) {
            if (!z10) {
                h0(sVarY0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f761u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarX = x();
        return aVarX != null && aVarX.g();
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            K0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public boolean L(int i10) {
        int iW0 = W0(i10);
        if (this.K && iW0 == 108) {
            return false;
        }
        if (this.G && iW0 == 1) {
            this.G = false;
        }
        if (iW0 == 1) {
            e1();
            this.K = true;
            return true;
        }
        if (iW0 == 2) {
            e1();
            this.E = true;
            return true;
        }
        if (iW0 == 5) {
            e1();
            this.F = true;
            return true;
        }
        if (iW0 == 10) {
            e1();
            this.I = true;
            return true;
        }
        if (iW0 == 108) {
            e1();
            this.G = true;
            return true;
        }
        if (iW0 != 109) {
            return this.f752l.requestFeature(iW0);
        }
        e1();
        this.H = true;
        return true;
    }

    boolean L0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarX = x();
        if (aVarX != null && aVarX.o(i10, keyEvent)) {
            return true;
        }
        s sVar = this.N;
        if (sVar != null && T0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.N;
            if (sVar2 != null) {
                sVar2.f804n = true;
            }
            return true;
        }
        if (this.N == null) {
            s sVarY0 = y0(0, true);
            U0(sVarY0, keyEvent);
            boolean zT0 = T0(sVarY0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarY0.f803m = false;
            if (zT0) {
                return true;
            }
        }
        return false;
    }

    boolean M0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                N0(0, keyEvent);
                return true;
            }
        } else if (I0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void N(int i10) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f751k).inflate(i10, viewGroup);
        this.f753m.c(this.f752l.getCallback());
    }

    @Override // androidx.appcompat.app.h
    public void O(View view) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f753m.c(this.f752l.getCallback());
    }

    void O0(int i10) {
        androidx.appcompat.app.a aVarX;
        if (i10 != 108 || (aVarX = x()) == null) {
            return;
        }
        aVarX.h(true);
    }

    @Override // androidx.appcompat.app.h
    public void P(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f753m.c(this.f752l.getCallback());
    }

    void P0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarX = x();
            if (aVarX != null) {
                aVarX.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            s sVarY0 = y0(i10, true);
            if (sVarY0.f805o) {
                h0(sVarY0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.h
    public void Q(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.Q(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f748h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f749i0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f749i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f750j;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f748h0 = onBackInvokedDispatcher;
            } else {
                this.f748h0 = m.a((Activity) this.f750j);
            }
        } else {
            this.f748h0 = onBackInvokedDispatcher;
        }
        i1();
    }

    @Override // androidx.appcompat.app.h
    public void R(Toolbar toolbar) {
        if (this.f750j instanceof Activity) {
            androidx.appcompat.app.a aVarX = x();
            if (aVarX instanceof z) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f756p = null;
            if (aVarX != null) {
                aVarX.n();
            }
            this.f755o = null;
            if (toolbar != null) {
                w wVar = new w(toolbar, z0(), this.f753m);
                this.f755o = wVar;
                this.f753m.e(wVar.f838c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f753m.e(null);
            }
            z();
        }
    }

    @Override // androidx.appcompat.app.h
    public void S(int i10) {
        this.U = i10;
    }

    final androidx.appcompat.app.a S0() {
        return this.f755o;
    }

    @Override // androidx.appcompat.app.h
    public final void T(CharSequence charSequence) {
        this.f757q = charSequence;
        androidx.appcompat.widget.s sVar = this.f758r;
        if (sVar != null) {
            sVar.setWindowTitle(charSequence);
            return;
        }
        if (S0() != null) {
            S0().E(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void X0(Configuration configuration, j0.k kVar) {
        k.d(configuration, kVar);
    }

    public boolean Y() {
        return W(true);
    }

    void Y0(j0.k kVar) {
        k.c(kVar);
    }

    final boolean Z0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s sVarR0;
        Window.Callback callbackA0 = A0();
        if (callbackA0 == null || this.R || (sVarR0 = r0(eVar.F())) == null) {
            return false;
        }
        return callbackA0.onMenuItemSelected(sVarR0.f791a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        V0(true);
    }

    j0.k b0(Context context) {
        j0.k kVarV;
        if (Build.VERSION.SDK_INT >= 33 || (kVarV = androidx.appcompat.app.h.v()) == null) {
            return null;
        }
        j0.k kVarX0 = x0(context.getApplicationContext().getResources().getConfiguration());
        j0.k kVarB = u.b(kVarV, kVarX0);
        return kVarB.e() ? kVarX0 : kVarB;
    }

    boolean b1() {
        if (this.f748h0 == null) {
            return false;
        }
        s sVarY0 = y0(0, false);
        return (sVarY0 != null && sVarY0.f805o) || this.f761u != null;
    }

    public androidx.appcompat.view.b c1(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f761u;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarX = x();
        if (aVarX != null) {
            androidx.appcompat.view.b bVarG = aVarX.G(iVar);
            this.f761u = bVarG;
            if (bVarG != null && (eVar = this.f754n) != null) {
                eVar.l(bVarG);
            }
        }
        if (this.f761u == null) {
            this.f761u = d1(iVar);
        }
        i1();
        return this.f761u;
    }

    void d0(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.M;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f800j;
            }
        }
        if ((sVar == null || sVar.f805o) && !this.R) {
            this.f753m.d(this.f752l.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b d1(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarQ;
        Context dVar;
        androidx.appcompat.app.e eVar;
        o0();
        androidx.appcompat.view.b bVar = this.f761u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f754n;
        if (eVar2 == null || this.R) {
            bVarQ = null;
        } else {
            try {
                bVarQ = eVar2.q(aVar);
            } catch (AbstractMethodError unused) {
                bVarQ = null;
            }
        }
        if (bVarQ != null) {
            this.f761u = bVarQ;
        } else {
            if (this.f762v == null) {
                if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f751k.getTheme();
                    theme.resolveAttribute(h.a.f39851d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f751k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f751k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f751k;
                    }
                    this.f762v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, h.a.f39853f);
                    this.f763w = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.f763w.setContentView(this.f762v);
                    this.f763w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(h.a.f39849b, typedValue, true);
                    this.f762v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f763w.setHeight(-2);
                    this.f764x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(h.f.f39929h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(t0()));
                        this.f762v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f762v != null) {
                o0();
                this.f762v.k();
                androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f762v.getContext(), this.f762v, aVar, this.f763w == null);
                if (aVar.b(eVar3, eVar3.e())) {
                    eVar3.k();
                    this.f762v.h(eVar3);
                    this.f761u = eVar3;
                    if (Z0()) {
                        this.f762v.setAlpha(0.0f);
                        a1 a1VarB = q0.e(this.f762v).b(1.0f);
                        this.f765y = a1VarB;
                        a1VarB.g(new e());
                    } else {
                        this.f762v.setAlpha(1.0f);
                        this.f762v.setVisibility(0);
                        if (this.f762v.getParent() instanceof View) {
                            q0.j0((View) this.f762v.getParent());
                        }
                    }
                    if (this.f763w != null) {
                        this.f752l.getDecorView().post(this.f764x);
                    }
                } else {
                    this.f761u = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f761u;
        if (bVar2 != null && (eVar = this.f754n) != null) {
            eVar.l(bVar2);
        }
        i1();
        return this.f761u;
    }

    void e0(androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f758r.l();
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null && !this.R) {
            callbackA0.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    @Override // androidx.appcompat.app.h
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f753m.c(this.f752l.getCallback());
    }

    @Override // androidx.appcompat.app.h
    boolean g() {
        if (androidx.appcompat.app.h.A(this.f751k) && androidx.appcompat.app.h.v() != null && !androidx.appcompat.app.h.v().equals(androidx.appcompat.app.h.w())) {
            i(this.f751k);
        }
        return W(true);
    }

    void g0(int i10) {
        h0(y0(i10, true), true);
    }

    void h0(s sVar, boolean z10) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.s sVar2;
        if (z10 && sVar.f791a == 0 && (sVar2 = this.f758r) != null && sVar2.e()) {
            e0(sVar.f800j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f751k.getSystemService("window");
        if (windowManager != null && sVar.f805o && (viewGroup = sVar.f797g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                d0(sVar.f791a, sVar, null);
            }
        }
        sVar.f803m = false;
        sVar.f804n = false;
        sVar.f805o = false;
        sVar.f798h = null;
        sVar.f807q = true;
        if (this.N == sVar) {
            this.N = null;
        }
        if (sVar.f791a == 0) {
            i1();
        }
    }

    void i1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zB1 = b1();
            if (zB1 && this.f749i0 == null) {
                this.f749i0 = m.b(this.f748h0, this);
            } else {
                if (zB1 || (onBackInvokedCallback = this.f749i0) == null) {
                    return;
                }
                m.c(this.f748h0, onBackInvokedCallback);
                this.f749i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public Context k(Context context) {
        Context context2;
        this.P = true;
        int iH0 = H0(context, c0());
        if (androidx.appcompat.app.h.A(context)) {
            androidx.appcompat.app.h.V(context);
        }
        j0.k kVarB0 = b0(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(i0(context2, iH0, kVarB0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(i0(context2, iH0, kVarB0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f740m0) {
            return super.k(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationI0 = i0(context2, iH0, kVarB0, !configuration2.equals(configuration3) ? s0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, h.i.f39992h);
        dVar.a(configurationI0);
        try {
            if (context2.getTheme() != null) {
                d0.h.d.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.k(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View k0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f746f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f751k.obtainStyledAttributes(h.j.A0);
            String string = typedArrayObtainStyledAttributes.getString(h.j.E0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f746f0 = new androidx.appcompat.app.s();
            } else {
                try {
                    this.f746f0 = (androidx.appcompat.app.s) this.f751k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f746f0 = new androidx.appcompat.app.s();
                }
            }
        }
        boolean z11 = f738k0;
        boolean zA1 = false;
        if (z11) {
            if (this.f747g0 == null) {
                this.f747g0 = new androidx.appcompat.app.t();
            }
            if (this.f747g0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zA1 = a1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zA1 = true;
                }
                z10 = zA1;
            }
        } else {
            z10 = zA1;
        }
        return this.f746f0.r(view, str, context, attributeSet, z10, z11, true, y0.c());
    }

    final int k1(k1 k1Var, Rect rect) {
        int iN;
        boolean z10;
        boolean z11;
        if (k1Var != null) {
            iN = k1Var.n();
        } else {
            iN = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f762v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f762v.getLayoutParams();
            boolean z12 = true;
            if (this.f762v.isShown()) {
                if (this.f744d0 == null) {
                    this.f744d0 = new Rect();
                    this.f745e0 = new Rect();
                }
                Rect rect2 = this.f744d0;
                Rect rect3 = this.f745e0;
                if (k1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k1Var.l(), k1Var.n(), k1Var.m(), k1Var.k());
                }
                z0.a(this.B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                k1 k1VarI = q0.I(this.B);
                int iL = k1VarI == null ? 0 : k1VarI.l();
                int iM = k1VarI == null ? 0 : k1VarI.m();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iL || marginLayoutParams2.rightMargin != iM) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iL;
                            marginLayoutParams2.rightMargin = iM;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f751k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iL;
                    layoutParams.rightMargin = iM;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z12 = view3 != null;
                if (z12 && view3.getVisibility() != 0) {
                    l1(this.D);
                }
                if (!this.I && z12) {
                    iN = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f762v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iN;
    }

    void l0() {
        androidx.appcompat.view.menu.e eVar;
        androidx.appcompat.widget.s sVar = this.f758r;
        if (sVar != null) {
            sVar.l();
        }
        if (this.f763w != null) {
            this.f752l.getDecorView().removeCallbacks(this.f764x);
            if (this.f763w.isShowing()) {
                try {
                    this.f763w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f763w = null;
        }
        o0();
        s sVarY0 = y0(0, false);
        if (sVarY0 == null || (eVar = sVarY0.f800j) == null) {
            return;
        }
        eVar.close();
    }

    boolean m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f750j;
        if (((obj instanceof n0.n.a) || (obj instanceof androidx.appcompat.app.q)) && (decorView = this.f752l.getDecorView()) != null && n0.n.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f753m.b(this.f752l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? J0(keyCode, keyEvent) : M0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.h
    public View n(int i10) {
        p0();
        return this.f752l.findViewById(i10);
    }

    void n0(int i10) {
        s sVarY0;
        s sVarY1 = y0(i10, true);
        if (sVarY1.f800j != null) {
            Bundle bundle = new Bundle();
            sVarY1.f800j.U(bundle);
            if (bundle.size() > 0) {
                sVarY1.f809s = bundle;
            }
            sVarY1.f800j.i0();
            sVarY1.f800j.clear();
        }
        sVarY1.f808r = true;
        sVarY1.f807q = true;
        if ((i10 != 108 && i10 != 0) || this.f758r == null || (sVarY0 = y0(0, false)) == null) {
            return;
        }
        sVarY0.f803m = false;
        U0(sVarY0, null);
    }

    void o0() {
        a1 a1Var = this.f765y;
        if (a1Var != null) {
            a1Var.c();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return k0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.h
    public Context p() {
        return this.f751k;
    }

    @Override // androidx.appcompat.app.h
    public final androidx.appcompat.app.b.InterfaceC0010b r() {
        return new f();
    }

    s r0(Menu menu) {
        s[] sVarArr = this.M;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f800j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.h
    public int s() {
        return this.T;
    }

    final Context t0() {
        androidx.appcompat.app.a aVarX = x();
        Context contextJ = aVarX != null ? aVarX.j() : null;
        return contextJ == null ? this.f751k : contextJ;
    }

    @Override // androidx.appcompat.app.h
    public MenuInflater u() {
        if (this.f756p == null) {
            B0();
            androidx.appcompat.app.a aVar = this.f755o;
            this.f756p = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f751k);
        }
        return this.f756p;
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.app.a x() {
        B0();
        return this.f755o;
    }

    j0.k x0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.h
    public void y() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f751k);
        if (layoutInflaterFrom.getFactory() == null) {
            n0.o.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof j) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected s y0(int i10, boolean z10) {
        s[] sVarArr = this.M;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.M = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    @Override // androidx.appcompat.app.h
    public void z() {
        if (S0() == null || x().l()) {
            return;
        }
        F0(0);
    }

    final CharSequence z0() {
        Object obj = this.f750j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f757q;
    }

    j(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private j(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d dVarF1;
        this.f765y = null;
        this.f766z = true;
        this.T = -100;
        this.f742b0 = new a();
        this.f751k = context;
        this.f754n = eVar;
        this.f750j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (dVarF1 = f1()) != null) {
            this.T = dVarF1.k0().s();
        }
        if (this.T == -100) {
            androidx.collection.u uVar = f737j0;
            Integer num = (Integer) uVar.get(obj.getClass().getName());
            if (num != null) {
                this.T = num.intValue();
                uVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            a0(window);
        }
        androidx.appcompat.widget.h.h();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            j.this.l0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.h
    public void G(Bundle bundle) {
    }

    void Q0(ViewGroup viewGroup) {
    }
}
