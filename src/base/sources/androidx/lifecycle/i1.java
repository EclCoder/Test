package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f4397a = gl.r.o(Application.class, z0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f4398b = gl.r.e(z0.class);

    public static final Constructor c(Class modelClass, List signature) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        kotlin.jvm.internal.s.h(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.s.g(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.s.g(parameterTypes, "getParameterTypes(...)");
            List listX0 = gl.j.x0(parameterTypes);
            if (kotlin.jvm.internal.s.c(signature, listX0)) {
                kotlin.jvm.internal.s.f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listX0.size() && listX0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final p1 d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.s.h(modelClass, "modelClass");
        kotlin.jvm.internal.s.h(constructor, "constructor");
        kotlin.jvm.internal.s.h(params, "params");
        try {
            return (p1) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
