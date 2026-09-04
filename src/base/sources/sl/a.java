package sl;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import zl.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Class a(c cVar) {
        s.h(cVar, "<this>");
        Class clsB = ((h) cVar).b();
        s.f(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(c cVar) {
        s.h(cVar, "<this>");
        Class clsB = ((h) cVar).b();
        if (!clsB.isPrimitive()) {
            s.f(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsB = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsB = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsB = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsB = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsB = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsB = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsB = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsB = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsB = Short.class;
                }
                break;
        }
        s.f(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }

    public static final c c(Class cls) {
        s.h(cls, "<this>");
        return l0.b(cls);
    }
}
