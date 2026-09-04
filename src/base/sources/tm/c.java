package tm;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Void a(String str, zl.c baseClass) {
        String str2;
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.k() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.k() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(zl.c subClass, zl.c baseClass) {
        kotlin.jvm.internal.s.h(subClass, "subClass");
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        String strK = subClass.k();
        if (strK == null) {
            strK = String.valueOf(subClass);
        }
        a(strK, baseClass);
        throw new KotlinNothingValueException();
    }
}
