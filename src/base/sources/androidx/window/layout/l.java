package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f7723a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fl.k f7724b = fl.l.b(e.f7729a);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f7725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f7725a = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0060  */
        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            l lVar = l.f7723a;
            Class clsL = lVar.l(this.f7725a);
            Method getBoundsMethod = clsL.getMethod("getBounds", null);
            Method getTypeMethod = clsL.getMethod("getType", null);
            Method getStateMethod = clsL.getMethod("getState", null);
            kotlin.jvm.internal.s.g(getBoundsMethod, "getBoundsMethod");
            if (lVar.k(getBoundsMethod, l0.b(Rect.class)) && lVar.o(getBoundsMethod)) {
                kotlin.jvm.internal.s.g(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (lVar.k(getTypeMethod, l0.b(cls)) && lVar.o(getTypeMethod)) {
                    kotlin.jvm.internal.s.g(getStateMethod, "getStateMethod");
                    if (lVar.k(getStateMethod, l0.b(cls)) && lVar.o(getStateMethod)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f7726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f7726a = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002d  */
        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            l lVar = l.f7723a;
            Method getWindowLayoutComponentMethod = lVar.t(this.f7726a).getMethod("getWindowLayoutComponent", null);
            Class windowLayoutComponentClass = lVar.v(this.f7726a);
            kotlin.jvm.internal.s.g(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (lVar.o(getWindowLayoutComponentMethod)) {
                kotlin.jvm.internal.s.g(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (lVar.j(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f7727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f7727a = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0039  */
        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            l lVar = l.f7723a;
            Class clsV = lVar.v(this.f7727a);
            Method addListenerMethod = clsV.getMethod(PAFNPq.WcnuK, Activity.class, Consumer.class);
            Method removeListenerMethod = clsV.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            kotlin.jvm.internal.s.g(addListenerMethod, "addListenerMethod");
            if (lVar.o(addListenerMethod)) {
                kotlin.jvm.internal.s.g(removeListenerMethod, "removeListenerMethod");
                if (lVar.o(removeListenerMethod)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f7728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f7728a = classLoader;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException {
            l lVar = l.f7723a;
            Method getWindowExtensionsMethod = lVar.u(this.f7728a).getDeclaredMethod("getWindowExtensions", null);
            Class windowExtensionsClass = lVar.t(this.f7728a);
            kotlin.jvm.internal.s.g(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            kotlin.jvm.internal.s.g(windowExtensionsClass, "windowExtensionsClass");
            return Boolean.valueOf(lVar.j(getWindowExtensionsMethod, windowExtensionsClass) && lVar.o(getWindowExtensionsMethod));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f7729a = new e();

        e() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = l.class.getClassLoader();
            if (classLoader == null || !l.f7723a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        return r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, zl.c cVar) {
        return j(method, sl.a.a(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(tl.a aVar) {
        try {
            return ((Boolean) aVar.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f7724b.getValue();
    }
}
