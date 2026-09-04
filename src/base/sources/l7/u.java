package l7;

import android.content.Context;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f44047a = new u();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        NONE(DevicePublicKeyStringDef.NONE),
        f44049c("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f44053a;

        a(String str) {
            this.f44053a = str;
        }

        public final String g() {
            return this.f44053a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        INAPP("inapp"),
        SUBS(SubSampleInformationBox.TYPE);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f44057a;

        b(String str) {
            this.f44057a = str;
        }

        public final String g() {
            return this.f44057a;
        }
    }

    private u() {
    }

    public static final Class a(String className) {
        if (x7.a.c(u.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u.class);
            return null;
        }
    }

    public static final Class b(Context context, String className) {
        if (x7.a.c(u.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u.class);
            return null;
        }
    }

    public static final Method c(Class clazz, String methodName, Class... args) {
        if (x7.a.c(u.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(clazz, "clazz");
            kotlin.jvm.internal.s.h(methodName, "methodName");
            kotlin.jvm.internal.s.h(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u.class);
            return null;
        }
    }

    public static final Method d(Class clazz, String methodName, Class... args) {
        if (x7.a.c(u.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(clazz, "clazz");
            kotlin.jvm.internal.s.h(methodName, "methodName");
            kotlin.jvm.internal.s.h(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u.class);
            return null;
        }
    }

    public static final Object e(Class clazz, Method method, Object obj, Object... args) {
        if (x7.a.c(u.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(clazz, "clazz");
            kotlin.jvm.internal.s.h(method, "method");
            kotlin.jvm.internal.s.h(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, u.class);
            return null;
        }
    }
}
