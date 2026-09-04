package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class o {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    o() {
    }

    public static p create() {
        p pVarInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return pVarInvokeSubclassFactory != null ? pVarInvokeSubclassFactory : new p();
    }

    public static p createEmpty() {
        p pVarInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return pVarInvokeSubclassFactory != null ? pVarInvokeSubclassFactory : p.EMPTY_REGISTRY_LITE;
    }

    private static final p invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean isFullRegistry(p pVar) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(pVar.getClass());
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
