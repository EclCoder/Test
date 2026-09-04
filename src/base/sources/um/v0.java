package um;

import java.lang.annotation.Annotation;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54839a;

        static {
            int[] iArr = new int[kotlinx.serialization.json.a.values().length];
            try {
                iArr[kotlinx.serialization.json.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54839a = iArr;
        }
    }

    public static final void b(rm.m kind) {
        kotlin.jvm.internal.s.h(kind, "kind");
        if (kind instanceof rm.m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof rm.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof rm.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(rm.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.f) {
                return ((kotlinx.serialization.json.f) annotation).discriminator();
            }
        }
        return json.e().e();
    }

    public static final Void d(String str, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.s.h(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.l0.b(element.getClass()).k() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(pm.l lVar, pm.l lVar2, String str) {
    }
}
